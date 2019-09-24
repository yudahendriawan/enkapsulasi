/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Enkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int nrp = 10;
//        String nama = "YUDA";
//        int semester = 7;
//        double ipk = 3.5;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NRP \t\t : ");
        int nrp = input.nextInt();
        
        System.out.print("Masukkan Nama\t\t : " );
        String nama = input.next();
        
        System.out.print("Masukkan Semester \t : ");
        int semester = input.nextInt();
        
        System.out.print("Masukkan IPK \t\t : ");
        double ipk = input.nextDouble();
        
        System.out.println("===============================================");
        //AYOOOOO
        Mahasiswa mhs = new Mahasiswa(nrp,nama,semester,ipk);
//        Mahasiswa mhs = new Mahasiswa();
//        mhs.setNama(nama);
//        mhs.setNrp(nrp);
//        mhs.setIpk(ipk);
//        mhs.setSemester(semester);
       
        
        //Mahasiswa mhsParameter = new Mahasiswa(003, "FIRMAN");
        
        System.out.println("DATA MAHASISWA : ");
        System.out.println("Nama \t\t : "+mhs.getNama());
        System.out.println("NRP \t\t : "+mhs.getNrp());
        System.out.println("Semester \t "
                + ": "+mhs.getSemester());
        System.out.println("IPK \t\t : "+mhs.getIpk());
        
  
    }
    
}
