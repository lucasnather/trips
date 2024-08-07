package br.com.lucasnather.trip.infra.gateways;

import br.com.lucasnather.trip.application.gateways.BriefsRepository;
import br.com.lucasnather.trip.domain.Briefs;
import br.com.lucasnather.trip.infra.persistence.BriefRepositoryJpa;
import br.com.lucasnather.trip.infra.persistence.BriefsEntity;

public class BriefJpaRepository implements BriefsRepository {

    private final BriefMapper briefMapper;
    private final BriefRepositoryJpa briefRepositoryJpa;

    public BriefJpaRepository(BriefMapper briefMapper, BriefRepositoryJpa briefRepositoryJpa) {
        this.briefMapper = briefMapper;
        this.briefRepositoryJpa =  briefRepositoryJpa;
    }


    @Override
    public Briefs create(Briefs briefs) {
        BriefsEntity briefsEntity = this.briefMapper.toEntity(briefs);
        this.briefRepositoryJpa.save(briefsEntity);

        return this.briefMapper.toDomain(briefsEntity);
    }
}
