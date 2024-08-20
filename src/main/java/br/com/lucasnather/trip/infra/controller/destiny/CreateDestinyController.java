package br.com.lucasnather.trip.infra.controller.destiny;

import br.com.lucasnather.trip.application.services.destiny.CreateDestinyService;
import br.com.lucasnather.trip.domain.Destiny;
import br.com.lucasnather.trip.infra.controller.destiny.dto.CreateDestinyDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/destinos")
@RestController()
public class CreateDestinyController {

    private final CreateDestinyService createDestinyService;

    public CreateDestinyController(CreateDestinyService createDestinyService) {
        this.createDestinyService = createDestinyService;
    }

    @PostMapping
    public Destiny post( @RequestBody CreateDestinyDTO createDestinyDTO) {
        Destiny destiny = new Destiny(createDestinyDTO.photo(), createDestinyDTO.name(), createDestinyDTO.price());

        return this.createDestinyService.create(destiny);
    }
}
