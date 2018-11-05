import java.util.Arrays;

public class CriterionForbiddenSubstring implements ICriterion {

    String[] forbiddenSubstrings = {
            "ab",
            "cd",
            "pq",
            "xy"
    };

    @Override
    public boolean check(String string) {
        String[] chars = string.split("");

        boolean foundForbiddenSubstring = false;

        for (String sub : forbiddenSubstrings) {
            if (string.contains(sub)) {
                foundForbiddenSubstring = true;
            }
        }
        return !foundForbiddenSubstring;
    }
}
