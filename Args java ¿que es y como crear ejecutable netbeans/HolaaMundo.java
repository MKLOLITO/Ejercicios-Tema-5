import java.awt.HeadlessException;

public class HolaaMundo {

    // Liz Neria
    
    public static void main(String[] args) throws HeadlessException, InterruptedException {
        Ventana v = new Ventana("saludos");
        v.setVisible(true);
    }

    public static String getPID() {
        return java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
    }
}
