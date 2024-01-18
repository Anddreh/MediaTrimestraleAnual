package appnota;

import javax.swing.JOptionPane;

public class AppNota {
    public static void main(String[] args) {
        double va1, va2, va3, mt1, mt2, mt3, ma;

        va1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota VA1 - 1° Trimestre:", "Média Trimestral", JOptionPane.PLAIN_MESSAGE));
        va2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota VA2 - 1° Trimestre:", "Média Trimestral", JOptionPane.PLAIN_MESSAGE));
        va3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota VA3 - 1° Trimestre:", "Média Trimestral", JOptionPane.PLAIN_MESSAGE));

        mt1 = Math.round((va1 + va2 + va3) / 3);
        JOptionPane.showMessageDialog(null, "Média 1° Trimestre: " + mt1);

        va1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota VA1 - 2° Trimestre:", "Média Trimestral", JOptionPane.PLAIN_MESSAGE));
        va2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota VA2 - 2° Trimestre:", "Média Trimestral", JOptionPane.PLAIN_MESSAGE));
        va3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota VA3 - 2° Trimestre:", "Média Trimestral", JOptionPane.PLAIN_MESSAGE));

        mt2 = Math.round((va1 + va2 + va3) / 3);
        JOptionPane.showMessageDialog(null, "Média 2° Trimestre: " + mt2);

        va1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota VA1 - 3° Trimestre:", "Média Trimestral", JOptionPane.PLAIN_MESSAGE));
        va2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota VA2 - 3° Trimestre:", "Média Trimestral", JOptionPane.PLAIN_MESSAGE));
        va3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota VA3 - 3° Trimestre:", "Média Trimestral", JOptionPane.PLAIN_MESSAGE));

        mt3 = Math.round((va1 + va2 + va3) / 3);
        JOptionPane.showMessageDialog(null, "Média 3° Trimestre: " + mt3);

        ma = (mt1 + mt2 + mt3) / 3;
        if (ma >= 7) {
            JOptionPane.showMessageDialog(null, "<html>Média Anual: " + String.format("%.1f", ma) + "<br>Situação: Aprovado", "Média Anual", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "<html>Média Anual: " + String.format("%.1f", ma) + "<br>Situação: Reprovado", "Médial Anual", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
