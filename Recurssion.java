public class Recurssion{

  public static void printDec(int n)
  {
    if(n==1)
    {
      System.out.println(n);
      return ;
    }

    System.out.println(n +" ");
    printDec(n-1); 
  }

  public static void printIn(int n)
    {
      if(n==1)
      {
        System.out.println(n);
        return ; 
      }
  
      printIn(n-1);
      System.out.println(n+ "");
    }

    public static int Fact(int n)
    {

      if(n==1)
      {
        return 1 ;
      }


      int fnm1 = Fact(n-1);
      int fact = n * fnm1;

      return fact;
    }

    public static int Sum(int n)
    {
      if(n==1)
      {
        return 1 ;
      }

      int fnm1 = Sum(n-1);
      int sum = n + fnm1 ;

      return sum ;
    }
    
    public static void main(String[] args) {
      int n =5 ;
      // printDec(n);
    //  printIn(n);
    int fact = Fact(n);
    System.out.println("the factorial of the given number is "+fact);

    int Sum = Sum(n);
    System.out.println("the sum of the first " + n + " netual number" + Sum);
  }
}