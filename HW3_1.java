import java.util.*;

  class HW3_1
  {
    public static int binarySearch(int[] lst,int v)
    {
      int i,j,mid,k;
      i = 0;
      j = lst.length;
      k = 0;
      while(i<j)
      {
        mid = (i+j) / 2;
        if (v < lst[mid]){
          j = mid;
        }
        else if (v > lst[mid]){
          i = mid + 1;
        }
        else{
          k = mid;
          break;
        }
      }
      return k;
    }

    public static void main(String[] args)
      {
      int[] set = {1,2,4,5,7,8,11,13};

      System.out.println(binarySearch(set,5));
      System.out.println(binarySearch(set,13));
      System.out.println(binarySearch(set,10));

    }
  }
