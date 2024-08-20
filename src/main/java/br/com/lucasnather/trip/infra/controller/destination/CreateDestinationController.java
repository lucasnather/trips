package br.com.lucasnather.trip.infra.controller.destination;

import br.com.lucasnather.trip.application.services.destination.CreateDestinationService;
import br.com.lucasnather.trip.domain.Destinations;
import br.com.lucasnather.trip.infra.controller.destination.dto.CreateDestinyDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/destinos")
@RestController()
public class CreateDestinationController {

    private final CreateDestinationService createDestinyService;

    public CreateDestinationController(CreateDestinationService createDestinyService) {
        this.createDestinyService = createDestinyService;
    }

    @PostMapping
    public Destinations post(@RequestBody CreateDestinyDTO createDestinyDTO) {
        Destinations destiny = new Destinations(createDestinyDTO.photo(), createDestinyDTO.name(), createDestinyDTO.price());

        return this.createDestinyService.create(destiny);
    }
}
