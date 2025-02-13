public  class FebonessiSeries{

  public static int Febo(int n)
  {

    if(n==0 || n==1)
    {
      return n;
    }
    int fnm1 = Febo(n-1);
    int fnm2 = Febo(n-2);
    int fn = fnm1 + fnm2; 

    return fn;
  }
  public static void main(String[] args) {

    int n = 3;

    int fn = Febo(n);
    System.out.println("The " + n + "th Fibonacci number is " + fn);
    
  }
}