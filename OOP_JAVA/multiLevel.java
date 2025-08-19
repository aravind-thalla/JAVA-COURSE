public class multiLevel {
  public static void main(String[] args) {
        EquilateralTriangle et = new EquilateralTriangle();
        et.color = "Red"; // inherited from Shape
        System.out.println("Color: " + et.color);

        et.area(10);
  }
}

class Shape {
    String color;
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}
class EquilateralTriangle extends Triangle{
  public void area(int h) {
        System.out.println(0.5 * h * h);
    }
}
