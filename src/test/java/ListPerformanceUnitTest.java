import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListPerformanceUnitTest {
    @Test
    public void testArrayListAddPerformance() {
        List<Integer> list = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            list.add(i);
        long endTime = System.nanoTime();
        assertTrue((endTime - startTime) < 10000000, "Performance test failed for ArrayList add");
    }

    @Test
    public void testLinkedListAddPerformance() {
        List<Integer> list = new LinkedList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            list.add(i);
        long endTime = System.nanoTime();
        assertTrue((endTime - startTime) < 10000000, "Performance test failed for LinkedList add");
    }

    @Test
    public void testArrayListGetPerformance() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++)
            list.add(i);

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            list.get(i);
        long endTime = System.nanoTime();
        assertTrue((endTime - startTime) < 10000000, "Performance test failed for ArrayList get");
    }

    @Test
    public void testLinkedListGetPerformance() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000; i++)
            list.add(i);

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            list.get(i);
        long endTime = System.nanoTime();
        assertTrue((endTime - startTime) < 10000000, "Performance test failed for LinkedList get");
    }

    @Test
    public void testArrayListRemovePerformance() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++)
            list.add(i);

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            list.remove(0);
        long endTime = System.nanoTime();
        assertTrue((endTime - startTime) < 10000000, "Performance test failed for ArrayList remove");
    }

    @Test
    public void testLinkedListRemovePerformance() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000; i++)
            list.add(i);

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            list.remove(0);
        long endTime = System.nanoTime();
        assertTrue((endTime - startTime) < 10000000, "Performance test failed for LinkedList remove");
    }
}