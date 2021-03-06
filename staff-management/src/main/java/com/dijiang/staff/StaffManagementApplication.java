package com.dijiang.staff;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.dijiang.common.service.FastDFSFileOperator;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;


@Import(FastDFSFileOperator.class)
@EnableDiscoveryClient
@EnableFeignClients
@EnableApolloConfig
@SpringBootApplication
@EnableScheduling
public class StaffManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaffManagementApplication.class, args);
    }

    @Autowired
    private FastDFSFileOperator fastDFSFileOperator;

}
