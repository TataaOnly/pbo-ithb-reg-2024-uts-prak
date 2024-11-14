import Control.Controller;
import View.Main;

public class App {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();

        Main main = new Main(controller);
    }
}
