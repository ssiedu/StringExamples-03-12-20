public class Info {
    private String name;
    private int age;
    
    public Info(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
