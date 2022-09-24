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
