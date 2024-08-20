package br.com.lucasnather.trip.application.services.brief;

import br.com.lucasnather.trip.application.gateways.BriefsRepository;
import br.com.lucasnather.trip.domain.Briefs;

import java.util.UUID;

public class UpdateBriefByIdService {

    private  final BriefsRepository briefsRepository;

    public UpdateBriefByIdService(BriefsRepository briefsRepository) {
        this.briefsRepository = briefsRepository;
    }

    public Briefs updateById(UUID id, Briefs briefs) {
        Briefs findBriefById = this.briefsRepository.findById(id).get();

        if(briefs.getName() != null) {
            findBriefById.setName(briefs.getName());
        }

        if(briefs.getBrief() != null) {
            findBriefById.setBrief(briefs.getBrief());
        }

        if(briefs.getPhoto() != null) {
            findBriefById.setPhoto(briefs.getPhoto());
        }

        return this.briefsRepository.updateById(id, findBriefById);
    }
}
