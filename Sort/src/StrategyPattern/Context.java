package StrategyPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }
     public int executeStrategy(int num1,int num2){
            return strategy.doOperation(num1,num2);
     }
}
