package lesson16_HomeWork;

public class HinhVuong implements HinhHoc2D<Long>{
    protected long side;

    public HinhVuong(){

    }

    public HinhVuong(long side) {
        if (side <= 0) {
            throw new RuntimeException("Khong hop le");
        }
        this.side = side;
    }

    public long getSide() {
        return side;
    }

    public void setSide(long side) {
        if(side<=0) {
            throw new RuntimeException("Khong hop le");
        }
        this.side = side;
    }

    @Override
    public Long tinhChuVi() {
        return (Integer) 4*side;
    }

    @Override
    public Long tinhDienTich() {
        return side*side;
    }
}
