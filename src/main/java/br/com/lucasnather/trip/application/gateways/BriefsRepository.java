package br.com.lucasnather.trip.application.gateways;

import br.com.lucasnather.trip.domain.Briefs;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BriefsRepository {

    Briefs create(Briefs briefs);
    List<Briefs> findMany();
    void deleteById(UUID id);
    Optional<Briefs> findById(UUID id);
    Briefs updateById(UUID id, Briefs briefs);
    List<Briefs> findThree();
}
