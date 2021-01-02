
import java.util.StringJoiner;


public class StringJoinerExample {

    public static void main(String[] args) {

        String s1="java", s2="python", s3="php", s4="dotnet";
        
        //to joint various string in a single string
        //StringJoiner sj=new StringJoiner("-");  //pass the char/chars to be used for joining
        StringJoiner sj=new StringJoiner("#@","{===>", "<===}");
                
        sj.add(s1); sj.add(s2); sj.add(s3); sj.add(s4);
        String text=sj.toString();
        System.out.println(text);
        
        
        
    }
}
