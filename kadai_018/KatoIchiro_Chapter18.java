package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18{
	
	public KatoIchiro_Chapter18(){
		super("加藤","東京都中野区〇×");
	}
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
	
	public void eachIntroduce(){
		System.out.println("好きな食べ物はリンゴです");
}

}