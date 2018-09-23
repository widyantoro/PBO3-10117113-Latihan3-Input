/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pho3.pkg10117113.latihan3.input;

import java.util.Scanner;

/*
 * 
 * @author
 * Nama     : Eka Widyantoro
 * Kelas    : IF-3 / PBO3
 * NIM      : 10117113
 * Deskripsi Program : Program memasukan nilai dari keyboard
 */
public class PHO310117113Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Masukan Nama Anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama Anda Adalah "+nama);
    }
    
}
