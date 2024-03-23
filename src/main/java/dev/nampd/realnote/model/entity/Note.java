package dev.nampd.realnote.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String description;

    private LocalDate createdAt;

    @ManyToOne(targetEntity = User.class)
    private User user;
}
