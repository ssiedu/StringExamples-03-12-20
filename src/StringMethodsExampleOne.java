
public class StringMethodsExampleOne {

    public static void main(String[] args) {

        String s1="dewas";      //w
        String s2="dewas";      //l
        
        int n=s1.compareTo(s2);
        System.out.println(n);
        
        
        
        /*
        String s="amit@gmail.com";
        
        //we need to check whether String s is starting with "amit" or not
        
        boolean b1=s.startsWith("am");
        System.out.println(b1);
        
        boolean b2=s.endsWith("com");
        System.out.println(b2);
        
        boolean b3=s.contains("gmail");
        System.out.println(b3);
        */
        
        
        /*
        String s1=new String("indore");
        String s2=new String("Indore(mp)");
        
        boolean res1=s1.equals(s2);
        System.out.println(res1);
        
        
        boolean res2=s1.equalsIgnoreCase(s2);
        System.out.println(res2);
        */
        
    }
}
/*
    //Comparison
    boolean equals(Object)
    boolean equalsIgnoreCase(String)
    boolean startsWith(String)      //checks the begining of a string
    boolean endsWith(String)        //checks the last chars of a string
    boolean contains(String)        //true , if exists otherwise false

    int compareTo(String)

    int n=s1.compareTo(s2);

        pos value   :   if invoking string is larger        s1>s2
        neg value   :   if invoking string is smaller       s1<s2
        0           :   if the strings are same             s1=s2













*/