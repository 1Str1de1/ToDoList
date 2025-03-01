public class Task implements Comparable<Task> {

    private String taskName;
    private Integer taskNumber;

    public Task(String taskName, int taskNumber) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String toString() {
        return getTaskNumber() + ": " + getTaskName();
    }

    @Override
    public int compareTo(Task anotherTask) {
        return this.getTaskNumber() - anotherTask.getTaskNumber();
    }
}
