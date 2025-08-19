import java.util.Arrays;

public class stringSearch {
    public static void main(String[] args) {
        String name = "aravind";
        char target = 'f';
        System.out.println(search(name,target));
        //name.toCharArray :- to charArray will convert name to array ex [a, r, a, v, i, n, d]
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static  boolean search(String str, char target){
        if(str.length() == 0){
            return  false;
        }
//        for (int i=0; i<str.length(); i++){
//            if(target == str.charAt(i)){
//                return  true;
//            }
//        }

        for (int ch : str.toCharArray()){
            if(ch == target){
                return  true;
            }
        }
        return  false;
    }
}
