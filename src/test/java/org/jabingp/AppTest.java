package org.jabingp;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import org.jabingp.proxy.BusinessClass;
import org.jabingp.proxy.LoggerProxy;
import org.jabingp.proxy.AbstractLog;

import org.jabingp.chainofresponsibility.JavaSearchContext;
import org.jabingp.chainofresponsibility.SQLSearchContext;
import org.jabingp.chainofresponsibility.SearchContext;
import org.jabingp.chainofresponsibility.UMLSearchContext;

import org.jabingp.command.Command;
import org.jabingp.command.ExitCommand;
import org.jabingp.command.FunctionButton;
import org.jabingp.command.HelpCommand;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testLoggerProxy() {
        AbstractLog businessClass = new BusinessClass();
        AbstractLog loggerProxy = new LoggerProxy(businessClass);

        loggerProxy.method();
        assertTrue(true);
    }

    @Test
    public void testChainOfResponsibility() {
        SearchContext javaCtx, sqlCtx, umlCtx;
        javaCtx = new JavaSearchContext();
        sqlCtx = new SQLSearchContext();
        umlCtx = new UMLSearchContext();

        javaCtx.setSuccessor(sqlCtx);
        sqlCtx.setSuccessor(umlCtx);

        String keyword = "UML类图绘制疑惑";

        javaCtx.search(keyword);

        assertTrue(true);
    }

    @Test
    public void testCommand() {
        Command cmd1, cmd2;

        cmd1 = new ExitCommand();
        cmd2 = new HelpCommand();

        FunctionButton fb1, fb2;

        fb1 = new FunctionButton(cmd1);
        fb2 = new FunctionButton(cmd2);

        fb1.click();
        fb2.click();

        assertTrue(true);
    }
}
