/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutilss;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class main  {

 
    private static void yaz(String mesaj, float deger)
    {
        System.out.print(mesaj + deger);
    }
    public static void main(String[] args) {
        
        
        yaz("Üçgen çevresi : ", MyUtilss.ucgenAlan(2, 4, 2));
        
        
        yaz("Üçgen Alanı", MyUtilss.ucgenAlan(4, 6, 8));
        
        yaz("Çokgen çevresi : ", MyUtilss.cokgenCevre(4, 4, 4, 4, 4));
        
        yaz("Çokgen çevresi : ", MyUtilss.cokgenAlan(4, 4));
        
        
      List<Integer> list = new ArrayList<>();   
        int sayac = -100;
        while(sayac <= 100)
        {
            list.add(sayac);
            sayac ++;
        }
        double[] dizi = new double[list.size()];
        for (int i = 0; i < dizi.length; i++) {
   
         dizi[i] = list.get(i).doubleValue();               
         }
        double[] dizi2 = MyUtilss.hesapla(dizi);
        
        for(int i = 0; i < dizi2.length; i++)
        {
            System.out.print(dizi2[i] + "\n");
            
        }
        
        
        
    }
      
    
}

    

