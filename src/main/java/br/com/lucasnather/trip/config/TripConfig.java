package br.com.lucasnather.trip.config;

import br.com.lucasnather.trip.application.gateways.BriefsRepository;
import br.com.lucasnather.trip.application.services.CreateBriefService;
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
    BriefJpaRepository briefJpaRepository(BriefRepositoryJpa briefRepositoryJpa, BriefMapper briefMapper) {
        return new BriefJpaRepository(briefMapper, briefRepositoryJpa);
    }

    @Bean
    BriefMapper briefMapper() {
        return  new BriefMapper();
    }
}
