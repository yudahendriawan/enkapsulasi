/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiproject;

/**
 *
 * @author YUDA HENDRIAWAN
 */
public class AIProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //searching about dimension === 1 to 4
//        int initiate = 4;
//        int x[] = {1};
//        Library1.print(x);
//        Library1.breadthFirstSearch1(x, initiate);
//        Library1.resultOfBFS(x);

        //RESULT OF PUZZLE
//        int initiate[][] = {{0,1}, 
//                     {2,3}};
//        
//        int x[][][] = {{{1,3},
//                        {0,2}}};
//        
//        PuzzleLibrary.print2(x);
//        PuzzleLibrary.breadthFirstSearch2(x, initiate);
//        PuzzleLibrary.resultOfBFS(x);
        
        
        //mencari langkah petani
        System.out.println("Kondisi Awal :");
        System.out.println("[ Petani Serigala Angsa Padi ][ ]");
        int x[][] = {{0,0,0,0}, {1,1,1,1}};
        int a[][][] = {{{1,1,1,1}, {0,0,0,0}}};
        FarmerLibrary.breadthFirstSearch(a);
        FarmerLibrary.result();
    }

}
