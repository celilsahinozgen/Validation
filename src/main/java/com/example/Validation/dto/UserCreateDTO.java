package com.example.Validation.dto;

import com.example.Validation.controller.valid.TCKNConstraint;
import com.example.Validation.controller.valid.UserNameConstraint;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserCreateDTO {

    @UserNameConstraint
    String firstName;

    String lastName;

    @TCKNConstraint
    String tcNo;

    String mail;

    String sifre;
}
