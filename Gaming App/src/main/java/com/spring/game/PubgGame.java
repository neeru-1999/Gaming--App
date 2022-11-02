package com.spring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pubgGame")
@Primary
public class PubgGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.println("start");
	}
	
	@Override
	public void down() {
		System.out.println("move the sides");
	}
	
	@Override
	public void left() {
		System.out.println("stop");
	}
	
	@Override
	public void right() {
		System.out.println("play game faster and shoot them ");
	}

}
