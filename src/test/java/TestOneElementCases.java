import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOneElementCases {
    private int[] collection;
    private static final int TEST_NUMBER = 6;
    private static final int ELEMENT_NOT_IN_COLLECTION = 5;
    private static final int NOT_FOUND = -1;
    private static final int POS = 0;
    @BeforeEach
    void init(){
        collection = new int[1];
        collection[0] = TEST_NUMBER;
    }

    @Test
    void elementInProvidedSequenceTest(){
        assertEquals(POS,BinarySearch.create().search(TEST_NUMBER, collection).getPosition());
    }

    @Test
    void elementNotInProvidedSequenceTest(){
        assertEquals(NOT_FOUND, BinarySearch.create().search(ELEMENT_NOT_IN_COLLECTION, collection).getPosition());
    }
    
}
