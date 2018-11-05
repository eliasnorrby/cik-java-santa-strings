public class CriterionDoubleLetter implements ICriterion {
    @Override
    public boolean check(String string) {
        String[] chars = string.split("");

        String lastChar = chars[0];

        boolean foundDoubleLetter = false;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i].equals(lastChar)) {
                foundDoubleLetter = true;
            }
            lastChar = chars[i];
        }

        return foundDoubleLetter;
    }
}
