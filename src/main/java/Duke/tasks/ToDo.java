package duke.tasks;

/**
 * Represents the Todo things of task.
 */
public class ToDo extends Task {

    /**
     * Constructor for ToDo.
     *
     * @param description description of the task.
     */
    public ToDo(String description) {
        super(description);
    }

    /**
     * Returns the strings representation of ToDO in the save file.
     *
     * @return the formats of the String to be save in the file
     */
    @Override
    public String encodeTaskToString() {
        return "T|" + (isDone ? "1|" : "0|") + super.getDescription() + "\n";
    }

    /**
     * Returns the strings representation of ToDo.
     *
     * @return [T] with the status and description of the task.
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
