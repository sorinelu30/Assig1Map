import java.util.Arrays;

public class Aufgabe4 {
    //Cea mai ieftina tastatura
    public static int findCheapestKeyboard(int[] keyboards) {
        return Arrays.stream(keyboards).min().orElse(0);
    }
    //Cel mai scump item
    public static int findMostExpensiveItem(int[] keyboards, int[] usbs) {
        return Math.max(Arrays.stream(keyboards).max().orElse(0), Arrays.stream(usbs).max().orElse(0));
    }
    //Cel mai scump usb intr un buget
    public static int findMostExpensiveUSBWithinBudget(int[] usbs, int budget) {
        return Arrays.stream(usbs).filter(price -> price <= budget).max().orElse(-1);
    }
    //Cum se pot cheltui cei mai multi bani
    public static int findMaxSpent(int[] keyboards, int[] usbs, int budget) {
        int maxSpent = -1;

        for (int keyboard : keyboards) {
            for (int usb : usbs) {
                int totalCost = keyboard + usb;
                if (totalCost <= budget && totalCost > maxSpent) {
                    maxSpent = totalCost;
                }
            }
        }

        return maxSpent;
    }

    public static void main(String[] args) {
        int[] keyboards = {40, 50, 60};
        int[] usbs = {8, 12};
        int budget = 60;

        System.out.println("The cheapest keyboard is " + findCheapestKeyboard(keyboards));
        System.out.println("The most expensive item is " + findMostExpensiveItem(keyboards, usbs));
        System.out.println("The most expensive USB within the budget is " + findMostExpensiveUSBWithinBudget(usbs, 30));
        System.out.println("The most that can be spent is " + findMaxSpent(keyboards, usbs, budget));
    }
}
