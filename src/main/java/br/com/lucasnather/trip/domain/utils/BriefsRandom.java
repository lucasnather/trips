package br.com.lucasnather.trip.domain.utils;

import br.com.lucasnather.trip.domain.Briefs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BriefsRandom {

    public List<Integer> threeDifferentsRandomNumbers(int size) {
        List<Integer> randomNumbers = new ArrayList<Integer>();

        Random random = new Random();


        while (randomNumbers.size() < 3) {

            int randomNumber = random.nextInt(size);

            if(!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);

            }
        }

        return  randomNumbers;
    }
}
