package Model;

public class Endereco {

    int id;
    String cep;
    String uf;
    String cidade;
    String bairro;
    String longadouro;
    String complemento;

    public Endereco(String cep,
                    String uf,
                    String cidade,
                    String bairro,
                    String longadouro,
                    String complemento) {
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.longadouro = longadouro;
        this.complemento = complemento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLongadouro() {
        return longadouro;
    }

    public void setLongadouro(String longadouro) {
        this.longadouro = longadouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", cep='" + cep + '\'' +
                ", uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", longadouro='" + longadouro + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
