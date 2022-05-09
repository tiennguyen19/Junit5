package lesson16_HomeWork;

public class HinhTru extends HinhTron implements HinhHoc3D <Double> {
    private double h;
    HinhTron ht = new HinhTron();

    public HinhTru(double h) {
        if (h <= 0) {
            throw new RuntimeException("Khong hop le");
        }
        this.h = h;
    }

    public HinhTru(double h, double r) {
        super(r);
        if (h <= 0) {
            throw new RuntimeException("Khong hop le");
        }
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if (h <= 0) {
            throw new RuntimeException("Khong hop le");
        }
        this.h = h;
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
}
