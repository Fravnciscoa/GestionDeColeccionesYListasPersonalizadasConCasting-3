public class Municipalidad {
    private MiLista parquimetros;

    public boolean agregarParquimetro(Parquimetro parquimetro) {
        parquimetros.irInicio();

        while (!parquimetros.alFinal()){
            Parquimetro p = (Parquimetro)parquimetros.datoActual();
            if (p.equals(parquimetro))
                return false;
            parquimetros.avanzar();
        }
        parquimetros.agrega(parquimetro);
        return true;
    }


//    Método agregarVehiculoEstacionado: recibe una patente del VehículoEstacionado (String), un identificador de Parquímetro
//    (String) y una hora de llegada. Agrega el VehículoEstacionado al Parquímetro indicado, si éste existe. Retorna true si el
//    VehículoEstacionado pudo ser agregado (existía el Parquímetro y patente+hora llegada no existían en el parquimetro), o false
//    en caso contrario. Debe usar el método agregarVehiculoEstacionado de la clase Parquimetro

    public boolean agregarVehiculoEstacionado(String patente, String idParquimetro, String horaLlegada){
        Parquimetro p;
        parquimetros.irInicio();

        while(!parquimetros.alFinal()){
            p = (Parquimetro)parquimetros.datoActual();
            if(p!= null){
                ShantaList vEstacionados = p.getVehiculosEstacionados();
                for (int i = 0; i < vEstacionados.tamañeishon(); i++){
                    VehiculoEstacionado v = (VehiculoEstacionado) vEstacionados.obtenereishon(i);
                    if (!v.getPatente().equals(patente))
                        if(v.getHoraLlegada() == null)
                            p.agregarVehiculoEstacionado(patente, horaLlegada);
                            return true;
                }
            }
        }
        return false;
    }

//    Método obtenerGananciaTotal: Recibe un monto (int) por parámetro y retorna la ganancia total de todos los parquímetros de
//    la Municipalidad considerando solo vehículos estacionados que posean un monto a cobrar mayor al monto por parámetro. Si
//    no existen parquímetros retorna 0. Debe usar el método obtenerGanancia de la clase Parquimetro.

    public int obtenerGananciaTotal(int monto){
        int ganancia = 0;
        parquimetros.irInicio();
        Parquimetro p;
        while(!parquimetros.alFinal()){
            p = (Parquimetro)parquimetros.datoActual();
            if(p != null){
                ShantaList vEstacionados = p.getVehiculosEstacionados();
                for (int i = 0; i < vEstacionados.tamañeishon(); i++){
                    VehiculoEstacionado v = (VehiculoEstacionado) vEstacionados.obtenereishon(i);
                    int montoCobrado = v.getMontoCobrar();
                    if (montoCobrado > monto)
                        ganancia += montoCobrado;
                }
            }
        }
        return ganancia;
    }

}
