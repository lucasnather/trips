package br.com.lucasnather.trip.infra.gateways.destination;

import br.com.lucasnather.trip.domain.Destinations;
import br.com.lucasnather.trip.infra.persistence.destination.DestinationsEntity;

public class DestinationMapper {

    Destinations toDomain(DestinationsEntity destinyEntity) {

        return  new Destinations(destinyEntity.getId(), destinyEntity.getPhoto(), destinyEntity.getName(), destinyEntity.getPrice(), destinyEntity.getCreatedAt());
    }

    DestinationsEntity toEntity(Destinations destiny) {
        return  new DestinationsEntity(destiny.getId(), destiny.getPhoto(), destiny.getName(), destiny.getPrice(), destiny.getCreatedAt());
    }
}
