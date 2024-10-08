package br.com.lucasnather.trip.infra.controller.brief;

import br.com.lucasnather.trip.application.services.brief.CreateBriefService;
import br.com.lucasnather.trip.domain.Briefs;
import br.com.lucasnather.trip.infra.controller.brief.dto.CreateBriefDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/api/depoimentos")
public class CreateBriefController {

    private final CreateBriefService createBriefService;

    public  CreateBriefController(CreateBriefService createBriefService) {
        this.createBriefService = createBriefService;
    }

    @PostMapping
    Briefs post(@RequestBody CreateBriefDto createBriefDto) {
        UUID id = UUID.randomUUID();
        LocalDateTime createdAt = LocalDateTime.now();
        Briefs briefs = new Briefs(id, createBriefDto.photo(), createBriefDto.brief(), createBriefDto.name(), createdAt);

        return  this.createBriefService.create(briefs);
    }
}
