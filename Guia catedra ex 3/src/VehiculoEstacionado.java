public class VehiculoEstacionado {
    private String patente;
    private String horaLlegada;
    private String horaSalida;
    private int montoCobrar;

    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getMontoCobrar() {
        return montoCobrar;
    }

    public void setMontoCobrar(int montoCobrar) {
        this.montoCobrar = montoCobrar;
    }
}
