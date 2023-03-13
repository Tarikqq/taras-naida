//4
public class lab24 {
        public static void main(String[] args) {
            String quest=("так");

            switch (quest) {
                case "так":
                case "ок":
                case "yes":
                case "y":
                case "+":
                    System.out.println("Я погоджуюсь!");
                    break;
                case "ні":
                case "no":
                case "n":
                case "-":
                    System.out.println("Я відмовляюсь!");
                    break;
                default:
                    System.out.println("Неправильний ввід. Будь ласка, введіть Так або Ні.");
                    break;
            }
        }
    }


}
