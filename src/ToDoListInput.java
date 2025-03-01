import java.util.Scanner;

public class ToDoListInput {

    Scanner scanner;
    String command;
    Integer index;

    public ToDoListInput() {
        this.scanner = new Scanner(System.in);
    }

    public String getCommand() {
        if (scanner.hasNext()){
            command = scanner.nextLine();
            return command;
        } else return null;
    }

    public Integer getIndex() {

        do {
            if (scanner.hasNextInt()) {
                index = scanner.nextInt();
                break;
            } else {
                System.out.println("Вы ввели не число! Если хотите отменить действие, напишите (-1)");
            }
        } while (index != -1);

        if (index != -1) {

            return index;
        } else return null;
    }


}
