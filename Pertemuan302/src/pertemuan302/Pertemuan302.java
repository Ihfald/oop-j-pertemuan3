/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan302;

import java.util.Scanner;

/**
 *
 * @author LAB F
 */
public class Pertemuan302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jml = 0;
        Scanner dtIN = new Scanner (System.in);
        System.out.print("Jumlah Perulangan: ");
        jml = Integer.parseInt(dtIN.nextLine());
        for(int i=1;i<=jml;i++){
            System.out.println("perulangan ke-");
        }
        System.out.println("Perulangan While");
        int awal = 1;
        while (awal<=jml){
            System.out.println("Perulangan ke-");
            awal++;
        }
        System.out.print("Perulangan do While");
        awal = 1;
        do{
            System.out.println("Perulangan ke-"+awal);
            awal++;
        }while (awal<=jml);
    }
    
}
