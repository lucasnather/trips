package br.com.lucasnather.trip.infra.controller.destination;

import br.com.lucasnather.trip.application.services.destination.FindManyDestinationsService;
import br.com.lucasnather.trip.domain.Destinations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/destinos")
public class FindManyDestinationController {

    private  final FindManyDestinationsService findManyDestinyService;

    public FindManyDestinationController(FindManyDestinationsService findManyDestinyService) {
        this.findManyDestinyService = findManyDestinyService;
    }

    @GetMapping
    public List<Destinations> get() {
        return this.findManyDestinyService.findMany();
    }
}
