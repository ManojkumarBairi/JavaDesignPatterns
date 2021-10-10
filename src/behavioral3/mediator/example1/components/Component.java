package behavioral3.mediator.example1.components;

import behavioral3.mediator.example1.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}