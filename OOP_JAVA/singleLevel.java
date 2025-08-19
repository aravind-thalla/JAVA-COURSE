public class singleLevel {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red"; // set inherited field
        System.out.println(t1.color);

        t1.area(10, 5);
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

