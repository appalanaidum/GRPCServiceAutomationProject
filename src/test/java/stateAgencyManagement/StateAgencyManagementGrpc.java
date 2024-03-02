package stateAgencyManagement;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: state_agency_management.proto")
public final class StateAgencyManagementGrpc {

  private StateAgencyManagementGrpc() {}

  public static final String SERVICE_NAME = "stateAgencyManagement.StateAgencyManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyResponse> getCreateStateAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStateAgency",
      requestType = stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyRequest.class,
      responseType = stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyResponse> getCreateStateAgencyMethod() {
    io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyRequest, stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyResponse> getCreateStateAgencyMethod;
    if ((getCreateStateAgencyMethod = StateAgencyManagementGrpc.getCreateStateAgencyMethod) == null) {
      synchronized (StateAgencyManagementGrpc.class) {
        if ((getCreateStateAgencyMethod = StateAgencyManagementGrpc.getCreateStateAgencyMethod) == null) {
          StateAgencyManagementGrpc.getCreateStateAgencyMethod = getCreateStateAgencyMethod = 
              io.grpc.MethodDescriptor.<stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyRequest, stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "stateAgencyManagement.StateAgencyManagement", "CreateStateAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StateAgencyManagementMethodDescriptorSupplier("CreateStateAgency"))
                  .build();
          }
        }
     }
     return getCreateStateAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyResponse> getUpdateStateAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStateAgency",
      requestType = stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyRequest.class,
      responseType = stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyResponse> getUpdateStateAgencyMethod() {
    io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyRequest, stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyResponse> getUpdateStateAgencyMethod;
    if ((getUpdateStateAgencyMethod = StateAgencyManagementGrpc.getUpdateStateAgencyMethod) == null) {
      synchronized (StateAgencyManagementGrpc.class) {
        if ((getUpdateStateAgencyMethod = StateAgencyManagementGrpc.getUpdateStateAgencyMethod) == null) {
          StateAgencyManagementGrpc.getUpdateStateAgencyMethod = getUpdateStateAgencyMethod = 
              io.grpc.MethodDescriptor.<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyRequest, stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "stateAgencyManagement.StateAgencyManagement", "UpdateStateAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StateAgencyManagementMethodDescriptorSupplier("UpdateStateAgency"))
                  .build();
          }
        }
     }
     return getUpdateStateAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyResponse> getGetStateAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStateAgency",
      requestType = stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyRequest.class,
      responseType = stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyResponse> getGetStateAgencyMethod() {
    io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyRequest, stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyResponse> getGetStateAgencyMethod;
    if ((getGetStateAgencyMethod = StateAgencyManagementGrpc.getGetStateAgencyMethod) == null) {
      synchronized (StateAgencyManagementGrpc.class) {
        if ((getGetStateAgencyMethod = StateAgencyManagementGrpc.getGetStateAgencyMethod) == null) {
          StateAgencyManagementGrpc.getGetStateAgencyMethod = getGetStateAgencyMethod = 
              io.grpc.MethodDescriptor.<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyRequest, stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "stateAgencyManagement.StateAgencyManagement", "GetStateAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StateAgencyManagementMethodDescriptorSupplier("GetStateAgency"))
                  .build();
          }
        }
     }
     return getGetStateAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyResponse> getSearchStateAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchStateAgency",
      requestType = stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyRequest.class,
      responseType = stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyResponse> getSearchStateAgencyMethod() {
    io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyRequest, stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyResponse> getSearchStateAgencyMethod;
    if ((getSearchStateAgencyMethod = StateAgencyManagementGrpc.getSearchStateAgencyMethod) == null) {
      synchronized (StateAgencyManagementGrpc.class) {
        if ((getSearchStateAgencyMethod = StateAgencyManagementGrpc.getSearchStateAgencyMethod) == null) {
          StateAgencyManagementGrpc.getSearchStateAgencyMethod = getSearchStateAgencyMethod = 
              io.grpc.MethodDescriptor.<stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyRequest, stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "stateAgencyManagement.StateAgencyManagement", "SearchStateAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StateAgencyManagementMethodDescriptorSupplier("SearchStateAgency"))
                  .build();
          }
        }
     }
     return getSearchStateAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdResponse> getGetStateAgencyByWicAuthorityIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStateAgencyByWicAuthorityId",
      requestType = stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdRequest.class,
      responseType = stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdResponse> getGetStateAgencyByWicAuthorityIdMethod() {
    io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdRequest, stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdResponse> getGetStateAgencyByWicAuthorityIdMethod;
    if ((getGetStateAgencyByWicAuthorityIdMethod = StateAgencyManagementGrpc.getGetStateAgencyByWicAuthorityIdMethod) == null) {
      synchronized (StateAgencyManagementGrpc.class) {
        if ((getGetStateAgencyByWicAuthorityIdMethod = StateAgencyManagementGrpc.getGetStateAgencyByWicAuthorityIdMethod) == null) {
          StateAgencyManagementGrpc.getGetStateAgencyByWicAuthorityIdMethod = getGetStateAgencyByWicAuthorityIdMethod = 
              io.grpc.MethodDescriptor.<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdRequest, stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "stateAgencyManagement.StateAgencyManagement", "GetStateAgencyByWicAuthorityId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StateAgencyManagementMethodDescriptorSupplier("GetStateAgencyByWicAuthorityId"))
                  .build();
          }
        }
     }
     return getGetStateAgencyByWicAuthorityIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyResponse> getAddLocalAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLocalAgency",
      requestType = stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyRequest.class,
      responseType = stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyResponse> getAddLocalAgencyMethod() {
    io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyRequest, stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyResponse> getAddLocalAgencyMethod;
    if ((getAddLocalAgencyMethod = StateAgencyManagementGrpc.getAddLocalAgencyMethod) == null) {
      synchronized (StateAgencyManagementGrpc.class) {
        if ((getAddLocalAgencyMethod = StateAgencyManagementGrpc.getAddLocalAgencyMethod) == null) {
          StateAgencyManagementGrpc.getAddLocalAgencyMethod = getAddLocalAgencyMethod = 
              io.grpc.MethodDescriptor.<stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyRequest, stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "stateAgencyManagement.StateAgencyManagement", "AddLocalAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StateAgencyManagementMethodDescriptorSupplier("AddLocalAgency"))
                  .build();
          }
        }
     }
     return getAddLocalAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyResponse> getUpdateLocalAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLocalAgency",
      requestType = stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyRequest.class,
      responseType = stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyResponse> getUpdateLocalAgencyMethod() {
    io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyRequest, stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyResponse> getUpdateLocalAgencyMethod;
    if ((getUpdateLocalAgencyMethod = StateAgencyManagementGrpc.getUpdateLocalAgencyMethod) == null) {
      synchronized (StateAgencyManagementGrpc.class) {
        if ((getUpdateLocalAgencyMethod = StateAgencyManagementGrpc.getUpdateLocalAgencyMethod) == null) {
          StateAgencyManagementGrpc.getUpdateLocalAgencyMethod = getUpdateLocalAgencyMethod = 
              io.grpc.MethodDescriptor.<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyRequest, stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "stateAgencyManagement.StateAgencyManagement", "UpdateLocalAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StateAgencyManagementMethodDescriptorSupplier("UpdateLocalAgency"))
                  .build();
          }
        }
     }
     return getUpdateLocalAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicResponse> getAddClinicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddClinic",
      requestType = stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicRequest.class,
      responseType = stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicResponse> getAddClinicMethod() {
    io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicRequest, stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicResponse> getAddClinicMethod;
    if ((getAddClinicMethod = StateAgencyManagementGrpc.getAddClinicMethod) == null) {
      synchronized (StateAgencyManagementGrpc.class) {
        if ((getAddClinicMethod = StateAgencyManagementGrpc.getAddClinicMethod) == null) {
          StateAgencyManagementGrpc.getAddClinicMethod = getAddClinicMethod = 
              io.grpc.MethodDescriptor.<stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicRequest, stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "stateAgencyManagement.StateAgencyManagement", "AddClinic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StateAgencyManagementMethodDescriptorSupplier("AddClinic"))
                  .build();
          }
        }
     }
     return getAddClinicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicResponse> getUpdateClinicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClinic",
      requestType = stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicRequest.class,
      responseType = stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicResponse> getUpdateClinicMethod() {
    io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicRequest, stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicResponse> getUpdateClinicMethod;
    if ((getUpdateClinicMethod = StateAgencyManagementGrpc.getUpdateClinicMethod) == null) {
      synchronized (StateAgencyManagementGrpc.class) {
        if ((getUpdateClinicMethod = StateAgencyManagementGrpc.getUpdateClinicMethod) == null) {
          StateAgencyManagementGrpc.getUpdateClinicMethod = getUpdateClinicMethod = 
              io.grpc.MethodDescriptor.<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicRequest, stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "stateAgencyManagement.StateAgencyManagement", "UpdateClinic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StateAgencyManagementMethodDescriptorSupplier("UpdateClinic"))
                  .build();
          }
        }
     }
     return getUpdateClinicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyResponse> getGetLocalAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocalAgency",
      requestType = stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest.class,
      responseType = stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyResponse> getGetLocalAgencyMethod() {
    io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest, stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyResponse> getGetLocalAgencyMethod;
    if ((getGetLocalAgencyMethod = StateAgencyManagementGrpc.getGetLocalAgencyMethod) == null) {
      synchronized (StateAgencyManagementGrpc.class) {
        if ((getGetLocalAgencyMethod = StateAgencyManagementGrpc.getGetLocalAgencyMethod) == null) {
          StateAgencyManagementGrpc.getGetLocalAgencyMethod = getGetLocalAgencyMethod = 
              io.grpc.MethodDescriptor.<stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest, stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "stateAgencyManagement.StateAgencyManagement", "GetLocalAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StateAgencyManagementMethodDescriptorSupplier("GetLocalAgency"))
                  .build();
          }
        }
     }
     return getGetLocalAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesResponse> getListLocalAgenciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLocalAgencies",
      requestType = stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesRequest.class,
      responseType = stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesResponse> getListLocalAgenciesMethod() {
    io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesRequest, stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesResponse> getListLocalAgenciesMethod;
    if ((getListLocalAgenciesMethod = StateAgencyManagementGrpc.getListLocalAgenciesMethod) == null) {
      synchronized (StateAgencyManagementGrpc.class) {
        if ((getListLocalAgenciesMethod = StateAgencyManagementGrpc.getListLocalAgenciesMethod) == null) {
          StateAgencyManagementGrpc.getListLocalAgenciesMethod = getListLocalAgenciesMethod = 
              io.grpc.MethodDescriptor.<stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesRequest, stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "stateAgencyManagement.StateAgencyManagement", "ListLocalAgencies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StateAgencyManagementMethodDescriptorSupplier("ListLocalAgencies"))
                  .build();
          }
        }
     }
     return getListLocalAgenciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicResponse> getGetClinicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClinic",
      requestType = stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicRequest.class,
      responseType = stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicResponse> getGetClinicMethod() {
    io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicRequest, stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicResponse> getGetClinicMethod;
    if ((getGetClinicMethod = StateAgencyManagementGrpc.getGetClinicMethod) == null) {
      synchronized (StateAgencyManagementGrpc.class) {
        if ((getGetClinicMethod = StateAgencyManagementGrpc.getGetClinicMethod) == null) {
          StateAgencyManagementGrpc.getGetClinicMethod = getGetClinicMethod = 
              io.grpc.MethodDescriptor.<stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicRequest, stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "stateAgencyManagement.StateAgencyManagement", "GetClinic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StateAgencyManagementMethodDescriptorSupplier("GetClinic"))
                  .build();
          }
        }
     }
     return getGetClinicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsResponse> getListClinicsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListClinics",
      requestType = stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsRequest.class,
      responseType = stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsRequest,
      stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsResponse> getListClinicsMethod() {
    io.grpc.MethodDescriptor<stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsRequest, stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsResponse> getListClinicsMethod;
    if ((getListClinicsMethod = StateAgencyManagementGrpc.getListClinicsMethod) == null) {
      synchronized (StateAgencyManagementGrpc.class) {
        if ((getListClinicsMethod = StateAgencyManagementGrpc.getListClinicsMethod) == null) {
          StateAgencyManagementGrpc.getListClinicsMethod = getListClinicsMethod = 
              io.grpc.MethodDescriptor.<stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsRequest, stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "stateAgencyManagement.StateAgencyManagement", "ListClinics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StateAgencyManagementMethodDescriptorSupplier("ListClinics"))
                  .build();
          }
        }
     }
     return getListClinicsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StateAgencyManagementStub newStub(io.grpc.Channel channel) {
    return new StateAgencyManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StateAgencyManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StateAgencyManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StateAgencyManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StateAgencyManagementFutureStub(channel);
  }

  /**
   */
  public static abstract class StateAgencyManagementImplBase implements io.grpc.BindableService {

    /**
     */
    public void createStateAgency(stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateStateAgencyMethod(), responseObserver);
    }

    /**
     */
    public void updateStateAgency(stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateStateAgencyMethod(), responseObserver);
    }

    /**
     */
    public void getStateAgency(stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStateAgencyMethod(), responseObserver);
    }

    /**
     */
    public void searchStateAgency(stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchStateAgencyMethod(), responseObserver);
    }

    /**
     */
    public void getStateAgencyByWicAuthorityId(stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStateAgencyByWicAuthorityIdMethod(), responseObserver);
    }

    /**
     */
    public void addLocalAgency(stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddLocalAgencyMethod(), responseObserver);
    }

    /**
     */
    public void updateLocalAgency(stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateLocalAgencyMethod(), responseObserver);
    }

    /**
     */
    public void addClinic(stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddClinicMethod(), responseObserver);
    }

    /**
     */
    public void updateClinic(stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateClinicMethod(), responseObserver);
    }

    /**
     */
    public void getLocalAgency(stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLocalAgencyMethod(), responseObserver);
    }

    /**
     */
    public void listLocalAgencies(stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListLocalAgenciesMethod(), responseObserver);
    }

    /**
     */
    public void getClinic(stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetClinicMethod(), responseObserver);
    }

    /**
     */
    public void listClinics(stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListClinicsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateStateAgencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyRequest,
                stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyResponse>(
                  this, METHODID_CREATE_STATE_AGENCY)))
          .addMethod(
            getUpdateStateAgencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyRequest,
                stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyResponse>(
                  this, METHODID_UPDATE_STATE_AGENCY)))
          .addMethod(
            getGetStateAgencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyRequest,
                stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyResponse>(
                  this, METHODID_GET_STATE_AGENCY)))
          .addMethod(
            getSearchStateAgencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyRequest,
                stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyResponse>(
                  this, METHODID_SEARCH_STATE_AGENCY)))
          .addMethod(
            getGetStateAgencyByWicAuthorityIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdRequest,
                stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdResponse>(
                  this, METHODID_GET_STATE_AGENCY_BY_WIC_AUTHORITY_ID)))
          .addMethod(
            getAddLocalAgencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyRequest,
                stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyResponse>(
                  this, METHODID_ADD_LOCAL_AGENCY)))
          .addMethod(
            getUpdateLocalAgencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyRequest,
                stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyResponse>(
                  this, METHODID_UPDATE_LOCAL_AGENCY)))
          .addMethod(
            getAddClinicMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicRequest,
                stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicResponse>(
                  this, METHODID_ADD_CLINIC)))
          .addMethod(
            getUpdateClinicMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicRequest,
                stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicResponse>(
                  this, METHODID_UPDATE_CLINIC)))
          .addMethod(
            getGetLocalAgencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest,
                stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyResponse>(
                  this, METHODID_GET_LOCAL_AGENCY)))
          .addMethod(
            getListLocalAgenciesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesRequest,
                stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesResponse>(
                  this, METHODID_LIST_LOCAL_AGENCIES)))
          .addMethod(
            getGetClinicMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicRequest,
                stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicResponse>(
                  this, METHODID_GET_CLINIC)))
          .addMethod(
            getListClinicsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsRequest,
                stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsResponse>(
                  this, METHODID_LIST_CLINICS)))
          .build();
    }
  }

  /**
   */
  public static final class StateAgencyManagementStub extends io.grpc.stub.AbstractStub<StateAgencyManagementStub> {
    private StateAgencyManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StateAgencyManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StateAgencyManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StateAgencyManagementStub(channel, callOptions);
    }

    /**
     */
    public void createStateAgency(stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateStateAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStateAgency(stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateStateAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStateAgency(stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStateAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchStateAgency(stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchStateAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStateAgencyByWicAuthorityId(stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStateAgencyByWicAuthorityIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addLocalAgency(stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddLocalAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLocalAgency(stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateLocalAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addClinic(stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddClinicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateClinic(stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateClinicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLocalAgency(stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLocalAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listLocalAgencies(stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListLocalAgenciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClinic(stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetClinicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listClinics(stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsRequest request,
        io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListClinicsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StateAgencyManagementBlockingStub extends io.grpc.stub.AbstractStub<StateAgencyManagementBlockingStub> {
    private StateAgencyManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StateAgencyManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StateAgencyManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StateAgencyManagementBlockingStub(channel, callOptions);
    }

    /**
     */
    public stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyResponse createStateAgency(stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateStateAgencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyResponse updateStateAgency(stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateStateAgencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyResponse getStateAgency(stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStateAgencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyResponse searchStateAgency(stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchStateAgencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdResponse getStateAgencyByWicAuthorityId(stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStateAgencyByWicAuthorityIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyResponse addLocalAgency(stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddLocalAgencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyResponse updateLocalAgency(stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateLocalAgencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicResponse addClinic(stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddClinicMethod(), getCallOptions(), request);
    }

    /**
     */
    public stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicResponse updateClinic(stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateClinicMethod(), getCallOptions(), request);
    }

    /**
     */
    public stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyResponse getLocalAgency(stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLocalAgencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesResponse listLocalAgencies(stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListLocalAgenciesMethod(), getCallOptions(), request);
    }

    /**
     */
    public stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicResponse getClinic(stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetClinicMethod(), getCallOptions(), request);
    }

    /**
     */
    public stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsResponse listClinics(stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListClinicsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StateAgencyManagementFutureStub extends io.grpc.stub.AbstractStub<StateAgencyManagementFutureStub> {
    private StateAgencyManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StateAgencyManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StateAgencyManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StateAgencyManagementFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyResponse> createStateAgency(
        stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateStateAgencyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyResponse> updateStateAgency(
        stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateStateAgencyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyResponse> getStateAgency(
        stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStateAgencyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyResponse> searchStateAgency(
        stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchStateAgencyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdResponse> getStateAgencyByWicAuthorityId(
        stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStateAgencyByWicAuthorityIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyResponse> addLocalAgency(
        stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddLocalAgencyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyResponse> updateLocalAgency(
        stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateLocalAgencyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicResponse> addClinic(
        stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddClinicMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicResponse> updateClinic(
        stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateClinicMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyResponse> getLocalAgency(
        stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLocalAgencyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesResponse> listLocalAgencies(
        stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListLocalAgenciesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicResponse> getClinic(
        stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetClinicMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsResponse> listClinics(
        stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListClinicsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_STATE_AGENCY = 0;
  private static final int METHODID_UPDATE_STATE_AGENCY = 1;
  private static final int METHODID_GET_STATE_AGENCY = 2;
  private static final int METHODID_SEARCH_STATE_AGENCY = 3;
  private static final int METHODID_GET_STATE_AGENCY_BY_WIC_AUTHORITY_ID = 4;
  private static final int METHODID_ADD_LOCAL_AGENCY = 5;
  private static final int METHODID_UPDATE_LOCAL_AGENCY = 6;
  private static final int METHODID_ADD_CLINIC = 7;
  private static final int METHODID_UPDATE_CLINIC = 8;
  private static final int METHODID_GET_LOCAL_AGENCY = 9;
  private static final int METHODID_LIST_LOCAL_AGENCIES = 10;
  private static final int METHODID_GET_CLINIC = 11;
  private static final int METHODID_LIST_CLINICS = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StateAgencyManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StateAgencyManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_STATE_AGENCY:
          serviceImpl.createStateAgency((stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyRequest) request,
              (io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.CreateStateAgencyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STATE_AGENCY:
          serviceImpl.updateStateAgency((stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyRequest) request,
              (io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateStateAgencyResponse>) responseObserver);
          break;
        case METHODID_GET_STATE_AGENCY:
          serviceImpl.getStateAgency((stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyRequest) request,
              (io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyResponse>) responseObserver);
          break;
        case METHODID_SEARCH_STATE_AGENCY:
          serviceImpl.searchStateAgency((stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyRequest) request,
              (io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.SearchStateAgencyResponse>) responseObserver);
          break;
        case METHODID_GET_STATE_AGENCY_BY_WIC_AUTHORITY_ID:
          serviceImpl.getStateAgencyByWicAuthorityId((stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdRequest) request,
              (io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.GetStateAgencyByWicAuthorityIdResponse>) responseObserver);
          break;
        case METHODID_ADD_LOCAL_AGENCY:
          serviceImpl.addLocalAgency((stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyRequest) request,
              (io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.AddLocalAgencyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LOCAL_AGENCY:
          serviceImpl.updateLocalAgency((stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyRequest) request,
              (io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateLocalAgencyResponse>) responseObserver);
          break;
        case METHODID_ADD_CLINIC:
          serviceImpl.addClinic((stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicRequest) request,
              (io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.AddClinicResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLINIC:
          serviceImpl.updateClinic((stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicRequest) request,
              (io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.UpdateClinicResponse>) responseObserver);
          break;
        case METHODID_GET_LOCAL_AGENCY:
          serviceImpl.getLocalAgency((stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyRequest) request,
              (io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.GetLocalAgencyResponse>) responseObserver);
          break;
        case METHODID_LIST_LOCAL_AGENCIES:
          serviceImpl.listLocalAgencies((stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesRequest) request,
              (io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.ListLocalAgenciesResponse>) responseObserver);
          break;
        case METHODID_GET_CLINIC:
          serviceImpl.getClinic((stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicRequest) request,
              (io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.GetClinicResponse>) responseObserver);
          break;
        case METHODID_LIST_CLINICS:
          serviceImpl.listClinics((stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsRequest) request,
              (io.grpc.stub.StreamObserver<stateAgencyManagement.StateAgencyManagementOuterClass.ListClinicsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StateAgencyManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StateAgencyManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return stateAgencyManagement.StateAgencyManagementOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StateAgencyManagement");
    }
  }

  private static final class StateAgencyManagementFileDescriptorSupplier
      extends StateAgencyManagementBaseDescriptorSupplier {
    StateAgencyManagementFileDescriptorSupplier() {}
  }

  private static final class StateAgencyManagementMethodDescriptorSupplier
      extends StateAgencyManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StateAgencyManagementMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StateAgencyManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StateAgencyManagementFileDescriptorSupplier())
              .addMethod(getCreateStateAgencyMethod())
              .addMethod(getUpdateStateAgencyMethod())
              .addMethod(getGetStateAgencyMethod())
              .addMethod(getSearchStateAgencyMethod())
              .addMethod(getGetStateAgencyByWicAuthorityIdMethod())
              .addMethod(getAddLocalAgencyMethod())
              .addMethod(getUpdateLocalAgencyMethod())
              .addMethod(getAddClinicMethod())
              .addMethod(getUpdateClinicMethod())
              .addMethod(getGetLocalAgencyMethod())
              .addMethod(getListLocalAgenciesMethod())
              .addMethod(getGetClinicMethod())
              .addMethod(getListClinicsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
