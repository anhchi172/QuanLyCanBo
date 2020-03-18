public class NhanVien extends CanBo{
private String congViec;
public NhanVien(String ten, int tuoi, char gioiTinh, String diaChi, String c){
super(ten, tuoi, gioiTinh, diaChi);
congViec = c;
}
public String getCongViec() {
    return congViec;
}

    @Override
    public String toString() {
        return ("Ho ten: " + getHoTen() +
                " Tuoi: " + getTuoi() +
                " Gioi Tinh: " + getGioiTinh() +
                " Dia Chi: " + getDiaChi() +
                " Cong viec " + getCongViec() + "\n");
    }
}