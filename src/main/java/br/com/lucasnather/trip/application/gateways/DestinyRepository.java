package br.com.lucasnather.trip.application.gateways;

import br.com.lucasnather.trip.domain.Destinations;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DestinyRepository {
    Destinations create(Destinations destiny);
    List<Destinations> findMany();
    void deleteById(UUID id);
    Optional<Destinations> findById(UUID id);
    Destinations updateById(UUID id, Destinations destiny);
}
