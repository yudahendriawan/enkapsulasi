/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiproject;

import java.util.Stack;

/**
 *
 * @author YUDA HENDRIAWAN
 */
public class Library1 {
    static Stack stack = new Stack();   //inisiasi stack untuk melihat tumpukan index
    static int index;                      //inisiasi indeks                 
      
    public static void breadthFirstSearch1(int a[], int x) {
        
        boolean cari_lagi = true;
        
        // untuk setiap x di a, dicari elemen-elemen di bawahnya
        int b[] = new int[2*a.length];
        for(int i = 0; i < a.length; i++) {
            b[2*i] = a[i]-1;
            
            // jika ditemukan maka berhenti
            if(b[2*i] == x) {
                cari_lagi = false;
                index = 2*i;
                break;
            }
            
            b[2*i+1] = a[i]+1;
            
            // jika ditemukan maka berhenti
            if(b[2*i+1] == x) {
                cari_lagi = false;
                index = (2*i)+1;
                break;
            }
        }
        
        //print tree
        print(b);
        
        // jika belum ditemukan, maka perlu dilakukan proses berikutnya
        if(cari_lagi == true) {
            breadthFirstSearch1(b, x);
        }
        stack.push(b[index]);
        index = index/2;
    }
    
    public static void print(int a[]) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static void resultOfBFS(int a[]){
        System.out.println("");
        System.out.println("Result of Breadth First Search =");
        System.out.print(a[0]);
        while(!stack.empty())
            System.out.print(" -> "+stack.pop());
        System.out.println("");
    }
}
