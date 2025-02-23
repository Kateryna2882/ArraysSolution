public class URLValidation {

    public static void main(String[] args) {
        String[] urls = {"https://javarush.us", "https://google.com",
                "http://wikipedia.org", "facebook.com",
                "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domainExtension = checkDomainExtension(url);

            System.out.println("URL address: " + url + ", network protocol - " + protocol + ", domain extension - " + domainExtension);
        }
    }

    public static String checkProtocol(String url) {
        //write your code here
        return "unknown";
    }

    public static String checkDomainExtension(String url) {
        //write your code here
        return "unknown";
    }
}
