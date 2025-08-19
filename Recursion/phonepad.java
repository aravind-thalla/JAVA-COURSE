public class phonepad {
  public static void main(String[] args) {
    phonepads("", "12");
  }
  static void phonepads(String p, String up){
    if(up.isEmpty()){
      System.out.println(p);
      return;
    }
    int digit = up.charAt(0) - '0';
    for(int i=(digit - 1) * 3; i< digit * 3; i++){
      char ch = (char) ('a' + i);
      phonepads(p+ch, up.substring(1));
    }
  }
}
