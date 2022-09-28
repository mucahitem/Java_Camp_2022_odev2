public class Main {
    public static void main(String[] args) {
        sil();
        String mesaj = "wasd";
        String yeniMesaj = mesaj.substring(0,3);
        System.out.println(yeniMesaj);
        int sayi__ = topla(22,30);
        System.out.println(sayi__);
        int toplam = topla2(111,223,33);
        System.out.println(toplam);

    }
    public static void ekle (){
        System.out.println("Veri eklendi!");
    }
    public static void sil (){
        System.out.println("Veri silindi!");
    }
    public static void guncelle (){
        System.out.println("Veri güncellendi!");
    }
    public static int topla (int sayi1, int sayi2){
        return sayi1 + sayi2;
    }
    public static int topla2 (int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}