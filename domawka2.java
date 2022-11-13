import java.util.Scanner;

public class domawka2 {
    public static void main(String[] args) {

        //First level: level1
        //С консоли считывается число. Если это число равно 0 - тогда напишите на экран "ошибок не обнаружено",
        //если число не равно 0, тогда выведите три сообщения "ERROR"

       Scanner scanner = new Scanner(System.in);
       int f = scanner.nextInt();
       if (f <=0) {
           System.out.println("No errors was found");
       }
       else if (f >=0){
           System.out.println("Error! Error! Error!");

            //Level2
                    //Мартин

            Scanner s = new Scanner(System.in);
            int firstSpin = scanner.nextInt();
            int secondSpin = scanner.nextInt();

            if (firstSpin == 36 && secondSpin == 17) {
                System.out.println("Jackpot!!!");
            }
            else if (firstSpin == 36 || secondSpin == 17) {
                System.out.println("Small win!");
            }
            else{
                System.out.println("You are looser!!!");
            }

        }


    }

}