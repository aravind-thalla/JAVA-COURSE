public class campare {
  public static void main(String[] args) {
    String name1 = "Aravind";
    String name2 = "Aravind";
    System.out.println(name1.compareTo(name2));

    if(name1.compareTo(name2)==0){
      System.out.println("Both are equal");
    }else{
      System.out.println("Both are not equal");
    }
  }
}
