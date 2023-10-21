package classes;

public class HorarioDia {
    private boolean horarios[] = new boolean[7];

    public boolean[] getHorarios() {
        return horarios;
    }

    public void setHorarios(boolean[] horarios) {
        this.horarios = horarios;
    }

    public HorarioDia(boolean[] horarios) {
        this.horarios = horarios;
    }
}
