/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasitlarprojecalistirma;

/**
 *
 * @author User
 */
public interface tasitlar {
    String arabaMarkalari[] = {"Audi","Bmw","Mercedes"};
    String motorMarkalari[] = {"Yamaha","Kawasaki"};
    
    
    
    public void kaskoSigorta(kullanici k1);
    
    abstract void motorTasitSahibi(String motorModel,String motorRenk,motorsiklet motor);
    abstract void arabaTasitSahibi(String arabaModel,String arabaRenk,otomobil oto);
    
    public String getTasitBilgileri();
    public void setTasitBilgileri(String marka, String model, double fiyat, String renk);
   
}
        