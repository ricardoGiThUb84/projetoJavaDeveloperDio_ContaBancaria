import Conta.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaService {

    private Scanner scan;


    public SistemaService(Scanner scan) {
        this.scan = scan;

    }

    public void cadastrarConta() {


        List<String> valores = new ArrayList<>();

        for (TELA_CADASTRO tela : TELA_CADASTRO.values()) {

            System.out.println(tela.getMensagem());
            valores.add(scan.next());

        }

        Conta conta = new Conta(Integer.parseInt(valores.get(0)), valores.get(1), valores.get(2), Double.parseDouble(valores.get(3)));

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                        "sua agência é %s, conta %s  e seu saldo %s já está disponivel para saque.",
                conta.nomeCliente(), conta.agencia(), conta.numero(), conta.saldo());

    }


}
