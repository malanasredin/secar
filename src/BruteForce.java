import java.io.IOException;
//Марк БРУТ
public class BruteForce {


    public static void main(String[] args) throws IOException {
        System.out.println("Добро пожаловать к Бруту, сейчас будем форсить цезаря, расшифрованные варинаты теста отобразятся ниже");

        for (int i = 0; i < 32; i++) {
            Cesar.setKey(i);
            Cesar kill = new Cesar();
            kill.runCrypto();
            System.out.println(Cesar.getS2());
        }

    }
}
