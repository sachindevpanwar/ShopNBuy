package com.shopnbuy.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = { "com.shopnbuy.common.entity", "com.shopnbuy.admin.user", "com.common.entity" })
public class ShopNBuyBackEndApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShopNBuyBackEndApplication.class, args);
	}
}
