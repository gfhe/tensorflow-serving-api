package tensorflow;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The ProfilerService service retrieves performance information about
 * the programs running on connected devices over a period of time.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: tensorflow/core/profiler/profiler_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProfilerServiceGrpc {

  private ProfilerServiceGrpc() {}

  public static final String SERVICE_NAME = "tensorflow.ProfilerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tensorflow.ProfilerServiceOuterClass.ProfileRequest,
      tensorflow.ProfilerServiceOuterClass.ProfileResponse> getProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Profile",
      requestType = tensorflow.ProfilerServiceOuterClass.ProfileRequest.class,
      responseType = tensorflow.ProfilerServiceOuterClass.ProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.ProfilerServiceOuterClass.ProfileRequest,
      tensorflow.ProfilerServiceOuterClass.ProfileResponse> getProfileMethod() {
    io.grpc.MethodDescriptor<tensorflow.ProfilerServiceOuterClass.ProfileRequest, tensorflow.ProfilerServiceOuterClass.ProfileResponse> getProfileMethod;
    if ((getProfileMethod = ProfilerServiceGrpc.getProfileMethod) == null) {
      synchronized (ProfilerServiceGrpc.class) {
        if ((getProfileMethod = ProfilerServiceGrpc.getProfileMethod) == null) {
          ProfilerServiceGrpc.getProfileMethod = getProfileMethod =
              io.grpc.MethodDescriptor.<tensorflow.ProfilerServiceOuterClass.ProfileRequest, tensorflow.ProfilerServiceOuterClass.ProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Profile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.ProfilerServiceOuterClass.ProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.ProfilerServiceOuterClass.ProfileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProfilerServiceMethodDescriptorSupplier("Profile"))
              .build();
        }
      }
    }
    return getProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tensorflow.ProfilerServiceOuterClass.TerminateRequest,
      tensorflow.ProfilerServiceOuterClass.TerminateResponse> getTerminateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Terminate",
      requestType = tensorflow.ProfilerServiceOuterClass.TerminateRequest.class,
      responseType = tensorflow.ProfilerServiceOuterClass.TerminateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.ProfilerServiceOuterClass.TerminateRequest,
      tensorflow.ProfilerServiceOuterClass.TerminateResponse> getTerminateMethod() {
    io.grpc.MethodDescriptor<tensorflow.ProfilerServiceOuterClass.TerminateRequest, tensorflow.ProfilerServiceOuterClass.TerminateResponse> getTerminateMethod;
    if ((getTerminateMethod = ProfilerServiceGrpc.getTerminateMethod) == null) {
      synchronized (ProfilerServiceGrpc.class) {
        if ((getTerminateMethod = ProfilerServiceGrpc.getTerminateMethod) == null) {
          ProfilerServiceGrpc.getTerminateMethod = getTerminateMethod =
              io.grpc.MethodDescriptor.<tensorflow.ProfilerServiceOuterClass.TerminateRequest, tensorflow.ProfilerServiceOuterClass.TerminateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Terminate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.ProfilerServiceOuterClass.TerminateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.ProfilerServiceOuterClass.TerminateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProfilerServiceMethodDescriptorSupplier("Terminate"))
              .build();
        }
      }
    }
    return getTerminateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tensorflow.ProfilerServiceOuterClass.MonitorRequest,
      tensorflow.ProfilerServiceOuterClass.MonitorResponse> getMonitorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Monitor",
      requestType = tensorflow.ProfilerServiceOuterClass.MonitorRequest.class,
      responseType = tensorflow.ProfilerServiceOuterClass.MonitorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.ProfilerServiceOuterClass.MonitorRequest,
      tensorflow.ProfilerServiceOuterClass.MonitorResponse> getMonitorMethod() {
    io.grpc.MethodDescriptor<tensorflow.ProfilerServiceOuterClass.MonitorRequest, tensorflow.ProfilerServiceOuterClass.MonitorResponse> getMonitorMethod;
    if ((getMonitorMethod = ProfilerServiceGrpc.getMonitorMethod) == null) {
      synchronized (ProfilerServiceGrpc.class) {
        if ((getMonitorMethod = ProfilerServiceGrpc.getMonitorMethod) == null) {
          ProfilerServiceGrpc.getMonitorMethod = getMonitorMethod =
              io.grpc.MethodDescriptor.<tensorflow.ProfilerServiceOuterClass.MonitorRequest, tensorflow.ProfilerServiceOuterClass.MonitorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Monitor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.ProfilerServiceOuterClass.MonitorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.ProfilerServiceOuterClass.MonitorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProfilerServiceMethodDescriptorSupplier("Monitor"))
              .build();
        }
      }
    }
    return getMonitorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProfilerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfilerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfilerServiceStub>() {
        @java.lang.Override
        public ProfilerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfilerServiceStub(channel, callOptions);
        }
      };
    return ProfilerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProfilerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfilerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfilerServiceBlockingStub>() {
        @java.lang.Override
        public ProfilerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfilerServiceBlockingStub(channel, callOptions);
        }
      };
    return ProfilerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProfilerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfilerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfilerServiceFutureStub>() {
        @java.lang.Override
        public ProfilerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfilerServiceFutureStub(channel, callOptions);
        }
      };
    return ProfilerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The ProfilerService service retrieves performance information about
   * the programs running on connected devices over a period of time.
   * </pre>
   */
  public static abstract class ProfilerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Starts a profiling session, blocks until it completes, and returns data.
     * </pre>
     */
    public void profile(tensorflow.ProfilerServiceOuterClass.ProfileRequest request,
        io.grpc.stub.StreamObserver<tensorflow.ProfilerServiceOuterClass.ProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Signal to terminate the Profile rpc for a on-going profiling session,
     * The Profile rpc will return successfully and prematurely without timeout.
     * This is used by programmatic mode to end the session in workers.
     * </pre>
     */
    public void terminate(tensorflow.ProfilerServiceOuterClass.TerminateRequest request,
        io.grpc.stub.StreamObserver<tensorflow.ProfilerServiceOuterClass.TerminateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTerminateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Collects profiling data and returns user-friendly metrics.
     * </pre>
     */
    public void monitor(tensorflow.ProfilerServiceOuterClass.MonitorRequest request,
        io.grpc.stub.StreamObserver<tensorflow.ProfilerServiceOuterClass.MonitorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMonitorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tensorflow.ProfilerServiceOuterClass.ProfileRequest,
                tensorflow.ProfilerServiceOuterClass.ProfileResponse>(
                  this, METHODID_PROFILE)))
          .addMethod(
            getTerminateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tensorflow.ProfilerServiceOuterClass.TerminateRequest,
                tensorflow.ProfilerServiceOuterClass.TerminateResponse>(
                  this, METHODID_TERMINATE)))
          .addMethod(
            getMonitorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tensorflow.ProfilerServiceOuterClass.MonitorRequest,
                tensorflow.ProfilerServiceOuterClass.MonitorResponse>(
                  this, METHODID_MONITOR)))
          .build();
    }
  }

  /**
   * <pre>
   * The ProfilerService service retrieves performance information about
   * the programs running on connected devices over a period of time.
   * </pre>
   */
  public static final class ProfilerServiceStub extends io.grpc.stub.AbstractAsyncStub<ProfilerServiceStub> {
    private ProfilerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfilerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfilerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts a profiling session, blocks until it completes, and returns data.
     * </pre>
     */
    public void profile(tensorflow.ProfilerServiceOuterClass.ProfileRequest request,
        io.grpc.stub.StreamObserver<tensorflow.ProfilerServiceOuterClass.ProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Signal to terminate the Profile rpc for a on-going profiling session,
     * The Profile rpc will return successfully and prematurely without timeout.
     * This is used by programmatic mode to end the session in workers.
     * </pre>
     */
    public void terminate(tensorflow.ProfilerServiceOuterClass.TerminateRequest request,
        io.grpc.stub.StreamObserver<tensorflow.ProfilerServiceOuterClass.TerminateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTerminateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Collects profiling data and returns user-friendly metrics.
     * </pre>
     */
    public void monitor(tensorflow.ProfilerServiceOuterClass.MonitorRequest request,
        io.grpc.stub.StreamObserver<tensorflow.ProfilerServiceOuterClass.MonitorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMonitorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The ProfilerService service retrieves performance information about
   * the programs running on connected devices over a period of time.
   * </pre>
   */
  public static final class ProfilerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProfilerServiceBlockingStub> {
    private ProfilerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfilerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfilerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts a profiling session, blocks until it completes, and returns data.
     * </pre>
     */
    public tensorflow.ProfilerServiceOuterClass.ProfileResponse profile(tensorflow.ProfilerServiceOuterClass.ProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Signal to terminate the Profile rpc for a on-going profiling session,
     * The Profile rpc will return successfully and prematurely without timeout.
     * This is used by programmatic mode to end the session in workers.
     * </pre>
     */
    public tensorflow.ProfilerServiceOuterClass.TerminateResponse terminate(tensorflow.ProfilerServiceOuterClass.TerminateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTerminateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Collects profiling data and returns user-friendly metrics.
     * </pre>
     */
    public tensorflow.ProfilerServiceOuterClass.MonitorResponse monitor(tensorflow.ProfilerServiceOuterClass.MonitorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMonitorMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The ProfilerService service retrieves performance information about
   * the programs running on connected devices over a period of time.
   * </pre>
   */
  public static final class ProfilerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProfilerServiceFutureStub> {
    private ProfilerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfilerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfilerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts a profiling session, blocks until it completes, and returns data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.ProfilerServiceOuterClass.ProfileResponse> profile(
        tensorflow.ProfilerServiceOuterClass.ProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Signal to terminate the Profile rpc for a on-going profiling session,
     * The Profile rpc will return successfully and prematurely without timeout.
     * This is used by programmatic mode to end the session in workers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.ProfilerServiceOuterClass.TerminateResponse> terminate(
        tensorflow.ProfilerServiceOuterClass.TerminateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTerminateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Collects profiling data and returns user-friendly metrics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.ProfilerServiceOuterClass.MonitorResponse> monitor(
        tensorflow.ProfilerServiceOuterClass.MonitorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMonitorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROFILE = 0;
  private static final int METHODID_TERMINATE = 1;
  private static final int METHODID_MONITOR = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProfilerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProfilerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROFILE:
          serviceImpl.profile((tensorflow.ProfilerServiceOuterClass.ProfileRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.ProfilerServiceOuterClass.ProfileResponse>) responseObserver);
          break;
        case METHODID_TERMINATE:
          serviceImpl.terminate((tensorflow.ProfilerServiceOuterClass.TerminateRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.ProfilerServiceOuterClass.TerminateResponse>) responseObserver);
          break;
        case METHODID_MONITOR:
          serviceImpl.monitor((tensorflow.ProfilerServiceOuterClass.MonitorRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.ProfilerServiceOuterClass.MonitorResponse>) responseObserver);
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

  private static abstract class ProfilerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProfilerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tensorflow.ProfilerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProfilerService");
    }
  }

  private static final class ProfilerServiceFileDescriptorSupplier
      extends ProfilerServiceBaseDescriptorSupplier {
    ProfilerServiceFileDescriptorSupplier() {}
  }

  private static final class ProfilerServiceMethodDescriptorSupplier
      extends ProfilerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProfilerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProfilerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProfilerServiceFileDescriptorSupplier())
              .addMethod(getProfileMethod())
              .addMethod(getTerminateMethod())
              .addMethod(getMonitorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
