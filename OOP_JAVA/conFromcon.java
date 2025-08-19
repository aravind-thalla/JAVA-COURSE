public class conFromcon {
  public static void main(String[] args) {
    Stdent s3 = new Stdent();
    System.out.println(s3.rno);
    System.out.println(s3.name);
    System.out.println(s3.marks);
  }
}
class Stdent{
  int rno;
  String name;
  float marks;

  Stdent(){
    this(2049, "ARVIND", 202.3f);
  }

  Stdent(int roll,String nam,float mark){
    this.rno = roll;
    this.name = nam;
    this.marks = mark;
  }
}
