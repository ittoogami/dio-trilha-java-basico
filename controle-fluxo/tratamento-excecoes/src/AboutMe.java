import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        try {

            Scanner s = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite seu nome:  ");
            String nome = s.next();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = s.next();

            System.out.print("Digite sua idade: ");
            int idade = s.nextInt();

            System.out.print("Digite sua altura: ");
            double altura = s.nextDouble();

            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "CM ");
            s.close();

        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos!");
        } 

    }
}
