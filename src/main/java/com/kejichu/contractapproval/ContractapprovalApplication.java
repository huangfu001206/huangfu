package com.kejichu.contractapproval;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kejichu")
public class ContractapprovalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContractapprovalApplication.class, args);
    }

}
