
import javax.swing.JOptionPane;


public class Tugas1 {
  public static void main(String[] args) {
      String namaDepan = JOptionPane.showInputDialog("Nama depan anda");
      String namaBelakang = JOptionPane.showInputDialog("Nama belakang anda");
      String usia = JOptionPane.showInputDialog("Usia anda");

      String msg = "Identitasmu adalah \n" + namaDepan + " " + namaBelakang + ", usia " + usia + " tahun.";

      JOptionPane.showMessageDialog(null, msg);
  }
}