package exaula;
import java.util.Scanner;

public class classe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float[] numeros = new float[10];
        float soma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextFloat();
            soma += numeros[i];
        }
        
        float maior = numeros[0];
        float menor = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        float media = soma / numeros.length;
        
        System.out.println("\nNúmeros digitados:");
        for (float num : numeros) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média: " + media);
        
        scanner.close();
    }
}