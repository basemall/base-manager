package com.ibase.mall.manager;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName WebApplication
 * @Description TODO
 * @Autor liaoxiongjian
 * @Date 2018/5/26 15:24
 * @Version 1.0
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages={"com.ibase.mall.manager"})
public class WebApplication {


    public static void main(String[] args){
        new SpringApplicationBuilder(WebApplication.class).web(true).run(args);
    }


}