public class singleinheritance{
    public static void main(String[] args)
    {
        dog obj =new dog();
        obj.eat();
        obj.bark();

    }
}
class animal{
    void eat(){
        System.out.println("eating......");
    }
}
class dog extends animal{
    void bark()
    {
        System.out.println("barking.....");
    }
}