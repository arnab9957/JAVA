/**
 * class
 */
class A{
    public A(){
        System.out.println("Obj Created !");
        }
        public void show(){
            System.out.println("In A Show");
        }
}

public class Classe {
    public static void main(){
        A objName = new A();
        objName.show();
    }
    
}
