package aplicacionTextos;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class PanelTamanoLetra extends JPanel {
    
    private JSlider sliderTamaño;
    private JLabel texto;

    public PanelTamanoLetra(JLabel texto) {
        
        this.texto = texto;

        setLayout(new FlowLayout(FlowLayout.LEFT));

        sliderTamaño = new JSlider(10, 50, 24);
        sliderTamaño.setMajorTickSpacing(10);
        sliderTamaño.setMinorTickSpacing(5);
        sliderTamaño.setPaintTicks(true);
        sliderTamaño.setPaintLabels(true);

        sliderTamaño.setPreferredSize(new Dimension(560, 50));

        sliderTamaño.addChangeListener(new ManejaSlider());

        add(sliderTamaño);
        
    }

    private class ManejaSlider implements ChangeListener {
        
        @Override
        public void stateChanged(ChangeEvent e) {
            texto.setFont(new Font(texto.getFont().getFamily(), texto.getFont().getStyle(), sliderTamaño.getValue()));
        }
        
    }
    
}