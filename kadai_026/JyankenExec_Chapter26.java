package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		Jyanken_Chapter26 game = new Jyanken_Chapter26();
		try {
            System.out.println("じゃんけんゲームを開始します！");
            String myChoice = game.getMyChoice(); // 自分の手を取得
            String opponentChoice = game.getRandom(); // 対戦相手の手を取得
            game.playGame(myChoice, opponentChoice); // ゲームを実行
        } finally {
            game.close(); // Scannerを閉じる
        }
	}

}
