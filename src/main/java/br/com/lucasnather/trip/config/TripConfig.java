package br.com.lucasnather.trip.config;

import br.com.lucasnather.trip.application.gateways.BriefsRepository;
import br.com.lucasnather.trip.application.gateways.DestinyRepository;
import br.com.lucasnather.trip.application.services.brief.*;
import br.com.lucasnather.trip.application.services.destination.CreateDestinationService;
import br.com.lucasnather.trip.application.services.destination.DeleteDestinationByIdService;
import br.com.lucasnather.trip.application.services.destination.FindManyDestinationsService;
import br.com.lucasnather.trip.application.services.destination.UpdateDestinationByIdService;
import br.com.lucasnather.trip.infra.gateways.brief.BriefJpaRepository;
import br.com.lucasnather.trip.infra.gateways.brief.BriefMapper;
import br.com.lucasnather.trip.infra.gateways.destination.DestinationJpaRepository;
import br.com.lucasnather.trip.infra.gateways.destination.DestinationMapper;
import br.com.lucasnather.trip.infra.persistence.brief.BriefRepositoryJpa;
import br.com.lucasnather.trip.infra.persistence.destination.DestinationRepositoryJpa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TripConfig {

    @Bean
    CreateBriefService createBriefService(BriefsRepository briefsRepository) {
        return new CreateBriefService(briefsRepository);
    }

    @Bean
    CreateDestinationService createDestinyService(DestinyRepository destinyRepository) {
        return new CreateDestinationService(destinyRepository);
    }


    @Bean
    FindManyBriefService findManyBriefService(BriefsRepository briefsRepository) {
        return new FindManyBriefService(briefsRepository);
    }

    @Bean
    FindManyDestinationsService findManyDestinyService(DestinyRepository destinyRepository) {
        return new FindManyDestinationsService(destinyRepository);
    }

    @Bean
    DeleteBriefByIdService deleteBriefByIdService(BriefsRepository briefsRepository) {
        return new DeleteBriefByIdService(briefsRepository);
    }

    @Bean
    DeleteDestinationByIdService deleteDestinyByIdService(DestinyRepository destinyRepository) {
        return new DeleteDestinationByIdService(destinyRepository);
    }

    @Bean
    UpdateBriefByIdService updateBriefByIdService(BriefsRepository briefsRepository) {
        return  new UpdateBriefByIdService(briefsRepository);
    }

    @Bean
    UpdateDestinationByIdService updateDestinationByIdService(DestinyRepository destinyRepository) {
        return  new UpdateDestinationByIdService(destinyRepository);
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
    DestinationJpaRepository destinyJpaRepository(DestinationRepositoryJpa destinyRepositoryJpa, DestinationMapper destinyMapper) {
        return new DestinationJpaRepository(destinyRepositoryJpa, destinyMapper);
    }

    @Bean
    BriefMapper briefMapper() {
        return  new BriefMapper();
    }

    @Bean
    DestinationMapper destinyMapper() {
        return  new DestinationMapper();
    }
}
