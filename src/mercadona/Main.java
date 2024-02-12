package mercadona;

import mercadona.empleados.Adrian;
import mercadona.empleados.Brian;
import mercadona.empleados.Eddy;
import mercadona.empleados.Empleado;

public class Main {
    public static void main(String[] args) {


        //-------Supermercado------//
        Supermercado mercadona = new Supermercado("Mercadona");

        //---------Empleados-------//

        Eddy eddy = new Eddy("Eddy",111,mercadona);
        Brian brian = new Brian("Brian",222,mercadona);
        Adrian adrian = new Adrian("Adrian",333,mercadona);

        //-------Clientes--------//


        //--------DEBUG---------//
        
        System.out.println(""+mercadona);
        System.out.println("\n");

            eddy.turnoMañana();
            eddy.reponer();
            eddy.acabarMañana();
        System.out.println("\n");

            brian.turnoTarde();
            brian.cobrar();
            brian.acabarTarde();
        System.out.println("\n");

            adrian.turnoTarde();
            adrian.cortarPescado();
            adrian.acabarTarde();


    }

}
