package StrategyPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
