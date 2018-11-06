import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CriterionVowelTest {

    CriterionVowel c;

    @BeforeEach
    void setUp() {
        c = new CriterionVowel();
    }

    @ParameterizedTest
    @ValueSource(strings = {"aao", "hdjjshgkaou", "hjdjajfkdjfoldkdjfkjdfo"})
    void ShouldCheckNiceStrings(String string) {
        assertTrue(c.check(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abo", "hdjjshgkau", "hjdjajfkdjfxldkdjfkjdfo"})
    void ShouldNotCheckBadStrings(String string) {
        assertFalse(c.check(string));
    }
}