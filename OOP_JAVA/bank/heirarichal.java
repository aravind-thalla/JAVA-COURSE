package bank;
import java.util.*;
public class heirarichal {
  public static void main(String[] args) {
    Account account1 = new Account();
    account1.name = "customer1";
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
class cricle extends Shape{
  public void area(int h) {
        System.out.println(0.5 * h * h);
    }
}
