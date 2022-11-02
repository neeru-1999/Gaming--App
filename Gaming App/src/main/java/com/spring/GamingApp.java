package com.spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.game.GameRunner;
import com.spring.game.GamingConsole;
import com.spring.game.PubgGame;
import com.spring.game.TemplerunGame;
import com.spring.game.CandyCrushGame;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class GamingApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GamingApp.class, args);
		
		//MarioGame game = new MarioGame();
		
		//SuperContraGame game = new SuperContraGame();
		
		//GamingConsole game = new MarioGame();
		
		
		//GameRunner runner = new GameRunner(game);
		
		GameRunner runner = context.getBean(GameRunner.class);
		
		runner.runGame();
		
		
	}

}
