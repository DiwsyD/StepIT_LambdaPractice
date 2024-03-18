package org.stepIt.lambda.practice;

import jdk.jshell.spi.ExecutionControl;
import org.stepIt.lambda.practice.robot.impl.Robot;

public class Main {

    public static void main(String[] args) throws ExecutionControl.NotImplementedException {

        //Create and configure Robot here:
        Robot<Object, Object> robot = null;

        //Robot testing:
        System.out.println("-------------------------");

        robot.introduce();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        Object thingRobotGaveMe = robot.giveAThing();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        robot.eat(new Object());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        boolean robotApproveResult = robot.approveAThing(new Object());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        Object robotActionResult = robot.doAction(new Object());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        Object robotDecorationResult = robot.decorateAThing(new Object());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        Object robotCombiningResult = robot.combineThings(new Object(), new Object());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        Object customOperationResult = robot.performCustomOperation();

        System.out.println("-------------------------");
    }

}
