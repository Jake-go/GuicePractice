package com.drawingapp.requests;

import com.drawingapp.services.DrawShape;
import com.google.inject.Inject;

public class SquareRequest {
	
	@Inject
	DrawShape d;
	
	public void makeRequest() {
		d.draw();
	}
	
	public DrawShape getDrawShape() {
		return d;
	}

}
