package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	private static final String[] CHOICES = {"r", "s", "p"}; // r: グー, s: チョキ, p: パー
    private HashMap<String, String> handMap;
    private Scanner scanner;

    // コンストラクタでHashMapを初期化
    public Jyanken_Chapter26() {
        handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");
        scanner = new Scanner(System.in);
    }

    // 自分の手を入力する
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String myChoice = "";
        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");
            myChoice = scanner.nextLine().toLowerCase();
            if (handMap.containsKey(myChoice)) {
                break;
            } else {
                System.out.println("無効な入力です。r, s, p のいずれかを入力してください。");
            }
        }
        return myChoice;
    }

    // 対戦相手の手を乱数で選ぶ
    public String getRandom() {
        int index = (int) Math.floor(Math.random()* 3); // 0から2のランダムな値を生成
        return CHOICES[index];
    }

    // じゃんけんを行う
    public void playGame(String myChoice, String opponentChoice) {
        // 自分と相手の手を表示
        System.out.println("あなたの手: " + handMap.get(myChoice));
        System.out.println("対戦相手の手: " + handMap.get(opponentChoice));

        // 勝敗判定
        if (myChoice.equals(opponentChoice)) {
            System.out.println("結果: あいこです！");
        } else if (
            (myChoice.equals("r") && opponentChoice.equals("s")) || // グー vs チョキ
            (myChoice.equals("s") && opponentChoice.equals("p")) || // チョキ vs パー
            (myChoice.equals("p") && opponentChoice.equals("r"))    // パー vs グー
        ) {
            System.out.println("結果: あなたの勝ちです！");
        } else {
            System.out.println("結果: あなたの負けです！");
        }
    }
 // Scannerを閉じる
    public void close() {
        scanner.close();
    }

}
