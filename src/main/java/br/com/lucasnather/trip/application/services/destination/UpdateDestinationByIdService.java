package br.com.lucasnather.trip.application.services.destination;

import br.com.lucasnather.trip.application.gateways.BriefsRepository;
import br.com.lucasnather.trip.application.gateways.DestinyRepository;
import br.com.lucasnather.trip.domain.Briefs;
import br.com.lucasnather.trip.domain.Destinations;

import java.util.UUID;

public class UpdateDestinationByIdService {

    private  final DestinyRepository destinyRepository;

    public UpdateDestinationByIdService(DestinyRepository destinyRepository) {
        this.destinyRepository = destinyRepository;
    }

    public Destinations updateById(UUID id, Destinations destinations) {
        Destinations findDestinationById = this.destinyRepository.findById(id).get();

        if(destinations.getName() != null) {
            findDestinationById.setName(destinations.getName());
        }

        if(destinations.getPrice() != null) {
            findDestinationById.setPrice(destinations.getPrice());
        }

        if(destinations.getPhoto() != null) {
            findDestinationById.setPhoto(destinations.getPhoto());
        }

        return this.destinyRepository.updateById(id, findDestinationById);
    }
}
