package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18{
	
	public KatoTaro_Chapter18(){
		super("加藤","東京都中野区〇×");
	}
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
	
	public void eachIntroduce(){
		System.out.println("Javaが得意です");
	}
}
