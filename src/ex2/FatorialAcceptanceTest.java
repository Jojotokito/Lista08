package ex2;

import ex1.FatorialView;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FatorialAcceptanceTest {
	
    @Test
    public void testNormalInput() {
    	FatorialView view = new FatorialView();
        JTextField inputField = view.inputField;
        JButton calculateButton = view.calculateButton ;
        JLabel resultLabel = view.resultLabel;
    
        inputField.setText("7");
        calculateButton.doClick();
        
        assertEquals("Resultado: 5040", resultLabel.getText());
    }
    
    @Test
    public void testNegativeInput() {
    	FatorialView view = new FatorialView();
        JTextField inputField = view.inputField;
        JButton calculateButton = view.calculateButton ;
        JLabel resultLabel = view.resultLabel;
    
        inputField.setText("-7");
        calculateButton.doClick();
        
        assertEquals("O número deve ser não negativo.", view.errorMessage);
    }
    
    @Test
    public void testNanInput() {
    	FatorialView view = new FatorialView();
        JTextField inputField = view.inputField;
        JButton calculateButton = view.calculateButton ;
        JLabel resultLabel = view.resultLabel;
    
        inputField.setText("ab");
        calculateButton.doClick();
        
        assertEquals("Por favor, insira um número inteiro válido.", view.errorMessage);
    }
}
