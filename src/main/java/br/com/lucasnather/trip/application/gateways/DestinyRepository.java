package br.com.lucasnather.trip.application.gateways;

import br.com.lucasnather.trip.domain.Briefs;
import br.com.lucasnather.trip.domain.Destiny;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DestinyRepository {
    Destiny create(Destiny destiny);
    List<Destiny> findMany();
    void deleteById(UUID id);
    Optional<Destiny> findById(UUID id);
    Destiny updateById(UUID id, Destiny destiny);
}
