import java.util.*;
public class LopCanBo{
   private ArrayList<CanBo> al;
   public LopCanBo(){
      al = new ArrayList<CanBo>();
   }

   public void addCanBo(CanBo b){
      al.add(b);
   }

   public CanBo timHoTen(String hoTen){
      for (CanBo b: al){
         if (b.getHoTen().equals(hoTen))
            return b;
      }
      return null;
   }

   public void hienThiCanBo(){
      for (CanBo b: al){
         System.out.println("Ho ten: " + b.getHoTen() + "\nTuoi: "+ b.getTuoi() +  "\nGioi Tinh: " + b.getGioiTinh() + "\nDia Chi: " + b.getDiaChi());
         System.out.println();
      }
   }
 
   public static void exit(){
      System.out.println("Exit");
      return;
   
   }
}