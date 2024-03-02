package com.stepdefinetions;

import io.cucumber.core.gherkin.messages.internal.gherkin.internal.com.eclipsesource.json.JsonObject;
import io.cucumber.core.gherkin.messages.internal.gherkin.internal.com.eclipsesource.json.JsonValue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.restassured.response.Response;
import junit.framework.Assert;
import stateAgencyManagement.StateAgencyManagementGrpc;
import stateAgencyManagement.StateAgencyManagementGrpc.StateAgencyManagementBlockingStub;
import stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest;
import stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyResponse;
import stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyRequest;
import stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyResponse;
import utility.ServerConnection;
import io.cucumber.java.en.Then;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.ResourceBundle;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.protobuf.StringValue;

import ClientRequests.StateAgencyRequests;

public class EBTCPAYStepDefinetions {
	ManagedChannel channel = null;
	
	StateAgencyManagementBlockingStub blockingStub = null;
	
	GetLocalAgencyResponse getLocalAgencyResponse = null;
	GetStateAgencyResponse getStateAgencyResponse = null;
	
	GetLocalAgencyRequest getLocalAgencyRequest = null;	
	GetStateAgencyRequest getStateAgencyRequest = null;

	ResourceBundle routes = ResourceBundle.getBundle("routes");
	

	@Given("the gRPC client is connected to the server")
	public void the_g_rpc_client_is_connected_to_the_server() {
		String uri=routes.getString("stateagency_uri").replace("{env}",routes.getString("env"));
		System.out.println(uri);
		channel = ServerConnection.getServerConnection(uri);
		blockingStub = StateAgencyManagementGrpc.newBlockingStub(channel);
	}

	@When("I make a call to retrieve the state agency information with a valid state agency id {string}")
	public void i_make_a_call_to_retrieve_the_state_agency_information_with_a_valid_state_agency_id(String stateAgencyID) {
		getStateAgencyRequest =StateAgencyRequests.getStateAgencyRequest(stateAgencyID);
		getStateAgencyResponse = blockingStub.getStateAgency(getStateAgencyRequest);
		
		
		
	}	

	@Then("the response should include the state agency details")
	public void the_response_should_include_the_state_agency_details() {
		/*	
		System.out.println(getStateAgencyResponse.getLocalAgencyId());
		assertEquals("48b9873c-1466-475b-937f-a33bac4fda1d", getStateAgencyResponse.getLocalAgencyId());
	*/
		System.out.println(getStateAgencyResponse.getStateAgencyId());
		assertEquals("406a17c1-3574-4597-9345-3dceb12121ab", getStateAgencyResponse.getStateAgencyId());

	}

	@Then("the response status code should indicate success")
	public void the_response_status_code_should_indicate_success() {
		// StateAgencyProto.StateAgencyResponse response = client.getStateAgency("NY");
		assertNotNull(getStateAgencyResponse);
		assertEquals("406a17c1-3574-4597-9345-3dceb12121ab", getStateAgencyResponse.getStateAgencyId());

		//assertEquals("48b9873c-1466-475b-937f-a33bac4fda1d", getStateAgencyResponse.getLocalAgencyId());
		// assertEquals("New York State Agency", response.getAgencyName()); // Example
		// agency name
		// assertEquals("Other relevant details", response.getOtherDetails()); //
		// Example other details
		//ServerConnection.shutdown();
	}
	
	@When("^I make a call to retrieve the local agency information with a valid StateAgencyId (.+) and LocalAgencyId (.+) and MisLocalAgencyId (.+)$")
	public void i_make_a_call_to_retrieve_the_local_agency_information_with_a_valid_state_agency_id_and_local_agency_id__and_mis_local_agency_id(String stateAgencyId, String localAgencyId, String misLocalAgencyId) {
				
		getLocalAgencyRequest=StateAgencyRequests.getLocalAgencyRequest(stateAgencyId, localAgencyId, misLocalAgencyId);
		getLocalAgencyResponse = blockingStub.getLocalAgency(getLocalAgencyRequest);
	}
	
	@Then("the response should include the local agency details")
	public void the_response_should_include_the_local_agency_details() {
		assertNotNull(getLocalAgencyResponse);
		System.out.println(getLocalAgencyResponse.getLocalAgencyId());
		assertEquals("48b9873c-1466-475b-937f-a33bac4fda1d", getLocalAgencyResponse.getLocalAgencyId());
		//ServerConnection.shutdown();
	}

}
