package br.com.lucasnather.trip.infra.controller;

import br.com.lucasnather.trip.application.services.FindManyBriefService;
import br.com.lucasnather.trip.domain.Briefs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/depoimentos")
public class FindManyBriefController {

    private  final FindManyBriefService findManyBriefService;

    public FindManyBriefController(FindManyBriefService findManyBriefService) {
        this.findManyBriefService = findManyBriefService;
    }

    @GetMapping
    public List<Briefs> get() {
        return this.findManyBriefService.findMany();
    }

}
