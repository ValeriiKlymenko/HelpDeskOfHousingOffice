package com.klimjavadev.HelpDeskOfHousingOffice.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Pattern(regexp = "[A-Z][a-z]+",
            message = "Must start with a capital letter followed by one or more lowercase letters")
    @Column(name = "country", nullable = false)
    private String country;

    @Pattern(regexp = "[A-Z][a-z]+",
            message = "Must start with a capital letter followed by one or more lowercase letters")
    @Column(name = "city", nullable = false)
    private String city;

    @Pattern(regexp = "[A-Z][a-z]+",
            message = "Must start with a capital letter followed by one or more lowercase letters")
    @Column(name = "oblast", nullable = false)
    private String oblast;

    @Pattern(regexp = "[A-Z][a-z]+",
            message = "Must start with a capital letter followed by one or more lowercase letters")
    @Column(name = "region", nullable = false)
    private String region;

    @Pattern(regexp = "[A-Z][a-z]+",
            message = "Must start with a capital letter followed by one or more lowercase letters")
    @Column(name = "street", nullable = false)
    private String street;

    @NotBlank(message = "The 'houseNumber' cannot be empty")
    @Column(name = "houseNumber", nullable = false, unique = true)
    private int houseNumber;

    @NotBlank(message = "The 'zipcode' cannot be empty")
    @Column(name = "zipcode", nullable = false, unique = true)
    private int zipcode;
}
