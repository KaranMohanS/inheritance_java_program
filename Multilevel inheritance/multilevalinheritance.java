public class multilevalinheritance {
    public static void main(String[] args)
    {
        babydog obj =new babydog();
        obj.eat();
        obj.bark();
        obj.sleep();

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
class babydog extends dog{
    void sleep()
    {
        System.out.println("sleeping.....");
    }
}
    

