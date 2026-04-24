package com.vibol.corepattern.command07;

public class OnCommand implements Command {
	
	private Television television;
	
	public OnCommand(Television television) {
		this.television = television;
	}

	@Override
	public void execute() {
		television.on();
	}

}
