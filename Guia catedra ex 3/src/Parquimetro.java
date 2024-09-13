public class Parquimetro {
    private String sigla;
    private String cuadra;
    private String sector;
    private int montoTotal;
    private ShantaList vehiculosEstacionados;

    public boolean agregarVehiculoEstacionado(String patente, String horaLlegada){
        for (int i = 0; i < vehiculosEstacionados.tamañeishon(); i++){
            VehiculoEstacionado v = (VehiculoEstacionado) vehiculosEstacionados.obtenereishon(i);
            String vPatente = v.getPatente();
            String vHoraLlegada = v.getHoraLlegada();
            if(vPatente.equals(patente)){
                if (vHoraLlegada.equals(horaLlegada)){
                    vehiculosEstacionados.agregareishon(v);
                    return true;
                }
            }
        }
        return false;
    }

    public int obtenerGanancia(int monto){
        int ganancia = 0;
        if (vehiculosEstacionados.tamañeishon() == 0)
            return 0;
        for (int i = 0; i < vehiculosEstacionados.tamañeishon();i++){
            VehiculoEstacionado v = (VehiculoEstacionado) vehiculosEstacionados.obtenereishon(i);
            int montoCobrado = v.getMontoCobrar();
            if (montoCobrado > monto){
                ganancia += montoCobrado;
            }
        }
        return ganancia;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCuadra() {
        return cuadra;
    }

    public void setCuadra(String cuadra) {
        this.cuadra = cuadra;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public ShantaList getVehiculosEstacionados() {
        return vehiculosEstacionados;
    }

    public void setVehiculosEstacionados(ShantaList vehiculosEstacionados) {
        this.vehiculosEstacionados = vehiculosEstacionados;
    }
}
