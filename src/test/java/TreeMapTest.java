import java.util.TreeMap;
import org.junit.jupiter.api.Test;

public class TreeMapTest {

    @Test
    void t1() {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        Integer integer = map.floorKey(10);

        System.out.println("integer = " + integer);
    }

}
