package edu.wpi.cs3733.b20.kotlin.demo.http;

import java.util.ArrayList;

import edu.wpi.cs3733.b20.kotlin.demo.model.Alternative;

public class GetChoiceResponse {
	public final String uniqueID;
	public final ArrayList<Alternative> alternatives;
	public final int maxUsers;
	public final String description;
	public final Alternative finalAlternative;
	public final boolean isClosed;
	
	public final int httpStatus;
	public final String error;
	
	public GetChoiceResponse(String uniqueID, ArrayList<Alternative> alternatives, int user, String description, Alternative finalAlternative2, boolean isClosed) {
		this.uniqueID = uniqueID;
		this.alternatives = alternatives;
		this.maxUsers = user;
		this.description = description;
		this.finalAlternative = finalAlternative2;
		this.error = "";
		this.httpStatus = 200;
		this.isClosed = isClosed;
	}
	public GetChoiceResponse(int statusCode, String errorMsg,boolean isClosed) {
		
		this.uniqueID = "";
		this.maxUsers = 0;
		this.description = "";
		this.alternatives = null;
		this.finalAlternative = null;
		this.error = errorMsg;
		this.httpStatus = statusCode;
		this.isClosed = isClosed;
	}
	public String toString() {
		return "Response(" + httpStatus + "," + error + "," + uniqueID + ")";
	}
}
