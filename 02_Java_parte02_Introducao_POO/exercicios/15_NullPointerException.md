Fernanda decidiu aplicar seu conhecimento sobre composição utilizando as classes Pessoa e Endereço criadas por Juarez. Porém, seu código não esta funcionando em tempo de execução (runtime). Vejamos seu código:

public class Pessoa {

    String nome;
    String cpf
    int idade;
    Endereco endereco;

}

public class Endereco {

    String logradouro;
    String complemento;
    String numero;
    String bairro;
    String cidade;
    String cep;

}

public class Programa {

    public static void main(String args[]) {

        Pessoa p = new Pessoa();
        p.nome = "Paulo";
        p.endereco.logradouro  = "Avenida XYZ";

    }

}


Marque a opção que explica corretamente o erro no código de Fernanda.

Resposta:

Ela esta acessando uma propriedade de um objeto que não foi inicializado.


Como a classe Pessoa não instanciou internamente a propriedade endereco ela é null. É por isso que a instrução p.endereco.logradouro resulta na exceção NullPointerException, pois p.endereco é null.