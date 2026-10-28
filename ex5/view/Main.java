package ex5.view;
import ex5.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Conversor conversor = new Conversor();
       Scanner blaziken = new Scanner(System.in);
       int celsius = 67;
       String palavra = "paralelepipedo";
       double quilometros = 67;
       
       conversor.converter(celsius);
       conversor.converter(quilometros);
       conversor.converter(palavra);

       blaziken.close();
    }
}
