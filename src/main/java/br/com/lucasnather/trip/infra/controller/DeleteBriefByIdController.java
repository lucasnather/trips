package br.com.lucasnather.trip.infra.controller;

import br.com.lucasnather.trip.application.services.DeleteBriefByIdService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/depoimentos")
public class DeleteBriefByIdController {

    private  final DeleteBriefByIdService deleteBriefByIdService;

    public DeleteBriefByIdController(DeleteBriefByIdService deleteBriefByIdService) {
        this.deleteBriefByIdService = deleteBriefByIdService;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id) {
        UUID uuidFromString = UUID.fromString(id);

        try {
            this.deleteBriefByIdService.deleteById(uuidFromString);

            return "Brief Delete!";
        } catch (Exception ex) {
            return  ex.getMessage();
        }
    }
}
