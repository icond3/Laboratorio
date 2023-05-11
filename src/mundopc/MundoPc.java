package mundopc;

import com.gm.mundopc.*;

public class MundoPc {

    public static void main(String[] args) {
        Teclado teclado1 = new Teclado("Blu2", "HP");
        Raton raton1 = new Raton("USB", "HP");
        Monitor monitor1 = new Monitor("HP", 27.0);
        Computadora computadora1 = new Computadora("HP", monitor1, teclado1, raton1);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
        //----
    }
}
