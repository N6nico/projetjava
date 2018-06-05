package controller;

import java.awt.Point;
import java.io.IOException;

import model.IModel;
import view.IView;

public class CastingSpell {
	private IModel model;
	private IView view;
	private Event event;
	private Point lastDirection;
	
	public CastingSpell(IView view,IModel model, Event event) {
        this.view = view;
		this.model = model;	
		this.event = event;
	}
	
	
	
	public void createSpell(Point lastDirection) throws IOException {
		if(model.hasMana() == true) {
			this.lastDirection = new Point();
			this.lastDirection = lastDirection;
			model.creatSpell(lastDirection);
			model.setMana(false);
		}
		
	}
	
	public void moveSpell() throws Exception {
		if(model.getElement(model.getSpell(), this.lastDirection).getSprite().getConsoleImage() == "V") {
			model.move(model.getSpell(), this.lastDirection);
		}
		else if(model.getElement(model.getSpell(), this.lastDirection).getSprite().getConsoleImage() == "D") {
			model.disappear(model.getDemonDMobile());
			model.disappear(model.getSpell());
			model.setMana(true);
		}
		else if(model.getElement(model.getSpell(), this.lastDirection).getSprite().getConsoleImage() == "X") {
			model.disappear(model.getDemonXMobile());
			model.disappear(model.getSpell());
			model.setMana(true);
		}
		else if(model.getElement(model.getSpell(), this.lastDirection).getSprite().getConsoleImage() == "L") {
			model.disappear(model.getSpell());
			model.setMana(true);
		}
		else {
			this.lastDirection.setLocation(0 - this.lastDirection.getX(), 0 - this.lastDirection.getY());
		}
		
	}
	
	
}
