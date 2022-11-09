import java.io.*;
import java.lang.*;

public class question3 {

    public static void main (String[] args) {
	    String str = "Yo Yo Yoshita dudes. Lets say hello-world_2, we";
	    System.out.println(fun(str));
	}
    
    public static String fun(String str){
        StringBuilder ans = new StringBuilder();
        for (int i=0;i< str.length() ;i++ ) {
            char ch = str.charAt(i);
            int ascii = (int) str.charAt(i);
            if (ascii >= 65 && ascii <= 86){
                ans.append((char)(ascii+4));
            }
            else if (ascii >= 87 && ascii <= 90){
                ans.append((char)(ascii-22));
            }else if (ascii >= 97 && ascii <= 118){
                ans.append((char)(ascii+4));
            }else if (ascii >= 119 && ascii <= 122){
                ans.append((char)(ascii-22));
            }else if (ascii >= 48 && ascii <= 53){
                ans.append((char)(ascii+4));
            }else if (ascii >= 54 && ascii <= 57){
                ans.append((char)(ascii-6));
            } else ans.append(ch);
            
        }
        return ans.toString();
    }
}