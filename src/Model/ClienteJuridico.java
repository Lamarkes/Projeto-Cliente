package Model;

public class ClienteJuridico extends Cliente{

    String id;
    String cnpj;
    String razaoSocial;
    String nomeFantasia;
    IndicadorInscricaoEstadual indicadorInscricaoEstadual;
    String inscricaoEstadual;
    String inscricaoMuninipal;

    public ClienteJuridico(Contato contato,
                           Endereco endereco,
                           String cadastradoEm,
                           boolean clienteAtivo,
                           String id,
                           String cnpj,
                           String razaoSocial,
                           String nomeFantasia,
                           IndicadorInscricaoEstadual indicadorInscricaoEstadual,
                           String inscricaoEstadual,
                           String inscricaoMuninipal) {
        super(contato, endereco, cadastradoEm, clienteAtivo);
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.indicadorInscricaoEstadual = indicadorInscricaoEstadual;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMuninipal = inscricaoMuninipal;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public IndicadorInscricaoEstadual getIndicadorInscricaoEstadual() {
        return indicadorInscricaoEstadual;
    }

    public void setIndicadorInscricaoEstadual(IndicadorInscricaoEstadual indicadorInscricaoEstadual) {
        this.indicadorInscricaoEstadual = indicadorInscricaoEstadual;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoMuninipal() {
        return inscricaoMuninipal;
    }

    public void setInscricaoMuninipal(String inscricaoMuninipal) {
        this.inscricaoMuninipal = inscricaoMuninipal;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" +
                "id='" + id + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", indicadorInscricaoEstadual=" + indicadorInscricaoEstadual +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                ", inscricaoMuninipal='" + inscricaoMuninipal + '\'' +
                ", id='" + id + '\'' +
                ", contato=" + contato +
                ", endereco=" + endereco +
                ", cadastradoEm='" + cadastradoEm + '\'' +
                ", clienteAtivo=" + clienteAtivo +
                '}';
    }
}



