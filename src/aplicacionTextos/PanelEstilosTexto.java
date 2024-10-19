package aplicacionTextos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanelEstilosTexto extends JPanel {
    
    private JLabel texto;
    private JCheckBox checkNegrita, checkCursiva;

    public PanelEstilosTexto(JLabel texto) {
        
        this.texto = texto;

        setLayout(new FlowLayout(FlowLayout.LEFT));

        checkNegrita = new JCheckBox("Negrita");
        checkCursiva = new JCheckBox("Cursiva");

        checkNegrita.addActionListener(new ManejaEstilos());
        checkCursiva.addActionListener(new ManejaEstilos());

        add(checkNegrita);
        add(checkCursiva);
        
    }

    private class ManejaEstilos implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            int estilo = Font.PLAIN;
            if (checkNegrita.isSelected()) estilo += Font.BOLD;
            if (checkCursiva.isSelected()) estilo += Font.ITALIC;

            texto.setFont(new Font(texto.getFont().getFamily(), estilo, texto.getFont().getSize()));
        }
        
    }
    
}