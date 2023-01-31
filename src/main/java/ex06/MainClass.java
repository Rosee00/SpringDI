package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		

		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("autowired-context.xml");
		
		Controller con = ctx.getBean("controller", Controller.class);
		//컨트롤러 hello메서드 호출
		con.hello();
		
	}

}
