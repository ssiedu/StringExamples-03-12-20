
public class StringMethodsExampleThree {
    public static void main(String[] args) {
        String s1="this is java code and we are testing substring method";
        //String s2=s1.substring(15);
        String s2=s1.substring(15, 30);
        System.out.println(s1);
        System.out.println(s2);
        /*
        String s1="  java code  ";
        int n=s1.length();
        System.out.println(n);
        String s2=s1.trim();
        System.out.println(s2.length());
        */
        /*
        //String s1="indore";
        String s1="INDIA";
        System.out.println(s1);
        //String s2=s1.toUpperCase();
        String s2=s1.toLowerCase();
        System.out.println("After Calling Method");
        System.out.println("S1 : "+s1);
        System.out.println("S2 : "+s2);
        */
    }
}
/*
    String substring(int)
    String substring(int,int)
    String toUpperCase()
    String toLowerCase()
    String trim();          //truncates the leading and trailing white spaces (in object)
*/