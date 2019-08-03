package application;

import controller.AdminController;

public class CRUDApplication {

	public static void main(String[] args) {
		
		AdminController adminControllerRef = new AdminController();
		adminControllerRef.adminProcess();

	}

}
