public class Dovusculer {
    String isim;
    int hasar,agirlik,saglik;
    Dovusculer(String isim,int hasar,int agirlik,int saglik){
        this.isim=isim;
        this.hasar= hasar;
        this.agirlik = agirlik;
        this.saglik=saglik;
    }

    int hit(Dovusculer enemy){
        System.out.println(this.isim+" "+enemy.isim+"'i "+this.hasar+" hasar ile vurdu.");
        return enemy.saglik-this.hasar;
    }
}
