package br.com.lucasnather.trip.infra.persistence.destiny;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "destiny")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DestinyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    @URL
    private String photo;

    @Column
    private String name;

    @Column
    private Double price;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
