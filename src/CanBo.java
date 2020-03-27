import java.io.Serializable;

public class CanBo implements Serializable {
    private String hoTen;
    private int tuoi;
    private char gioiTinh;
    private String diaChi;

    public CanBo(String h, int t, char g, String d) {
        hoTen = h;
        tuoi = t;
        gioiTinh = g;
        diaChi = d;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public char getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}