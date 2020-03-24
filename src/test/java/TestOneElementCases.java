import edu.iis.mto.bsearch.BinarySearch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static helpers.PositionMatcher.notFound;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static helpers.PositionMatcher.positionOf;

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
    void searchElementInProvidedSequenceTest(){
        assertThat(BinarySearch.create().search(TEST_NUMBER, collection).getPosition(),is(positionOf(POS)));
    }

    @Test
    void searchElementNotInProvidedSequenceTest(){
        assertThat(BinarySearch.create().search(ELEMENT_NOT_IN_COLLECTION, collection).getPosition(),is(notFound()));
    }

}
