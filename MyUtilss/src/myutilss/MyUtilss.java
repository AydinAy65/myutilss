/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutilss;
import java.math.*;
/**
 *
 * @author Lenovo
 */
public class MyUtilss {
    public static float ucgenCevre(float a,float b,float c){
         return a+b+c;
     }
    
     public static float ucgenAlan(float a,float b,float c){
         float s = (a + b +c )/ 2;
         float sonuc = (float)Math.sqrt(s*(s - a)*(s - b)*(s - c));
         return sonuc;
     }
       public static float cokgenCevre(float a, float b, float c, float d)
    {
        return a + b + c + d;
    }
     public static float cokgenCevre(float a, float b, float c, float d, float e)
    {
        return a + b + c + d;
    }
    
    public static float cokgenAlan(float KenarUzunlugu, int KenarSayisi)
    {
       float alan = KenarSayisi * (KenarUzunlugu*KenarUzunlugu) / 4 * (float)Math.tan(Math.PI / KenarSayisi);
       
       return alan;
    }
     
    public static  double[] hesapla(double[] dizi){
        
        
       double [] sonuc = new double[dizi.length * 2];
        int sayac1 = 0, sayac2 = 1;
        for(int i = 0; i < dizi.length; i ++)
        {
            double x = dizi[i];
            sonuc[sayac1] = 3*x*x - 2 * Math.exp(x) + Math.sqrt(x);
            
            double x2 = dizi[i];
            sonuc[sayac2] = 1 / (1+ Math.exp(x2));
            
            sayac1 += 2;
            sayac2 += 2;
            
        }
        
        
        return sonuc;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
