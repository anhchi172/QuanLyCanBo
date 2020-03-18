public class KySu extends CanBo{
private String nganhDaoTao;
public KySu(String t, int tuoi, char g, String d,String n){
super(t, tuoi, g, d);
nganhDaoTao = n;
}
public String getNganhDaoTao(){
return nganhDaoTao;
}

    @Override
    public String toString() {
        return ("Ho ten: " + getHoTen() +
                " Tuoi: " + getTuoi() +
                " Gioi Tinh: " + getGioiTinh() +
                " Dia Chi: " + getDiaChi() +
                " Nganh Dao Tao: " + getNganhDaoTao() + "\n");
    }
}