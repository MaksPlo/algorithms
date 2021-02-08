import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();

        List<List<Integer>> result = solution.generate(5);

        assertEquals(1, result.get(0).get(0));
        assertEquals(1, result.get(1).get(0));
        assertEquals(1, result.get(1).get(1));
        assertEquals(1, result.get(2).get(0));
        assertEquals(2, result.get(2).get(1));
        assertEquals(1, result.get(2).get(2));
        assertEquals(1, result.get(3).get(0));
        assertEquals(3, result.get(3).get(1));
        assertEquals(3, result.get(3).get(2));
        assertEquals(1, result.get(3).get(3));
        assertEquals(1, result.get(4).get(0));
        assertEquals(4, result.get(4).get(1));
        assertEquals(6, result.get(4).get(2));
        assertEquals(4, result.get(4).get(3));
        assertEquals(1, result.get(4).get(4));
    }
}