import telran.stream.StreamTasks;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;



public class StreamTaskTest {
    @Test
    void shuffleTest() {
    int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int [] res = StreamTasks.shuffle(arr);

    assertFalse(Arrays.equals(arr, res));
    assertEquals(arr.length, res.length);

    int[] arrSort = Arrays.copyOf(arr, arr.length);
    int[] resSort = Arrays.copyOf(res, res.length);

    Arrays.sort(arrSort);
    Arrays.sort(resSort);
    assertArrayEquals(arrSort, resSort);
    }

}
