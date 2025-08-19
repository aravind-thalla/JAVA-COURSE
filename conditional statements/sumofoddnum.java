public class sumofoddnum {
  public static void main(String[] args) {
    int n= 10;
    int result = 0;
    for(int i=0; i<=n; i++){
      if(i%2 != 0){
        result = result+i;
      }
    }
    System.out.println("sum of odd numbers is : "+result);
  }
}
