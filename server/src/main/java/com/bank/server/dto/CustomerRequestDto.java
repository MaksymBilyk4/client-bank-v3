package com.bank.server.dto;

import com.bank.server.entity.Employer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDto {
    @Min(1)
    private Long id;

    @NotNull
    @Size(min = 2, message = "Customer`s name should have at least 2 characters")
    private String name;

    @Min(18)
    @NotNull
    private Integer age;

    @Email
//    @Pattern(regexp = "^(.+)@(\\\\S+)$")
    @NotNull
    private String email;

    //    @Pattern(regexp = "(\\+38|0)[0-9]{9}")
    @NotNull
    private String phoneNumber;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull
    private String password;

    @Override
    public String toString() {
        return "CustomerRequestDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
