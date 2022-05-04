package lesson16_HomeWork;

public class HinhVuong implements HinhHoc2D<Long>{
    protected long side;

    public HinhVuong(long side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Khong hop le");
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
