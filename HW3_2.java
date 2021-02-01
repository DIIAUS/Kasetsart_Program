import java.util.ArrayList;
class HW3_2{
  public static void main(String[] args) {
    ArrayList<Integer> lst = new ArrayList<Integer>();
    int i = 0;
    lst.add(1);
    lst.add(2);
    lst.add(3);
    lst.add(2);
    lst.add(5);
    lst.add(3);
    lst.add(1);
    lst.add(3);
    lst.add(9);
    while (i < lst.size()){
      if (lst.get(i) % 3 == 0){
          lst.remove(i);
      }
      else{
        i = i + 1;
      }
    }
    System.out.println(lst);
      // add your code here
   }
}

