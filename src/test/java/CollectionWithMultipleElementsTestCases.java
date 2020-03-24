import edu.iis.mto.bsearch.BinarySearch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionWithMultipleElementsTestCases {

    private int[] collection;
    private static final int TEST_NUMBER_FIRST =2;
    private static final int TEST_NUMBER_CENTER = 3;
    private static final int TEST_NUMBER_LAST = 6;
    private static final int ELEMENT_NOT_IN_COLLECTION = 5;
    private static final int NOT_FOUND = -1;
    private static final int FIRST_POS = 0;
    private static int CENTER_POS;
    private static int LAST_POS;

    @BeforeEach
    void init() {
        collection = new int[]{TEST_NUMBER_FIRST, TEST_NUMBER_CENTER, TEST_NUMBER_LAST};
        CENTER_POS = (collection.length - 1)/2;
        LAST_POS = collection.length - 1;
    }

    @Test
    void firstElementInProvidedSequenceTest() {
        assertEquals(FIRST_POS, BinarySearch.create().search(TEST_NUMBER_FIRST, collection).getPosition());
    }

    @Test
    void centerElementInProvidedSequenceTest(){
        assertEquals(CENTER_POS, BinarySearch.create().search(TEST_NUMBER_CENTER, collection).getPosition());
    }
    

}
