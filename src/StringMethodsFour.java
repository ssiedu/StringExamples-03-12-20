
public class StringMethodsFour {

    public static void main(String[] args) {
        String s="java,oracle,mysql,python,php";
        String items[]=s.split(",");
        for(String item:items){
            System.out.println(item);
        }
        
    }
}
