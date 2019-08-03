package day09;

public class GaryServiceImpl implements GaryServiceInterface {

	GaryDAOInterface refGaryDAOInterface;
	
	@Override
	public void checkLogicStatus(Gary refGary) {
		
		refGaryDAOInterface = new GaryDAOImpl(); // up casting
		
		if(refGaryDAOInterface.checkLogic(refGary)) {
			System.out.println("hello.. your NRIC : "+refGary.getNRIC());
		}
		else {
			System.out.println("NRIC not found..");
		}

	}

}
