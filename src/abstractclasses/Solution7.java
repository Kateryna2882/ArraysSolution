package abstractclasses;
/*
Code doesn't fix itself

*/

public class Solution7 {
    public static void main(String[] args) {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public  static class Translator {
        public String translate() {
            return "I translate from Ukrainian";
        }
    }


}
