import javax.swing.*;

public class Messenge {
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
    public static void messenge(){
        if (buttonClicked == 3) {
            JOptionPane.showMessageDialog(null,
                    "Poprawnych odpowiedzi: " + poprawnaodpowiedz);
        }
    }
}
