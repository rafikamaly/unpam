
import javax.swing.JOptionPane;

public class Tugas2 {

    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Masukkan username:");
        String password = JOptionPane.showInputDialog("Masukkan username:");

        if (username.equals("admin") && password.equals("123")) {
            JOptionPane.showMessageDialog(null, "Selamat datang " + username);
        } else {
            JOptionPane.showMessageDialog(null, "Username/password salah!");
        }
    }
}
