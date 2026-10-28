package ex5.model;

public class Conversor {
    public void converter(int temperatura){
        double fahrenheit = (temperatura * 9 / 5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }

    public void converter(double quilometros){
        double milhas = quilometros * 0.621371;

        System.out.println("Distância em milhas: " + milhas);
    }

    public void converter(String letras){
        System.out.println(letras.toUpperCase());
    }
}
