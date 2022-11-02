package com.spring.game;

import org.springframework.context.annotation.Primary;

import org.springframework.stereotype.Component;
@Component("templerunGame")
public class TemplerunGame implements GamingConsole{
	
	public void up() {
		System.out.println("Start");
		
	}
	
	public void down() {
		System.out.println("go into a hole");
		
	}
	
	public void left() {
		System.out.println("stop");
		
	}
	
	public void right() {
		System.out.println("accelerate");
		
	}
	
	

}
