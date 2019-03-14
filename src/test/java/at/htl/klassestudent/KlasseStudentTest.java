package at.htl.klassestudent;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class KlasseStudentTest {
    @BeforeAll
    static void setup() {

    }

    @Test
    void unsortiert01() {
        String[] name = {"Marie Mueller", "Joseph Acker", "Sebastian Berger", "Martina Bauer"};

        Klasse.sortBubble(name);
        Arrays.sort(expected);

        assertThat(name,is(expected));
    }

    @Test
    void sortiert() {
        String[] name = {"Joseph Acker", "Martina Bauer", "Sebastian Berger", "Marie Mueller"};

        Klasse.sortBubble(name);
        Arrays.sort(expected);

        assertThat(name,is(expected));
    }

    @Test
    void unsortiert02() {
        String[] name = {"Marie Mueller", "Joseph Acker", "Martina Bauer", " Sebastian Berger"};

        Klasse.sortBubble(name);
        Arrays.sort(expected);

        assertThat(name,is(expected));
    }

    @Test
    void unsortiert03() {
        String[] name = {" Sebastian Berger", "Joseph Acker", "Martina Bauer", " Marie Mueller"};

        Klasse.sortBubble(name);
        Arrays.sort(expected);

        assertThat(name,is(expected));
    }

    @Test
    void unsortiert04() {
        String[] name = {" Martina Bauer", "Marie Mueller", "Sebastian Berger", " Joseph Acker"};

        Klasse.sortBubble(name);
        Arrays.sort(expected);

        assertThat(name,is(expected));
    }
}