public class removDublicates {
  public static boolean[] map= new boolean[26];
  public static void removeduv(String str,int idx,String newString){
    if(idx == str.length()){
      System.out.println(newString);
      return;
    }
    char currchar = str.charAt(idx);
    if(map[currchar - 'a']){
      removeduv(str, idx+1, newString);
    }else{
      newString += currchar;
      map[currchar - 'a'] = true;
      removeduv(str, idx+1, newString);
    }
  }
  public static void main(String[] args) {
    String str = "abbccda";
    removeduv(str, 0, "");
  }
}
