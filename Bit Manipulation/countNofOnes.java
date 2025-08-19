public class countNofOnes {
  public static void main(String[] args) {
    int number = 5;
    int count = 0;
    while ((number>0)) {
      count = count+(number&1);
      number>>=1;
    }
    System.out.println(count);
  }
}
