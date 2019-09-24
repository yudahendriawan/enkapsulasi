package enkapsulasi;

public class Mahasiswa {
    private int nrp;
    private String nama;
    private int semester;
    private double ipk;

    public Mahasiswa() {
    }

    public Mahasiswa(int nrp, String nama, int semester, double ipk) {
        this.nrp = nrp;
        this.nama = nama;
        this.semester = semester;
        this.ipk = ipk;
    }

    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    
   
    
    
    
}
