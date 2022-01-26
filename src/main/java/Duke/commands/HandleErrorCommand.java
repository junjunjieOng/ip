package duke.commands;

import duke.storage.Storage;
import duke.ui.DukeException;
import duke.ui.Ui;
import duke.tasklist.TaskList;


public class HandleErrorCommand extends Command{

    private String errorMsg;

    public HandleErrorCommand(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        ui.showError(errorMsg);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}