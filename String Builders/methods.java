public class methods {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Aravind");
    System.out.println(sb);
    System.out.println(sb.length());

    //to print char at index 0
    System.out.println(sb.charAt(0));

    //remove and set a char at index 0
    sb.setCharAt(0, 'a');
    System.out.println(sb);

    //insert T. at index 0
    sb.insert(0, 'T');
    System.out.println(sb);

    //delete a part
    sb.delete(3, 6);
    System.out.println(sb);

    sb.append("9");
    System.out.println(sb);
  }
}