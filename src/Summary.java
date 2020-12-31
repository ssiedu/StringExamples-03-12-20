
public class Summary {

    public static void main(String[] args) {

        String s="This Is Java Code We Are Using Java 8 Since Last 3 Years And Planning To Use It For Further 2 Years";
        int vowels=0;
        
        for(int i=0; i<s.length(); i++){
            char tmp=s.charAt(i);
            if(tmp=='a' || tmp=='e' || tmp=='i' || tmp=='o' || tmp=='u'){
                vowels++;
            }
        }
        
        /*
        char ch[]=s.toCharArray();
        for(char tmp:ch){
            if(tmp=='a' || tmp=='e' || tmp=='i' || tmp=='o' || tmp=='u'){
                vowels++;
            }
        }
        */
        System.out.println("No of vowels : "+vowels);
        
        /*
        //here we are counting no of small chars and capital chars
        int small=0;
        int capital=0;
        int space=0;
        
        byte b[]=s.getBytes();
        
        for(byte tmp:b){
            if(tmp>=65 && tmp<=90){
                capital++;
            }else if(tmp>=97 && tmp<=122){
                small++;
            }else if(tmp==32){
                space++;
            }
        }
        System.out.println("Capital : "+capital);
        System.out.println("Small   : "+small);
        System.out.println("Spaces  : "+space);
        */
    }
}
