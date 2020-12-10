package edu.wpi.cs3733.b20.kotlin.demo;

import java.util.ArrayList;
import java.util.UUID;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import edu.wpi.cs3733.b20.kotlin.demo.db.ChoicesDAO;
import edu.wpi.cs3733.b20.kotlin.demo.http.CreateChoiceRequest;
import edu.wpi.cs3733.b20.kotlin.demo.http.CreateChoiceResponse;
import edu.wpi.cs3733.b20.kotlin.demo.http.SelectFinalAlternativeRequest;
import edu.wpi.cs3733.b20.kotlin.demo.http.SelectFinalAlternativeResponse;
import edu.wpi.cs3733.b20.kotlin.demo.model.Alternative;
import edu.wpi.cs3733.b20.kotlin.demo.model.Choice;

public class SelectFinalAlternativeHandler implements RequestHandler<SelectFinalAlternativeRequest,SelectFinalAlternativeResponse>{
	LambdaLogger logger;
	ChoicesDAO choiceDAO = new ChoicesDAO();
	Boolean SelectFinalAlternative(String uuid, Alternative alternative,int altID) {
		try {
			return choiceDAO.addFinalAlternative(uuid, alternative, altID);
		}catch(Exception e) {
			return false;
		}
		
		
	}

	@Override
	public SelectFinalAlternativeResponse handleRequest(SelectFinalAlternativeRequest input, Context context) {
		
		return null;
	}
	
	
	
}
