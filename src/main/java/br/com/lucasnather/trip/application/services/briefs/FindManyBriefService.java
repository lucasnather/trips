package br.com.lucasnather.trip.application.services.briefs;

import br.com.lucasnather.trip.application.gateways.BriefsRepository;
import br.com.lucasnather.trip.domain.Briefs;

import java.util.List;

public class FindManyBriefService {

    private final BriefsRepository briefsRepository;

    public  FindManyBriefService(BriefsRepository briefsRepository) {
        this.briefsRepository = briefsRepository;
    }

    public List<Briefs> findMany() {
        return this.briefsRepository.findMany();
    }
}
