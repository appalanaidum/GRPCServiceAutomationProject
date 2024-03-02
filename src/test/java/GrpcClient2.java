
import java.util.Map;
import java.util.Set;

import com.examples.grpc.User.APIResponse;
import com.examples.grpc.User.LoginRequest;
import com.examples.grpc.userGrpc;
import com.examples.grpc.userGrpc.userBlockingStub;
import com.google.protobuf.StringValue;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import stateAgencyManagement.StateAgencyManagementGrpc;
import stateAgencyManagement.StateAgencyManagementGrpc.StateAgencyManagementBlockingStub;
import stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest;
import stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyResponse;
import stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyRequest;
import stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyResponse;

public class GrpcClient2 {

	public static void main(String[] args) throws InterruptedException {
		GetLocalAgencyResponse response=null;
	try
	{
		ManagedChannel channel = ManagedChannelBuilder.forTarget("ebt-qa-core-cus-stateagency-service.azurewebsites.net").useTransportSecurity().build();
	
		
		// stubs - generate from proto
	
		StateAgencyManagementBlockingStub StateAgencyManagementStub = StateAgencyManagementGrpc.newBlockingStub(channel);
		
	    /*	
	     GetStateAgencyRequest getStateAgencyRequest = GetStateAgencyRequest.newBuilder().setStateAgencyId("406a17c1-3574-4597-9345-3dceb12121ab").build();
		
		 response = StateAgencyManagementStub.getStateAgency(getStateAgencyRequest);
		 System.out.println(response.getStateAgencyId());
		 
		 */
		
		
		
		GetLocalAgencyRequest getLocalAgencyRequest=GetLocalAgencyRequest.newBuilder().setLocalAgencyId(StringValue.of("48b9873c-1466-475b-937f-a33bac4fda1d")).setMisLocalAgencyId(StringValue.of("9000000001")).setStateAgencyId("933edcf0-7925-4a86-89a3-7c8776df9448").build();
		
		//GetStateAgencyRequest getStateAgencyRequest =  GetLocalAgencyRequest. .newBuilder().setStateAgencyId("406a17c1-3574-4597-9345-3dceb12121ab").build();
		
		 response = StateAgencyManagementStub.getLocalAgency(getLocalAgencyRequest);
		 System.out.println(response.getLocalAgencyId());
		 
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		Thread.sleep(100);
		System.out.println(response.getLocalAgencyId());	
	}
		
	}
}
