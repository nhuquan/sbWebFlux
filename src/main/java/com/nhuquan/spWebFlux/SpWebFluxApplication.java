package com.nhuquan.spWebFlux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpWebFluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpWebFluxApplication.class, args);
        GreetingWebClient gwc = new GreetingWebClient();
        System.out.println(gwc.getResult());
	}
}
