package duke.commands;

import duke.storage.Storage;
import duke.ui.DukeException;
import duke.ui.Ui;
import duke.tasklist.TaskList;

import java.io.IOException;

public abstract class Command {

    public abstract void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException, IOException;

    public abstract boolean isExit();

}