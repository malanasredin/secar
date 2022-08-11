import java.io.IOException;
import java.util.Scanner;

public class Controller { // контролер цезаря


        public static void main(String[] args) throws IOException {
            System.out.println("Добро пожаловать в шифр Цезаря");
            System.out.println("Укажите код для шифра для скорытия следующего текста : ");
            Scanner scanner = new Scanner(System.in);
            System.out.println(Cesar.getString());
            Cesar.setKey(Integer.parseInt(scanner.next()));
            Cesar start = new Cesar();
            start.runCrypto();
            System.out.println("Текст успешно зашифрован и выглядит так: ");
            System.out.println(Cesar.getS2());









}}
