package com.zais.alertdantoast.network.model;

import java.util.List;

public class UserResponse{

	private List<UserResponseItem> userResponse;

	public void setUserResponse(List<UserResponseItem> userResponse){
		this.userResponse = userResponse;
	}

	public List<UserResponseItem> getUserResponse(){
		return userResponse;
	}

	@Override
 	public String toString(){
		return 
			"UserResponse{" + 
			"userResponse = '" + userResponse + '\'' + 
			"}";
		}
}