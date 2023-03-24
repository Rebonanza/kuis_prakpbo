import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.*;
import java.awt.color.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class CiptaPuisi extends JFrame {
    // INSTANSIASI OBJEK KOMPONEN GUI

    JLabel lJudul = new JLabel("Penilaian Cipta Puisi");
    JLabel lBiodata = new JLabel("Form Biodata");
    JLabel lPenilaian = new JLabel("Form Penilaian (0-100)");
    JPanel PanelBiodata = new JPanel();
    JPanel PanelPenilaian = new JPanel();
    Border border = new LineBorder(Color.GRAY, 1, true);

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

    public CiptaPuisi() {
        setTitle("Form Penilaian Cipta Puisi");
        setLayout(null);
        setSize(1200, 1000);

        PanelBiodata.setBorder(border);
        PanelPenilaian.setBorder(border);
        PanelBiodata.add(lNama);
        PanelBiodata.add(lJurusan);
        PanelBiodata.add(lNim);
        PanelBiodata.add(fNama);
        PanelBiodata.add(fJurusan);
        PanelBiodata.add(fNim);

        PanelPenilaian.add(lBahasa);
        PanelPenilaian.add(lEYD);
        PanelPenilaian.add(lKreativitas);
        PanelPenilaian.add(lStruktur);
        PanelPenilaian.add(fBahasa);
        PanelPenilaian.add(fEYD);
        PanelPenilaian.add(fKreativitas);
        PanelPenilaian.add(fStruktur);

        add(btnSimpan);
        add(btnBatal);
        add(lJudul);
        add(lBiodata);
        add(PanelBiodata);
        add(lPenilaian);
        add(PanelPenilaian);

        lJudul.setBounds(250, 10, 200, 50);
        lJudul.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lBiodata.setBounds(50, 60, 200, 50);
        lBiodata.setFont(new Font("Arial", Font.PLAIN, 16));
        PanelBiodata.setBounds(50, 110, 530, 160);
        PanelBiodata.setLayout(null);

        lNama.setBounds(15, 8, 50, 50);
        lNama.setFont(new Font("Arial", Font.BOLD, 14));
        fNama.setBounds(100, 18, 380, 25);

        lJurusan.setBounds(15, 50, 100, 50);
        lJurusan.setFont(new Font("Arial", Font.BOLD, 14));
        fJurusan.setBounds(100, 63, 380, 25);

        lNim.setBounds(15, 95, 100, 50);
        lNim.setFont(new Font("Arial", Font.BOLD, 14));
        fNim.setBounds(100, 108, 380, 25);

        lPenilaian.setBounds(50, 300, 200, 50);
        lPenilaian.setFont(new Font("Arial", Font.PLAIN, 16));

        PanelPenilaian.setBounds(50, 350, 530, 200);
        PanelPenilaian.setLayout(null);

        lBahasa.setBounds(15, 8, 150, 50);
        lBahasa.setFont(new Font("Arial", Font.BOLD, 14));
        fBahasa.setBounds(120, 18, 380, 25);

        lEYD.setBounds(15, 50, 100, 50);
        lEYD.setFont(new Font("Arial", Font.BOLD, 14));
        fEYD.setBounds(120, 63, 380, 25);

        lStruktur.setBounds(15, 95, 100, 50);
        lStruktur.setFont(new Font("Arial", Font.BOLD, 14));
        fStruktur.setBounds(120, 108, 380, 25);

        lKreativitas.setBounds(15, 140, 100, 50);
        lKreativitas.setFont(new Font("Arial", Font.BOLD, 14));
        fKreativitas.setBounds(120, 155, 380, 25);

        btnSimpan.setBounds(230, 600, 100, 30);
        btnBatal.setBounds(350, 600, 100, 30);
        this.setSize(650, 700);
        this.setVisible(true);
    }
}