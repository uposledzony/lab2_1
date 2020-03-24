import edu.iis.mto.bsearch.BinarySearch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOneElementCases {
    private int[] collection;
    private static final int TEST_NUMBER = 6;
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
    
}
