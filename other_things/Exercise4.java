public class Exercise4 {
    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println(str1.length());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.charAt(0)+ " " + str1.charAt(str1.length()-1));
        System.out.println(str1.indexOf("e"));
        System.out.println(str1.trim());
        System.out.println(str1.replace("Hello ", "Bye"));
        String rev = new StringBuilder(str1).reverse().toString();
        System.out.println(rev);

    }
}
