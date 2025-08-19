public class tabbleusingXOR {
  public static void main(String[] args) {
    int number = 5;
    int pos = 1; 
    int bitMask = 1<<pos;
    int tagglenumber = bitMask ^ number;
    System.out.println(tagglenumber);
  }
}
