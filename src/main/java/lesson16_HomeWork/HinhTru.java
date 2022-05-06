package lesson16_HomeWork;

public class HinhTru implements HinhHoc3D <Double>{
    private double h;
    private double r;

    HinhTron ht = new HinhTron();

    public HinhTru(){

    }

    public HinhTru(double h, double r) {
        if (r <= 0 || h <= 0) {
            throw new RuntimeException("Khong hop le");
        }
        this.h = h;
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if(h<=0) {
            throw new RuntimeException("Khong hop le");
        }
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if(r<=0) {
            throw new RuntimeException("Khong hop le");
        }
        this.r = r;
    }

    @Override
    public Double tinhTheTich() {
        return h*ht.tinhDienTich();
    }

    public double tinhDienTichXungQuanh(){
        return h*ht.tinhChuVi();
    }

    public double tinhDienTichToanPhan(){
        return tinhDienTichXungQuanh()+2*ht.tinhDienTich();
    }

    @Override
    public String toString() {
        return "HinhTru{" +
                "h=" + h +
                ", r=" + r +
                '}';
    }
}
