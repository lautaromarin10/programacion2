package trabajopractico7;
import Pagos.Efectivo;
import Pagos.TarjetaCredito;
import Pagos.Transferencia;
import java.util.ArrayList;
import Pagos.MetodoPago;

public class Pagos {


    public static void main(String args[]) {
        
        Efectivo efectivo = new Efectivo(15000.0);
        TarjetaCredito tarjeta = new TarjetaCredito(1200.0);
        Transferencia transferencia = new Transferencia(12000.0);
        ArrayList<MetodoPago> metodosPagos = new ArrayList<>();
        
        metodosPagos.add(efectivo);
        metodosPagos.add(tarjeta);
        metodosPagos.add(transferencia);
        
        for(MetodoPago metodo: metodosPagos){
            metodo.procesarPago();
        }
        
        
    }
}
