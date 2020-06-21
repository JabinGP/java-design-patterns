package org.jabingp.command;

public class HelpCommand extends Command {

    private DisplayHelpClass hcObj = new DisplayHelpClass();

    public void execute() {
        hcObj.display();
    }

}