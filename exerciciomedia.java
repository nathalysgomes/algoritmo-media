
import java.util.Scanner;

public class exerciciomedia 
{
    public static void main(String[] args)  
    { 
        Scanner ler = new Scanner(System.in); 
        double a,b,c,d,r; 
        // declarado 5 variaveis em double para numeros reais
        System.out.printf("Digite a nota da AC1:"); 
        a = ler.nextDouble(); 
        // System.out.printf para exibir a mensagem "Digite a nota da AC1:" e atribuido o valor para variavel a
        System.out.printf("Digite a nota da AC2:"); 
        b = ler.nextDouble();
        // System.out.printf para exibir a mensagem "Digite a nota da AC2:" e atribuido o valor para variavel b 
        System.out.printf("Digite a nota da AG:");
        c = ler.nextDouble();
        // System.out.printf para exibir a mensagem "Digite a nota da AG:" e atribuido o valor para variavel c
        System.out.printf("Digite a nota da AF:");
        d = ler.nextDouble();
        // System.out.printf para exibir a mensagem "Digite a nota da AF:" e atribuido o valor para variavel d

        a = (a*0.15);
        b = (b*0.3);
        c = (c*0.1);
        d = (d*0.45);
        // Para calcular os valores ponderados das variaveis

        r = (a+b+c+d);
        // Para calcular os valores ja ponderados das variaveis

 if (r>=5) 
{
System.out.print ("Aluno aprovado! =)");
} 
else
System.out.print ("Aluno reprovado! =(");
 // Se o resultado do calculo for maior igual que 5 vai exibir para o usuario "Auluno aprovado! =)"
 // Se nao "Aluno reprovado! =("
} 
}