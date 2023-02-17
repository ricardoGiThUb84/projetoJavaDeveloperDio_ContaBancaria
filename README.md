# projetoJavaDeveloperDio_ContaBancaria

## Projeto simulação abertura de uma conta bancária.
### Será exibida mensagens ao usuário e o sistema aguardará as respectivas entradas.

 - Modelagem da funcionalidade de mensagens de instrução ao usuário.

    a. Utilizou-se um ENUM com as mensagens e um metodo para exibir as mensagens através da iteração das constantes do ENUM.

- Foi criada uma classe Sistema service cujo papel é gerenciar as funcionalidades da aplicação

//        a. o metodo cadastrar cliente será responsável por realizar o cadastro da conta.
//        b. o método cadastro faz uma iteração pelo enum e nas respectivas mensagens o sistema aguarda a entrada do usuário
// que será armazenada em uma lista.
//        c. Ao término da iteração o sistema retorna um string com uma mensagem gerada dinâmicamente com os dados da instância
//        do objeto conta criado.

        //Pontos de destaque.
        // Toda a lógica da tela fica centralizada no  Sistema service contidas o que permite fácil manutenção e escalabilidade.
```
public void cadastrarConta() {


        List<String> valores = new ArrayList<>();

        for (TELA_CADASTRO tela : TELA_CADASTRO.values()) {

            System.out.println(tela.getMensagem());
            valores.add(scan.next());

        }

        Conta conta = new Conta(Integer.parseInt(valores.get(0)), 
        valores.get(1), valores.get(2), 
        Double.parseDouble(valores.get(3)));
        
        }

```