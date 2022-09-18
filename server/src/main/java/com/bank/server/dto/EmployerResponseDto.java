package com.bank.server.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployerResponseDto {
    private Long id;

    private String name;

    private String address;

    @JsonProperty("customers")
    private Set<Long> customersIds = new HashSet<>();

    @Override
    public String toString() {
        return "EmployerResponseDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", customersIds=" + customersIds +
                '}';
    }
}
