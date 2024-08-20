package br.com.lucasnather.trip.infra.controller.brief;

import br.com.lucasnather.trip.application.services.brief.UpdateBriefByIdService;
import br.com.lucasnather.trip.domain.Briefs;
import br.com.lucasnather.trip.infra.controller.brief.dto.CreateBriefDto;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.UUID;

@RestController
@RequestMapping("/api/depoimentos")
public class UpdateBriefByIdController {

    private final UpdateBriefByIdService updateBriefByIdService;

    public UpdateBriefByIdController(UpdateBriefByIdService updateBriefByIdService) {
        this.updateBriefByIdService = updateBriefByIdService;
    }

    @PutMapping("/{id}")
    public Object put(@RequestBody @Valid CreateBriefDto createBriefDto, @PathVariable("id") String id) {
        UUID uuidFromString = UUID.fromString(id);

        Briefs briefs = new Briefs(uuidFromString, createBriefDto.photo(), createBriefDto.brief(), createBriefDto.name());

        try {
            Briefs updateBrief = this.updateBriefByIdService.updateById(uuidFromString, briefs);

            return updateBrief;
        } catch (RuntimeException ex) {
            return Arrays.asList(ex.getMessage());
        }
    }
}
