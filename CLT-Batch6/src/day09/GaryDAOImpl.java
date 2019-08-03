package day09;

public class GaryDAOImpl implements GaryDAOInterface {

	boolean status;
	
	@Override
	public boolean checkLogic(Gary refGary) {
		
		if (refGary.getNRIC()==1234) {
			status = true;
		} else {
			status = false;
		}

		return status;
		
	}

	
}
