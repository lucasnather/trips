package br.com.lucasnather.trip.infra.controller.destination;

import br.com.lucasnather.trip.application.services.brief.UpdateBriefByIdService;
import br.com.lucasnather.trip.application.services.destination.UpdateDestinationByIdService;
import br.com.lucasnather.trip.domain.Briefs;
import br.com.lucasnather.trip.domain.Destinations;
import br.com.lucasnather.trip.infra.controller.brief.dto.CreateBriefDto;
import br.com.lucasnather.trip.infra.controller.destination.dto.CreateDestinationDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.UUID;

@RestController
@RequestMapping("/api/destinos")
public class UpdateDestionationByIdController {

    private final UpdateDestinationByIdService updateDestinationByIdService;

    public UpdateDestionationByIdController(UpdateDestinationByIdService updateDestinationByIdService) {
        this.updateDestinationByIdService = updateDestinationByIdService;
    }

    @PutMapping("/{id}")
    public Object put(@RequestBody @Valid CreateDestinationDTO destinationDTO, @PathVariable("id") String id) {
        UUID uuidFromString = UUID.fromString(id);

        Destinations destinations = new Destinations(uuidFromString, destinationDTO.photo(), destinationDTO.name(), destinationDTO.price());

        try {
            Destinations updateDestination= this.updateDestinationByIdService.updateById(uuidFromString, destinations);

            return updateDestination;
        } catch (RuntimeException ex) {
            return Arrays.asList(ex.getMessage());
        }
    }
}
