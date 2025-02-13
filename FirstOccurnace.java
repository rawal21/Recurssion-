public class FirstOccurnace {

  public static int IsFirstOccurnace(int arr[] , int i,int key )
    {
  if(i==arr.length-1)
  {
    return -1;
  }
  
  if(arr[i]== key)
    {
      return i ; 
    }
    return IsFirstOccurnace(arr , i+1 , key);
  }

 

   public static void main(String[] args) {

    int arr[] = {2,5,7,8,5};
    System.out.println(IsFirstOccurnace(arr, 0, 5));
   }
}
