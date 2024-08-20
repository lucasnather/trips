package br.com.lucasnather.trip.application.services.briefs;

import br.com.lucasnather.trip.application.gateways.BriefsRepository;
import br.com.lucasnather.trip.domain.Briefs;

public class CreateBriefService {

    private final BriefsRepository briefsRepository;

    public  CreateBriefService(BriefsRepository briefsRepository) {
        this.briefsRepository = briefsRepository;
    }

    public Briefs create(Briefs briefs) {
        return this.briefsRepository.create(briefs);
    }
}
