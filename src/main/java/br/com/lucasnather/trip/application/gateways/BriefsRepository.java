package br.com.lucasnather.trip.application.gateways;

import br.com.lucasnather.trip.domain.Briefs;

import java.util.List;
import java.util.UUID;

public interface BriefsRepository {

    Briefs create(Briefs briefs);
    List<Briefs> findMany();
    void deleteById(UUID id);
}
