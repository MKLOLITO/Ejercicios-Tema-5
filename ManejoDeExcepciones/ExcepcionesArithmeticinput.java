public class ExcepcionesArithmeticinput {

    // Liz Neria
    
    private int res=0;
    public void ejecutar(){
        do{
            try{
                int numerador = Integer.parseInt(JOptionPane.showInputDialog("introduce un numerador entero"));
                int denominador = Integer.parseInt(JOptionPane.showInputDialog("introduce un numerador entero"));
                int resultado = Integer.parseInt(JOptionPane.showInputDialog("introduce un numerador entero"));

            }
            catch (NumberFormatException errordetipo){
                System.err.printf("Exception: %s\n", "no es un numero entero");
                JOptionPane.showMessageDialog(null, "no es un dato numerico entero");
            } catch (ArithmeticException erroraritmetico){
                System.err.printf("Excepcion: %s\n", errorAritmetico);
                JOptionPane.showMessageDialog(null, "no es posible dividie entre cero");
            } finally {
                res= JOptionPane.showConfirmDialog(null, "desea intentar otra vez?");
            }
        } while (res==0);
    }
    public int division(int numerador, int denominador){
        return numerador/denominador;
    }
}
