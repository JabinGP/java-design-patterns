package org.jabingp.mediator;

public class ConcreteMediator extends Mediator {
    public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComboBox cb;

    @Override
    public void componentChanged(Component c) {
        // 单击按钮
        if (c == addButton) {
            System.out.println("--单击添加按钮--");
            list.update();
            cb.update();
            userNameTextBox.clear();
        }
        // 从列表框选择客户
        else if (c == list) {
            System.out.println("--从列表框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
        // 从组合框选择客户
        else if (c == cb) {
            System.out.println("--从组合框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
    }
}