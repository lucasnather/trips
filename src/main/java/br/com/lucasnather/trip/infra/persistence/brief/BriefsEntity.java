package br.com.lucasnather.trip.infra.persistence.brief;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "briefs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BriefsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    @URL
    private String photo;

    @Column
    @Length(min = 10, max = 100)
    private String brief;

    @Column
    private String name;

    @Column
    @CreationTimestamp
    private LocalDateTime createdAt;
}
