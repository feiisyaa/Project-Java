/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author i
 */
import java.util.Scanner;
public class ifElsePraktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int nilai;
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("masukkan nilai");
        nilai = scanner.nextInt();

  if (nilai >= 75) {
      System.out.println("Lulus!");
  } else {
      System.out.println("Tidak Lulus.");
  }
    }
    
}
