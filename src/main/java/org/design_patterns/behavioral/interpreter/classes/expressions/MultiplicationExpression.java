package org.design_patterns.behavioral.interpreter.classes.expressions;

public class MultiplicationExpression implements MathExpression {
    private final MathExpression factor1;
    private final MathExpression factor2;

    public MultiplicationExpression(final MathExpression factor1, final MathExpression factor2) {
        this.factor1 = factor1;
        this.factor2 = factor2;
    }

    @Override
    public Double calculate() {
        return this.factor1.calculate() * this.factor2.calculate();
    }
}
