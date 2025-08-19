public class binarySearch {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,55,66,78};
    int target = 55;
    System.out.println(serachBinary(arr, target, 0, arr.length-1));
  }

  static int serachBinary(int arr[],int target,int s,int e){
    if(s>e){
      return -1;
    }
    int mid = (s+e)/2;
    if(target == arr[mid]){
      return mid;
    }
    if(target<arr[mid]){
      return serachBinary(arr, target, s, mid-1);
    }
    return serachBinary(arr, target, mid+1, e);
  }
}
