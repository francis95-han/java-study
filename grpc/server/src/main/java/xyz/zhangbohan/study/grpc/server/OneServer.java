/*
 *
 *  * Copyright (c)  2020. zhangbohan.dell@gmail.com ,All Rights Reserved
 *  *
 *
 */

package xyz.zhangbohan.study.grpc.server;

import cn.org.faster.framework.grpc.core.annotation.GRpcMethod;
import cn.org.faster.framework.grpc.server.annotation.GRpcApi;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
/**
 * @author mir22
 */
@GRpcApi("one-server")
@Slf4j
public class OneServer {

	@GRpcMethod(value = "test")
	public void grpcMethod(StreamObserver<String> response) {
		log.info("grpc called");
		response.onNext("1");
		response.onCompleted();
	}
}
