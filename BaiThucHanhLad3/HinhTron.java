pakage shapes;

import Java.util.Scanner;

public class HinhTron extends HinhHoc {
    
    public float bankinh;
    // Contructor
    pubic HinhTron() {
        ten = "Hình Tròn ";
    }

    public void nhapBanKinh();{
        System.out.println("Ban Kính =");
        scanner scanner = new Scanner(System.in);
        bankinh = scanner.nextFloat();
    }
    
    public void tinhchuvi(){
        chuvi = 2 * PI * bankinh;
    }

    public void tinhDienTich(){
        dientich = PI * bankinh * bankinh;
    
    }
}   