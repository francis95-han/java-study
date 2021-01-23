/*
 *
 *  * Copyright (c)  2020. zhangbohan.dell@gmail.com ,All Rights Reserved
 *  *
 *
 */

package xyz.zhangbohan.study.grpc.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.zhangbohan.study.grpc.client.service.impl.GrpcClientService;

/**
 * @author mir22
 */
@RestController
@Slf4j
public class OneController {
	@Autowired
	private GrpcClientService grpcClientService;

	@GetMapping("/test")
	public Object test() {
		String rs = grpcClientService.grpcMethod();
		log.info(rs);
		return rs;
	}
}
