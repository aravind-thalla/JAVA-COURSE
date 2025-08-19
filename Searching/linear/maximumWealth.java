public class maximumWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {9,9,9}
        };
        System.out.println(maximumwealth(arr));
    }
    static int maximumwealth(int [][] accounts){
        int ans = 0;
//        for(int[] acc : accounts){
//            int sum =0;
//            for(int ints : acc){
//                sum = sum + ints;
//            }
//            if(sum > ans){
//                ans = sum;
//            }
//        }
        for(int row=0; row<accounts.length; row++){
            int sum = 0;
            for(int col=0; col<accounts[row].length; col++){
                sum = sum + accounts[row][col];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return  ans;
    }
}
