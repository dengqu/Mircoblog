package controllers;

import models.User;
import play.mvc.Controller;

public class UserCenter extends Controller {
	
   public static void checkLogin(User u,String username,String password){
	   u.setUsername(username);
	   u.setPassword(password);
       
	   render("user/center.html");
   }
   
}
