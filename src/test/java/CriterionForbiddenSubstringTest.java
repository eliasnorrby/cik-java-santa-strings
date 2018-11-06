import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CriterionForbiddenSubstringTest {

    CriterionForbiddenSubstring c;

    @BeforeEach
    void setUp() {
        c = new CriterionForbiddenSubstring();
    }

    @ParameterizedTest
    @ValueSource(strings = {"aaaa", "ailk", "stok"})
    void ShouldCheckStringsWithoutForbiddenSubstrings(String string) {
        assertTrue(c.check(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aaaxyaaa", "ababab", "kacda", "pqaaaaa"})
    void ShouldNotCheckStringsWithForbiddenSubstring(String string) {
        assertFalse(c.check(string));
    }
}