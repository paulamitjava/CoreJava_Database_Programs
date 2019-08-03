package day09;

public class GaryController {

	Gary refGary; // POJO class reference
	GaryServiceInterface refGaryService; // Service reference
	
	void routeService() {
		refGary = new Gary();
		refGary.setNRIC(1234);
		
		// call serviceImpl
		refGaryService = new GaryServiceImpl(); // up casting
		refGaryService.checkLogicStatus(refGary);
	}
	
}
