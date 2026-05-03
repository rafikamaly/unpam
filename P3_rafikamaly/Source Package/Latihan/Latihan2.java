
import javax.swing.JOptionPane;

public class Latihan2 {

    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Ketik nama anda: ");
        String msg = "Hello " + nama + ", salam kenal ya!";

        JOptionPane.showMessageDialog(null, msg);
    }
}
