import java.util.Scanner;

class GuessNumber {
    int randomNum;
    int userNum;
    int count = 0;
    Scanner sc = new Scanner(System.in);

    void generateRandomNum() {
        randomNum = (int)(Math.random() * 100) + 1; // 1–100
        getNumber();
    }

    void getNumber() {
        while (true) {
            System.out.println("Guess The Random Number (Between 1-100): ");
            userNum = sc.nextInt();
            count++;

            if (userNum < 1 || userNum > 100) {
                System.out.println("❌ Invalid input! Please enter a number between 1–100.");
                continue;
            }

            if (userNum < randomNum) {
                System.out.println("📉 Too low! Try again.");
            } else if (userNum > randomNum) {
                System.out.println("📈 Too high! Try again.");
            } else {
                System.out.println("✅ Congratulations, YOU WON!");
                System.out.println("-------Your Score-------");
                System.out.println("Total Attempts: " + count);
                break;
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        GuessNumber gs = new GuessNumber();
        gs.generateRandomNum();
    }
}
