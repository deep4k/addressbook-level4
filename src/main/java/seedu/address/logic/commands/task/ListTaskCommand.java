package seedu.address.logic.commands.task;

import static seedu.address.model.Model.PREDICATE_SHOW_ALL_TASKS;

import seedu.address.commons.core.EventsCenter;
import seedu.address.commons.events.model.ListSizeEvent;
import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.CommandResult;

//@@author deep4k
/**
 * Lists all persons in the address book to the user.
 */
public class ListTaskCommand extends Command {

    public static final String COMMAND_WORD = "list";

    public static final String MESSAGE_SUCCESS = "Listed all tasks";


    @Override
    public CommandResult execute() {
        EventsCenter.getInstance().post(new ListSizeEvent(model.getFilteredTaskList().size()));
        model.updateFilteredTaskList(PREDICATE_SHOW_ALL_TASKS);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}

