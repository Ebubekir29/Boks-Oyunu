public class Mac {
    Dovusculer dovuscu1;
    Dovusculer dovuscu2;
    int minKilo;
    int maxKilo;

    Mac(Dovusculer dovuscu1,Dovusculer dovuscu2,int minKilo,int maxKilo){
        this.dovuscu1 = dovuscu1;
        this.dovuscu2 = dovuscu2;
        this.minKilo = minKilo;
        this.maxKilo = maxKilo;
    }

    public void basla() {
        if (this.dovuscu1.agirlik >= minKilo && this.dovuscu1.agirlik <= maxKilo) {
            if (this.dovuscu2.agirlik >= minKilo && this.dovuscu2.agirlik <= maxKilo) {
                while (this.dovuscu1.saglik > 0 && this.dovuscu2.saglik > 0) {
                    System.out.println("------Yeni Round-----");
                    this.dovuscu2.saglik=this.dovuscu1.hit(this.dovuscu2);
                    this.dovuscu1.saglik=this.dovuscu2.hit(this.dovuscu1);
                    System.out.println(this.dovuscu1.isim + " Saglik : "+ this.dovuscu1.saglik);
                    System.out.println(this.dovuscu2.isim + " Saglik : "+ this.dovuscu2.saglik);
                    if(kazanan())
                        break;
                }
            } else
                System.out.println("Sporcularin sikletleri uyusmuyor.");
        }
    }
    boolean kazanan(){
        if(this.dovuscu1.saglik==0){
            System.out.println(dovuscu2.isim + " kazandi.");
            return true;
        }
        if (this.dovuscu2.saglik==0){
            System.out.println(dovuscu1.isim + " kazandi.");
            return true;
        }
        return false;
    }
}
