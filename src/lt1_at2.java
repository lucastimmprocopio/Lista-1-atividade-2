import java.util.Scanner;
public class lt1_at2 {
    public static void main(String[] args) throws Exception {

        //Req_1: Solicitar um número.
        System.out.print(" Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();

        //Req_2: Mostrar o número informado.
    
        System.out.println("O número informado foi: " + numero);
    }
}
