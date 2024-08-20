package br.com.lucasnather.trip.config;

import br.com.lucasnather.trip.application.gateways.BriefsRepository;
import br.com.lucasnather.trip.application.gateways.DestinyRepository;
import br.com.lucasnather.trip.application.services.briefs.*;
import br.com.lucasnather.trip.application.services.destiny.CreateDestinyService;
import br.com.lucasnather.trip.infra.gateways.brief.BriefJpaRepository;
import br.com.lucasnather.trip.infra.gateways.brief.BriefMapper;
import br.com.lucasnather.trip.infra.gateways.destiny.DestinyJpaRepository;
import br.com.lucasnather.trip.infra.gateways.destiny.DestinyMapper;
import br.com.lucasnather.trip.infra.persistence.brief.BriefRepositoryJpa;
import br.com.lucasnather.trip.infra.persistence.destiny.DestinyRepositoryJpa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TripConfig {

    @Bean
    CreateBriefService createBriefService(BriefsRepository briefsRepository) {
        return new CreateBriefService(briefsRepository);
    }

    @Bean
    CreateDestinyService createDestinyService(DestinyRepository destinyRepository) {
        return new CreateDestinyService(destinyRepository);
    }


    @Bean
    FindManyBriefService findManyBriefService(BriefsRepository briefsRepository) {
        return new FindManyBriefService(briefsRepository);
    }

    @Bean
    DeleteBriefByIdService deleteBriefByIdService(BriefsRepository briefsRepository) {
        return new DeleteBriefByIdService(briefsRepository);
    }

    @Bean
    UpdateBriefByIdService updateBriefByIdService(BriefsRepository briefsRepository) {
        return  new UpdateBriefByIdService(briefsRepository);
    }

    @Bean
    FindThreeBriefsRandomlyService findThreeBriefsRandomlyService(BriefsRepository briefsRepository) {
        return  new FindThreeBriefsRandomlyService(briefsRepository);
    }


    @Bean
    BriefJpaRepository briefJpaRepository(BriefRepositoryJpa briefRepositoryJpa, BriefMapper briefMapper) {
        return new BriefJpaRepository(briefMapper, briefRepositoryJpa);
    }

    @Bean
    DestinyJpaRepository destinyJpaRepository(DestinyRepositoryJpa destinyRepositoryJpa, DestinyMapper destinyMapper) {
        return new DestinyJpaRepository(destinyRepositoryJpa, destinyMapper);
    }

    @Bean
    BriefMapper briefMapper() {
        return  new BriefMapper();
    }

    @Bean
    DestinyMapper destinyMapper() {
        return  new DestinyMapper();
    }
}
