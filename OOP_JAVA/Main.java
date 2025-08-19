import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Student students = new Student(24,"randa",90.7f);
    students.changename("pandu");//u can know "this" keyword is important here
    System.out.println(students.rno);
    System.out.println(students.name);
    System.out.println(students.marks);

    students.greetings();
    System.out.println();
    Student random = new  Student(students);
    System.out.println(random.name);
    System.out.println(random.rno);
    System.out.println(random.marks);
  }
}
class Student{
  int rno;
  String name;
  float marks;
  // constructer
  Student (){
    this.rno = 13;
    this.name = "Thalla Aravind";
    this.marks = 74.6f;
  }
  Student (Student other){
    this.name = other.name;
    this.rno = other.rno;
    this.marks = other.marks;
  }


  void greetings(){
    System.out.println("Hello my name is "+this.name);
  }
  void changename(String nam){
    this.name = nam;
  }
  Student (int rno1,String name,float marks){
    this.rno = rno1;
    this.name = name;
    this.marks = marks;
  }
 }