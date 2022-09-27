package Model;

public class CLienteFisico extends Cliente{


    String id;
    String nomeCompleto;
    String cpf;
    String rg;
    String orgaoEmissor;
    Sexo sexo;
    String nascimento;

    public CLienteFisico(Contato contato,
                         Endereco endereco,
                         String cadastradoEm,
                         boolean clienteAtivo,
                         String nomeCompleto,
                         String cpf,
                         String rg,
                         String orgaoEmissor,
                         Sexo sexo,
                         String nascimento) {
        super(contato, endereco, cadastradoEm, clienteAtivo);
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.rg = rg;
        this.orgaoEmissor = orgaoEmissor;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "CLienteFisico{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", orgaoEmissor='" + orgaoEmissor + '\'' +
                ", sexo=" + sexo +
                ", nascimento='" + nascimento + '\'' +
                ", id='" + id + '\'' +
                ", contato=" + contato +
                ", endereco=" + endereco +
                ", cadastradoEm='" + cadastradoEm + '\'' +
                ", clienteAtivo=" + clienteAtivo +
                '}';
    }
}
