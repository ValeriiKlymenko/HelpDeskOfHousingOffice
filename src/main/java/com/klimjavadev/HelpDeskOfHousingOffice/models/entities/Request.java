package com.klimjavadev.HelpDeskOfHousingOffice.models.entities;

import com.klimjavadev.HelpDeskOfHousingOffice.models.enums.Status;
import com.klimjavadev.HelpDeskOfHousingOffice.models.enums.Task;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "requests")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Pattern(regexp = "[A-Z][a-z]+", message = "Must start with a capital letter followed by one or more lowercase letters")
    @Column(name = "description", nullable = false)//(null)
    private String description;

//    @Lob
//    @Column(name = "filePhoto")
//    private byte[] filePhoto;

    @Column(name = "data_created", nullable = false)
    private LocalDateTime dataCreated;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "task")
    @Enumerated(EnumType.STRING)
    private Task task;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;
}
