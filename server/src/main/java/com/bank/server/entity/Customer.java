package com.bank.server.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
@Entity
public class Customer extends AbstractEntity{
    private String name;
    private String email;
    private Integer age;
    @JsonIgnore
    private String password;
    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Account> accounts = new LinkedHashSet<>();

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    public Customer addAccount (Account account) {
        accounts.add(account);
        account.setCustomer(this);
        return this;
    }
}
