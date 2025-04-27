public class SolutionStringBuilder {
    public static void main(String[] args) {
        String string = "Learn, learn, and learn again! ";

        System.out.println(addTo(string, new String[]{"A", "rolling", "stone", "gathers", "no", "moss"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        //write your code here
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]);

        }
        return stringBuilder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        //write your code here
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.replace(start, end, str);
    }
}
