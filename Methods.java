public class Methods {
 
    //there is a difference including static here - what is it?
    public static void zoo1 (int x, String string1, String string2){
        System.out.print(x + ", ");
        System.out.print(string1 + ", ");
        System.out.println(string2);
    }
    
    public static void main(String[] args){
        zoo1(11,"none","Harley Street");
    }
    
}