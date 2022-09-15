
package sayıbulma;


public class SayıBulma {

    
    public static void main(String[] args) {
         int[] numbers = new int[]{06, 7, 8, 23, 78, 44};
        int aranacak = 44;

        boolean varMi = false;

        for (int sayi : numbers) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Sayı mevcuttur");
        } else {
            System.out.println("Sayı mevcut değildir");
        }
    }
    
}
