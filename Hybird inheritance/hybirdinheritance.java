public class hybirdinheritance {
    public static void main(String[] args) {
        mother obj=new mother();
        obj.name3();
        obj.name1();
        obj.name();
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
class mother extends grandson{
    void name3(){
        System.out.println("veeramani");
    }
}