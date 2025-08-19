public class   linear_Search {
    public static void main(String[] args) {
        int[] num = {23,43,55,67,19,20,89};
        int target = 19;
        System.out.println(search(num,target));
    }
    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int search(int arr[],int target) {
        if (arr.length == 0) {
            return -1;
        }
        //runs a for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is = target
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        //This line will execute if non of the return statements above have executed
        return -1;
    }
}
