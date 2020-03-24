import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.jupiter.api.Test;

import static helpers.PositionMatcher.notFound;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class  NotEmptyInvalidCollectionsTestCases {

    private int[] collection;
    private static final int TEST_NUMBER1 = 6;
    private static final int TEST_NUMBER2 = 2;
    private static final int TEST_NUMBER3 = 3;
    private static final int TEST_NUMBER4 = 4;
    private static final int POS_OF_SECOND_DUPLICATE = 3;

    @Test
    void searchElementThatExistsInProvidedUnorderedSequenceTest() {
        collection = new int[]{TEST_NUMBER1, TEST_NUMBER2, TEST_NUMBER3, TEST_NUMBER4};
        SearchResult result = BinarySearch.create().search(TEST_NUMBER1, collection);
        int position = result.getPosition();

        assertFalse(result.isFound());
        assertThat(position, is(notFound()));
    }

    @Test
    void searchSecondDuplicateInProvidedSequenceTest() {
        collection = new int[]{TEST_NUMBER3, TEST_NUMBER4, TEST_NUMBER4, TEST_NUMBER4, TEST_NUMBER1};
        SearchResult result = BinarySearch.create().search(TEST_NUMBER4, collection);
        int position = result.getPosition();
        int value = collection[position];

        assertTrue(result.isFound());
        assertThat(value, is(collection[POS_OF_SECOND_DUPLICATE]));
        assertThat(position, not(POS_OF_SECOND_DUPLICATE));
    }
}


