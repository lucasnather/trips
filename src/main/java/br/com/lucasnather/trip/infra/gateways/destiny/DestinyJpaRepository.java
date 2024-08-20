package br.com.lucasnather.trip.infra.gateways.destiny;

import br.com.lucasnather.trip.application.gateways.DestinyRepository;
import br.com.lucasnather.trip.domain.Destiny;
import br.com.lucasnather.trip.infra.persistence.destiny.DestinyEntity;
import br.com.lucasnather.trip.infra.persistence.destiny.DestinyRepositoryJpa;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class DestinyJpaRepository implements DestinyRepository {

    private final DestinyRepositoryJpa destinyRepositoryJpa;
    private  final DestinyMapper destinyMapper;

    public DestinyJpaRepository(DestinyRepositoryJpa destinyRepositoryJpa, DestinyMapper destinyMapper) {
        this.destinyMapper = destinyMapper;
        this.destinyRepositoryJpa = destinyRepositoryJpa;
    }

    @Override
    public Destiny create(Destiny destiny) {
        DestinyEntity destinyEntity = this.destinyMapper.toEntity(destiny);
        this.destinyRepositoryJpa.save(destinyEntity);
        return  this.destinyMapper.toDomain(destinyEntity);
    }

    @Override
    public List<Destiny> findMany() {
        return  this.destinyRepositoryJpa.findAll()
                .stream()
                .map(this.destinyMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(UUID id) {

    }

    @Override
    public Optional<Destiny> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Destiny updateById(UUID id, Destiny destiny) {
        return null;
    }
}
