package homework4;

/**
 * Created by home on 20.08.2016.
 */
public class Main {

    public static void main(String[] args) {

        Firm firm = new Firm("defalt", "defalt", 0.00);
        Console console = new Console(firm);
        console.consolMenu();

    }
}
