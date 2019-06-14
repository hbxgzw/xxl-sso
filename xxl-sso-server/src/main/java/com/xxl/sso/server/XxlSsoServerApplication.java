package com.xxl.sso.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xuxueli 2018-03-22 23:41:47
 */
@SpringBootApplication
public class XxlSsoServerApplication {

	public static void main(String[] args) {
		System.out.println("sso-server start..........");
        SpringApplication.run(XxlSsoServerApplication.class, args);
        System.out.println("sso-server success..........");
	}

}