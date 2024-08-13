package br.com.lucasnather.trip.config;

import br.com.lucasnather.trip.application.gateways.BriefsRepository;
import br.com.lucasnather.trip.application.services.CreateBriefService;
import br.com.lucasnather.trip.application.services.DeleteBriefByIdService;
import br.com.lucasnather.trip.application.services.FindManyBriefService;
import br.com.lucasnather.trip.application.services.UpdateBriefByIdService;
import br.com.lucasnather.trip.infra.gateways.BriefJpaRepository;
import br.com.lucasnather.trip.infra.gateways.BriefMapper;
import br.com.lucasnather.trip.infra.persistence.BriefRepositoryJpa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TripConfig {

    @Bean
    CreateBriefService createBriefService(BriefsRepository briefsRepository) {
        return new CreateBriefService(briefsRepository);
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
    BriefJpaRepository briefJpaRepository(BriefRepositoryJpa briefRepositoryJpa, BriefMapper briefMapper) {
        return new BriefJpaRepository(briefMapper, briefRepositoryJpa);
    }

    @Bean
    BriefMapper briefMapper() {
        return  new BriefMapper();
    }
}
