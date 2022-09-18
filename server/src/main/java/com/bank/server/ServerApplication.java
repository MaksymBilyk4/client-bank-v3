package com.bank.server;

import com.bank.server.dao.CustomerRepository;
import com.bank.server.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.EntityGraph;

import javax.persistence.Entity;
import java.util.List;

@SpringBootApplication
public class ServerApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) {

    }
}
