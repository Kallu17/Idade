import java.util.Scanner;
public class Idade{
    public static void main(String[] args){
        int anoAtual, anoNascimento, qtdAnos;
        
        System.out.println("Ano atual: ");
        anoAtual = new Scanner(System.in).nextInt();
        
        System.out.println("Ano de nascimento: ");
        anoNascimento = new Scanner(System.in).nextInt();
        
        qtdAnos = anoAtual - anoNascimento;
        
        System.out.printf("Em %d você faz %d anos!\n",anoAtual,qtdAnos);
    }
}
