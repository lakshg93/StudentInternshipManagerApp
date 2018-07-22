
package studentinternshipapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomListGenerator {
    
  public List<Integer> generate(int n) {
  List<Integer> arr = new ArrayList<>(n);
  for (int i = 0; i < n; i++) {
   arr.add(i + 1);
  }

  Random rand = new Random();
  int r; // stores random number
  int tmp;

  //shuffle above input array
  for (int i = n; i > 0; i--) {
   r = rand.nextInt(i);
   
   tmp = arr.get(i - 1);
   arr.set(i - 1, arr.get(r));
   arr.set(r, tmp);
  }
  return arr;
 }  
  public static String[] shuffleArray(String[] b)
  {
    String [] ar=b.clone();
    List<Integer> rdindex = new RandomListGenerator().generate(ar.length);
 
  for (int i = 0; i < ar.length; i++) {
    ar[i] = b[rdindex.get(i)-1];
  }  
    return ar;
  }

    
}
