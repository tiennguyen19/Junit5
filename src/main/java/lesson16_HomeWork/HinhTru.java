package lesson16_HomeWork;

public class HinhTru implements HinhHoc3D<Double>{
    private double h;
    private double r;

    public HinhTru(double h, double r) {
        if (r <= 0 || h <= 0) {
            throw new IllegalArgumentException("Khong hop le");
        }
        this.h = h;
        this.r = r;
    }

    @Override
    public Double tinhTheTich() {
        return r*r*h*Math.PI;
    }

    public double tinhDienTichXungQuanh(){
        return 2*r*h*Math.PI;
    }

    public double tinhDienTichToanPhan(){
        return tinhDienTichXungQuanh()+2*r*r*Math.PI;
    }
}
