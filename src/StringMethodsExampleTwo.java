
public class StringMethodsExampleTwo {

    public static void main(String[] args) {
        String s="this is java";
        
        byte b[]=s.getBytes();
        
        for(byte tmp:b){
            System.out.println(tmp);
        }
        
        /*
        char ch[]=s.toCharArray();
        for(char tmp:ch){
            System.out.println(tmp);
        }
        */
        /*
        String s="this is java code and java is object oriented language there are 10 chapters in core java";
        char ch=s.charAt(65);
        System.out.println(ch);
        */
        /*
        int n1=s.indexOf("java");   //we searching "java" from index 0
        System.out.println(n1);        
        int n2=s.indexOf("java", 15);  //our search for 'i' will begin from index 15
        System.out.println(n2);
        */
        System.out.println((int)'a');
        System.out.println((int)'z');
    }

}
/*
    char charAt(int)
    char[] toCharArray()
    byte[] getBytes()

    searching
    -------------
    int indexOf(char)       //gives the first occurence of the char passed to parameter (start from 0)
    int indexOf(char,int)   //gives the first occurence of the char passed to par but searching starts with given index
    int indexOf(String)     //search a string in another one
    int indexOf(String,int)


*/
