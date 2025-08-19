public class copyconstructer {
  public static void main(String[] args) {
    Mobile m1 = new Mobile(128, "Vivo");
    m1.printMobileInfo();
    System.out.println();
    Mobile m2 = new Mobile(m1);
    m2.printMobileInfo();
  }
}
class Mobile{
  int storage;
  String brand;

  Mobile (int storge,String brnd){
    this.storage = storge;
    this.brand = brnd;
  }

  public void printMobileInfo(){
    System.out.println(storage);
    System.out.println(brand);
  }

  //copy from m1 to m2
  Mobile (Mobile m){
    this.storage = m.storage;
    this.brand = m.brand;
  }
}
 
