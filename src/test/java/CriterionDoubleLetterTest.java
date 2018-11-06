import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CriterionDoubleLetterTest {

    CriterionDoubleLetter c;

    @BeforeEach
    void setUp() {
        c = new CriterionDoubleLetter();
    }

    @ParameterizedTest
    @ValueSource(strings = {"xx", "abcdde", "aabbccdd"})
    void ShouldCheckDoubleLetterStrings(String string) {
        assertTrue(c.check(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aba", "", "halelua"})
    void ShouldNotCheckNonDoubleLetterStrings(String string) {
        assertFalse(c.check(string));
    }
}