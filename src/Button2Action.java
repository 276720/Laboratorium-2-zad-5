import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button2Action implements ActionListener {
    private JTextField answearTextField2;
    public Button2Action(JTextField answearTextField2){
        this.answearTextField2 = answearTextField2;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.incrementButtonClicked();
        int buttonClicked = Main.getButtonClicked();
        JButton btn2 = (JButton) e.getSource();
        if(answearTextField2.getText().equalsIgnoreCase("10000")){
            btn2.setEnabled(false);
            Main.incrementPoprawnaOdpowiedz();
            int poprawnaodpowiedz = Main.getPoprawnaodpowiedz();
            JOptionPane.showMessageDialog(null,
                    "Odpowiedż poprawna ");
        }
        else {
            btn2.setEnabled(false);
            JOptionPane.showMessageDialog(null,
                    "Niepoprawna odpowiedż ");
        }

        Main.messenge();
    }
}
