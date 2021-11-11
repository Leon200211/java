package task_14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class GameStack {

    private static final int NUMBER_OF_CARDS = 10;

    public static void run() throws FileNotFoundException {
        Scanner reader = new Scanner(new FileInputStream("C:\\work\\work_java\\vyz_laba\\src\\task_14\\input.txt"));
        Stack<Integer> firstPlayerCards = new Stack<>();
        Stack<Integer> secondPlayerCards = new Stack<>();
        String[] playerOneDeck = reader.nextLine().split(" ");
        String[] playerTwoDeck = reader.nextLine().split(" ");



        reader.close();
        for (int i = 0; i < NUMBER_OF_CARDS / 2; ++i) {
            firstPlayerCards.push(Integer.parseInt(playerOneDeck[NUMBER_OF_CARDS / 2 - i - 1]));
        }
        for (int i = 0; i < NUMBER_OF_CARDS / 2; ++i) {
            secondPlayerCards.push(Integer.parseInt(playerTwoDeck[NUMBER_OF_CARDS / 2 - i - 1]));
        }


        System.out.println(firstPlayerCards);
        System.out.println(secondPlayerCards);

        int turnCount = 0;
        while (!firstPlayerCards.empty() && !secondPlayerCards.empty()) {
            if (turnCount >= 106) {
                System.out.println("botva");
                break;
            }
            int firstPlayerCard = firstPlayerCards.pop();
            int secondPlayerCard = secondPlayerCards.pop();
            if (firstPlayerCard == NUMBER_OF_CARDS - 1 && secondPlayerCard == 0){
                secondPlayerCards.add(0, firstPlayerCard);
                secondPlayerCards.add(0, secondPlayerCard);
            }
            else
            if (firstPlayerCard == 0 && secondPlayerCard == NUMBER_OF_CARDS - 1){
                firstPlayerCards.add(0, firstPlayerCard);
                firstPlayerCards.add(0, secondPlayerCard);
            }
            else
            if (firstPlayerCard < secondPlayerCard) {
                secondPlayerCards.add(0, firstPlayerCard);
                secondPlayerCards.add(0, secondPlayerCard);
            }
            else {
                firstPlayerCards.add(0, firstPlayerCard);
                firstPlayerCards.add(0, secondPlayerCard);
            }
            ++turnCount;
        }
        if (firstPlayerCards.empty()) {
            System.out.println("second " + turnCount);
        } else if (secondPlayerCards.empty()) {
            System.out.println("first " + turnCount);
        }
    }
}