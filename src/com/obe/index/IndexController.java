package com.obe.index;

import com.jfinal.core.Controller;


/**
 * IndexController
 */
public class IndexController extends Controller {
	public void index() {
		render("login.html");
	}
	public void panel(){
		render("index.html");
	}
}





