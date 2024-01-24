package com.drawingapp.requests;

import com.drawingapp.services.DrawShape;
import com.google.inject.Inject;

public class SquareRequestSubclass extends SquareRequest {
	
//	@Inject
//	public SquareRequestSubclass(DrawShape d) {
//		super(d);
//	}
	
	@Override
	public void makeRequest() {
		System.out.println("Delegating call to draw method");
		d.draw();
	}
}
