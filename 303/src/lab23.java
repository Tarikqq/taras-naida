//3
public class lab23 {
    public static void main(String[] args) {
        String arrow = "До низу";
        int floor = 2;
        if (floor == 2 && arrow == "До верху") {
            floor = 3;
        } else if (floor == 2 && arrow == "До низу") {
            floor = 1;
        }
        if (arrow == "До низу") {
            System.out.println("Ви спустились на " + floor + " поверх");
        } else {
            System.out.println("Ви піднялись на " + floor + " поверх");
        }
    }
}