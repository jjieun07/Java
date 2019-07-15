package app;

import java.util.*;
import character.Solider;

public class App {
	public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Solider solider = new Solider();
        int weaponType;
        
        while(true){
            System.out.println("������ ������ ����� ���⸦ �����ּ���.");
            System.out.print("1.Ȱ 2.�� 3.Į 0.����: ");
            weaponType = scanner.nextInt();

            if(weaponType == 0){
                break;
            }

            if(weaponType < 0 || weaponType > 3){
                System.out.println("���� ���� �Դϴ�.");
                continue;
            }
            
            solider.setWeapon(weaponType);
            solider.use();
        }

        System.out.println("����");
        scanner.close();
    }
}
