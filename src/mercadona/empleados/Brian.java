package mercadona.empleados;

import mercadona.Supermercado;

public class Brian extends Empleado {

    public Brian(String nombre, int codigo, Supermercado supermercado) {
        super(nombre, codigo, supermercado);
    }

    @Override
    public void turnoTarde() {super.turnoTarde();}

    @Override
    public void turnoMañana() {super.turnoMañana();}

    @Override
    public void acabarMañana() {super.acabarMañana();}

    @Override
    public void acabarTarde() {super.acabarTarde();}

    @Override
    public void cobrar(){
        super.cobrar();
    }

}
