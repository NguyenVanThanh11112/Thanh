package shapess;

 import  java.util.scanner;

 public class HinhChuNhat extends HinhHoc {
     public float dai;
     public float rong;

     // Constructor
     public HinhChuNhat() {
        ten = "Hình Chữ Nhật";
     }

     public void nhapchieudai(){
        sysrem.out.srintln("chiều dài = ");
        scanner scanner = new scanner(system.in);
        dai = scanner.nextfloat();
     }

     public viod nhapchieurong(){
        system.out.println("chiều rộng = ");
        scanner scanner = new scanner(system.in);
        rong = scanner .nextfloat();
    
     }

     public void tinhchuvi(){
        chuvi = 2 * (dai + rong );
     }

     public void tinhdientich(){
        dientich = dai * rong;
     }
 }

