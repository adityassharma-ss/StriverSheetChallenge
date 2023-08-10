import java.util.*;

class Item {
    int value, weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int W = 50;
        int N = 3;
        System.out.println(fractionalKnapsack(value, weight, W));
    }

    public static double fractionalKnapsack(int[] value, int[] weight, int W){
        Item[] items = new Item[value.length];
        for(int i=0; i<value.length; i++){
            items[i] = new Item(value[i], weight[i]);
        }
        Arrays.sort(items, (a,b) -> Double.compare((double)b.value/b.weight, (double)a.value/a.weight));
        double profit = 0;
        for(int i=0; i<items.length; i++){
            if(W >= items[i].weight){
                profit += items[i].value;
                W -= items[i].weight;
            }else{
                profit += (double)W/items[i].weight * items[i].value;
                break;
            }
        }
        return profit;
    }
}
