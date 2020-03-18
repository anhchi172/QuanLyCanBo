import java.util.*;
public class CanBoTester{
public static void main (String [] args){
Scanner scan = new Scanner(System.in);
LopCanBo l = new LopCanBo();

int act;
do{
System.out.println("Chon thao tac: \n1. Them moi can bo\n2. Tim kiem \n3. Hien thi thong tin \n4. Thoat");
 act = checkInput(1,4);
if (act == 1)
{
 System.out.print("Nhap ho ten: ");  
 String ten = scan.nextLine();
 System.out.print("Nhap tuoi: ");
 int tuoi = checkInput(1, Integer.MAX_VALUE);
 System.out.print("Nhap gioi tinh (M/F): ");
 char gioiTinh = scan.next().charAt(0);
 scan.nextLine();
 System.out.println("Nhap dia chi: ");
 String diaChi = scan.nextLine();
 
System.out.println("Chon \n1.Cong nhan\n2.Ky su\n3.Nhan vien");
int choice = checkInput(1, 3);

if (choice == 1){
System.out.print("Nhap bac: ");
int bac = checkInput(1,10);
CanBo c = new CongNhan(ten, tuoi, gioiTinh, diaChi, bac);
l.addCanBo(c);
}
else if (choice == 2)
{
System.out.print("Nhap nganh dao tao: ");
String nganh = scan.nextLine();
CanBo c = new KySu(ten, tuoi, gioiTinh, diaChi, nganh);
l.addCanBo(c);
}
else 
{
System.out.print("Nhap cong viec: ");
String congViec = scan.nextLine();
CanBo c = new NhanVien(ten, tuoi, gioiTinh, diaChi, congViec);
l.addCanBo(c);

}


  
} 

else if (act == 2)
{
System.out.println("Nhap Ho Ten: ");
String hoTen = scan.nextLine();
l.timHoTen(hoTen);

}

else if (act == 3){
System.out.println("Thong tin can bo: ");
l.hienThiCanBo();
}

else {
l.exit();
}

}while (act!=4);
}
    private static int checkInput(int a, int b){
        Scanner scan = new Scanner (System.in);
        try {
            int choice = scan.nextInt();

            while (choice < a || choice > b) {
                System.out.println("Du lieu nhap khong phu hop voi yeu cau. Vui long nhap lai:");
                choice = scan.nextInt();
            }


            return choice;
        } catch (Exception e) {
            System.out.println("Du lieu nhap khong phu hop voi yeu cau. Vui long nhap lai:");
            return checkInput(a, b);
        }
    }
}