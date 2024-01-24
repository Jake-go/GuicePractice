package com.drawingapp.main;


import com.google.inject.Guice;
import com.google.inject.Injector;

import java.time.*;

import com.drawingapp.module.AppModule;
import com.drawingapp.requests.*;

public class GuiceDemo {

	private static final String SQUARE_REQ = "SQUARE";
	
	private static void sendRequest(String squareReq) {
		
		if (squareReq.equals(SQUARE_REQ)) {
			Injector injector = Guice.createInjector(new AppModule());
			SquareRequest request1 = injector.getInstance(SquareRequest.class);
			request1.makeRequest();
			
			SquareRequest request2 = injector.getInstance(SquareRequest.class);
			request2.makeRequest();
			
			boolean areDrawShapesEqual = request1.getDrawShape() == request2.getDrawShape();
			boolean areSquareRequestsEqual = request1 == request2;
			System.out.println("Were Draw Shapes equal? Survey says: " + areDrawShapesEqual);
			System.out.println("Were Square Requests equal? Survey says: " + areSquareRequestsEqual);
		}
		
	}
	
	public static void main(String[] args) {
		
		LocalDateTime beginning = LocalDateTime.now();
		
		sendRequest(SQUARE_REQ);
		
		LocalDateTime end = LocalDateTime.now();
		
		System.out.println("The Program took: " + Duration.between(beginning, end).toMillis() + " milliseconds");
	}

}
