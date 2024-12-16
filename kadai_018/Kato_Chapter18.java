package kadai_018;

abstract public class Kato_Chapter18 {

//	フィールド（内部データ）
	public String familyName = "加藤"; //姓
	public String givenName  = ""; //名
	public String address    = "東京都中野区〇×"; //住所
	
//	コンストラクタ
	public Kato_Chapter18(String familyName, String address) {
		this.familyName = familyName;
        this.address = address;
	}
	
//	共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です" );
		System.out.println("住所は" + this.address + "です");
	}
	
//	個別の紹介を出力するメソッド（抽象）
	abstract void eachIntroduce();
	
//	紹介を実行するメソッド
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
