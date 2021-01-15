public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private Endereco endereco;
    
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

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
}

