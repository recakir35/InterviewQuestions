package practice_basic_day05.ObjeOlusturma_ogretmen;

public class ObjectClass {
    /*
     * Object Class’i olusturun burada OgretmenBilgileri Class indan
     * object ureterek yeni
     * ogretmenler olusturun ve bilgilerini yazdirin
     */
    public static void main(String[] args) {
        OgretmenBilgileri obj1= new OgretmenBilgileri();
        obj1.name="Ahmet";
        obj1.surname="Kaya";
        obj1.age=32;
        obj1.branch="Fizik";
        obj1.PhoneNumber="123456789";

        OgretmenBilgileri obj2= new OgretmenBilgileri();
        obj2.name="Mehmet";
        obj2.surname="Kaya";
        obj2.age=30;
        obj2.branch="Matematik";
        obj2.PhoneNumber="98756456789";

        System.out.println(obj1.name+" "+obj1.surname+" "+obj1.PhoneNumber);
    }


}
