import Conta.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



       SistemaService sitema = new SistemaService(scan);

       sitema.cadastrarConta();


    }
}