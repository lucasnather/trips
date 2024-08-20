package br.com.lucasnather.trip.application.services.destiny;

import br.com.lucasnather.trip.application.gateways.DestinyRepository;
import br.com.lucasnather.trip.domain.Destiny;

import java.util.Optional;
import java.util.UUID;

public class DeleteDestinyByIdService {

    private final DestinyRepository destinyRepository;

    public  DeleteDestinyByIdService(DestinyRepository destinyRepository) {
        this.destinyRepository = destinyRepository;
    }

    public  void deleteById(UUID id) {
        Optional<Destiny> destiny = this.destinyRepository.findById(id);

        if(destiny.isEmpty()) throw  new RuntimeException("Destiny Not Foundd");

        this.destinyRepository.deleteById(destiny.get().getId());

    }
}
