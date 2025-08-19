public class calcpower {
  public static int calPower(int x,int n){//stack height is equal to n;
    if(n==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    int power_nmo = calPower(x, n-1);
    int power = x*power_nmo;
    return power;
  }
  public static int calPowerlogn(int x,int n){// stack height is logn;
    if(n==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    if(n%2==0){
      return calPowerlogn(x,n/2)*calPowerlogn(x,n/2);
    }else{
      return calPowerlogn(x, n/2)*calPowerlogn(x, n/2)*x;
    }
  }
  public static void main(String[] args) {
    int n=5;
    int x=2;
    System.out.println(calPower(x,n));
    System.out.println(calPowerlogn(x, n));
  }
}
