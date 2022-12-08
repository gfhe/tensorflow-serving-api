package tensorflow;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Coordination Service defines a TensorFlow service that controls and
 * coordinates distributed execution in a cluster of multiple workers.
 * The service keeps track of the cluster configuration and the state of cluster
 * members or the leader depending on the role of the current worker. The
 * distributed runtime leverages this service to coordinate and perform cluster
 * initialization, check the healthiness of workers, and propagate error
 * messages to the cluster.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: tensorflow/core/protobuf/coordination_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CoordinationServiceGrpc {

  private CoordinationServiceGrpc() {}

  public static final String SERVICE_NAME = "tensorflow.CoordinationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.RegisterWorkerRequest,
      tensorflow.CoordinationServiceOuterClass.RegisterWorkerResponse> getRegisterWorkerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterWorker",
      requestType = tensorflow.CoordinationServiceOuterClass.RegisterWorkerRequest.class,
      responseType = tensorflow.CoordinationServiceOuterClass.RegisterWorkerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.RegisterWorkerRequest,
      tensorflow.CoordinationServiceOuterClass.RegisterWorkerResponse> getRegisterWorkerMethod() {
    io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.RegisterWorkerRequest, tensorflow.CoordinationServiceOuterClass.RegisterWorkerResponse> getRegisterWorkerMethod;
    if ((getRegisterWorkerMethod = CoordinationServiceGrpc.getRegisterWorkerMethod) == null) {
      synchronized (CoordinationServiceGrpc.class) {
        if ((getRegisterWorkerMethod = CoordinationServiceGrpc.getRegisterWorkerMethod) == null) {
          CoordinationServiceGrpc.getRegisterWorkerMethod = getRegisterWorkerMethod =
              io.grpc.MethodDescriptor.<tensorflow.CoordinationServiceOuterClass.RegisterWorkerRequest, tensorflow.CoordinationServiceOuterClass.RegisterWorkerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterWorker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.RegisterWorkerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.RegisterWorkerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoordinationServiceMethodDescriptorSupplier("RegisterWorker"))
              .build();
        }
      }
    }
    return getRegisterWorkerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.HeartbeatRequest,
      tensorflow.CoordinationServiceOuterClass.HeartbeatResponse> getHeartbeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Heartbeat",
      requestType = tensorflow.CoordinationServiceOuterClass.HeartbeatRequest.class,
      responseType = tensorflow.CoordinationServiceOuterClass.HeartbeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.HeartbeatRequest,
      tensorflow.CoordinationServiceOuterClass.HeartbeatResponse> getHeartbeatMethod() {
    io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.HeartbeatRequest, tensorflow.CoordinationServiceOuterClass.HeartbeatResponse> getHeartbeatMethod;
    if ((getHeartbeatMethod = CoordinationServiceGrpc.getHeartbeatMethod) == null) {
      synchronized (CoordinationServiceGrpc.class) {
        if ((getHeartbeatMethod = CoordinationServiceGrpc.getHeartbeatMethod) == null) {
          CoordinationServiceGrpc.getHeartbeatMethod = getHeartbeatMethod =
              io.grpc.MethodDescriptor.<tensorflow.CoordinationServiceOuterClass.HeartbeatRequest, tensorflow.CoordinationServiceOuterClass.HeartbeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Heartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.HeartbeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.HeartbeatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoordinationServiceMethodDescriptorSupplier("Heartbeat"))
              .build();
        }
      }
    }
    return getHeartbeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.WaitForAllTasksRequest,
      tensorflow.CoordinationServiceOuterClass.WaitForAllTasksResponse> getWaitForAllTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WaitForAllTasks",
      requestType = tensorflow.CoordinationServiceOuterClass.WaitForAllTasksRequest.class,
      responseType = tensorflow.CoordinationServiceOuterClass.WaitForAllTasksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.WaitForAllTasksRequest,
      tensorflow.CoordinationServiceOuterClass.WaitForAllTasksResponse> getWaitForAllTasksMethod() {
    io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.WaitForAllTasksRequest, tensorflow.CoordinationServiceOuterClass.WaitForAllTasksResponse> getWaitForAllTasksMethod;
    if ((getWaitForAllTasksMethod = CoordinationServiceGrpc.getWaitForAllTasksMethod) == null) {
      synchronized (CoordinationServiceGrpc.class) {
        if ((getWaitForAllTasksMethod = CoordinationServiceGrpc.getWaitForAllTasksMethod) == null) {
          CoordinationServiceGrpc.getWaitForAllTasksMethod = getWaitForAllTasksMethod =
              io.grpc.MethodDescriptor.<tensorflow.CoordinationServiceOuterClass.WaitForAllTasksRequest, tensorflow.CoordinationServiceOuterClass.WaitForAllTasksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WaitForAllTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.WaitForAllTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.WaitForAllTasksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoordinationServiceMethodDescriptorSupplier("WaitForAllTasks"))
              .build();
        }
      }
    }
    return getWaitForAllTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentRequest,
      tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentResponse> getReportErrorToAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportErrorToAgent",
      requestType = tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentRequest.class,
      responseType = tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentRequest,
      tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentResponse> getReportErrorToAgentMethod() {
    io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentRequest, tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentResponse> getReportErrorToAgentMethod;
    if ((getReportErrorToAgentMethod = CoordinationServiceGrpc.getReportErrorToAgentMethod) == null) {
      synchronized (CoordinationServiceGrpc.class) {
        if ((getReportErrorToAgentMethod = CoordinationServiceGrpc.getReportErrorToAgentMethod) == null) {
          CoordinationServiceGrpc.getReportErrorToAgentMethod = getReportErrorToAgentMethod =
              io.grpc.MethodDescriptor.<tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentRequest, tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportErrorToAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoordinationServiceMethodDescriptorSupplier("ReportErrorToAgent"))
              .build();
        }
      }
    }
    return getReportErrorToAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceRequest,
      tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceResponse> getReportErrorToServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportErrorToService",
      requestType = tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceRequest.class,
      responseType = tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceRequest,
      tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceResponse> getReportErrorToServiceMethod() {
    io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceRequest, tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceResponse> getReportErrorToServiceMethod;
    if ((getReportErrorToServiceMethod = CoordinationServiceGrpc.getReportErrorToServiceMethod) == null) {
      synchronized (CoordinationServiceGrpc.class) {
        if ((getReportErrorToServiceMethod = CoordinationServiceGrpc.getReportErrorToServiceMethod) == null) {
          CoordinationServiceGrpc.getReportErrorToServiceMethod = getReportErrorToServiceMethod =
              io.grpc.MethodDescriptor.<tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceRequest, tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportErrorToService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoordinationServiceMethodDescriptorSupplier("ReportErrorToService"))
              .build();
        }
      }
    }
    return getReportErrorToServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.InsertKeyValueRequest,
      tensorflow.CoordinationServiceOuterClass.InsertKeyValueResponse> getInsertKeyValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertKeyValue",
      requestType = tensorflow.CoordinationServiceOuterClass.InsertKeyValueRequest.class,
      responseType = tensorflow.CoordinationServiceOuterClass.InsertKeyValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.InsertKeyValueRequest,
      tensorflow.CoordinationServiceOuterClass.InsertKeyValueResponse> getInsertKeyValueMethod() {
    io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.InsertKeyValueRequest, tensorflow.CoordinationServiceOuterClass.InsertKeyValueResponse> getInsertKeyValueMethod;
    if ((getInsertKeyValueMethod = CoordinationServiceGrpc.getInsertKeyValueMethod) == null) {
      synchronized (CoordinationServiceGrpc.class) {
        if ((getInsertKeyValueMethod = CoordinationServiceGrpc.getInsertKeyValueMethod) == null) {
          CoordinationServiceGrpc.getInsertKeyValueMethod = getInsertKeyValueMethod =
              io.grpc.MethodDescriptor.<tensorflow.CoordinationServiceOuterClass.InsertKeyValueRequest, tensorflow.CoordinationServiceOuterClass.InsertKeyValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertKeyValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.InsertKeyValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.InsertKeyValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoordinationServiceMethodDescriptorSupplier("InsertKeyValue"))
              .build();
        }
      }
    }
    return getInsertKeyValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.GetKeyValueRequest,
      tensorflow.CoordinationServiceOuterClass.GetKeyValueResponse> getGetKeyValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKeyValue",
      requestType = tensorflow.CoordinationServiceOuterClass.GetKeyValueRequest.class,
      responseType = tensorflow.CoordinationServiceOuterClass.GetKeyValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.GetKeyValueRequest,
      tensorflow.CoordinationServiceOuterClass.GetKeyValueResponse> getGetKeyValueMethod() {
    io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.GetKeyValueRequest, tensorflow.CoordinationServiceOuterClass.GetKeyValueResponse> getGetKeyValueMethod;
    if ((getGetKeyValueMethod = CoordinationServiceGrpc.getGetKeyValueMethod) == null) {
      synchronized (CoordinationServiceGrpc.class) {
        if ((getGetKeyValueMethod = CoordinationServiceGrpc.getGetKeyValueMethod) == null) {
          CoordinationServiceGrpc.getGetKeyValueMethod = getGetKeyValueMethod =
              io.grpc.MethodDescriptor.<tensorflow.CoordinationServiceOuterClass.GetKeyValueRequest, tensorflow.CoordinationServiceOuterClass.GetKeyValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKeyValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.GetKeyValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.GetKeyValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoordinationServiceMethodDescriptorSupplier("GetKeyValue"))
              .build();
        }
      }
    }
    return getGetKeyValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.DeleteKeyValueRequest,
      tensorflow.CoordinationServiceOuterClass.DeleteKeyValueResponse> getDeleteKeyValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteKeyValue",
      requestType = tensorflow.CoordinationServiceOuterClass.DeleteKeyValueRequest.class,
      responseType = tensorflow.CoordinationServiceOuterClass.DeleteKeyValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.DeleteKeyValueRequest,
      tensorflow.CoordinationServiceOuterClass.DeleteKeyValueResponse> getDeleteKeyValueMethod() {
    io.grpc.MethodDescriptor<tensorflow.CoordinationServiceOuterClass.DeleteKeyValueRequest, tensorflow.CoordinationServiceOuterClass.DeleteKeyValueResponse> getDeleteKeyValueMethod;
    if ((getDeleteKeyValueMethod = CoordinationServiceGrpc.getDeleteKeyValueMethod) == null) {
      synchronized (CoordinationServiceGrpc.class) {
        if ((getDeleteKeyValueMethod = CoordinationServiceGrpc.getDeleteKeyValueMethod) == null) {
          CoordinationServiceGrpc.getDeleteKeyValueMethod = getDeleteKeyValueMethod =
              io.grpc.MethodDescriptor.<tensorflow.CoordinationServiceOuterClass.DeleteKeyValueRequest, tensorflow.CoordinationServiceOuterClass.DeleteKeyValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteKeyValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.DeleteKeyValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.CoordinationServiceOuterClass.DeleteKeyValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoordinationServiceMethodDescriptorSupplier("DeleteKeyValue"))
              .build();
        }
      }
    }
    return getDeleteKeyValueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CoordinationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoordinationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoordinationServiceStub>() {
        @java.lang.Override
        public CoordinationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoordinationServiceStub(channel, callOptions);
        }
      };
    return CoordinationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CoordinationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoordinationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoordinationServiceBlockingStub>() {
        @java.lang.Override
        public CoordinationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoordinationServiceBlockingStub(channel, callOptions);
        }
      };
    return CoordinationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CoordinationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoordinationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoordinationServiceFutureStub>() {
        @java.lang.Override
        public CoordinationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoordinationServiceFutureStub(channel, callOptions);
        }
      };
    return CoordinationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Coordination Service defines a TensorFlow service that controls and
   * coordinates distributed execution in a cluster of multiple workers.
   * The service keeps track of the cluster configuration and the state of cluster
   * members or the leader depending on the role of the current worker. The
   * distributed runtime leverages this service to coordinate and perform cluster
   * initialization, check the healthiness of workers, and propagate error
   * messages to the cluster.
   * </pre>
   */
  public static abstract class CoordinationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Register task to coordination service so that the service starts to track
     * liveness of the task. RPC blocks and returns only when it registers to
     * the service successfully, or error happens in the registering process.
     * </pre>
     */
    public void registerWorker(tensorflow.CoordinationServiceOuterClass.RegisterWorkerRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.RegisterWorkerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterWorkerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Heartbeat message from task to coordination service. Heartbeat is sent from
     * a task to refresh its timestamp on leader to avoid it becoming stale.
     * RPC responds immediately after refreshing the timestamp on leader.
     * </pre>
     */
    public void heartbeat(tensorflow.CoordinationServiceOuterClass.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.HeartbeatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHeartbeatMethod(), responseObserver);
    }

    /**
     * <pre>
     * Wait for all tasks in the cluster to be up and running. The RPC request
     * only gets responded when all workers are registered, or some error occurs.
     * </pre>
     */
    public void waitForAllTasks(tensorflow.CoordinationServiceOuterClass.WaitForAllTasksRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.WaitForAllTasksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWaitForAllTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Report error to the task. RPC sets the receiving instance of coordination
     * service agent to error state permanently.
     * TODO(b/195990880): Consider splitting this into a different RPC service.
     * </pre>
     */
    public void reportErrorToAgent(tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportErrorToAgentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Report task error to coordination service. RPC sets the service-side task
     * state to error, and propagate the error to other tasks in the cluster.
     * </pre>
     */
    public void reportErrorToService(tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportErrorToServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Insert configuration key-value that will be accessible to all cluster
     * workers. The key can be formatted as Unix file path with hierarchy. The
     * coordination service key-value store should only be used for cluster
     * configuration data.
     * </pre>
     */
    public void insertKeyValue(tensorflow.CoordinationServiceOuterClass.InsertKeyValueRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.InsertKeyValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertKeyValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get configuration key-value. The request blocks until the key-value data
     * becomes available (i.e., set by a worker in the cluster).
     * </pre>
     */
    public void getKeyValue(tensorflow.CoordinationServiceOuterClass.GetKeyValueRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.GetKeyValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKeyValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete configuration key-value. If is_directory is set in request,
     * recursively clean up all key-values under the path specified by `key`.
     * </pre>
     */
    public void deleteKeyValue(tensorflow.CoordinationServiceOuterClass.DeleteKeyValueRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.DeleteKeyValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteKeyValueMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterWorkerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tensorflow.CoordinationServiceOuterClass.RegisterWorkerRequest,
                tensorflow.CoordinationServiceOuterClass.RegisterWorkerResponse>(
                  this, METHODID_REGISTER_WORKER)))
          .addMethod(
            getHeartbeatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tensorflow.CoordinationServiceOuterClass.HeartbeatRequest,
                tensorflow.CoordinationServiceOuterClass.HeartbeatResponse>(
                  this, METHODID_HEARTBEAT)))
          .addMethod(
            getWaitForAllTasksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tensorflow.CoordinationServiceOuterClass.WaitForAllTasksRequest,
                tensorflow.CoordinationServiceOuterClass.WaitForAllTasksResponse>(
                  this, METHODID_WAIT_FOR_ALL_TASKS)))
          .addMethod(
            getReportErrorToAgentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentRequest,
                tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentResponse>(
                  this, METHODID_REPORT_ERROR_TO_AGENT)))
          .addMethod(
            getReportErrorToServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceRequest,
                tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceResponse>(
                  this, METHODID_REPORT_ERROR_TO_SERVICE)))
          .addMethod(
            getInsertKeyValueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tensorflow.CoordinationServiceOuterClass.InsertKeyValueRequest,
                tensorflow.CoordinationServiceOuterClass.InsertKeyValueResponse>(
                  this, METHODID_INSERT_KEY_VALUE)))
          .addMethod(
            getGetKeyValueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tensorflow.CoordinationServiceOuterClass.GetKeyValueRequest,
                tensorflow.CoordinationServiceOuterClass.GetKeyValueResponse>(
                  this, METHODID_GET_KEY_VALUE)))
          .addMethod(
            getDeleteKeyValueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tensorflow.CoordinationServiceOuterClass.DeleteKeyValueRequest,
                tensorflow.CoordinationServiceOuterClass.DeleteKeyValueResponse>(
                  this, METHODID_DELETE_KEY_VALUE)))
          .build();
    }
  }

  /**
   * <pre>
   * Coordination Service defines a TensorFlow service that controls and
   * coordinates distributed execution in a cluster of multiple workers.
   * The service keeps track of the cluster configuration and the state of cluster
   * members or the leader depending on the role of the current worker. The
   * distributed runtime leverages this service to coordinate and perform cluster
   * initialization, check the healthiness of workers, and propagate error
   * messages to the cluster.
   * </pre>
   */
  public static final class CoordinationServiceStub extends io.grpc.stub.AbstractAsyncStub<CoordinationServiceStub> {
    private CoordinationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoordinationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoordinationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register task to coordination service so that the service starts to track
     * liveness of the task. RPC blocks and returns only when it registers to
     * the service successfully, or error happens in the registering process.
     * </pre>
     */
    public void registerWorker(tensorflow.CoordinationServiceOuterClass.RegisterWorkerRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.RegisterWorkerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterWorkerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Heartbeat message from task to coordination service. Heartbeat is sent from
     * a task to refresh its timestamp on leader to avoid it becoming stale.
     * RPC responds immediately after refreshing the timestamp on leader.
     * </pre>
     */
    public void heartbeat(tensorflow.CoordinationServiceOuterClass.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.HeartbeatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Wait for all tasks in the cluster to be up and running. The RPC request
     * only gets responded when all workers are registered, or some error occurs.
     * </pre>
     */
    public void waitForAllTasks(tensorflow.CoordinationServiceOuterClass.WaitForAllTasksRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.WaitForAllTasksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWaitForAllTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Report error to the task. RPC sets the receiving instance of coordination
     * service agent to error state permanently.
     * TODO(b/195990880): Consider splitting this into a different RPC service.
     * </pre>
     */
    public void reportErrorToAgent(tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportErrorToAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Report task error to coordination service. RPC sets the service-side task
     * state to error, and propagate the error to other tasks in the cluster.
     * </pre>
     */
    public void reportErrorToService(tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportErrorToServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Insert configuration key-value that will be accessible to all cluster
     * workers. The key can be formatted as Unix file path with hierarchy. The
     * coordination service key-value store should only be used for cluster
     * configuration data.
     * </pre>
     */
    public void insertKeyValue(tensorflow.CoordinationServiceOuterClass.InsertKeyValueRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.InsertKeyValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertKeyValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get configuration key-value. The request blocks until the key-value data
     * becomes available (i.e., set by a worker in the cluster).
     * </pre>
     */
    public void getKeyValue(tensorflow.CoordinationServiceOuterClass.GetKeyValueRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.GetKeyValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKeyValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete configuration key-value. If is_directory is set in request,
     * recursively clean up all key-values under the path specified by `key`.
     * </pre>
     */
    public void deleteKeyValue(tensorflow.CoordinationServiceOuterClass.DeleteKeyValueRequest request,
        io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.DeleteKeyValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteKeyValueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Coordination Service defines a TensorFlow service that controls and
   * coordinates distributed execution in a cluster of multiple workers.
   * The service keeps track of the cluster configuration and the state of cluster
   * members or the leader depending on the role of the current worker. The
   * distributed runtime leverages this service to coordinate and perform cluster
   * initialization, check the healthiness of workers, and propagate error
   * messages to the cluster.
   * </pre>
   */
  public static final class CoordinationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CoordinationServiceBlockingStub> {
    private CoordinationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoordinationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoordinationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register task to coordination service so that the service starts to track
     * liveness of the task. RPC blocks and returns only when it registers to
     * the service successfully, or error happens in the registering process.
     * </pre>
     */
    public tensorflow.CoordinationServiceOuterClass.RegisterWorkerResponse registerWorker(tensorflow.CoordinationServiceOuterClass.RegisterWorkerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterWorkerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Heartbeat message from task to coordination service. Heartbeat is sent from
     * a task to refresh its timestamp on leader to avoid it becoming stale.
     * RPC responds immediately after refreshing the timestamp on leader.
     * </pre>
     */
    public tensorflow.CoordinationServiceOuterClass.HeartbeatResponse heartbeat(tensorflow.CoordinationServiceOuterClass.HeartbeatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHeartbeatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Wait for all tasks in the cluster to be up and running. The RPC request
     * only gets responded when all workers are registered, or some error occurs.
     * </pre>
     */
    public tensorflow.CoordinationServiceOuterClass.WaitForAllTasksResponse waitForAllTasks(tensorflow.CoordinationServiceOuterClass.WaitForAllTasksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWaitForAllTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Report error to the task. RPC sets the receiving instance of coordination
     * service agent to error state permanently.
     * TODO(b/195990880): Consider splitting this into a different RPC service.
     * </pre>
     */
    public tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentResponse reportErrorToAgent(tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportErrorToAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Report task error to coordination service. RPC sets the service-side task
     * state to error, and propagate the error to other tasks in the cluster.
     * </pre>
     */
    public tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceResponse reportErrorToService(tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportErrorToServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Insert configuration key-value that will be accessible to all cluster
     * workers. The key can be formatted as Unix file path with hierarchy. The
     * coordination service key-value store should only be used for cluster
     * configuration data.
     * </pre>
     */
    public tensorflow.CoordinationServiceOuterClass.InsertKeyValueResponse insertKeyValue(tensorflow.CoordinationServiceOuterClass.InsertKeyValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertKeyValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get configuration key-value. The request blocks until the key-value data
     * becomes available (i.e., set by a worker in the cluster).
     * </pre>
     */
    public tensorflow.CoordinationServiceOuterClass.GetKeyValueResponse getKeyValue(tensorflow.CoordinationServiceOuterClass.GetKeyValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKeyValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete configuration key-value. If is_directory is set in request,
     * recursively clean up all key-values under the path specified by `key`.
     * </pre>
     */
    public tensorflow.CoordinationServiceOuterClass.DeleteKeyValueResponse deleteKeyValue(tensorflow.CoordinationServiceOuterClass.DeleteKeyValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteKeyValueMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Coordination Service defines a TensorFlow service that controls and
   * coordinates distributed execution in a cluster of multiple workers.
   * The service keeps track of the cluster configuration and the state of cluster
   * members or the leader depending on the role of the current worker. The
   * distributed runtime leverages this service to coordinate and perform cluster
   * initialization, check the healthiness of workers, and propagate error
   * messages to the cluster.
   * </pre>
   */
  public static final class CoordinationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CoordinationServiceFutureStub> {
    private CoordinationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoordinationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoordinationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register task to coordination service so that the service starts to track
     * liveness of the task. RPC blocks and returns only when it registers to
     * the service successfully, or error happens in the registering process.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.CoordinationServiceOuterClass.RegisterWorkerResponse> registerWorker(
        tensorflow.CoordinationServiceOuterClass.RegisterWorkerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterWorkerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Heartbeat message from task to coordination service. Heartbeat is sent from
     * a task to refresh its timestamp on leader to avoid it becoming stale.
     * RPC responds immediately after refreshing the timestamp on leader.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.CoordinationServiceOuterClass.HeartbeatResponse> heartbeat(
        tensorflow.CoordinationServiceOuterClass.HeartbeatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Wait for all tasks in the cluster to be up and running. The RPC request
     * only gets responded when all workers are registered, or some error occurs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.CoordinationServiceOuterClass.WaitForAllTasksResponse> waitForAllTasks(
        tensorflow.CoordinationServiceOuterClass.WaitForAllTasksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWaitForAllTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Report error to the task. RPC sets the receiving instance of coordination
     * service agent to error state permanently.
     * TODO(b/195990880): Consider splitting this into a different RPC service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentResponse> reportErrorToAgent(
        tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportErrorToAgentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Report task error to coordination service. RPC sets the service-side task
     * state to error, and propagate the error to other tasks in the cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceResponse> reportErrorToService(
        tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportErrorToServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Insert configuration key-value that will be accessible to all cluster
     * workers. The key can be formatted as Unix file path with hierarchy. The
     * coordination service key-value store should only be used for cluster
     * configuration data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.CoordinationServiceOuterClass.InsertKeyValueResponse> insertKeyValue(
        tensorflow.CoordinationServiceOuterClass.InsertKeyValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertKeyValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get configuration key-value. The request blocks until the key-value data
     * becomes available (i.e., set by a worker in the cluster).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.CoordinationServiceOuterClass.GetKeyValueResponse> getKeyValue(
        tensorflow.CoordinationServiceOuterClass.GetKeyValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKeyValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete configuration key-value. If is_directory is set in request,
     * recursively clean up all key-values under the path specified by `key`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.CoordinationServiceOuterClass.DeleteKeyValueResponse> deleteKeyValue(
        tensorflow.CoordinationServiceOuterClass.DeleteKeyValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteKeyValueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_WORKER = 0;
  private static final int METHODID_HEARTBEAT = 1;
  private static final int METHODID_WAIT_FOR_ALL_TASKS = 2;
  private static final int METHODID_REPORT_ERROR_TO_AGENT = 3;
  private static final int METHODID_REPORT_ERROR_TO_SERVICE = 4;
  private static final int METHODID_INSERT_KEY_VALUE = 5;
  private static final int METHODID_GET_KEY_VALUE = 6;
  private static final int METHODID_DELETE_KEY_VALUE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CoordinationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CoordinationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_WORKER:
          serviceImpl.registerWorker((tensorflow.CoordinationServiceOuterClass.RegisterWorkerRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.RegisterWorkerResponse>) responseObserver);
          break;
        case METHODID_HEARTBEAT:
          serviceImpl.heartbeat((tensorflow.CoordinationServiceOuterClass.HeartbeatRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.HeartbeatResponse>) responseObserver);
          break;
        case METHODID_WAIT_FOR_ALL_TASKS:
          serviceImpl.waitForAllTasks((tensorflow.CoordinationServiceOuterClass.WaitForAllTasksRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.WaitForAllTasksResponse>) responseObserver);
          break;
        case METHODID_REPORT_ERROR_TO_AGENT:
          serviceImpl.reportErrorToAgent((tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.ReportErrorToAgentResponse>) responseObserver);
          break;
        case METHODID_REPORT_ERROR_TO_SERVICE:
          serviceImpl.reportErrorToService((tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.ReportErrorToServiceResponse>) responseObserver);
          break;
        case METHODID_INSERT_KEY_VALUE:
          serviceImpl.insertKeyValue((tensorflow.CoordinationServiceOuterClass.InsertKeyValueRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.InsertKeyValueResponse>) responseObserver);
          break;
        case METHODID_GET_KEY_VALUE:
          serviceImpl.getKeyValue((tensorflow.CoordinationServiceOuterClass.GetKeyValueRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.GetKeyValueResponse>) responseObserver);
          break;
        case METHODID_DELETE_KEY_VALUE:
          serviceImpl.deleteKeyValue((tensorflow.CoordinationServiceOuterClass.DeleteKeyValueRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.CoordinationServiceOuterClass.DeleteKeyValueResponse>) responseObserver);
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

  private static abstract class CoordinationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CoordinationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tensorflow.CoordinationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CoordinationService");
    }
  }

  private static final class CoordinationServiceFileDescriptorSupplier
      extends CoordinationServiceBaseDescriptorSupplier {
    CoordinationServiceFileDescriptorSupplier() {}
  }

  private static final class CoordinationServiceMethodDescriptorSupplier
      extends CoordinationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CoordinationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CoordinationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CoordinationServiceFileDescriptorSupplier())
              .addMethod(getRegisterWorkerMethod())
              .addMethod(getHeartbeatMethod())
              .addMethod(getWaitForAllTasksMethod())
              .addMethod(getReportErrorToAgentMethod())
              .addMethod(getReportErrorToServiceMethod())
              .addMethod(getInsertKeyValueMethod())
              .addMethod(getGetKeyValueMethod())
              .addMethod(getDeleteKeyValueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
