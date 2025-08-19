import java.util.Arrays;
public class sumTriangle {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    triangle(arr);
  }
  static void triangle(int[] arr){
    if(arr.length < 1){
      return;
    }
    int[] temp = new int[arr.length-1];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = arr[i] + arr[i+1];
    }
    triangle(temp);
    System.out.println(Arrays.toString(arr));
  }
}
