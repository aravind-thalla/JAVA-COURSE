public class inheritance {
  public static void main(String[] args) {
    Triangle t1 = new Triangle();
    t1.color = "red";
    System.out.println(t1.color);
  }
}
class Shape {
  String  color;
}
class Triangle extends Shape {

}