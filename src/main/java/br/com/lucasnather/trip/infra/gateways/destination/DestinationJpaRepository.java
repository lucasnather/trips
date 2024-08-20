package br.com.lucasnather.trip.infra.gateways.destination;

import br.com.lucasnather.trip.application.gateways.DestinyRepository;
import br.com.lucasnather.trip.domain.Destinations;
import br.com.lucasnather.trip.infra.persistence.brief.BriefsEntity;
import br.com.lucasnather.trip.infra.persistence.destination.DestinationsEntity;
import br.com.lucasnather.trip.infra.persistence.destination.DestinationRepositoryJpa;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class DestinationJpaRepository implements DestinyRepository {

    private final DestinationRepositoryJpa destinyRepositoryJpa;
    private  final DestinationMapper destinyMapper;

    public DestinationJpaRepository(DestinationRepositoryJpa destinyRepositoryJpa, DestinationMapper destinyMapper) {
        this.destinyMapper = destinyMapper;
        this.destinyRepositoryJpa = destinyRepositoryJpa;
    }

    @Override
    public Destinations create(Destinations destiny) {
        DestinationsEntity destinyEntity = this.destinyMapper.toEntity(destiny);
        this.destinyRepositoryJpa.save(destinyEntity);
        return  this.destinyMapper.toDomain(destinyEntity);
    }

    @Override
    public List<Destinations> findMany() {
        return  this.destinyRepositoryJpa.findAll()
                .stream()
                .map(this.destinyMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(UUID id) {
        this.destinyRepositoryJpa.deleteById(id);
    }

    @Override
    public Optional<Destinations> findById(UUID id) {
        DestinationsEntity destinyEntity = this.destinyRepositoryJpa.findById(id).get();

        return Optional.ofNullable(this.destinyMapper.toDomain(destinyEntity));
    }

    @Override
    public Destinations updateById(UUID id, Destinations destinations) {
        Optional<DestinationsEntity> findBriefById = this.destinyRepositoryJpa.findById(id);

        if(findBriefById.isEmpty()) throw new RuntimeException("Brief not exist");

        DestinationsEntity destinationsEntity = this.destinyMapper.toEntity(destinations);

        DestinationsEntity updateDestination = this.destinyRepositoryJpa.save(destinationsEntity);

        return  this.destinyMapper.toDomain(updateDestination);
    }
}
