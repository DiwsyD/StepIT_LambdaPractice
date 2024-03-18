package org.stepIt.lambda.practice.robot;

import jdk.jshell.spi.ExecutionControl;

public interface RobotTemplate<T, R> {

    void introduce();

    R giveAThing();

    void eat(T thing);

    boolean approveAThing(T thing);

    R doAction(T thing);

    T decorateAThing(T thing);

    T combineThings(T thingOne, T thingTwo);

    R performCustomOperation() throws ExecutionControl.NotImplementedException;
}
