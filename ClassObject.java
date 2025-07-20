class Student{
    String name;
    int age;

void displayInfo(){
    System.out.println("Name:"+ name);
    System.out.println("Age:"+ age);
}
}
public class ClassObject{
    public static void main(String[] args) {
        Student s1=new Student(); // Object
        s1.name="Laxman";
        s1.age=21;
        s1.displayInfo();
    }
}