public class CongNhan extends CanBo{
private int bac;
public CongNhan(String t, int tuoi, char g, String d, int b){
super(t, tuoi, g, d);
bac =b;
}

public int getBac(){
    return bac;
        }
    @Override
    public String toString() {
        return ("Ho ten: " + getHoTen() +
                " Tuoi: " + getTuoi() +
                " Gioi Tinh: " + getGioiTinh() +
                " Dia Chi: " + getDiaChi() +
                " Bac: " + getBac() + "\n");
    }

}