package br.com.lucasnather.trip;


import br.com.lucasnather.trip.domain.Briefs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

public class FindManyBriefsTest {

    @Test
    public  void findManyBrief() {
        UUID id = UUID.randomUUID();
        LocalDateTime createdAt = LocalDateTime.now();

        Briefs briefs = new Briefs(id, "www.url.com", "mt boa", "Lucas Nather", createdAt);

        Assertions.assertEquals("Lucas Nather", briefs.getName());
    }
}
