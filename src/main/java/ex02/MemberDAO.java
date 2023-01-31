package ex02;

public class MemberDAO {

	private DatabaseDev databaseDev;
	
	//get,
	public DatabaseDev getDatabaseDev() {
		return databaseDev;
	}
	
	//set
	public void setDatabaseDev(DatabaseDev databaseDev) {//객체를 setter주입을 통해서 넣음
		this.databaseDev = databaseDev;
	}
	
	
	
	
}
