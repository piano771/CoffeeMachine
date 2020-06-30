import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Кофе-машина");
        Scanner in = new Scanner(System.in);

        System.out.println("Для выбора напитка, пожалуйста, внесите деньги");
        int moneyAmount = in.nextInt();
        //TODO: метод in.nextInt() возвращает введеёное целочисленное значение

        int[] drinkPrices = {150, 80, 20, 35};
        String[] drinkNames = {"капучино", "эспрессо", "воду", "молоко"};

        boolean canBuyAnything = false;

        //TODO: в данном случае, для условия цикла задаётся значение длины массива (0, 1, 2, ..., i)
        for(int i = 0; i < drinkNames.length; i++) {
            if(moneyAmount >= drinkPrices[i]) {
                System.out.println("Вы можете купить " + drinkNames[i] + " - " + drinkPrices[i]);
                canBuyAnything = true;
            }
        }

        /*
         *TODO: В данном случае используется инвентирование,
         * если бы восклицательного знака не было, то условие
         * звучало как: canBuyAnything должен быть равен правде
         */
        if(!canBuyAnything) {
            System.out.println("Недостаточно денег для покупки напитка");
        }
    }
}
