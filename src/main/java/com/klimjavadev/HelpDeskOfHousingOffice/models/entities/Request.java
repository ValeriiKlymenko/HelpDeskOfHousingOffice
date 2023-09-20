package com.klimjavadev.HelpDeskOfHousingOffice.models.entities;

import com.klimjavadev.HelpDeskOfHousingOffice.models.enums.Status;
import com.klimjavadev.HelpDeskOfHousingOffice.models.enums.Task;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
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
    @Column(name = "description", nullable = true)//(null)
    private String description;

    @Column(name = "filePhoto", nullable = true)//(null)
    private File filePhoto;

    @Column(name = "dataCreated", nullable = true)//(now)
    private Date dataCreated;

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
