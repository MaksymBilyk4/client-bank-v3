package com.bank.server.mapper;

import com.bank.server.dao.CustomerRepository;
import com.bank.server.dto.EmployerRequestDto;
import com.bank.server.entity.Customer;
import com.bank.server.entity.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployerRequestDtoMapper extends DtoMapperFacade<Employer, EmployerRequestDto> {

    @Autowired
    CustomerRepository customerRepository;

    public EmployerRequestDtoMapper() {
        super(Employer.class, EmployerRequestDto.class);
    }

    @Override
    protected void decorateEntity(Employer entity, EmployerRequestDto dto) {
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setAddress(dto.getAddress());
        entity.setCustomers(dto.getCustomers().stream()
                .map(customer -> {
                    Optional<Customer> c = Optional.ofNullable(customer);
                    if (c.get().getId() > 0) {
                        c = customerRepository.findById(c.get().getId());
                    } else {
                        c.get().setPassword(customer.getPassword());
                    }
                    c.get().addEmployer(entity);
                    return c.get();
                })
                .collect(Collectors.toSet())
        );
    }
}