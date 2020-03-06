import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class sortOfSortTester { // used visualizer from http://www.pythontutor.com/visualize.html#mode=edit to test the time complexity as well as the max number of steps it takes to complete the code

    @Test
    public void sorting(){ // Tested this with large numbers.
        sortOfSort sort = new sortOfSort();
        int[] arr = {100,65,33,1002,77,88};
        int[] expected = {88,77,33,65,100,1002};


        sort.sortOfSorts(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void sorting2(){ // Tested this with odd length numbers.
        sortOfSort sort = new sortOfSort();
        int[] arr = {50,14,63,6,10};
        int[] expected = {14,10,6,50,63};

        sort.sortOfSorts(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void sorting3(){ // Tested with with atleast one negative number.
        sortOfSort sort = new sortOfSort();
        int[] arr = {50,14,-63,6,10};
        int[] expected = {10,6,-63,14,50};

        sort.sortOfSorts(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void sorting4(){ // Tested this with all negative numbers.
        sortOfSort sort = new sortOfSort();
        int[] arr = {-5,-8,-44,-7,-9,-22};
        int[] expected = {-8,-9,-44,-22,-7,-5};

        sort.sortOfSorts(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void sorting5(){ // Tested this with a long array
        sortOfSort sort = new sortOfSort();
        int[] arr = {5,-1,2,7,99,8,65,-7,-2,10,12,33,45,87};
        int[] expected = {65,45,10,8,2,-1,-7,-2,5,7,12,33,87,99};

        sort.sortOfSorts(arr);
        assertArrayEquals(expected, arr);

    }

    @Test
    public void sorting6(){ // Tested this with a sorted array
        sortOfSort sort = new sortOfSort();
        int[] arr = {1,2,3,4,5,6};
        int[] expected = {4,3,1,2,5,6};

        sort.sortOfSorts(arr);
        assertArrayEquals(expected, arr);

    }

    @Test
    public void sorting7(){ // Tested this with a already completed array
        sortOfSort sort = new sortOfSort();
        int[] arr = {9,8,3,6,7,10,11};
        int[] expected = {9,8,3,6,7,10,11};

        sort.sortOfSorts(arr);
        assertArrayEquals(expected, arr);

    }

    @Test
    public void sorting8(){ // Tested this to see if it catches the errors
        sortOfSort sort = new sortOfSort();
        int[] arr = {50,14,63,6,10};
        int[] expected = {14,10,63,50,6};

        sort.sortOfSorts(arr);
        assertArrayEquals(expected, arr);

    }


}
