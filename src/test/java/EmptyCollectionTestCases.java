import edu.iis.mto.bsearch.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmptyCollectionTestCases {

    private int[] collection;
    private static final int EXAMPLE_KEY = 99;

    @Test
    void searchInNullSequenceTest(){
        collection = null;
        assertThrows(NullPointerException.class,()-> BinarySearch.create().search(EXAMPLE_KEY, collection));
    }

    @Test
    void searchInEmptySequenceTest(){
        collection = new int[0];
        assertThrows(IllegalArgumentException.class,()-> BinarySearch.create().search(EXAMPLE_KEY, collection));
    }

}
