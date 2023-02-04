package addnum.W2; //Package pada Java digunakan untuk mengelompokkan kelas,interface, enum, dan sebagainya yang terkait. Package dalam java berperan sebagai folder dalam direktori file.

import java.io.*; //Mengimport library java.io

/**
 * <h1>Add Two Numbers!</h1>
 * The AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 * @author Zulkifli
 * @version 1.0
 * @since 2022-02-09F
 */
public class AddNum {
   /**
    * This method is used to add two integers. This is
    * a the simplest form of a class method, just to
    * show the usage of various javadoc Tags.
    * 
    * @param numA This is the first paramter to addNum method
    * @param numB This is the second parameter to addNum method
    * @return int This returns sum of numA and numB.
    */
   public int addNum(int numA, int numB) {
      return numA + numB; // Method/fungsi ini mengembalikan nilai penjumlahan nilai dari dua variabel
                          // integer.
   }

   /**
    * This is the main method which makes use of addNum method.
    * 
    * @param args Unused.
    * @exception IOException On input error.
    * @see IOException
    */

   public static void main(String args[]) throws IOException {
      AddNum obj = new AddNum(); // Membuat objek baru bertipe AddNum bernama "obj".
      int sum = obj.addNum(10, 20); // Deklarasi variabel "sum" bertipe integer yang diinisialisasi dengan hasil
                                    // dari pemanggilan fungsi addNum (penjumlahan).
      System.out.println("Sum of 10 and 20 is :" + sum); // Menampilkan nilai dari variabel sum
   }

}