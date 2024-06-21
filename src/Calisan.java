public class Calisan {

    // superclass veya baseclass

    private String isim;
    private int maas;
    private String departman;

    public Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public void calis(){
        System.out.println("Çalışan çalışıyor");
    }
    public void bilgilerigoster(){
        System.out.println("İsim : " + isim);
        System.out.println("Departman : " + departman);
        System.out.println("Maaş : " + maas);
    }
    public void departmandegis(String yeniDepartman){
        System.out.println("Departman değiştiriliyor");
        departman=yeniDepartman;
        System.out.println("Yeni departman : " + departman);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
