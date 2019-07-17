/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilprima;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class BilPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan : ");
        Scanner input = new Scanner(System.in);
        int prima = input.nextInt();
        boolean yuda = isPrima(prima);
        System.out.println(prima+" prima? "+yuda);
        System.out.println("LOVEYOU");
    }
    public static boolean isPrima(int bil){
        boolean hasil = false;
        if(bil == 1){
            hasil=false;
        }
        else if (bil == 2){
            hasil = true;
        }
        else if (bil>2){
            for(int i = 3 ; i < bil; i++){
               if(bil%i == 0){
                   hasil = false;
               }
               else{
                   hasil = true;
               }
            }   
        }   
       return hasil; 
    }
    
}
