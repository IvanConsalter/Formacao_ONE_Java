Usando o aprendizado sobre referências e atribuição de valores vamos definir uma classe abaixo.

public class Conta {

    double saldo;

}

A partir desta classe, diga o que imprime o código:

public class Teste {

    public static void main(String [] args) {

        Conta minhaConta = new Conta();
        minhaConta.saldo = 500.0;
        Conta outraConta = minhaConta;
        outraConta.saldo += 1000.0;
        System.out.println(minhaConta.saldo);

    }

}

Resposta:

Imprime 1500.0


Imprime 1500, pois as duas referências (minhaConta e outraConta) apontam para o mesmo objeto, fazendo com que a quantidade 1000 seja somada à anterior 500.