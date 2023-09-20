import java.util.*;

interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();
    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();
    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

public class NestedListSum {
    public static void main(String[] args) { 
        

    }

    public static int depthSum(List<NestedInteger> nestedList){
        return ds(1, nestedList);
    }

    private static int ds(int depth, List<NestedInteger> nestedList){
        int sum = 0;
        for(NestedInteger ni : nestedList){
            if(ni.isInteger()){
                sum += ni.getInteger() * depth;
            }else{
                sum += ds(depth+1, ni.getList());
            }
        }
        return sum;
    }
}
