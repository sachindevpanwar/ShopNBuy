package com.shopnbuy.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EntityScan({ "com.shopnbuy.common.entity", "com.shopnbuy.admin.user" })
public class ShopNBuyBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopNBuyBackEndApplication.class, args);
	}

}
