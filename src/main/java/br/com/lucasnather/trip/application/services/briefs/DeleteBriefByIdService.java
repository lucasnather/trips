package br.com.lucasnather.trip.application.services.briefs;

import br.com.lucasnather.trip.application.gateways.BriefsRepository;
import br.com.lucasnather.trip.domain.Briefs;

import java.util.Optional;
import java.util.UUID;

public class DeleteBriefByIdService {

    private final BriefsRepository briefsRepository;

    public  DeleteBriefByIdService(BriefsRepository briefsRepository) {
        this.briefsRepository = briefsRepository;
    }

    public  void deleteById(UUID id) {
        Optional<Briefs> briefs = this.briefsRepository.findById(id);

        if(briefs.isEmpty()) throw  new RuntimeException("Brief Not Found");

        this.briefsRepository.deleteById(briefs.get().getId());

    }
}
