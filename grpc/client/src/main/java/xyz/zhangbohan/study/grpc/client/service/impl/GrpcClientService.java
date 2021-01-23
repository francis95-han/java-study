/*
 *
 *  * Copyright (c)  2020. zhangbohan.dell@gmail.com ,All Rights Reserved
 *  *
 *
 */

package xyz.zhangbohan.study.grpc.client.service.impl;

import cn.org.faster.framework.grpc.client.annotation.GRpcService;
import cn.org.faster.framework.grpc.core.annotation.GRpcMethod;

@GRpcService(value = "test", scheme = "one-server")
public interface GrpcClientService {
	@GRpcMethod("test")
	String grpcMethod();
}
