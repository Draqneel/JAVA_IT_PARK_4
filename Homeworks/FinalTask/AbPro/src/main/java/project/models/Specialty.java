package project.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "hstable")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Specialty {
    private Long id;
    private String name;
    private String host;
    private int points;
    private String citizen;
}
