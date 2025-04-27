import java.util.Arrays;
import java.util.StringTokenizer;

public class IPv6 {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(map("2001:db8:11a3:9d7:1f34:8a2e:7a0:765d")));
    }

    public static String[] map(String ipv6) {
        //write your code here
        StringTokenizer stringTokenizer = new StringTokenizer(ipv6, ":");
        String [] tokens = new String[stringTokenizer.countTokens()];
        for (int i = 0; i < tokens.length; i++) {
            tokens[i]= stringTokenizer.nextToken();
            
        }

        return tokens;
    }

}
