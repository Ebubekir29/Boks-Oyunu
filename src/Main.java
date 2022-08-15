public class Main {
    public static void main(String[] args) {
        Dovusculer dovusculer1 = new Dovusculer("Ebubekir",10,90,100);
        Dovusculer dovusculer2 = new Dovusculer("Semih",20,85,90);
        Mac mac = new Mac(dovusculer1,dovusculer2,80,100);

        mac.basla();

    }
}
