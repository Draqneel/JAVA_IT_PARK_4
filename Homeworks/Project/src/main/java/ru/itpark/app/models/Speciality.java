package ru.itpark.app.models;

//Last update

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "hstable")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Speciality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int specid;


    private String name;
    private String host;
    private String citizen;
    private int points;

}
