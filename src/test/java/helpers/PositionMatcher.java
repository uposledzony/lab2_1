package helpers;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class PositionMatcher extends TypeSafeMatcher<Integer> {
    @Override
    public boolean matchesSafely(Integer number){
        return number.equals(position);
    }

    private int position = -1;
    private static int NOT_FOUND = -1;
    PositionMatcher(int number){
        position = number;
    }

    public static Matcher positionOf(Integer number){
        return new PositionMatcher(number);
    }

    public static Matcher notFound(){
        return new PositionMatcher(NOT_FOUND);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText(String.valueOf(position));
    }
}
