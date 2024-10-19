package aplicacionTextos;

import java.awt.*;
import javax.swing.*;

public class LaminaEditorTexto extends JPanel {
    
	private JLabel texto;

    public LaminaEditorTexto() {
        
    	setLayout(new BorderLayout());

        // Texto inicial
        texto = new JLabel("Texto de ejemplo para probar la aplicación");
        texto.setFont(new Font("Serif", Font.PLAIN, 24));
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        add(texto, BorderLayout.CENTER);

        // Panel para opciones
        JPanel panelOpciones = new JPanel();
        panelOpciones.setLayout(new BoxLayout(panelOpciones, BoxLayout.Y_AXIS));

        // Panel para estilos de texto
        JPanel panelEstilos = new PanelEstilosTexto(texto);
        panelEstilos.setBorder(BorderFactory.createTitledBorder("Estilos de Texto"));
        panelOpciones.add(panelEstilos);

        // Panel para seleccionar color de fondo
        JPanel panelColor = new PanelColorFondo(this);
        panelColor.setBorder(BorderFactory.createTitledBorder("Color de Fondo"));
        panelOpciones.add(panelColor);

        // Panel para seleccionar la fuente
        JPanel panelFuente = new PanelSeleccionFuente(texto);
        panelFuente.setBorder(BorderFactory.createTitledBorder("Fuente"));
        panelOpciones.add(panelFuente);

        // Panel para el slider de tamaño de letra
        JPanel panelTamaño = new PanelTamanoLetra(texto);
        panelTamaño.setBorder(BorderFactory.createTitledBorder("Tamaño de Letra"));
        panelOpciones.add(panelTamaño);

        // Alinear todos los paneles
        add(panelOpciones, BorderLayout.SOUTH);
        
    }

    public void cambiarColorFondo(Color color) {
        setBackground(color);
    }
    
}