public class StringBufferExample {
    public static void main(String[] args) {
        
        
        StringBuffer sb=new StringBuffer("abcdefgh");
        String s=sb.toString();
        String s1=s.toUpperCase();
        System.out.println(s1);
        //System.out.println(sb);
        //sb.reverse();
        //sb.delete(1, 4);            //delete 1,2,3
        //sb.deleteCharAt(4);     //delete char on index 4
        //sb.setCharAt(4, 'Z');
        //sb.append("XYZ");   //XYZ will be added at the end of existing data
        //sb.insert(0, "XYZ");
        //sb.replace(1, 4, "XYZ");
        //System.out.println(sb);
        
}
}
/*
    toString        //converts a StringBuffer to String
    reverse         //reverse the contents
    delete          //deletes a range
    deleteCharAt    //deletes a single char on given index
    append      //adds the new contents at the end of existing contents
    insert      //adds the new contents on the given index
    replace     //removes some chars and adds new contents in place of it
    setCharAt   //sets a new char on the given index

*/