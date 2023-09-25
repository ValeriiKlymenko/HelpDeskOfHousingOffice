package com.klimjavadev.HelpDeskOfHousingOffice.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "housing_offices")
public class HousingOffice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Pattern(regexp = "[A-Z][a-z]+", message = "Must start with a capital letter followed by one or more lowercase letters")
    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "housingOffice")
    private List<Building> buildings;
}
