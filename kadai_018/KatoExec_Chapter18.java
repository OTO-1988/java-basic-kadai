package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// 子のインスタンス
		KatoTaro_Chapter18   taro   = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		// 名前を設定
		taro.setGivenName("太郎");
		ichiro.setGivenName("一郎");
		hanako.setGivenName("花子");
		
		// 紹介を実行
		taro.execIntroduce();
		System.out.println(); // 空白行
		ichiro.execIntroduce();
		System.out.println(); // 空白行
		hanako.execIntroduce();

	}

}
