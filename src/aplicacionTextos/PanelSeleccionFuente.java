package aplicacionTextos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanelSeleccionFuente extends JPanel {
    
    private JLabel texto;
    private JComboBox<String> comboFuentes;

    public PanelSeleccionFuente(JLabel texto) {
        
        this.texto = texto;

        setLayout(new FlowLayout(FlowLayout.LEFT));

        String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        comboFuentes = new JComboBox<>(fuentes);

        comboFuentes.setPreferredSize(new Dimension(560, 25));

        comboFuentes.addActionListener(new ManejaFuentes());

        add(comboFuentes);
        
    }

    private class ManejaFuentes implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setFont(new Font((String) comboFuentes.getSelectedItem(), texto.getFont().getStyle(), texto.getFont().getSize()));
        }
        
    }
    
}