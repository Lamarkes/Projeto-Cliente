package Model;

public class Cliente {

    String id;
    Contato contato;
    Endereco endereco;
    String cadastradoEm;
    boolean clienteAtivo;


    public Cliente(Contato contato, Endereco endereco, String cadastradoEm, boolean clienteAtivo) {
        this.contato = contato;
        this.endereco = endereco;
        this.cadastradoEm = cadastradoEm;
        this.clienteAtivo = clienteAtivo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCadastradoEm() {
        return cadastradoEm;
    }

    public void setCadastradoEm(String cadastradoEm) {
        this.cadastradoEm = cadastradoEm;
    }

    public boolean isClienteAtivo() {
        return clienteAtivo;
    }

    public void setClienteAtivo(boolean clienteAtivo) {
        this.clienteAtivo = clienteAtivo;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", contato=" + contato +
                ", endereco=" + endereco +
                ", cadastradoEm='" + cadastradoEm + '\'' +
                ", clienteAtivo=" + clienteAtivo +
                '}';
    }
}
