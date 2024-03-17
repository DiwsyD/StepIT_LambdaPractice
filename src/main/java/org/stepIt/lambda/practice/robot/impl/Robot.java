package org.stepIt.lambda.practice.robot.impl;


import org.stepIt.lambda.practice.robot.RobotTemplate;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Robot<T, R> implements RobotTemplate<T, R> {

    private final Runnable runnable;
    private final Supplier<R> supplier;
    private final Consumer<T> consumer;
    private final Predicate<T> predicate;
    private final Function<T, R> function;
    private final UnaryOperator<T> unaryOperator;
    private final BinaryOperator<T> binaryOperator;

    public Robot(Runnable runnable,
                 Supplier<R> supplier,
                 Consumer<T> consumer,
                 Predicate<T> predicate,
                 Function<T, R> function,
                 UnaryOperator<T> unaryOperator,
                 BinaryOperator<T> binaryOperator) {
        this.runnable = runnable;
        this.supplier = supplier;
        this.consumer = consumer;
        this.predicate = predicate;
        this.function = function;
        this.unaryOperator = unaryOperator;
        this.binaryOperator = binaryOperator;
    }

    private Robot(Builder<T, R> builder) {
        this.runnable = builder.runnable;
        this.supplier = builder.supplier;
        this.consumer = builder.consumer;
        this.predicate = builder.predicate;
        this.function = builder.function;
        this.unaryOperator = builder.unaryOperator;
        this.binaryOperator = builder.binaryOperator;
    }

    @Override
    public void introduce() {
        runnable.run();
    }

    @Override
    public R giveAThing() {
        return supplier.get();
    }

    @Override
    public void eat(T thing) {
        consumer.accept(thing);
    }

    @Override
    public boolean approveAThing(T thing) {
        return predicate.test(thing);
    }

    @Override
    public R doAction(T thing) {
        return function.apply(thing);
    }

    @Override
    public T decorateAThing(T thing) {
        return unaryOperator.apply(thing);
    }

    @Override
    public T combineThings(T thingOne, T thingTwo) {
        return binaryOperator.apply(thingOne, thingTwo);
    }

    public static class Builder<T, R> {

        private Runnable runnable;
        private Supplier<R> supplier;
        private Consumer<T> consumer;
        private Predicate<T> predicate;
        private Function<T, R> function;
        private UnaryOperator<T> unaryOperator;
        private BinaryOperator<T> binaryOperator;

        public Builder() {
            // Set default values if needed
        }

        // Setter methods for fields

        public Builder<T, R> addIntroduction(Runnable runnable) {
            this.runnable = runnable;
            return this;
        }

        public Builder<T, R> addGivingAThing(Supplier<R> supplier) {
            this.supplier = supplier;
            return this;
        }

        public Builder<T, R> addEating(Consumer<T> consumer) {
            this.consumer = consumer;
            return this;
        }

        public Builder<T, R> addApproving(Predicate<T> predicate) {
            this.predicate = predicate;
            return this;
        }

        public Builder<T, R> addAction(Function<T, R> function) {
            this.function = function;
            return this;
        }

        public Builder<T, R> addDecorate(UnaryOperator<T> unaryOperator) {
            this.unaryOperator = unaryOperator;
            return this;
        }

        public Builder<T, R> addCombining(BinaryOperator<T> binaryOperator) {
            this.binaryOperator = binaryOperator;
            return this;
        }

        public Robot<T, R> build() {
            return new Robot<T, R>(this);
        }
    }

}
