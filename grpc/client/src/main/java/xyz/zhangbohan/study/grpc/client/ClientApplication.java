/*
 *
 *  * Copyright (c)  2020. zhangbohan.dell@gmail.com ,All Rights Reserved
 *  *
 *
 */

package xyz.zhangbohan.study.grpc.client;

import cn.org.faster.framework.grpc.client.annotation.GRpcClientScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author mir22
 */
@SpringBootApplication
@GRpcClientScan(basePackages = "xyz.zhangbohan")
public class ClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
}
