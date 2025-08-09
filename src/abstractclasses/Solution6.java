package abstractclasses;
/*
Let's hire a translator

*/

public class Solution6 {
    public static void main(String[] args) {
        UkranianianTranslator russianTranslator = new UkranianianTranslator();
        System.out.println(ukranianTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "I translate from " + getLanguage();
        }
    }
    public static class UkranianTranslator extends Translator {

        @Override
        public String getLanguage() {
            return "Ukrainian";
        }
    }

}
