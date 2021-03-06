package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJMSBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

//		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
//		System.out.println(i18nController.sayGreeting());

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("---------------MyController");
		System.out.println(myController.sayHello());
//
//		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
//		System.out.println("--------------Property");
//		System.out.println(propertyInjectedController.getGreeting());
//
//		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
//		System.out.println("--------------Setter");
//		System.out.println(setterInjectedController.getGreeting());
//
//		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
//		System.out.println("--------------Constructor");
//		System.out.println(constructorInjectedController.getGreeting());

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println("fakeDataSource: " + fakeDataSource.getUserName());
		System.out.println("fakeDataSource: " + fakeDataSource.getPassword());
		System.out.println("fakeDataSource: " + fakeDataSource.getDbUrl());

		FakeJMSBroker fakeJMSBroker = (FakeJMSBroker) ctx.getBean(FakeJMSBroker.class);

		System.out.println("fakeJMSBroker: " + fakeJMSBroker.getJms_userName());
		System.out.println("fakeJMSBroker: " + fakeJMSBroker.getJms_password());
		System.out.println("fakeJMSBroker: " + fakeJMSBroker.getJms_dbUrl());
	}
}
