public class LastOccurnace {
  public static int Last(int arr[] , int i , int key)
  {
    if(i==arr.length-1)
    {
      return -1;
    }

    int isfound = Last(arr , i+1 , key);
    if(isfound!=-1)
    {
      return  isfound ;
    }

    if(arr[i] == key)
    {
      return i ;
    }

  return isfound ; 
  }
  public static void main(String[] args) {
   
   int []arr = {1,2,3,4,5,2,3,4,5,2};
   System.out.println(Last(arr, 0, 2));

  }
}
