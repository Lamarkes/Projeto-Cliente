package Model;

public class Sexo {
    String id;
    String orientacaoSexual;

    public Sexo(String id,
                String orientacaoSexual) {
        this.id = id;
        this.orientacaoSexual = orientacaoSexual;
    }

    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrientacaoSexual() {
        return orientacaoSexual;
    }

    public void setOrientacaoSexual(String orientacaoSexual) {
        this.orientacaoSexual = orientacaoSexual;
    }

    @Override
    public String toString() {
        return "Sexo{" +
                "id=" + id +
                ", orientacaoSexual='" + orientacaoSexual + '\'' +
                '}';
    }
}
