import Conta.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public enum TELA_CADASTRO {

    MSG_NUMERO("Por favor, digite o número da conta "),
    MSG_AGENCIA("Por favor, digite o número da agência. Ex: 077-8 "),
    MSG_CLIENTE("Por favor, digite o nome do cliente "),
    MSG_SALDO("Por favor, digite o saldo do cliente ");

    private String mensagem;

    TELA_CADASTRO(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }



}
