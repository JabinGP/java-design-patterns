package org.jabingp.proxy;

public class LoggerProxy implements AbstractLog {

    private AbstractLog abstractLog;

    public LoggerProxy(AbstractLog abstractLog) {
        this.abstractLog = abstractLog;
    }

    public void method() {
        this.beforeMethod();
        this.abstractLog.method();
        this.afterMethod();
    }

    public void beforeMethod() {
        System.out.println("Proxying AbstractLog: before...");
    }

    public void afterMethod() {
        System.out.println("Proxying AbstractLog: after...");
    }
}