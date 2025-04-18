package org.design_patterns.behavioral.interpreter.classes.expressions;

public class DivisionExpression implements MathExpression {
    private final MathExpression dividend;
    private final MathExpression divisor;

    public DivisionExpression(final MathExpression dividend, final MathExpression divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    @Override
    public Double calculate() {
        return this.dividend.calculate() / this.divisor.calculate();
    }
}
