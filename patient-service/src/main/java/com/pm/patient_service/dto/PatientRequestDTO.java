package com.pm.patient_service.dto;

import com.pm.patient_service.dto.validators.CreatePatientValidationGroup;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {
    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name cannot exceed 100 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "address should be valid")
    private String address ;

    @NotBlank(message="Date of Birth should be valid")
    private String dateOfBirth;

    @NotBlank(groups = CreatePatientValidationGroup.class, message = "Registered date is required")
    private static String registeredDate;


    public @NotBlank(message = "Email is required") @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Email should be valid") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Name is required") @Size(max = 100, message = "Name cannot exceed 100 characters") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name is required") @Size(max = 100, message = "Name cannot exceed 100 characters") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Email is required")  String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank(message = "Email is required")  String address) {
        this.address = address;
    }

    public @NotBlank(message = "Date of Birth should be valid") String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(@NotBlank(message = "Date of Birth should be valid") String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static  String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate( String registeredDate) {
        this.registeredDate = registeredDate;
    }
}


