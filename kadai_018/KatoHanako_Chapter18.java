package kadai_018;

public class KatoHanako_Chapter18  extends Kato_Chapter18{
	
	public KatoHanako_Chapter18(){
		super("加藤","東京都中野区〇×");
	}
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
	
	
	public void eachIntroduce(){
		System.out.println("趣味は読書です");
	}
}