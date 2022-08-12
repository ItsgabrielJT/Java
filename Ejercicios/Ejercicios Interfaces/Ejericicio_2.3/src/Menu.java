import com.emojis.*;

import javax.swing.*;

public class Menu
{
    private static int option = 0;
    private static JFrame windows = new JFrame("Emojis");
    public static void initMenu() {
        option = loadWindowMain();
        realizeTaks();
    }

    private static int loadWindowMain() {
        int optionWindow = JOptionPane.showOptionDialog(null,
                showMessageMain(),
                "Emojis", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.CLOSED_OPTION,
                null,
                new Object[]{"😊", "☹", "😐", "😗", "😛", "😒", "😑", "😉", "😠", "😶", "🙄", "😥"},
                null);
        return optionWindow;
    }

    private static String showMessageMain() {
        return "Escoje el emoji que quieras !!!";
    }

    private static void realizeTaks() {
        switch (option) {
            case 0:
                windows.add(EmojiIcon.getObjectOne());
                break;
            case 1:
                windows.add(EmojiIcon.getObjectTwo());
                break;
            case 2:
                windows.add(EmojiIcon.getObjectThree());
                break;
            case 3:
                windows.add(EmojiIcon.getObjectFour());
                break;
            case 4:
                windows.add(EmojiIcon.getObjectFive());
                break;
            case 5:
                windows.add(EmojiIcon.getObjectSix());
                break;
            case 6:
                windows.add(EmojiIcon.getObjectSeven());
                break;
            case 7:
                windows.add(EmojiIcon.getObjectEight());
                break;
            case 8:
                windows.add(EmojiIcon.getObjectNine());
                break;
            case 9:
                windows.add(EmojiIcon.getObjectTen());
                break;
            case 10:
                windows.add(EmojiIcon.getObjectEleven());
                break;
            case 11:
                windows.add(EmojiIcon.getObjectTwelve());
                break;
        }
        windows.setSize(370, 400);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setVisible(true);
        windows.setLocationRelativeTo(null);
    }
}
