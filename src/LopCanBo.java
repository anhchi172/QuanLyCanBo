import javax.swing.*;
import java.util.*;
public class LopCanBo{
   private ArrayList<CanBo> al;
   public LopCanBo(){
      al = new ArrayList<CanBo>();
   }

   public void addCanBo(CanBo b){
      al.add(b);
   }

   public void timHoTen(String hoTen){
      boolean found = false;
      for (CanBo b: al){
         if (b.getHoTen().equals(hoTen)) {
            System.out.println(b.toString());
            found = true;
         }
      }
      if (!found)
         System.out.println("Ko tim thay can bo co ten: " + hoTen);

   }

   public void hienThiCanBo(){
      for (CanBo b: al){
         System.out.print(b.toString());
        /* System.out.println("Ho ten: " + b.getHoTen() + "\nTuoi: "+ b.getTuoi() +  "\nGioi Tinh: " + b.getGioiTinh() + "\nDia Chi: " + b.getDiaChi());
         System.out.println();*/
      }
   }
 
   public static void exit(){
      System.out.println("Exit");
      return;
   
   }
}