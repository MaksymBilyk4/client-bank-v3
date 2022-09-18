package com.bank.server.dto;

import com.bank.server.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployerRequestDto {
    @Min(1)
    private Long id;

    @Size(min = 3, message = "Employer`s name should have at least 2 characters")
    @NotNull
    private String name;

    @Size(min = 3, message = "Employer`s address should have at least 2 characters")
    @NotNull
    private String address;

    private Set<Customer> customers = new HashSet<>();

    @Override
    public String toString() {
        return "EmployerRequestDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", customers=" + customers +
                '}';
    }
}