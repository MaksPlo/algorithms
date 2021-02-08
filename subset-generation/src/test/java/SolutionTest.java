import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        List<List<Integer>> result = solution.subsets(array);
        assertEquals(8, result.size());
        assertEquals(1, result.get(0).get(0));
        assertEquals(2, result.get(0).get(1));
        assertEquals(3, result.get(0).get(2));
        assertEquals(1, result.get(1).get(0));
        assertEquals(2, result.get(1).get(1));
        assertEquals(1, result.get(2).get(0));
        assertEquals(3, result.get(2).get(1));
        assertEquals(1, result.get(3).get(0));
        assertEquals(2, result.get(4).get(0));
        assertEquals(3, result.get(4).get(1));
        assertEquals(2, result.get(5).get(0));
        assertEquals(3, result.get(6).get(0));
        assertTrue(result.get(7).isEmpty());
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        int[] array = new int[1];
        array[0] = 0;

        List<List<Integer>> result = solution.subsets(array);
        assertEquals(2, result.size());
        assertTrue(result.get(1).isEmpty());
        assertEquals(0, result.get(0).get(0));
    }
}