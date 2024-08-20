package br.com.lucasnather.trip.application.services.destination;

import br.com.lucasnather.trip.application.gateways.DestinyRepository;
import br.com.lucasnather.trip.domain.Destinations;

import java.util.List;

public class FindManyDestinationsService {

    private final DestinyRepository destinyRepository;

    public FindManyDestinationsService(DestinyRepository destinyRepository) {
        this.destinyRepository = destinyRepository;
    }

    public List<Destinations> findMany() {
        return this.destinyRepository.findMany();
    }
}
