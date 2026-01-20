package ya;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1};
        //int[] data = {};

        System.out.println(ArrayStat.findMin(data)); // 1
        System.out.println(ArrayStat.findMax(data)); // 9
        System.out.println(ArrayStat.calculateAvg(data)); // 4.25
        }
    }
