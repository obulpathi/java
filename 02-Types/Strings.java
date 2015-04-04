public class Strings {
    public static void main(String[] args) {
        String s = "Hello, world!";
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";
        String s4 = "world";
        System.out.println(s);

        System.out.printf("s1 = %s\n", s1);
        System.out.printf("s2 = %s\n", s2);
        System.out.printf("s3 = %s\n", s3);
        System.out.println("");

        for (int i = 0; i < s.length(); i++)
            System.out.printf("%c ", s.charAt(i));
        System.out.println("");

        char[] carray = s.toCharArray();
        for(char c: carray)
            System.out.printf("%c ", c);
        System.out.println("");

        System.out.printf("Index if %c in %s: %d\n", 'l', s, s.indexOf("l"));
        System.out.printf("Last index if %c in %s: %d\n", 'l', s, s.lastIndexOf("l"));
        System.out.println("");

        System.out.printf("Substring of %s from %d is %s\n", s, 4, s.substring(4));
        System.out.printf("Substring of %s from %d to %d is %s\n", s, 4, 10, s.substring(4, 10));
        System.out.println("");

        if(s1 == s2)
            System.out.println("s1 == s2");
        else
            System.out.println("s1 != s2");

        if(s1.equals(s2))
            System.out.println("s1 equals s2");
        else
            System.out.println("s1 not equals s2");

        if(s2 == s3)
            System.out.println("s2 == s3");
        else
            System.out.println("s2 != s3");

        if(s2.equals(s3))
            System.out.println("s2 equals s3");
        else
            System.out.println("s2 not equals s3");

        if(s2.equalsIgnoreCase(s3))
            System.out.println("s2 equals ignore case s3");
        else
            System.out.println("s2 not equals ignore case s3");
        System.out.println("");

        System.out.printf("s3 + s4 = %s\n", s3 + " " + s4 + "!");
    }
}
