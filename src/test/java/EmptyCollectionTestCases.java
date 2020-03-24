import edu.iis.mto.bsearch.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmptyCollectionTestCases {

    private int[] collection;
    private static final int EXAMPLE_KEY = 99;

    @Test
    void searchInSequenceSequenceTest(){
        collection = null;
        assertThrows(NullPointerException.class,()-> BinarySearch.create().search(EXAMPLE_KEY, collection));
    }

    

}
