import java.io.*;
import java.util.*;
public class Permutation
{
    public static void main(String[] args) throws IOException {
        
        String fileName = "input.csv";

        File file = new File(fileName);

        ArrayList<ArrayList<Character>> arr = new ArrayList<>();

        int i,j;

         Scanner inputStream = new Scanner (file);
         while(inputStream.hasNext())
            {
                ArrayList<Character> sub_arr = new ArrayList<>();
                String data = inputStream.next();
                String values [] = data.split(",");
                for(i=0;i<values.length;i++)
                {
                    sub_arr.add(values[i].charAt(1));
                }
                arr.add(sub_arr);
            }
        
            int[] indices = new int[arr.size()];
            while (indices[0] < arr.get(0).size()) {
                StringBuilder sb = new StringBuilder();
                for (i = 0; i < indices.length; ++i) {
                
                    sb.append(arr.get(i).get(indices[i]));
                }
                System.out.print(sb.toString()+", ");
                for (i = indices.length - 1; i >= 0; --i) {
                    if (++indices[i] < arr.get(i).size()) {
                        break;
                    }
                    if (i != 0) {
                        indices[i] = 0;
                    }
                }    
        
            }

  
    }
}