package screen;
public class Screen {
    public static void clearScreen(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
