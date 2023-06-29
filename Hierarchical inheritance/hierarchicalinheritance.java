public class hierarchicalinheritance {
    public static void main(String[] args){
    grandson obj=new grandson();
    obj.name();
    obj.name1();

    son obj1=new son();
    obj1.name();
    obj1.name2();
    
}
}
class father{
    void name(){
        System.out.println("sivasamy");
    }
}
class grandson extends father{
    void name1(){
        System.out.println("sri karthick");
    }
}
class son extends father{
    void name2(){
        System.out.println("karan");
    }
}