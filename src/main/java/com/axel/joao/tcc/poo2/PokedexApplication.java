package com.axel.joao.tcc.poo2;

import com.axel.joao.tcc.poo2.gui.StartScreen;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.swing.*;

@SpringBootApplication
@EnableFeignClients
public class PokedexApplication {

	public static void main(String[] args) {
		JFrame startScreen = new StartScreen();
		startScreen.setVisible(true);

		SpringApplication.run(PokedexApplication.class, args);
	}

}
