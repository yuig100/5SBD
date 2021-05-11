package com.sbd.xptotec.banco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.sbd.xptotec.model"})
public class Criar_Banco {

	public static void main(String[] args) {
		SpringApplication.run(Criar_Banco.class, args);

	}

}
