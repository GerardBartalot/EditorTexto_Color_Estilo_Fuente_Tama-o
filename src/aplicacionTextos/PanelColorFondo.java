package aplicacionTextos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanelColorFondo extends JPanel {
    
	private JComboBox<String> comboColores;
    private LaminaEditorTexto laminaPrincipal;

    public PanelColorFondo(LaminaEditorTexto lamina) {
        
    	this.laminaPrincipal = lamina;

        setLayout(new FlowLayout(FlowLayout.LEFT));

        comboColores = new JComboBox<>();
        comboColores.addItem("Blanco");
        comboColores.addItem("Rojo");
        comboColores.addItem("Verde");
        comboColores.addItem("Azul");

        comboColores.setPreferredSize(new Dimension(560, 25));

        comboColores.addActionListener(new ManejaColores());

        add(comboColores);
        
    }

    private class ManejaColores implements ActionListener {
        
    	@Override
        public void actionPerformed(ActionEvent e) {
            String colorSeleccionado = (String) comboColores.getSelectedItem();
            switch (colorSeleccionado) {
                case "Rojo":
                    laminaPrincipal.cambiarColorFondo(Color.RED);
                    break;
                case "Verde":
                    laminaPrincipal.cambiarColorFondo(Color.GREEN);
                    break;
                case "Azul":
                    laminaPrincipal.cambiarColorFondo(Color.BLUE);
                    break;
                default:
                    laminaPrincipal.cambiarColorFondo(Color.WHITE);
                    break;
            }
        }
    	
    }
    
}