import java.io.*;

class Lab1 {
    public static void main(String[] args) {
        try {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = bufferedReader.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                System.out.print(str.charAt(i) + " ");
            }
 
        }
    
        
        } catch (IOException ex) {
            System.out.println(ex.toString());
        
    }
    }
}


import java.io.*;
//import java.util.Arrays;
import java.util.*;
class Lab1 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str = bufferedReader.readLine();
            String digit = bufferedReader.readLine();
            String[] output = str.split(" ");
            ArrayList<String> a = new ArrayList<String>(List.of(output));
            for (int i = 0;i<a.size();i++) {
                if ((a.get(i)).length() != Integer.parseInt(digit)){
                    a.remove(i);
                }

            }
            String[] b = new String[a.size()];
            a.toArray(b);
            Arrays.sort(b);
            for (int i = 0;i<b.length;i++) {
                System.out.println(b[i]);
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());

        }
    }
}
