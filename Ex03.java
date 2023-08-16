import java.util.Scanner;

public class Ex03
{
   public static void main(String[] args)
   {
     Scanner leitorTeclado = new Scanner(System.in);
     String frase;
     frase = lerFrase(leitorTeclado);
     while(frase.toLowerCase() != "fim")
     {
        frase = Inverter(frase);
        System.out.println("\nFrase invertida:" + frase);
        frase = lerFrase(leitorTeclado);
     }
     leitorTeclado.close();

   }

   static String lerFrase(Scanner leitorTeclado)
   {
    System.out.println("Digite uma frase:");
    String frase = leitorTeclado.nextLine();
    return frase;
   }

   static String Inverter(String frase)
   {
    String invertida = "";
    int tamanho = frase.length();
    for(int i = tamanho-1 ; i>=0; i--)
    {
       invertida+= frase.charAt(i);
    }
    return invertida;
   }
}