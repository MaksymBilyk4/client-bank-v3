package com.bank.server.mapper;

import com.bank.server.dto.AccountResponseDto;
import com.bank.server.dto.CustomerResponseDto;
import com.bank.server.entity.Customer;
import com.bank.server.entity.Employer;
import org.springframework.stereotype.Service;


@Service
public class CustomerResponseDtoMapper extends DtoMapperFacade<Customer, CustomerResponseDto> {
    public CustomerResponseDtoMapper() {
        super(Customer.class, CustomerResponseDto.class);
    }

    @Override
    protected void decorateDto(CustomerResponseDto dto, Customer entity) {
        for (AccountResponseDto account: dto.getAccounts()) {
            account.setCustomerId(entity.getId());
        }
        for (Employer employer : entity.getEmployers()) {
            dto.getEmployersIds().add(employer.getId());
        }
        entity.setPassword(dto.getPassword());
    }

}
