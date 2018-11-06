import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SantaTest {

    Santa santa;

    @BeforeEach
    void setUp() {
        santa = new Santa(new ICriterion[] {
                new CriterionVowel(),
                new CriterionDoubleLetter(),
                new CriterionForbiddenSubstring()
        });
    }

    @Test
    void ShouldFindNiceStrings() {
        assertTrue(santa.determineNiceness("ugknbfddgicrmopn"));
        assertTrue(santa.determineNiceness("aaa"));
    }

    @Test
    void ShouldRejectBadStrings() {
        assertFalse(santa.determineNiceness("jchzalrnumimnmhp"));
        assertFalse(santa.determineNiceness("haegwjzuvuyypxyu"));
        assertFalse(santa.determineNiceness("dvszwmarrgswjxmb"));
    }


    @DisplayName("Count strings")
    @ParameterizedTest(name = "{index} should have {1} nice strings")
    @MethodSource("argumentProvider")
    void ShouldCountNiceStrings(String[] strings, int count) {
        assertTrue(santa.countNiceStrings(strings) == count);
    }

    private static Stream<Arguments> argumentProvider() {
        String[] input1 = {"hej", "ababab", "aaao"};
        String[] input2 = {"xy", "ab", "pq"};
        String[] input3 = {"jchzalrnumimnmhp", "haegwjzuvuyypxyu", "ugknbfddgicrmopn", "dvszwmarrgswjxmb"};
        String[] input4 = {"ugknbfddgicrmopn", "ugknbfddgicrmopn", "ugknbfddgicrmopn", "aaaaa"};
        String[] input5 = LongInput.longInput();

        return Stream.of(
                Arguments.of(input1, 1),
                Arguments.of(input2, 0),
                Arguments.of(input3, 1),
                Arguments.of(input4, 4),
                Arguments.of(input5, 238)
        );
    }
}