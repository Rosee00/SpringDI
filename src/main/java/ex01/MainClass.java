package ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

   public static void main(String[] args) {
      
      //xml파일 호출
      GenericXmlApplicationContext ctx = 
    		  new GenericXmlApplicationContext("application-context.xml");
      
      
      //SpringTest bean = ctx.getBean(SpringTest.class); //해당 클래스의 정보를 전달받음     
      //bean.test();
      
      SpringTest bean = (SpringTest)ctx.getBean("test");    
      
      SpringTest bean2 = (SpringTest)ctx.getBean("test");
      
      //true -> singleton의 형태(자동)
      //false -> prototype
      System.out.println(bean == bean2);
      

   }

}