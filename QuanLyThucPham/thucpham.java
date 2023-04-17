package QuanLyThucPham;
import java.util.Scanner;
public class thucpham{
    private String loaithucpham;
    private String mahang;
    private String masoSp;
    private String xuatxu;
    private float soluong;
    private float ngaynhap;
     private float giatrenmoimon;
            
 public thucpham(){}
     public thucpham(String loaithucpham,String mahang,String masoSp,String xuatxu,float soluong,float ngaynhap,float giatrenmoimon){
            this.loaithucpham=loaithucpham;
            this.mahang=mahang;
            this.masoSp=masoSp;
            this.xuatxu=xuatxu;
            this.soluong=soluong;
            this.ngaynhap=ngaynhap;
            this.giatrenmoimon=giatrenmoimon;
     }
     
public String getloaithucpham(){
        return loaithucpham;
 }
public void setloaithucpham(String loaithucpham){
        this.loaithucpham=loaithucpham;
}
public String getmahang(){
        return mahang;
}
public void setmahang(String mahang){
        this.mahang=mahang;
}
public String getmasoSp(){
        return masoSp;
}
public void setmasoSp(String masoSp){
        this.masoSp=masoSp;
}
public String getxuatxu(){
        return xuatxu;
}
public void setxuatxu(String xuatxu){
        this.xuatxu=xuatxu;
}
public float getsoluong(){
        return soluong;
}
public void setsoluong(float soluong){
        this.soluong=soluong;
}
public float getngaynhap(){
        return ngaynhap;
}
public void setngaynhap(float ngaynhap){
        this.ngaynhap=ngaynhap;
}
public  float getgiatrenmoimon(){
        return giatrenmoimon;

}
public void setgiatrenmoimon(float giatrenmoimon){
    this.giatrenmoimon=giatrenmoimon;
}


    @Override
    public String toString() {
        return "thucpham{" + "loaithucpham=" + loaithucpham + ", mahang=" + mahang + ", masoSp=" + masoSp + ", xuatxu=" + xuatxu + ", soluong=" + soluong + ", ngaynhap=" + ngaynhap + ", giatrenmoimon=" + giatrenmoimon + '}';
    }
   
public void nhapthongtinsanpham(){
    Scanner sc =new Scanner(System.in);
    System.out.println("nhap loai thuc pham");
    loaithucpham=sc.nextLine();
    System.out.println("nhap ma hang");
    mahang=sc.nextLine();
    System.out.println("nhap ma so sp");
    masoSp=sc.nextLine();
    System.out.println("nhap xuat xu");
    xuatxu=sc.nextLine();
    System.out.println("nhap so luong");
    soluong=sc.nextFloat();
    System.out.println("ngay nhap");
    ngaynhap=sc.nextFloat();
    System.out.println("nhap gia tren moi mon");
    giatrenmoimon=sc.nextFloat();
}
}


    
        