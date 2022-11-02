package com.spring.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired
	@Qualifier("pubgGame")
	private GamingConsole gamingConsole;
	
	
	
	//public GameRunner(GamingConsole gamingConsole) {
		// TODO Auto-generated constructor stub
		//this.gamingConsole = gamingConsole;
	//}
	
	
	public void runGame() {
		gamingConsole.up();
        gamingConsole.down();
		gamingConsole.left();
		gamingConsole.right();
	}

}
