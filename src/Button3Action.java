import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button3Action implements ActionListener {
    private JTextField answearTextField3;
    public Button3Action(JTextField answearTextField3){
        this.answearTextField3 = answearTextField3;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Messenge.incrementButtonClicked();
        int buttonClicked = Messenge.getButtonClicked();
        JButton btn3 = (JButton) e.getSource();
        if(answearTextField3.getText().equalsIgnoreCase("Martynenka")){
            btn3.setEnabled(false);
            Messenge.incrementPoprawnaOdpowiedz();
            int poprawnaodpowiedz = Messenge.getPoprawnaodpowiedz();
            JOptionPane.showMessageDialog(null,
                    "Odpowiedż poprawna ");
        }
        else {
            btn3.setEnabled(false);
            JOptionPane.showMessageDialog(null,
                    "Niepoprawna odpowiedż ");
        }
        Messenge.messenge();
    }
}
