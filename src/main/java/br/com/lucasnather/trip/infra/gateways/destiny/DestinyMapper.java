package br.com.lucasnather.trip.infra.gateways.destiny;

import br.com.lucasnather.trip.domain.Destiny;
import br.com.lucasnather.trip.infra.persistence.destiny.DestinyEntity;

public class DestinyMapper {

    Destiny toDomain(DestinyEntity destinyEntity) {

        return  new Destiny(destinyEntity.getId(), destinyEntity.getPhoto(), destinyEntity.getName(), destinyEntity.getPrice(), destinyEntity.getCreatedAt());
    }

    DestinyEntity toEntity(Destiny destiny) {
        return  new DestinyEntity(destiny.getId(), destiny.getPhoto(), destiny.getName(), destiny.getPrice(), destiny.getCreatedAt());
    }
}
