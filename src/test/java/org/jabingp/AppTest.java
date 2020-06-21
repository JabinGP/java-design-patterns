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
import org.jabingp.iterator.AbstractIterator;
import org.jabingp.iterator.AbstractProductList;
import org.jabingp.iterator.ProductList;
import org.jabingp.observer.ConcreteInvestor;
import org.jabingp.observer.Investor;
import org.jabingp.observer.Stock;

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

    @Test
    public void testIterator() {
        String[] pNames = { "ThinkPad电脑", "Tissot手表", "iPhone手机", "LV手提包" };

        AbstractIterator iterator;
        AbstractProductList list;

        list = new ProductList(pNames);
        iterator = list.getIterator();

        while (!iterator.isLast()) {
            System.out.println(iterator.getNextItem());
            iterator.next();
        }

        System.out.println("--------------------");

        while (!iterator.isFirst()) {
            System.out.println(iterator.getPreviousItem());
            iterator.previous();
        }

        assertTrue(true);
    }

    @Test
    public void testInvestor() {
        Investor inv1, inv2;

        inv1 = new ConcreteInvestor("杨过");
        inv2 = new ConcreteInvestor("小龙女");

        Stock haier = new Stock("青岛海尔", 20.00);
        haier.attach(inv1);
        haier.attach(inv2);

        haier.setPrice(25.00);
    }
}
