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
public class PuzzleLibrary {
    public static void breadthFirstSearch2(int a[][][], int x[][]) {
     boolean find = true;
        
     //for every x in a, being found the elemen under
        int b[][][] = new int[2*a.length][2][2];
        for(int i = 0; i < a.length; i++) {
            int c[][] = {{a[i][0][0], a[i][0][1]},
                         {a[i][1][0], a[i][1][1]}};
            
            if(c[0][0] == 0) {
                int d[][] = {{c[0][0], c[0][1]},
                             {c[1][0], c[1][1]}};
                
                d[0][0] = d[1][0];
                d[1][0] = 0;
                
                b[2*i][0][0] = d[0][0];
                b[2*i][0][1] = d[0][1];
                b[2*i][1][0] = d[1][0];
                b[2*i][1][1] = d[1][1];
                
                if(d[0][0] == x[0][0] && d[0][1] == x[0][1] && d[1][0] == x[1][0] && d[1][1] == x[1][1]) {
                    find = false;
                    
                    break;
                }
                
                int e[][] = {{c[0][0], c[0][1]},
                             {c[1][0], c[1][1]}};
                
                e[0][0] = e[0][1];
                e[0][1] = 0;
                
                b[2*i+1][0][0] = e[0][0];
                b[2*i+1][0][1] = e[0][1];
                b[2*i+1][1][0] = e[1][0];
                b[2*i+1][1][1] = e[1][1];
                
                if(e[0][0] == x[0][0] && e[0][1] == x[0][1] && e[1][0] == x[1][0] && e[1][1] == x[1][1]) {
                    find = false;
                    break;
                }
            }
            else if(c[0][1] == 0) {
                int d[][] = {{c[0][0], c[0][1]},
                             {c[1][0], c[1][1]}};
                
                d[0][1] = d[0][0];
                d[0][0] = 0;
                
                b[2*i][0][0] = d[0][0];
                b[2*i][0][1] = d[0][1];
                b[2*i][1][0] = d[1][0];
                b[2*i][1][1] = d[1][1];
                
                if(d[0][0] == x[0][0] && d[0][1] == x[0][1] && d[1][0] == x[1][0] && d[1][1] == x[1][1]) {
                    find = false;
                    break;
                }
                
                int e[][] = {{c[0][0], c[0][1]},
                             {c[1][0], c[1][1]}};
                
                e[0][1] = e[1][1];
                e[1][1] = 0;
                
                b[2*i+1][0][0] = e[0][0];
                b[2*i+1][0][1] = e[0][1];
                b[2*i+1][1][0] = e[1][0];
                b[2*i+1][1][1] = e[1][1];
                
                if(e[0][0] == x[0][0] && e[0][1] == x[0][1] && e[1][0] == x[1][0] && e[1][1] == x[1][1]) {
                    find = false;
                    break;
                }
            }
            else if(c[1][0] == 0) {
                int d[][] = {{c[0][0], c[0][1]},
                             {c[1][0], c[1][1]}};
                
                d[1][0] = d[1][1];
                d[1][1] = 0;
                
                b[2*i][0][0] = d[0][0];
                b[2*i][0][1] = d[0][1];
                b[2*i][1][0] = d[1][0];
                b[2*i][1][1] = d[1][1];
                
                if(d[0][0] == x[0][0] && d[0][1] == x[0][1] && d[1][0] == x[1][0] && d[1][1] == x[1][1]) {
                    find = false;
                    break;
                }
                
                int e[][] = {{c[0][0], c[0][1]},
                             {c[1][0], c[1][1]}};
                
                e[1][0] = e[0][0];
                e[0][0] = 0;
                
                b[2*i+1][0][0] = e[0][0];
                b[2*i+1][0][1] = e[0][1];
                b[2*i+1][1][0] = e[1][0];
                b[2*i+1][1][1] = e[1][1];
                
                if(e[0][0] == x[0][0] && e[0][1] == x[0][1] && e[1][0] == x[1][0] && e[1][1] == x[1][1]) {
                    find = false;
                    break;
                }
            }
            else {
                int d[][] = {{c[0][0], c[0][1]},
                             {c[1][0], c[1][1]}};
                
                d[1][1] = d[0][1];
                d[0][1] = 0;
                
                b[2*i][0][0] = d[0][0];
                b[2*i][0][1] = d[0][1];
                b[2*i][1][0] = d[1][0];
                b[2*i][1][1] = d[1][1];
                
                if(d[0][0] == x[0][0] && d[0][1] == x[0][1] && d[1][0] == x[1][0] && d[1][1] == x[1][1]) {
                    find = false;
                    break;
                }
                
                int e[][] = {{c[0][0], c[0][1]},
                             {c[1][0], c[1][1]}};
                
                e[1][1] = e[1][0];
                e[1][0] = 0;
                
                b[2*i+1][0][0] = e[0][0];
                b[2*i+1][0][1] = e[0][1];
                b[2*i+1][1][0] = e[1][0];
                b[2*i+1][1][1] = e[1][1];
                
                if(e[0][0] == x[0][0] && e[0][1] == x[0][1] && e[1][0] == x[1][0] && e[1][1] == x[1][1]) {
                    find = false;
                    break;
                }
            }
        }
        
        print2(b);
        
        // jika belum ditemukan, maka perlu dilakukan proses berikutnya
        if(find == true) {
            breadthFirstSearch2(b, x);
        }
    }
    
    public static void print2(int a[][]) {
        System.out.print(a[0][0] + " ");
        System.out.println(a[0][1]);
        System.out.print(a[1][0] + " ");
        System.out.println(a[1][1]);
    }
    
    public static void print2(int a[][][]) {
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < a.length; j++) {
                for(int k = 0; k < 2; k++) {
                    System.out.print(a[j][i][k] + " ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    
    public static void resultOfBFS(int a[][][]) {
        System.out.println("");
        System.out.println("Hasil dari Breadth First Search =");
        int s[][] = new int[2][2];
        s[0][0] = a[0][0][0];
        s[0][1] = a[0][0][1];
        s[1][0] = a[0][1][0];
        s[1][1] = a[0][1][1];
        
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(s[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        while (s[0][0]!=0){
 
            if (s[1][0]==0){
           
                if (s[0][0]==2){
                    s[1][0]=2;
                    s[0][0]=0;
                  
                    for(int i=0; i<2; i++){
                        for(int j=0; j<2; j++){
                            System.out.print(s[i][j]+" ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                }
                else if (s[1][1]==2){
                    s[1][0]=2;
                    s[1][1]=0;
               
                    for(int i=0; i<2; i++){
                        for(int j=0; j<2; j++){
                            System.out.print(s[i][j]+" ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                }
            }
            else if (s[0][1]==0){
                if (s[0][0]==1){
                    s[0][1]=1;
                    s[0][0]=0;
                    //print
                    for(int i=0; i<2; i++){
                        for(int j=0; j<2; j++){
                            System.out.print(s[i][j]+" ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                }
                else if (s[1][1]==1){
                    s[0][1]=1;
                    s[1][1]=0;
                    //print
                    for(int i=0; i<2; i++){
                        for(int j=0; j<2; j++){
                            System.out.print(s[i][j]+" ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                }
            }
            else if (s[1][1]==0){
                if (s[1][0]==3){
                    s[1][1]=3;
                    s[1][0]=0;
                    //print
                    for(int i=0; i<2; i++){
                        for(int j=0; j<2; j++){
                            System.out.print(s[i][j]+" ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                }
                else if (s[0][1]==3){
                    s[1][1]=3;
                    s[0][1]=0;
                    //print
                    for(int i=0; i<2; i++){
                        for(int j=0; j<2; j++){
                            System.out.print(s[i][j]+" ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                }
            }
        }
    
    }
}
