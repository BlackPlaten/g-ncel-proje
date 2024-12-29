/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasitlarprojecalistirma;
import java.util.*;
/**
 *
 * @author User
 */
public class motorsiklet extends karaTasitlari {
    public String motorMarka[];
    public String motorModel[];
    public double motorFiyat[];
    public String motorRenk[];    
    Scanner input = new Scanner(System.in);
    
    
     motorsiklet() {
        
        

        this.motorRenk = new String[3];
        this.motorModel = new String[10];
        this.motorFiyat = new double[10];
        
        
    }
    
    public void setMotorMarka(String motorMarka[]){
        this.motorMarka = motorMarka;
    }
    public void setMotorModel(String motorModel[]){
        this.motorModel = motorModel;
    }
    public void setMotorFiyat(double fiyat[]){
        this.motorFiyat = fiyat;
    }
    public void setMotorRenk(String renk[]){
        this.motorRenk = renk;
    }
    public String getMotorRenk(int i){
        try{
            if (i >= 0 && i < this.motorRenk.length) {
            return this.motorRenk[i];
        }
        }catch(Exception e){        
            System.out.println("Gecersiz girdi:"+i);
        }
        
        
        return this.motorRenk[i];
    }
    

    public double getMotorFiyat(int i){
        try{
            if (i >= 0 && i < this.motorFiyat.length) {
            return this.motorFiyat[i];
        }
        }catch(Exception e){
            System.out.println("Gecersiz girdi:"+i);
        }
        
        
        return this.motorFiyat[i];
    }
    public String getMotorModel(int i){
        try{
            if (i >= 0 && i < this.motorModel.length) {
            return this.motorModel[i];
        }
        }catch(Exception e){
            System.out.println("Gecersiz girdi:"+i);
        }
        
        
        return this.motorModel[i];
    }
    public String getMotorMarka(int i){
        try{
            if (i >= 0 && i < this.motorMarka.length) {
            return this.motorMarka[i];
        }
        }catch(Exception e){
            System.out.println("Gecersiz girdi:"+i);
        }
        
        
        return this.motorMarka[i];
    }
    
    @Override
    public void motorTasitSahibi(String motorModel, String motorRenk, motorsiklet motor) {
        this.motorModel[0] = motorModel;
        this.motorRenk[0] = motorRenk;
    }

    @Override
    public void arabaTasitSahibi(String arabaModel, String arabaRenk, otomobil oto) {
        System.out.println("İstediginiz otomobil bulanamamaktadir.");
    }

    public String getTasitBilgileri() {
      String[] tasitBilgileri = new String[4]; 
      tasitBilgileri[0] = this.motorMarka[0]; 
      tasitBilgileri[1] = this.motorModel[0];      
      tasitBilgileri[2] = String.valueOf(this.motorFiyat[0]); 
      tasitBilgileri[3] = this.motorRenk[0];
      
      for(int i = 0;i < tasitBilgileri.length; i++){
          return tasitBilgileri[i];
      }
      return tasitBilgileri[0];
      
       
       
    }
    
    @Override
    public void kaskoSigorta(kullanici k1) {
        int secim;
        System.out.println("Kasko Sigorta yapmak istiyor musunuz. (1-Evet 2-Hayir)");
        secim= input.nextInt();
        
        if(secim == 1 && motorMarka == null){
            System.out.println("Motorunuz bulunmamaktadir");
            k1.anasayfaMenu();
        }
        
        else if(secim == 1 && motorMarka != null){
            System.out.println("Kasko Sigorta ucreti 1000 tldir.");
            if(k1.getButce() < 1000){
                System.out.println("Bakiye yetersizdir.");
                k1.anasayfaMenu();
            }
            else{
                k1.setButce(k1.getButce() - 1000);
                System.out.println("Kasko Sigorta basariyla yapilmistir.");
                k1.anasayfaMenu();
            }
           
        }
        else if(secim == 2){
            k1.anasayfaMenu();
        }
        else{
            System.out.println("Gecersiz secim. Anasayfa ya yonlendiriliyorsunuz.");
            k1.anasayfaMenu();
        }
    }

    @Override
    public void setTasitBilgileri(String marka, String model, double fiyat, String renk) {
        this.motorMarka[0] = marka;
        this.motorModel[0] = model;
        this.motorFiyat[0] = fiyat;
        this.motorRenk[0] = renk;
    }

    
    class yamaha{
        String model[] = {"R1","R3","R7","R25","MT-10"};
        double fiyat[] = {174800,37250,50000,18500,85000};
        String renk[] = {"Siyah","Beyaz","Kirmizi"};
        
        
    }
    class kawasaki{
       String model[] = {"Z500","Eliminator 500","Z7 Hybrid","Ninja7 Hybrid","Ninja 500"};
       double fiyat[] = {38000,40000,82000,80000,42000};
       String renk[] = {"Siyah","Beyaz","Kirmizi"};
       
    }
    
}
