import java.util.ArrayList;
import java.util.Arrays;

public class CriterionVowel implements ICriterion {

    private String[] vowels = {"a", "e", "i", "o", "u"};

    @Override
    public boolean check(String string) {
        int vowelCount = 0;
        String[] chars = string.split("");

        for (String c : chars) {
            if (Arrays.stream(vowels).anyMatch(c::equals)) {
                vowelCount++;
            }
        }
        return vowelCount >= 3;
    }
}
