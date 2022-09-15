package com.bank.server.service;

import com.bank.server.dao.AccountRepository;
import com.bank.server.dao.CustomerRepository;
import com.bank.server.entity.Account;
import com.bank.server.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final AccountRepository accountRepository;

    @Transactional(readOnly = true)
    public List<Customer> findAll () {
        return customerRepository.findAll();
    }

    public Customer create (Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteById (Long id) {
        customerRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Optional<Customer> findById (Long id) {
        return customerRepository.findById(id);
    }

    public Customer update (Customer customer) {
        return customerRepository.save(customer);
    }


    public void createAccount (Account account, Long id) {
        Optional<Customer> customer = findById(id);
        customer.get().addAccount(account);
        account.setNumber(UUID.randomUUID().toString());
        account.setCustomer(customer.get());
        accountRepository.save(account);
    }
}
