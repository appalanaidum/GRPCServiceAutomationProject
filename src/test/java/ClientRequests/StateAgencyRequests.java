package ClientRequests;

import com.google.protobuf.StringValue;

import stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest;
import stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyRequest;

public class StateAgencyRequests {
	static GetLocalAgencyRequest getLocalAgencyRequest = null;
	static GetStateAgencyRequest getStateAgencyRequest = null;

	public static GetLocalAgencyRequest getLocalAgencyRequest(String stateAgencyId, String localAgencyId, String misLocalAgencyId) {
		try {
			getLocalAgencyRequest = GetLocalAgencyRequest.newBuilder().setStateAgencyId(stateAgencyId).setLocalAgencyId(StringValue.of(localAgencyId))
					.setMisLocalAgencyId(StringValue.of(misLocalAgencyId)).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getLocalAgencyRequest;
	}
	
	public static GetStateAgencyRequest getStateAgencyRequest(String stateAgencyId) {
		try {
			getStateAgencyRequest = GetStateAgencyRequest.newBuilder().setStateAgencyId(stateAgencyId).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getStateAgencyRequest;
	}
}
