import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {

        int[] prices = new int[6];
        prices[0] = 7;
        prices[1] = 1;
        prices[2] = 5;
        prices[3] = 3;
        prices[4] = 6;
        prices[5] = 4;


        Solution solution = new Solution();

        int result = solution.maxProfit(prices);

        assertEquals(5, result);
    }


    @Test
    void test2() {

        int[] prices = new int[5];
        prices[0] = 7;
        prices[1] = 6;
        prices[2] = 4;
        prices[3] = 3;
        prices[4] = 1;


        Solution solution = new Solution();

        int result = solution.maxProfit(prices);

        assertEquals(0, result);
    }


    @Test
    void test3() {

        int[] prices = new int[1];
        prices[0] = 1;


        Solution solution = new Solution();

        int result = solution.maxProfit(prices);

        assertEquals(0, result);
    }


    @Test
    void test4() {

        int[] prices = new int[]{2,4,1};


        Solution solution = new Solution();

        int result = solution.maxProfit(prices);

        assertEquals(2, result);
    }


    @Test
    void test5() {

        int[] prices = new int[]{1,2};


        Solution solution = new Solution();

        int result = solution.maxProfit(prices);

        assertEquals(1, result);
    }


    @Test
    void test6() {

        int[] prices = new int[]{2,1,2,0,1};


        Solution solution = new Solution();

        int result = solution.maxProfit(prices);

        assertEquals(1, result);
    }


    @Test
    void test7() {

        int[] prices = new int[]{3,2,6,5,0,3};


        Solution solution = new Solution();

        int result = solution.maxProfit(prices);

        assertEquals(4, result);
    }
}