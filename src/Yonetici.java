public class Yonetici extends Calisan{
    //subclass

    private int sorumluKisi;
    public Yonetici(String isim, int maas, String departman,int sorumluKisi) {
        super(isim, maas, departman);
        this.sorumluKisi = sorumluKisi;
    }

    public void zamYap(int miktar){
        System.out.println("Çalışanlara " + miktar + " TL zam yapıldı");
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Sorumlu kişi sayısı : " + sorumluKisi);
    }
}
