package com.ebtcpay.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import stateAgencyManagement.StateAgencyManagementGrpc;
import stateAgencyManagement.StateAgencyManagementGrpc.StateAgencyManagementBlockingStub;
import stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest;
import stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyResponse;
import utility.ServerConnection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.google.protobuf.StringValue;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/EBTCPAY_StateAgencyServices.feature", glue = "com/stepdefinetions", tags = "@Sanity", plugin = {
		"pretty", "junit:target/cucumber.xml", "html:target/cucumber.html", "json:target/cucumber.json" })
public class TestRunner {
	
	@AfterClass
    public static void tearDown() {
		ServerConnection.shutdown();
    }
}
