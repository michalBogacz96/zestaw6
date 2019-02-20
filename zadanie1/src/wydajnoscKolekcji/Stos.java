package wydajnoscKolekcji;

import java.util.Stack;

public class Stos {

    int iIterations;
    long start, end, result;
    boolean flag;

    Stack<Integer> stack;

    public Stos(int iIterations) {
        this.iIterations = iIterations;
        stack = new Stack<>();
    }

    public long addingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = 0; i < iIterations; i++){
            stack.add(i);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }


    public long containingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = 0; i < iIterations; i++){
            flag = stack.contains(1);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }

    public long removingTimeResult(){
        start = System.currentTimeMillis();
        for(int i = iIterations - 1; i >= 0; i--){
            stack.remove(i);
        }
        end = System.currentTimeMillis();
        result = end - start;
        return result;
    }

}
