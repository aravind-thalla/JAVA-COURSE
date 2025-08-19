import java.util.*;
public class circumfurunce {
  public static double circleCircumfurunce(double radius){
    return  2 * 3.14 * radius;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double radius = sc.nextDouble();
    double result = circleCircumfurunce(radius);
    System.out.println(result);
  }
}
