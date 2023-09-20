package com.klimjavadev.HelpDeskOfHousingOffice.models.entities;

import com.klimjavadev.HelpDeskOfHousingOffice.models.enums.State;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "buildings")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private State state;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "housingOffice_id")
    private HousingOffice housingOffice;

    @OneToMany(mappedBy = "building")
    private List<Room> rooms;

    @OneToMany(mappedBy = "building")
    private List<Request> requests;

}
