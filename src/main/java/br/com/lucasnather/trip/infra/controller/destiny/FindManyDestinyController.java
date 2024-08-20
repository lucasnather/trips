package br.com.lucasnather.trip.infra.controller.destiny;

import br.com.lucasnather.trip.application.services.destiny.FindManyDestinyService;
import br.com.lucasnather.trip.domain.Destiny;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/destinos")
public class FindManyDestinyController {

    private  final FindManyDestinyService findManyDestinyService;

    public FindManyDestinyController(FindManyDestinyService findManyDestinyService) {
        this.findManyDestinyService = findManyDestinyService;
    }

    @GetMapping
    public List<Destiny> get() {
        return this.findManyDestinyService.findMany();
    }
}
