package ru.itpark.app.models;
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
    private String hashID;
    private String name;
    private String host;
    private String points;
    private String citizen;
}
