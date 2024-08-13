package br.com.lucasnather.trip.infra.controller;

import br.com.lucasnather.trip.application.services.FindThreeBriefsRandomlyService;
import br.com.lucasnather.trip.domain.Briefs;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/depoimentos-home")
public class FIndThreeBriefsRandomlyController {

    private  final FindThreeBriefsRandomlyService findThreeBriefsRandomlyService;

    public  FIndThreeBriefsRandomlyController(FindThreeBriefsRandomlyService findThreeBriefsRandomlyService) {
        this.findThreeBriefsRandomlyService = findThreeBriefsRandomlyService;
    }

    @GetMapping
    public List<Briefs> get() {
        return  this.findThreeBriefsRandomlyService.findThree();
    }


}
