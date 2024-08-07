package br.com.lucasnather.trip.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BriefRepositoryJpa extends JpaRepository<BriefsEntity, UUID> {
}
