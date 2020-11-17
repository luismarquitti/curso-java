public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private Endereço endereço;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return this.cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public String getProfissao() {
        return this.profissao;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
    public Endereço getEndereço() {
        return this.endereço;
    }
}

