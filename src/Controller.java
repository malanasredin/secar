import java.io.IOException;
import java.util.Scanner;

public class Controller { // контролер


        public static void main(String[] args) throws IOException {
            System.out.println("Добро пожаловать в шифр Цезаря");
            System.out.println("Укажите код для шифра для скорытия следующего текста : ");
            Scanner scanner = new Scanner(System.in);
            System.out.println(Cesar.getString());
            Cesar.setKey(Integer.parseInt(scanner.next()));
            Cesar go = new Cesar();
            go.runCrypto();
            System.out.println("Текст успешно зашифрован и выглядит так: ");
            System.out.println(Cesar.getS2());
            System.out.println("Введите 1 для дешифратора или 2 для взлома");


            while (true){
                int choice;
                choice = Integer.parseInt(scanner.next());
                if (choice == 1 ){
                DeCrypto finish = new DeCrypto();
                finish.DeCrypto();
                break;
            }if (choice == 2){
                BruteForce breaking = new BruteForce();
                    breaking.brut();
                break;
            }else {
                System.out.println("Вы ввели иное значение, введите 1 или 2");
                }
            }
        }
}
