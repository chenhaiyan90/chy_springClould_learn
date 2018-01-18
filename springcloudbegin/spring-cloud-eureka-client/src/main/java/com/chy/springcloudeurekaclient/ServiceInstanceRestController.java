package com.chy.springcloudeurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by 001774 on 2018/1/17.
 */
@RestController
@RequestMapping("service-instances")
class ServiceInstanceRestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }

//    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        return "Hello world";

    }
}