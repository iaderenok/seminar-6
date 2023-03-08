import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Laptop {
    private List<Brands> brands;
    private String model;
    private float diagonal;
    private String screenResolution;
    private boolean dvdRom;
    private int hardDisk;
    private String operativeMemory;
    private String operatingSystem;
    private String color;
    public Laptop() {
    }
    public Laptop(String model, float diagonal, String screenResolution, 
    boolean dvdRom, int hardDisk,String operativeMemory, String operatingSystem, 
    String color) {
        this.brands = new ArrayList<>();
        this.model = model;
        this.diagonal = diagonal;
        this.screenResolution = screenResolution;
        this.dvdRom = dvdRom;
        this.hardDisk = hardDisk;
        this.operativeMemory = operativeMemory;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }
    public String getModel() {return model;}
    public float getDiagonal() {return diagonal;}
    public String getScreenResolution() {return screenResolution;}
    public boolean isDvdRom() {return dvdRom;}
    public int getHardDisk() {return hardDisk;}
    public String getOperativeMemory() {return operativeMemory;}
    public String getOperatingSystem() {return operatingSystem;}
    public String getColor() {return color;}
    public void addBrand(Brands brand) {
        brands.add(brand);
    }
    public List<Laptop> filter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Здрасвуйте, Укажите каие параметры для ноут бука вы бы хотели иметь." +
                "\nУкажите размер жёсткого диска в гб\nВ наличии : 300,500,600,700,1000");
        String enterHardDisk = scan.nextLine();
        int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
        System.out.println("Укажите количество оперативной памяти в Гб\nВ наличии : 4, 8, 16 ");
        String enterOperativeMemory = scan.nextLine();
        System.out.println("Укажите операционную систему\nВ наличии : Linux, ios, Windows");
        String enterOperatingSystem = scan.nextLine();
        System.out.println("Укажите цвет ноутбука\nВ наличии : black, white");
        String enterColor = scan.nextLine();

        List<Laptop> list_Laptop = new ArrayList<>();
        for (Laptop tl : laptop) {
            if (intParseEnterHardDisk == tl.hardDisk) {
                if (enterOperativeMemory.equals(tl.operativeMemory)) {
                    if (enterOperatingSystem.equals(tl.operatingSystem)) {
                        if (enterColor.equals(tl.color)) {
                            list_Laptop.add(tl);
                        }
                    }
                }
            }
        }
        return list_Laptop;
    }
    public Set<Laptop> newFilter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        Set<Laptop> list_Laptop = new HashSet<>(laptop);

        System.out.println("Здрасвуйте, Укажите номер или номера критериев фильрации ноутбуков," + 
        "\n1. Size hard disk\n2. Size operatyvi memory\n3. Operating system\n4. Color");
        String userRequest = scan.nextLine();
            
        for (int i = 0; i < userRequest.length(); i++) {
            if(1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите размер жёсткого диска в Гб\nВналичии : 300,500,600,700,1000");
                String enterHardDisk = scan.nextLine();
                int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
                for (Laptop tl : laptop) {
                    if (intParseEnterHardDisk != tl.hardDisk){ 
                        list_Laptop.remove(tl);
                    }
                }          
            }
            
            if(2 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите количество оперативной памяти в Гб\nВ наличии : 4, 8, 16 ");
                String enterOperativeMemory = scan.nextLine();
                for (Laptop tl : laptop) {
                    if ((enterOperativeMemory.equals(tl.operativeMemory)) == false) {
                        list_Laptop.remove(tl);
                    }
                }
            }   

            if(3 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите операционную систему\nВ наличии : Linux, ios, Windows");
                String enterOperatingSystem = scan.nextLine();
                for (Laptop tl : laptop) {
                    if ((enterOperatingSystem.equals(tl.operatingSystem) == false)) {
                        list_Laptop.remove(tl);
                    }
                }
            }
        
            if(4 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите цвет ноутбука\nВ наличии : black, white");
                String enterColor = scan.nextLine();
                for (Laptop tl : laptop) {
                    if ((enterColor.equals(tl.color)) == false) {
                        list_Laptop.remove(tl);
                    }
                }
            }
        }
        return list_Laptop;
    }



    public String toString() {
        return "\nLaptop  ->  " + model + "\nbrands = " + brands + ",\ndiagonal = " 
        + diagonal + ",\nscreenResolution = " + screenResolution + ",\ndvdRom = " 
        + dvdRom + ",\nhardDisk = " + hardDisk + ",\noperativeMemory = " + operativeMemory 
        + ",\noperatingSystem = " + operatingSystem + ",\ncolor = " + color + "\n";
    }

}