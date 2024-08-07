package br.com.lucasnather.trip.infra.gateways;

import br.com.lucasnather.trip.domain.Briefs;
import br.com.lucasnather.trip.infra.persistence.BriefsEntity;

public class BriefMapper {

    public Briefs toDomain(BriefsEntity briefsEntity) {
        return  new Briefs(briefsEntity.getId(), briefsEntity.getPhoto(), briefsEntity.getBrief(), briefsEntity.getName(), briefsEntity.getCreatedAt());
    }

    public BriefsEntity toEntity(Briefs briefs) {
        return  new BriefsEntity(briefs.getId(), briefs.getPhoto(), briefs.getBrief(), briefs.getName(), briefs.getCreatedAt());
    }
}
