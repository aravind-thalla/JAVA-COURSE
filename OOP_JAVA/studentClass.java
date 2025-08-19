public class studentClass {
  public static void main(String[] args) {
    Students s1 = new Students();
    s1.name = "Aravind";
    s1.age = 20;
    s1.printInfo();
    Students s2 = new Students("pandu",21);
    System.out.println(s2.name);
    System.out.println(s2.age);
    Students s3 = new Students(s2);
    s3.printInfo();
  }
}
class Students{
  String name;
  int age;

  public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
  }
  //non parametrised constructor
  Students(){
    System.out.println("constructor called");
  }

  //parametrised constructor
  Students(String naam,int vayasu){
    this.name = naam;
    this.age = vayasu;
  }

  //copy constructor
  Students(Students s3){
    this.name = s3.name;
    this.age = s3.age;
  }
}


