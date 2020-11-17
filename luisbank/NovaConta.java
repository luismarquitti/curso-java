public class NovaConta {
    public static void main(String[] args) {
        
        //Criando a minha conta:
        Conta contaLuis = new Conta();
        
        //Cadastrando todos os dados da conta:
        contaLuis.saldo = 1000;
        contaLuis.agencia = 001;
        contaLuis.numero = 12345;
        
        //Cadastrando dados do titular:
        contaLuis.titular.nome = "Luís Eduardo Angelini Marquitti";
        contaLuis.titular.cpf = "123.456.789-10";
        contaLuis.titular.profissao = "Desenvolvedor";
        
        //Cadastrando dados do endereço:
        contaLuis.titular.endereço.logradouro = "Rua Itu";
        contaLuis.titular.endereço.numero = "86";
        contaLuis.titular.endereço.complemento = "Bloco Perúgia";
        contaLuis.titular.endereço.bairro = "Cambuí";
        contaLuis.titular.endereço.cep = "13720-000";
        contaLuis.titular.endereço.cidade = "Campinas";

        //Exibindo tudo no terminal:

        System.out.println("Seus dados são:");
        System.out.println("Nome: " + contaLuis.titular.nome);
        System.out.println("CPF: " + contaLuis.titular.cpf);
        System.out.println("Profissão: " + contaLuis.titular.profissao);
        System.out.println("Endereço: " + contaLuis.titular.endereço.logradouro + " " + contaLuis.titular.endereço.numero + " " + contaLuis.titular.endereço.complemento + " " + 
                            contaLuis.titular.endereço.cep + " " + contaLuis.titular.endereço.bairro + " " + contaLuis.titular.endereço.cidade);
        System.out.println("Dados da Conta: ");
        System.out.println("Agência: " + contaLuis.agencia);
        System.out.println("Conta: " + contaLuis.numero);
        System.out.println("Saldo: " + contaLuis.saldo);
    }



}