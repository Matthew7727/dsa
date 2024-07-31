package Stack.LEETCODE.C;

import java.util.ArrayList;

public class StackB<T> {
    
    private ArrayList<T> stackList = new ArrayList<>();  
    
    public ArrayList<T> getStackList() {
        return stackList;
    }
    
    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }
    
    public boolean isEmpty() {
        return stackList.size() == 0;
    }
    
    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }
    
    public int size() {
        return stackList.size();
    }
    
   public void push(T value) {
    stackList.add(value);
   }

   public T pop() {
    if (stackList.size() == 0) return null;
    int length = stackList.size() - 1;
    T value = stackList.get(length);
    stackList.remove(length);

    return value;
 }
    
}
