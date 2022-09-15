package com.bank.server.mapper;

import com.bank.server.dto.CustomerRequestDto;
import com.bank.server.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerRequestDtoMapper extends DtoMapperFacade<Customer, CustomerRequestDto>{
    public CustomerRequestDtoMapper() {
        super(Customer.class, CustomerRequestDto.class);
    }

    @Override
    protected void decorateDto(CustomerRequestDto dto, Customer entity) {

    }
}
