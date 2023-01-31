package ex02;

public class DatabaseDev {

	//database관련 정보(문자열)를 setter주입으로 넣음
	private String url; //메서드
	private String uid;
	private String upw;
	
	//get, set
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	
	
	
}
