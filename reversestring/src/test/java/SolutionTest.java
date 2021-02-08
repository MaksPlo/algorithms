import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();
        char[] string = new char[5];
        string[0] = 'h';
        string[1] = 'e';
        string[2] = 'l';
        string[3] = 'l';
        string[4] = '0';


        solution.reverseString(string);

        assertEquals('o', string[0]);
        assertEquals('l', string[1]);
        assertEquals('l', string[2]);
        assertEquals('e', string[3]);
        assertEquals('h', string[4]);
    }
}