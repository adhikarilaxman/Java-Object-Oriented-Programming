class Fruit{
    void taste(){
        System.out.println("Friuit tastes good");
    }
}
class Apple extends Fruit{
    void eat(){
        System.out.println("Eating an apple");;
    }
}
public class Inheritance {
    public static void main(String[] args){
        Apple myApple=new Apple();
        myApple.taste(); //Inherited method
        myApple.eat();   //own method
        System.out.println("This is an example of inheritance in Java.");
    }
  
}