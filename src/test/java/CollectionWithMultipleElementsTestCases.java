import edu.iis.mto.bsearch.BinarySearch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static helpers.PositionMatcher.notFound;
import static helpers.PositionMatcher.positionOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CollectionWithMultipleElementsTestCases {

    private int[] collection;
    private static final int TEST_NUMBER_FIRST = 2;
    private static final int TEST_NUMBER_CENTER = 3;
    private static final int TEST_NUMBER_LAST = 6;
    private static final int ELEMENT_NOT_IN_COLLECTION = 5;
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
    void searchFirstElementInProvidedSequenceTest() {
        assertThat(BinarySearch.create().search(TEST_NUMBER_FIRST, collection).getPosition(),is(positionOf(FIRST_POS)));
    }

    @Test
    void searchCenterElementInProvidedSequenceTest(){
        assertThat(BinarySearch.create().search(TEST_NUMBER_CENTER, collection).getPosition(),is(positionOf(CENTER_POS)));
    }

    @Test
    void searchLastElementInProvidedSequenceTest(){
        assertThat(BinarySearch.create().search(TEST_NUMBER_LAST, collection).getPosition(),is(positionOf(LAST_POS)));
    }

    @Test
    void searchNoSuchElementInSequenceTest(){
        assertThat(BinarySearch.create().search(ELEMENT_NOT_IN_COLLECTION, collection).getPosition(),is(notFound()));
    }

}
