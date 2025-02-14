public class NthPower{

  public static int nthPower(int x , int n) {

    if(n==0)
    {
      return 1 ;
    }

    return x * nthPower(x,n-1);

  }
  public static void main(String[] args) {

    int n = 2 ; 
    int nthPower = nthPower(n, 3);

    System.out.println(nthPower);
    
  }
}