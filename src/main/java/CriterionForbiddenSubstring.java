public class CriterionForbiddenSubstring implements ICriterion {

    String[] forbiddenSubstrings = {
            "ab",
            "cd",
            "pq",
            "xy"
    };

    @Override
    public boolean check(String string) {
        boolean foundForbiddenSubstring = false;

        for (String sub : forbiddenSubstrings) {
            if (string.contains(sub)) {
                foundForbiddenSubstring = true;
            }
        }
        return !foundForbiddenSubstring;
    }
}
