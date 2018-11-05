import java.util.ArrayList;
import java.util.Arrays;

public class CriterionVowel implements ICriterion {

//    private char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    private String[] vowels = {"a", "e", "i", "o", "u"};

    @Override
    public boolean check(String string) {
        int vowelCount = 0;
//        char[] chars = string.toCharArray();
        String[] chars = string.split("");

        for (String c : chars) {
            if (Arrays.stream(vowels).anyMatch(c::equals)) {
                vowelCount++;
            }
        }
        return vowelCount >= 3;
    }
}
