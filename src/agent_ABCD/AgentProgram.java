package agent_ABCD;

public class AgentProgram {

	public Action execute(Percept p) {// location, status
		if(p.getLocationState().equals(Environment.LocationState.DIRTY)) {
			return Environment.SUCK_DIRT;
		}else if(p.getAgentLocation().equals(Environment.LOCATION_A)) {
			return Environment.MOVE_RIGHT;
		}else if(p.getAgentLocation().equals(Environment.LOCATION_B)) {
			return Environment.MOVE_DOWN;
		}else if(p.getAgentLocation().equals(Environment.LOCATION_C)) {
			return Environment.MOVE_LEFT;
		}else {
			return Environment.MOVE_UP;
		}
		
		
	}
}