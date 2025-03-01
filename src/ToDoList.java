import java.util.LinkedList;

public class ToDoList {

    LinkedList<Task> taskList;
    LinkedList<Task> completedList;
    ToDoListInput input;


    ToDoList() {
        this.taskList = new LinkedList<>();
        this.completedList = new LinkedList<>();
        this.input = new ToDoListInput();
    }

    public void addTask() {

        System.out.println("Введите название задачи. ");

        String newTask = input.getCommand();

        for (Task tasks: taskList) {

            if (newTask.equals(tasks.getTaskName())) {
                System.out.println("Задача с таким названием уже существует!");
                return;
            }
        }

        Task task = new Task(newTask, taskList.size() + 1);

        taskList.add(task);

        System.out.println("Задача " + task.getTaskName() + " успешно добавлена!");
    }

    public void markCompleted() {

        System.out.println("Текущие задачи: \n" + taskList + "\nВведите номер задачи, которую вы выполнили. ");

        Integer taskNumber = input.getIndex();

        if (taskNumber < 0 || taskNumber > taskList.size()) {

            System.out.println("Задачи с таким номером нет в списке!");
            return;
        }

        taskNumber--;

        completedList.add(taskList.get(taskNumber));
        taskList.remove(taskList.get(taskNumber));

        for (int i = taskNumber; i < taskList.size(); i++) { // Переприсвоение номеров по порядку в листе задач
            taskList.get(i).setTaskNumber(i + 1);
        }

        for (int i = 0; i < completedList.size(); i++) { // Переприсвоение номеров по порядку в листе выполненных задач
            completedList.get(i).setTaskNumber(i + 1);
        }

        System.out.println("Задача успешно выполнена!");

    }

    public void removeTask() {

        System.out.println("Текущие задачи: \n" + taskList + "\nВведите номер задачи, которую вы хотите удалить. ");

        Integer taskNumber = input.getIndex();

        if (taskNumber < 0 || taskNumber > taskList.size()) {

            System.out.println("Задачи с таким номером нет в списке!");
            return;
        }

        taskNumber--;

        taskList.remove(taskList.get(taskNumber));

        for (int i = taskNumber; i < taskList.size(); i++) {
            taskList.get(i).setTaskNumber(i + 1);
        }

        System.out.println("Задача успешно удалена!");
    }

    public void printTasks() {
        System.out.println(taskList);
    }

    public void printCompletedTasks() {
        System.out.println(completedList);
    }

    public ToDoListInput getInput() {
        return input;
    }
}