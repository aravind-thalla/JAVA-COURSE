public class subsequence {
  public static void main(String[] args) {
    subseQuence("","abc");
  }
  static void subseQuence(String p,String up){
    if(up.isEmpty()){
      System.out.println(p);
      return;
    }
    char ch = up.charAt(0);
    subseQuence(p+ch,up.substring(1));
    subseQuence(p,up.substring(1));
  }
}