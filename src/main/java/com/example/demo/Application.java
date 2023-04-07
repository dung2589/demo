package com.example.demo;

import com.example.demo.controller.HomeController;
import com.example.demo.test.Girl;
import com.example.demo.test.Outfit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	@Autowired
	public HomeController homeController;

	public HomeController getHomeController() {
		return homeController;
	}

	public static void main(String[] args) {

		System.out.println("run mainnnnnnn");
		ApplicationContext context = SpringApplication.run(Application.class, args);

		System.out.println("run app");

		Outfit outfit = context.getBean(Outfit.class);

		System.out.println(outfit);
		outfit.wear();

		Girl girl = context.getBean(Girl.class);
		System.out.println(girl);
		System.out.println(girl.outfit);
		girl.outfit.wear();


	}

}
