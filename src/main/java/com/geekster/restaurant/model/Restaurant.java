package com.geekster.restaurant.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class Restaurant {

    private Integer id;

    @NotBlank(message = "Restaurant name is required")
    private String name;

    @NotBlank(message = "Restaurant address is required")
    private String address;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "\\d{10}", message = "Phone number must be a 10-digit number")
    private String number;


    private Speciality specialty;

    private int totalStaffs;
}
