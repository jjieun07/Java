package app;

import java.util.*;
import character.Solider;

public class App {
	public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Solider solider = new Solider();
        int weaponType;
        
        while(true){
            System.out.println("군인이 전략에 사용할 무기를 눌러주세요.");
            System.out.print("1.활 2.총 3.칼 0.종료: ");
            weaponType = scanner.nextInt();

            if(weaponType == 0){
                break;
            }

            if(weaponType < 0 || weaponType > 3){
                System.out.println("없는 무기 입니다.");
                continue;
            }
            
            solider.setWeapon(weaponType);
            solider.use();
        }

        System.out.println("종료");
        scanner.close();
    }
}
