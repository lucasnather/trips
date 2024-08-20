package br.com.lucasnather.trip.application.services.destiny;

import br.com.lucasnather.trip.application.gateways.DestinyRepository;
import br.com.lucasnather.trip.domain.Destiny;

import java.util.List;

public class FindManyDestinyService {

    private final DestinyRepository destinyRepository;

    public  FindManyDestinyService(DestinyRepository destinyRepository) {
        this.destinyRepository = destinyRepository;
    }

    public List<Destiny> findMany() {
        return this.destinyRepository.findMany();
    }
}
