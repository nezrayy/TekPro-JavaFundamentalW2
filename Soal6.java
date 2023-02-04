package W2;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String A = kb.nextLine();
        String B = kb.nextLine();

        kb.close();

        System.out.println(A.length() + B.length());
        
        int lexical = A.compareTo(B);

        if(lexical>0)
        {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.print(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
}
}
