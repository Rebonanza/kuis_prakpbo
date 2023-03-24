import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KaryaTulis extends JFrame {
    // INSTANSIASI OBJEK KOMPONEN GUI

    JLabel lJudul = new JLabel("Penilaian Karya Tulis");
    JLabel lBiodata = new JLabel("Form Biodata");
    JLabel lPenilaian = new JLabel("Form Penilaian (0-100)");
    JPanel PanelBiodata = new JPanel();
    JPanel PanelPenialian = new JPanel();

    JLabel lNama = new JLabel("Nama");
    JLabel lJurusan = new JLabel("Jurusan");
    JLabel lNim = new JLabel("NIM");
    JTextField fNama = new JTextField();
    JTextField fJurusan = new JTextField();
    JTextField fNim = new JTextField();

    JLabel lBahasa = new JLabel("Tata Bahasa");
    JLabel lEYD = new JLabel("EYD");
    JLabel lStruktur = new JLabel("Struktur");
    JLabel lKreativitas = new JLabel("Kreativitas");
    JTextField fBahasa = new JTextField();
    JTextField fEYD = new JTextField();
    JTextField fStruktur = new JTextField();
    JTextField fKreativitas = new JTextField();

    JButton btnSimpan = new JButton("Simpan");
    JButton btnBatal = new JButton("Batal");
    // JLabel lUsername = new JLabel("Username");
    // JLabel lPassword = new JLabel("Password");

    // JTextField fJudul = new JTextField();
    // JTextField fUsername = new JTextField();
    // JPasswordField fPassword = new JPasswordField();

    public KaryaTulis() {
        setTitle("Form Penilaian Karya Tulis");
        setLayout(null);
        setSize(1200, 1000);

        PanelBiodata.add(lNama);
        PanelBiodata.add(lJurusan);
        PanelBiodata.add(lNim);
        PanelBiodata.add(fNama);
        PanelBiodata.add(fJurusan);
        PanelBiodata.add(fNim);

        PanelPenialian.add(lBahasa);
        PanelPenialian.add(lEYD);
        PanelPenialian.add(lKreativitas);
        PanelPenialian.add(lStruktur);
        PanelPenialian.add(fBahasa);
        PanelPenialian.add(fEYD);
        PanelPenialian.add(fKreativitas);
        PanelPenialian.add(fStruktur);

        add(lJudul);
        add(lBiodata);
        add(lPenilaian);
        add(btnSimpan);
        add(btnBatal);
        add(PanelBiodata);
        add(PanelPenialian);

        lJudul.setBounds(100, 30, 200, 50);
        lJudul.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lBiodata.setBounds(50, 80, 200, 50);
        lBiodata.setFont(new Font("Arial", Font.PLAIN, 16));
        PanelBiodata.setBounds(50, 120, 300, 600);
        lPenilaian.setBounds(50, 60, 400, 50);
        lPenilaian.setFont(new Font("Arial", Font.PLAIN, 16));
        PanelBiodata.setBounds(50, 500, 300, 600);
        btnSimpan.setBounds(140, 400, 150, 50);
        btnBatal.setBounds(200, 400, 150, 50);
        this.setSize(400, 500);
        this.setVisible(true);
    }
}