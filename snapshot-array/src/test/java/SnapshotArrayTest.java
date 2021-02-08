import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SnapshotArrayTest {


    @Test
    void test1() {
        SnapshotArray sa = new SnapshotArray(3);
        sa.set(0, 5);
        sa.snap();
        sa.set(0, 6);

        assertEquals(5, sa.get(0, 0));
    }

    @Test
    void tets2() {
        SnapshotArray sa = new SnapshotArray(4);
        sa.snap();
        sa.snap();
        sa.get(3, 1);
        sa.set(2, 4);
        sa.snap();
        sa.set(1, 4);
    }
}