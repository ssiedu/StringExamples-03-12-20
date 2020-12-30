
public class StringConstructorExample {

    public static void main(String[] args) {

        String s1=new String("indore");
        System.out.println(s1);
        
        char ch[]={'a','b','c','d','e','f','g','h','i','j'};    //array of chars
        
        String s2=new String(ch);
        System.out.println(s2);
    
        String s3=new String(ch,0,4);
        System.out.println(s3);
        
        byte b[]={65,66,67,68,69,70,71,72,73,74,75,76};         //array of bytes
        
        String s4=new String(b);
        System.out.println(s4);
        
        String s5=new String(b,2,5);
        System.out.println(s5);
        
        String s6=new String();
        System.out.println(s6);
        
    }
}
/*
    String()                //a constructor with 0 args
    String(String)          //a constructor with a String type parameter
    String(char[])          //a constructor with a char[] type parameter
    String(char[],int,int)  //a constructor with 3 args (char[],int,int)
    String(byte[])          //a constructor with a byte[] type parameter
    String(byte[],int,int)  //a constructor with 3 args (byte[],int,int)
 */
