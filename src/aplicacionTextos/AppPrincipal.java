package aplicacionTextos;

import javax.swing.*;

public class AppPrincipal {
    
	public static void main(String[] args) {
        
		JFrame frame = new JFrame("Editor de Texto Completo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 200, 600, 400);

        LaminaEditorTexto editorTexto = new LaminaEditorTexto();

        frame.add(editorTexto);
        frame.setVisible(true);
        
    }
	
}