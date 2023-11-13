import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    private JLabel question1,question2,question3;
    private JTextField answearTextField1,answearTextField2,answearTextField3;
    private JButton button1,button2,button3;
    private JPanel panel;
    private static int poprawnaodpowiedz = 0;
    private static int buttonClicked = 0;

    public static int getButtonClicked() {
        return buttonClicked;
    }

    public static void incrementButtonClicked() {
        buttonClicked++;
    }

    public static int getPoprawnaodpowiedz(){
        return poprawnaodpowiedz;
    }

    public static void incrementPoprawnaOdpowiedz() {
       poprawnaodpowiedz++;
    }


    public Main() {
        super("Zadanie 5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(3, 3));

        question1 = new JLabel("Stolica Polski to -");
        button1 = new JButton("Ok");
        answearTextField1 = new JTextField(10);

        question2 = new JLabel("Ile metrów jest w 10 kilometrach?:");
        button2 = new JButton("Ok");
        answearTextField2 = new JTextField(10);

        question3 = new JLabel("Twoje nazwisko:");
        button3 = new JButton("Ok");
        answearTextField3 = new JTextField(10);


        panel.add(question1);
        panel.add(answearTextField1);
        panel.add(button1);

        panel.add(question2);
        panel.add(answearTextField2);
        panel.add(button2);

        panel.add(question3);
        panel.add(answearTextField3);
        panel.add(button3);

        add(panel);

        Button1Action button1Action = new Button1Action(answearTextField1);
        Button2Action button2Action = new Button2Action(answearTextField2);
        Button3Action button3Action = new Button3Action(answearTextField3);
        button1.addActionListener(button1Action);
        button2.addActionListener(button2Action);
        button3.addActionListener(button3Action);
        

        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void messenge(){
        if (buttonClicked == 3) {
            JOptionPane.showMessageDialog(null,
                    "Poprawnych odpowiedzi: " + poprawnaodpowiedz);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Main test = new Main();
                    test.setVisible(true);
                } catch (Exception e ) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }
}