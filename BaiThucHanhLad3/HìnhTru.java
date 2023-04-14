package shapes;

import Java.util.Scanner;

public class HinhTru extends Hinhtron {

    public float chieucao;
    
    // constructor
    public HinhTru() {
        ten = " hinh trụ ";
    
    }

    public void nhapchieucao() {
        nhapBanKinh();

        System.out.println("chiều cao = ");
        scanner scanner = new sacnner ( system.in);
        chieucao = scanner.nextfloat();

    }

    public void tinhthetich() {
        tinhdientich();
        thetich = dientich * chieucao;
        
    }
}