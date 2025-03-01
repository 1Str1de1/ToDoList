public class ToDoListMain {
    public static void main(String[] args) {

        String command;
        ToDoList toDoList = new ToDoList();

        System.out.println("Добро пожаловать в To-Do-List!");

        do {
            System.out.println("""
                    Выберите команду:
                    1: Просмотреть список задач.
                    2: Добавить новую задачу.
                    3: Пометить задачу как выполненную.
                    4: Удалить задачу.
                    5: Просмотреть список выполненных задач.
                    0: Выйти из программы.""");

            command = toDoList.getInput().getCommand();
            switch (command) {

                case "1":
                    toDoList.printTasks();
                    break;
                case "2":
                    toDoList.addTask();
                    break;
                case "3":
                    toDoList.markCompleted();
                    break;
                case "4":
                    toDoList.removeTask();
                    break;
                case "5":
                    toDoList.printCompletedTasks();
                    break;
                default:
                    System.out.println("Команда не распознана. Попробуйте ещё раз.");
            }
        } while(!command.equals("0"));

    }
}

