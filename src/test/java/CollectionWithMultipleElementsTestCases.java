import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static helpers.PositionMatcher.notFound;
import static helpers.PositionMatcher.positionOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        SearchResult result = BinarySearch.create().search(TEST_NUMBER_FIRST, collection);
        int position = result.getPosition();
        int value = collection[position];

        assertTrue(result.isFound());
        assertThat(position,is(positionOf(FIRST_POS)));
        assertThat(value,is(collection[FIRST_POS]));

    }

    @Test
    void searchCenterElementInProvidedSequenceTest(){
        SearchResult result = BinarySearch.create().search(TEST_NUMBER_CENTER, collection);
        int position = result.getPosition();
        int value = collection[position];

        assertTrue(result.isFound());
        assertThat(position,is(positionOf(CENTER_POS)));
        assertThat(value,is(collection[CENTER_POS]));
    }

    @Test
    void searchLastElementInProvidedSequenceTest(){
        SearchResult result = BinarySearch.create().search(TEST_NUMBER_LAST, collection);
        int position = result.getPosition();
        int value = collection[position];

        assertTrue(result.isFound());
        assertThat(position,is(positionOf(LAST_POS)));
        assertThat(value,is(collection[LAST_POS]));
    }

    @Test
    void searchNoSuchElementInSequenceTest(){
        SearchResult result = BinarySearch.create().search(ELEMENT_NOT_IN_COLLECTION, collection);
        int position = result.getPosition();

        assertFalse(result.isFound());
        assertThat(position,is(notFound()));
    }

}
