/**
 * Clase tarjeta donde se puede depositar, retirar y consultar saldo de una tarjeta
 * @version 21 agosto 2017
 */
public class Tarjeta
{
    private double saldo;
    
    public Tarjeta()
    { 
        saldo = 0;
    }
    
    /**
     * Deposita el dinero a la tarjeta.
     * @param dinero Cantidad a abonar a la tarjeta.
     */
    public void depositar(double dinero)
    {
        saldo = saldo + dinero;
    }
    
    /**
     * Retira una determinada cantidad de la tarjeta.
     * @param dinero Cantidad deseada a retirar.
     * @return Regresa 0 en caso de que ya no haya dinero en la tarjeta.
     */
    public double retirar(double dinero)
    {
        if (saldo >= dinero)
        {
            saldo = saldo - dinero;
            return dinero;
        }
        else
            return 0; 
    }
    
    /**
     * Consulta el saldo de la tarjeta y regresa el monto existente.
     */
    public void consultar()
    {
        System.out.println("Saldo actual: " +saldo);
    }
}