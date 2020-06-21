package org.jabingp.mediator;

public abstract class Component {
    protected Mediator mediator;

    public void change() {
        this.mediator.componentChanged(this);
    };

    public abstract void update();

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

}