import com.bury.models.Lottery;
import com.bury.models.Play;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayTest {
    Set<Integer> possibilities = new HashSet<>() {{
        add(0);
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
    }};

    @Test
    public void ReturnsValidTime() {
        Lottery player = new Lottery(possibilities);
        Lottery generated = new Lottery(possibilities);

        Play play = new Play(player, generated);
        String result = play.check();
        String expected = "Potrzeba 0 lat, 0 miesiecy i 1 dni.";
        assertEquals(expected, result);
    }

}
