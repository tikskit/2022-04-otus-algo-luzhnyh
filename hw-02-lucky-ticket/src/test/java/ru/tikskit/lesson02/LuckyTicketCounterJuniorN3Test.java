package ru.tikskit.lesson02;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LuckyTicketCounterJuniorN3Test {

    @Test
    public void test() throws URISyntaxException, IOException {

        Path path = Path.of(getClass().getClassLoader().getResource("test.2.out").toURI());
        List<String> lines = Files.readAllLines(path);
        Long expected = Long.valueOf(lines.get(0).trim());

        LuckyTicketCounter counter = new LuckyTicketCounterJuniorN3();
        long actual = counter.calc(3);
        assertThat(actual).isEqualTo(expected);
    }
}