import java.util.Scanner;

class TestC3 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int cislo = sc.nextInt();

        if(cislo % 7 == 0) {
           System.out.println("Číslo je dělitené sedmi.");
        } else {
              System.out.println("Číslo není dělitelné sedmi.");
        }

        int counter = 0;

        for(int x = 2; x < 101; x++) {
            for(int y = 2; y < 101; y++){
                if(x % y == 0) {
                    counter++;
                }
            }
            if(counter < 2) System.out.println(x);
            counter = 0;
        }
    }
       
}