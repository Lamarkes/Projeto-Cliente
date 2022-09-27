package Model;

public class Contato {

    int id;
    String numeroDeContato;
    String email;

    public Contato(String numeroDeContato,
                   String email) {
        this.numeroDeContato = numeroDeContato;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroDeContato() {
        return numeroDeContato;
    }

    public void setNumeroDeContato(String numeroDeContato) {
        this.numeroDeContato = numeroDeContato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", numeroDeContato='" + numeroDeContato + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
