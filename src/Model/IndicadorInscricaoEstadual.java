package Model;

public class IndicadorInscricaoEstadual {

    String id;
    String indicador;

    public IndicadorInscricaoEstadual(String id, String indicador) {
        this.id = id;
        this.indicador = indicador;
    }

    public String getId() {
        return id;
    }

    public String getIndicador() {
        return indicador;
    }

    @Override
    public String toString() {
        return "IndicadorInscricaoEstadual{" +
                "id='" + id + '\'' +
                ", indicador='" + indicador + '\'' +
                '}';
    }
}
