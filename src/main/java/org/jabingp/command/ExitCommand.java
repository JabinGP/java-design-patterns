package org.jabingp.command;

public class ExitCommand extends Command {

    private SystemExitClass seObj = new SystemExitClass();

    @Override
    public void execute() {
        seObj.exit();
    }

}