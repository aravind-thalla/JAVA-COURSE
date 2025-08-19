public class sum_of_N_void {
  public static void sum(int n,int i,int sum){
    if(i==n){
      sum=sum+i;
      
      System.out.println(sum);
      System.out.println(i);//to print 5
      return;
    }
    sum = sum+i;
    sum(n,i+1,sum);
    System.out.println(i);//to see memory deletion 
  }
  public static void main(String[] args) {
    int n=5;
    sum(n, 1, 0);
  }
}
