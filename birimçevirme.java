/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class birimçevirme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Dönüştürmek İstediğiniz Değeri Giriniz: ");
        double a = input.nextDouble();
        System.out.println("Milimetreye Çevirmek İçin 1 Yazınız.");
        System.out.println("Santimetreye Çevirmek İçin 2 Yazınız.");
        System.out.println("Desimetreye Çevirmek İçin 3 Yazınız.");
        System.out.println("Dekametreye Çevirmek İçin 4 Yazınız.");
        System.out.println("Hektametreye Çevirmek İçin 5 Yazınız.");
        System.out.println("Kilometreye Çevirmek İçin 6 Yazınız.");
        int b = input.nextInt();
        
        if(b == 1)
        {
        a = a * 1000;
        System.out.println(a + "Milimetre");
        }
        else if(b == 2)
        {
        a = a * 100;
        System.out.println(a + "Santimetre");
        }        
        else if(b == 3)
        {
        a = a * 10;
        System.out.println(a + "Desimetre");
        }
        else if(b == 4)
        {
        a = a / 10;
        System.out.println(a + "Dekametre");
        }   
        else if(b == 5)
        {
        a = a / 100;
        System.out.println(a + "Hektametre");        
        }
        else
        {
        a = a / 1000;
        System.out.println(a + "Kilometre");
        }
       
        
        
        
        
        
        
        
    }
    
}
