package com.bank.server;

import com.bank.server.dao.CustomerRepository;
import com.bank.server.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@EnableJpaAuditing
public class ServerApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) {

    }
}
