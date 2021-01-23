/*
 *
 *  * Copyright (c)  2020. zhangbohan.dell@gmail.com ,All Rights Reserved
 *  *
 *
 */

package xyz.zhangbohan.study.grpc.server;

import cn.org.faster.framework.grpc.server.annotation.GRpcServerScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author mir22
 */
@SpringBootApplication
@GRpcServerScan(basePackages = "xyz.zhangbohan")
public class ServerApplciation {
	public static void main(String[] args) {
		SpringApplication.run(ServerApplciation.class, args);
	}
}
