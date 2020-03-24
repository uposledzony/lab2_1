import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static helpers.PositionMatcher.notFound;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static helpers.PositionMatcher.positionOf;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestOneElementCases {

    private int[] collection;
    private static final int TEST_NUMBER = 6;
    private static final int ELEMENT_NOT_IN_COLLECTION = 5;
    private static final int POS = 0;

    @BeforeEach
    void init(){
        collection = new int[1];
        collection[0] = TEST_NUMBER;
    }

    @Test
    void searchElementInProvidedSequenceTest(){
        SearchResult result = BinarySearch.create().search(TEST_NUMBER, collection);
        int position = result.getPosition();
        int value = collection[position];

        assertTrue(result.isFound());
        assertThat(position,is(positionOf(POS)));
        assertThat(value, is(collection[POS]));
    }

    @Test
    void searchElementNotInProvidedSequenceTest(){
        SearchResult result = BinarySearch.create().search(ELEMENT_NOT_IN_COLLECTION, collection);
        int position = result.getPosition();

        assertFalse(result.isFound());
        assertThat(position,is(notFound()));
    }

}
