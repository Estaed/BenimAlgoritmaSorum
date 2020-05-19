package benimalgoritmasorum;
interface Bilgiler{
    public void Bilgileri_Goster();
}
abstract class Saldir{
    public abstract void Saldiri_Yap();   
}

public class BenimAlgoritmaSorum {
    public static void main(String[] args){
        Oyuncu o = new Oyuncu("Estaed", 60 ,"Kazanilmis");
        o.Bilgileri_Goster();
        o.Saldiri_Yap();
        o.BariyerKullanma();
        o.KazanmaKosulu();
    }
}

 class Oyuncu extends Saldir implements Bilgiler{
    
    private static String Bariyer = "Isık Bariyeri";
    private String NickName;
    private int Seviyesi;
    private static String Silah = "Asa";
    private static String OncekiSavas;

    
    public Oyuncu(String NickName, int Seviyesi, String OncekiSavas){
        this.NickName = NickName;
        this.Seviyesi = Seviyesi;
        this.OncekiSavas = OncekiSavas;
    }
    
    
        //Getter and Setter ile yapilmiştir bu kisim
    
    public static String getOncekiSavas() {
        return OncekiSavas;
    }


    public static void setOncekiSavas(String OncekiSavas) {    
        Oyuncu.OncekiSavas = OncekiSavas;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public int getSeviyesi() {
        return Seviyesi;
    }

    public void setSeviyesi(int Seviyesi) {
        this.Seviyesi = Seviyesi;
    }

    public static String getSilah() {
        return Silah;
    }

    public static void setSilah(String Silah) {
        Oyuncu.Silah = Silah;
    }

    
    public void BariyerKullanma(){
        System.out.println(this.Bariyer + " Kullaniliyor");
    }
    
    
    public void KazanmaKosulu(){
        if(this.Seviyesi > 30){
            System.out.println("Seviyesi = " + this.Seviyesi + " Oldugundan Savas Kazanildi");
        }
        else{
            System.out.println("Seviyesi = " + this.Seviyesi + " Oldugundan Savas Kaybedildi");
        }
    }
    
    
    @Override
    public void Saldiri_Yap() {
        System.out.println(this.Silah + " Kullaniliyor" + "\n" + "Mana Harcaniyor");
    }

    @Override
    public void Bilgileri_Goster() {
        System.out.println("Bariyer = " + this.Bariyer + "\n" +"Seviyesi = " + this.Seviyesi + "\n" + "NickName = " + this.NickName + "\n" + "OncekiSavas = "
                + this.OncekiSavas + "\n" + "-----------------------------");
    }
    
    
}
