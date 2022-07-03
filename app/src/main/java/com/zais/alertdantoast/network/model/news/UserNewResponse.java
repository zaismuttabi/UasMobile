package com.zais.alertdantoast.network.model.news;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class UserNewResponse{

	@SerializedName("UserNewResponse")
	private List<UserNewResponseItem> userNewResponse;

	public void setUserNewResponse(List<UserNewResponseItem> userNewResponse){
		this.userNewResponse = userNewResponse;
	}

	public List<UserNewResponseItem> getUserNewResponse(){
		return userNewResponse;
	}

	@Override
 	public String toString(){
		return 
			"UserNewResponse{" + 
			"userNewResponse = '" + userNewResponse + '\'' + 
			"}";
		}
}