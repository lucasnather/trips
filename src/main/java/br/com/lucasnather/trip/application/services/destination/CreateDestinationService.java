package br.com.lucasnather.trip.application.services.destination;

import br.com.lucasnather.trip.application.gateways.DestinyRepository;
import br.com.lucasnather.trip.domain.Destinations;

public class CreateDestinationService {

    private  final DestinyRepository destinyRepository;

    public CreateDestinationService(DestinyRepository destinyRepository) {
        this.destinyRepository = destinyRepository;
    }

    public Destinations create(Destinations destiny) {
        return  this.destinyRepository.create(destiny);
    }

}
