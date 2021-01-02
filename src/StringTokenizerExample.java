
import java.util.StringTokenizer;


public class StringTokenizerExample {

    public static void main(String[] args) {

        String s="indore,bhopal,delhi,chennai;pune";
        
        //to create the tokens, we are creating a StringTokenizer object
        StringTokenizer st=new StringTokenizer(s,",;");
        //StringTokenizer st=new StringTokenizer(s);
        while(true){
            boolean found=st.hasMoreTokens();
            if(found==false)break;
            System.out.println(st.nextToken());    
        }
        
        
        
        
    }
}
/*
    Constructors
    ---------------
        StringTokenizer(String) //it creates the token using space as a delimeter
        StringTokenizer(String,String)

    Methods
    ---------------
        String nextToken()
        boolean hasMoreTokens()     //check the existence of next token and returns true if exists else false


*/