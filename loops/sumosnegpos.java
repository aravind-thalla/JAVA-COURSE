public class sumosnegpos {
  public static void main(String[] args) {
    int n=1-2+3-4+5;
    int ans=0;
    for(int i=1; i<=n; i++){
      if(i%2==0){
        ans=ans-i;
      }else{
        ans=ans+i;
      }
    }
    System.out.println(ans);
  }
}
