import static org.junit.Assert.*;
import org.junit.Test;

public class ExplorerSearchTest {
    @Test
    public void testReachableArea_someUnreachable() {
        int[][] island = {
            {1,1,1,3,1,1},
            {3,2,3,1,3,1},
            {1,1,1,1,3,3},
            {3,1,2,1,0,1},
            {1,1,1,2,1,1},
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(14, actual);
    }

    // Add more tests here!
    // Come up with varied cases

    @Test
    public void testStartingLocation_TopLeft() {
        int[][] island = {
            {0,1,1,3,1,1},
            {3,2,3,1,3,1},
            {1,1,1,1,3,3},
            {3,1,2,1,1,1},
            {1,1,1,2,1,1},
        };

        int[] actual = ExplorerSearch.startingLocation(island);
        assertArrayEquals(new int[]{0, 0}, actual);
    }

    @Test
    public void testStartingLocation_Middle() {
        int[][] island = {
            {1,1,1,3,1,1},
            {3,2,3,1,3,1},
            {1,1,1,0,3,3},
            {3,1,2,1,1,1},
            {1,1,1,2,1,1},
        };

        int[] actual = ExplorerSearch.startingLocation(island);
        assertArrayEquals(new int[]{2, 3}, actual);
    }

    @Test
    public void testStartingLocation_LastIndex() {
        int[][] island = {
            {1,1,1,3,1,1},
            {3,2,3,1,3,1},
            {1,1,1,1,3,3},
            {3,1,2,1,1,1},
            {1,1,1,2,1,0},
        };

        int[] actual = ExplorerSearch.startingLocation(island);
        assertArrayEquals(new int[]{4, 5}, actual);
    }
}
