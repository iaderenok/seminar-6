import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Laptop hp_pailion_g6 = new Laptop("hp_pailion_g6", 16, "4k", 
        true, 500, "16", "Windows", "black"); 
        Brands brandHp = new Brands("HP", "U.S.A.", "AmericaLanguage");
        hp_pailion_g6.addBrand(brandHp); 
        Laptop samsung_a52 = new Laptop("samsung_a52", 18, "FullHD", 
        true, 300, "8", "Windows", "black");
        Brands brandSamsung = new Brands("Samsung", "Korea", "KoreaLanguage");
        samsung_a52.addBrand(brandSamsung);
        Laptop lenovo_gtx76 = new Laptop("lenovo_gtx76", 16, "FullHD", 
        true, 700, "8", "Windows", "white");
        Brands brandLenovo = new Brands("Lenovo", "China", "ChinaLanguage");
        lenovo_gtx76.addBrand(brandLenovo);
        Laptop macbook_14pro = new Laptop("macbook_14pro", 17, "4k", 
        false, 1000, "8", "ios", "white");
        Brands brandMacbook = new Brands("Apple", "U.S.A.", "AmericaLanguage");
        macbook_14pro.addBrand(brandMacbook);
        Laptop asus_x515 = new Laptop("asus_x515", 17, "FullHD", 
        true, 300, "4", "Windows", "black");
        Brands brandAsus = new Brands("Asus", "taiwan", "ChinaLanguage");
        asus_x515.addBrand(brandAsus);
        Laptop acer_air5 = new Laptop("acer_air5", 19, "FullHD", 
        true, 600, "8", "Windows", "black");
        Brands brandAcer = new Brands("Acer", "taiwan", "ChinaLanguage");
        acer_air5.addBrand(brandAcer);

        Set <Laptop> laptop = new HashSet<>();
        laptop.add(hp_pailion_g6);     
        laptop.add(samsung_a52);
        laptop.add(lenovo_gtx76);
        laptop.add(macbook_14pro);
        laptop.add(asus_x515);
        laptop.add(acer_air5);
        Laptop FilterLaptop = new Laptop();
// фильтрации по определеннеым параметрам (раскомитте)
        //System.out.println("по вашему запросу найдено: " + FilterLaptop.filter(laptop));

        System.out.println(FilterLaptop.newFilter(laptop));
    }
}