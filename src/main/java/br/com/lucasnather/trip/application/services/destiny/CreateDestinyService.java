package br.com.lucasnather.trip.application.services.destiny;

import br.com.lucasnather.trip.application.gateways.DestinyRepository;
import br.com.lucasnather.trip.domain.Destiny;

public class CreateDestinyService {

    private  final DestinyRepository destinyRepository;

    public  CreateDestinyService(DestinyRepository destinyRepository) {
        this.destinyRepository = destinyRepository;
    }

    public Destiny create(Destiny destiny) {
        return  this.destinyRepository.create(destiny);
    }

}
