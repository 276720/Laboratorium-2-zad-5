import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1Action implements ActionListener {
    private JTextField answearTextField1;
    public Button1Action(JTextField answearTextField1){
        this.answearTextField1 = answearTextField1;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.incrementButtonClicked();
        int buttonClicked = Main.getButtonClicked();
        JButton btn1 = (JButton) e.getSource();
        if(answearTextField1.getText().equalsIgnoreCase("Warszawa")){
            btn1.setEnabled(false);
            Main.incrementPoprawnaOdpowiedz();
            int poprawnaodpowiedz = Main.getPoprawnaodpowiedz();
            JOptionPane.showMessageDialog(null,
                    "Odpowiedż poprawna ");
        }
        else {
            btn1.setEnabled(false);
            JOptionPane.showMessageDialog(null,
                    "Niepoprawna odpowiedż ");
        }
        Main.messenge();
    }
}
