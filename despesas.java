import java.util.ArrayList;
import java.util.Scanner;

public class despesas {
    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList<String>();
        ArrayList<Float> valor = new ArrayList<Float>();
        Scanner entrada = new Scanner(System.in);
        int y;
        String n;
        float sobra, i, z, x = 0;

        System.out.println("Informe quanto ganha: ");
        z = entrada.nextInt();
        System.out.printf("Digite: %n1.Para continuar %n2.Para sair%n");
        y = entrada.nextInt();
        while (y != 2) {
            System.out.println(" ");
            System.out.println("Informe pra onde irá a despesa: ");
            entrada.nextLine();
            n = entrada.nextLine();
            System.out.println("Informe valor gasto: ");
            i = entrada.nextFloat();
            System.out.println(" ");
            System.out.printf("Digite: %n1.Para continuar %n2.Para sair%n");
            y = entrada.nextInt();

            valor.add(i);
            nome.add(n);
            x += i;
        }

        System.out.println(" ");
        for (int c = 0; c < nome.size(); c++) {
            System.out.println("Nome: " + nome.get(c));
            System.out.println("Valor: " + valor.get(c));
        }

        sobra = z - x;
        System.out.println(" ");
        System.out.printf("Despesa total: %f%n", x);
        System.out.printf("Sobra: %f", sobra);
        entrada.close();
    }
}