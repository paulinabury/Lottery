import com.bury.models.Lottery;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LotteryTest {

    @Test
    public void ShouldGenerateNumbersInCorrectRange() {
        Lottery lottery = new Lottery();
        lottery.setGeneratedLottery();

        List<Integer> list = new ArrayList<>(lottery.getNumbers());
        Collections.sort(list);
        int min = list.get(0);
        int max = list.get(5);

        boolean min_ = min >= 0;
        boolean max_ = max <= 49;

        assertTrue(min_);
        assertTrue(max_);
    }

    @Test
    public void t() {

    }
}
