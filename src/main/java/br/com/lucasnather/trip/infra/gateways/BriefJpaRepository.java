package br.com.lucasnather.trip.infra.gateways;

import br.com.lucasnather.trip.application.gateways.BriefsRepository;
import br.com.lucasnather.trip.domain.Briefs;
import br.com.lucasnather.trip.infra.persistence.BriefRepositoryJpa;
import br.com.lucasnather.trip.infra.persistence.BriefsEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

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

    @Override
    public List<Briefs> findMany() {
       return  this.briefRepositoryJpa.findAll()
               .stream()
               .map(this.briefMapper::toDomain)
               .collect(Collectors.toList());
    }

    @Override
    public void deleteById(UUID id) {
        this.briefRepositoryJpa.deleteById(id);
    }

    @Override
    public Optional<Briefs> findById(UUID id) {
        BriefsEntity briefsEntity = this.briefRepositoryJpa.findById(id).get();

       return Optional.ofNullable(this.briefMapper.toDomain(briefsEntity));
    }

    @Override
    public Briefs updateById(UUID id, Briefs briefs) {
        Optional<BriefsEntity> findBriefById = this.briefRepositoryJpa.findById(id);

        if(findBriefById.isEmpty()) throw new RuntimeException("Brief not exist");

        BriefsEntity briefsEntity = this.briefMapper.toEntity(briefs);

        BriefsEntity updateBrief = this.briefRepositoryJpa.save(briefsEntity);

        return  this.briefMapper.toDomain(updateBrief);
    }
}
