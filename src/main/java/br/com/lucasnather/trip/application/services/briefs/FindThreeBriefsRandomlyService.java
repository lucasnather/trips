package br.com.lucasnather.trip.application.services.briefs;

import br.com.lucasnather.trip.application.gateways.BriefsRepository;
import br.com.lucasnather.trip.domain.Briefs;
import br.com.lucasnather.trip.domain.utils.BriefsRandom;

import java.util.*;

public class FindThreeBriefsRandomlyService {

    private  final BriefsRepository briefsRepository;

    public FindThreeBriefsRandomlyService(BriefsRepository briefsRepository) {
        this.briefsRepository = briefsRepository;
    }

    public List<Briefs> findThree() {
        List<Briefs> briefs = this.briefsRepository.findMany();
        int size = briefs.size() -1;

        BriefsRandom briefsRandom = new BriefsRandom();
        List<Integer> randomNumbers = briefsRandom.threeDifferentsRandomNumbers(size);

        return  Arrays.asList(briefs.get(randomNumbers.get(0)), briefs.get(randomNumbers.get(1)), briefs.get(randomNumbers.get(2)));
    }

}
