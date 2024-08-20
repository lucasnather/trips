package br.com.lucasnather.trip.infra.persistence.destination;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DestinationRepositoryJpa extends JpaRepository<DestinationsEntity, UUID> {
}
