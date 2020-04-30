import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandartInput {
    public StandartInput() {

    }

    public static void main(String[] args) throws IOException {
        System.out.println("Hai, Apa karakter favorit kamu?");

        char FavoriteChar;
        BufferedReader BR;

        BR = new BufferedReader(new InputStreamReader(System.in));
        FavoriteChar = (char) BR.read();

        System.out.println(FavoriteChar + " adalah pilihan yang baik!");
    }
}
