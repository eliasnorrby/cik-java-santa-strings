public class Santa {
    private ICriterion[] criteria;

    public Santa(ICriterion[] criteria) {
        this.criteria = criteria;
    }

    public boolean determineNiceness(String string) {
        boolean stringIsNice = true;

        for (ICriterion c : criteria) {
            if (!c.check(string)) {
                stringIsNice = false;
            }
        }

        return stringIsNice;
    }

    public int countNiceStrings(String[] strings) {
        int count = 0;
        for (String s : strings) {
            if (determineNiceness(s)) {
                count++;
            }
        }
        return count;
    }
}
