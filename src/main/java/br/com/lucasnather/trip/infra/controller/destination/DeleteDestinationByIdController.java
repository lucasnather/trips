package br.com.lucasnather.trip.infra.controller.destination;

import br.com.lucasnather.trip.application.services.destination.DeleteDestinationByIdService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/destinos")
public class DeleteDestinationByIdController {

    private  final DeleteDestinationByIdService deleteDestinyByIdService;

    public DeleteDestinationByIdController(DeleteDestinationByIdService deleteDestinyByIdService) {
        this.deleteDestinyByIdService = deleteDestinyByIdService;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id) {
        UUID uuidFromString = UUID.fromString(id);

        try {
            this.deleteDestinyByIdService.deleteById(uuidFromString);

            return "Destination Delete!";
        } catch (Exception ex) {
            return  ex.getMessage();
        }
    }
}
