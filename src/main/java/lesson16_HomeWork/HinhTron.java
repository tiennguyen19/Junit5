package lesson16_HomeWork;

public class HinhTron implements HinhHoc2D<Double>{
    protected double r;

    public HinhTron(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Khong hop le");
        }
        this.r = r;
    }

    @Override
    public Double tinhChuVi() {
        return 2*r*Math.PI;
    }

    @Override
    public Double tinhDienTich() {
        return r*r*Math.PI;
    }
}
