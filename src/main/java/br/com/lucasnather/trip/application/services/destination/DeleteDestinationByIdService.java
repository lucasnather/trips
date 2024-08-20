package br.com.lucasnather.trip.application.services.destination;

import br.com.lucasnather.trip.application.gateways.DestinyRepository;
import br.com.lucasnather.trip.domain.Destinations;

import java.util.Optional;
import java.util.UUID;

public class DeleteDestinationByIdService {

    private final DestinyRepository destinyRepository;

    public DeleteDestinationByIdService(DestinyRepository destinyRepository) {
        this.destinyRepository = destinyRepository;
    }

    public  void deleteById(UUID id) {
        Optional<Destinations> destiny = this.destinyRepository.findById(id);

        if(destiny.isEmpty()) throw  new RuntimeException("Destiny Not Foundd");

        this.destinyRepository.deleteById(destiny.get().getId());

    }
}
