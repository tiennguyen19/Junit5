package lesson16_HomeWork;

public class HinhTron implements HinhHoc2D<Double>{
    protected double r;

    public HinhTron(){

    }

    public HinhTron(double r) {
        if (r <= 0) {
            throw new RuntimeException("Khong hop le");
        }
        this.r = r;
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
    public Double tinhChuVi() {
        return 2*r*3.14159;
    }

    @Override
    public Double tinhDienTich() {
        return r*r*3.14159;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "r=" + r +
                '}';
    }
}
