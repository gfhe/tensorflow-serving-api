package tensorflow;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *&#47;/////////////////////////////////////////////////////////////////////////////
 * ProfileAnalysis service provide entry point for profiling TPU and for
 * serving profiled data to Tensorboard through GRPC
 * //////////////////////////////////////////////////////////////////////////////
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: tensorflow/core/profiler/profiler_analysis.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProfileAnalysisGrpc {

  private ProfileAnalysisGrpc() {}

  public static final String SERVICE_NAME = "tensorflow.ProfileAnalysis";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tensorflow.ProfilerAnalysis.NewProfileSessionRequest,
      tensorflow.ProfilerAnalysis.NewProfileSessionResponse> getNewSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewSession",
      requestType = tensorflow.ProfilerAnalysis.NewProfileSessionRequest.class,
      responseType = tensorflow.ProfilerAnalysis.NewProfileSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.ProfilerAnalysis.NewProfileSessionRequest,
      tensorflow.ProfilerAnalysis.NewProfileSessionResponse> getNewSessionMethod() {
    io.grpc.MethodDescriptor<tensorflow.ProfilerAnalysis.NewProfileSessionRequest, tensorflow.ProfilerAnalysis.NewProfileSessionResponse> getNewSessionMethod;
    if ((getNewSessionMethod = ProfileAnalysisGrpc.getNewSessionMethod) == null) {
      synchronized (ProfileAnalysisGrpc.class) {
        if ((getNewSessionMethod = ProfileAnalysisGrpc.getNewSessionMethod) == null) {
          ProfileAnalysisGrpc.getNewSessionMethod = getNewSessionMethod =
              io.grpc.MethodDescriptor.<tensorflow.ProfilerAnalysis.NewProfileSessionRequest, tensorflow.ProfilerAnalysis.NewProfileSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.ProfilerAnalysis.NewProfileSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.ProfilerAnalysis.NewProfileSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProfileAnalysisMethodDescriptorSupplier("NewSession"))
              .build();
        }
      }
    }
    return getNewSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsRequest,
      tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsResponse> getEnumSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnumSessions",
      requestType = tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsRequest.class,
      responseType = tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsRequest,
      tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsResponse> getEnumSessionsMethod() {
    io.grpc.MethodDescriptor<tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsRequest, tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsResponse> getEnumSessionsMethod;
    if ((getEnumSessionsMethod = ProfileAnalysisGrpc.getEnumSessionsMethod) == null) {
      synchronized (ProfileAnalysisGrpc.class) {
        if ((getEnumSessionsMethod = ProfileAnalysisGrpc.getEnumSessionsMethod) == null) {
          ProfileAnalysisGrpc.getEnumSessionsMethod = getEnumSessionsMethod =
              io.grpc.MethodDescriptor.<tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsRequest, tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnumSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProfileAnalysisMethodDescriptorSupplier("EnumSessions"))
              .build();
        }
      }
    }
    return getEnumSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tensorflow.ProfilerAnalysis.ProfileSessionDataRequest,
      tensorflow.ProfilerAnalysis.ProfileSessionDataResponse> getGetSessionToolDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSessionToolData",
      requestType = tensorflow.ProfilerAnalysis.ProfileSessionDataRequest.class,
      responseType = tensorflow.ProfilerAnalysis.ProfileSessionDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.ProfilerAnalysis.ProfileSessionDataRequest,
      tensorflow.ProfilerAnalysis.ProfileSessionDataResponse> getGetSessionToolDataMethod() {
    io.grpc.MethodDescriptor<tensorflow.ProfilerAnalysis.ProfileSessionDataRequest, tensorflow.ProfilerAnalysis.ProfileSessionDataResponse> getGetSessionToolDataMethod;
    if ((getGetSessionToolDataMethod = ProfileAnalysisGrpc.getGetSessionToolDataMethod) == null) {
      synchronized (ProfileAnalysisGrpc.class) {
        if ((getGetSessionToolDataMethod = ProfileAnalysisGrpc.getGetSessionToolDataMethod) == null) {
          ProfileAnalysisGrpc.getGetSessionToolDataMethod = getGetSessionToolDataMethod =
              io.grpc.MethodDescriptor.<tensorflow.ProfilerAnalysis.ProfileSessionDataRequest, tensorflow.ProfilerAnalysis.ProfileSessionDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSessionToolData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.ProfilerAnalysis.ProfileSessionDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.ProfilerAnalysis.ProfileSessionDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProfileAnalysisMethodDescriptorSupplier("GetSessionToolData"))
              .build();
        }
      }
    }
    return getGetSessionToolDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProfileAnalysisStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfileAnalysisStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfileAnalysisStub>() {
        @java.lang.Override
        public ProfileAnalysisStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfileAnalysisStub(channel, callOptions);
        }
      };
    return ProfileAnalysisStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProfileAnalysisBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfileAnalysisBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfileAnalysisBlockingStub>() {
        @java.lang.Override
        public ProfileAnalysisBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfileAnalysisBlockingStub(channel, callOptions);
        }
      };
    return ProfileAnalysisBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProfileAnalysisFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfileAnalysisFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfileAnalysisFutureStub>() {
        @java.lang.Override
        public ProfileAnalysisFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfileAnalysisFutureStub(channel, callOptions);
        }
      };
    return ProfileAnalysisFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *&#47;/////////////////////////////////////////////////////////////////////////////
   * ProfileAnalysis service provide entry point for profiling TPU and for
   * serving profiled data to Tensorboard through GRPC
   * //////////////////////////////////////////////////////////////////////////////
   * </pre>
   */
  public static abstract class ProfileAnalysisImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Starts a profiling session, blocks until it completes.
     * TPUProfileAnalysis service delegate this to TPUProfiler service.
     * Populate the profiled data in repository, then return status to caller.
     * </pre>
     */
    public void newSession(tensorflow.ProfilerAnalysis.NewProfileSessionRequest request,
        io.grpc.stub.StreamObserver<tensorflow.ProfilerAnalysis.NewProfileSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enumerate existing sessions and return available profile tools.
     * </pre>
     */
    public void enumSessions(tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsRequest request,
        io.grpc.stub.StreamObserver<tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnumSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve specific tool's data for specific session.
     * </pre>
     */
    public void getSessionToolData(tensorflow.ProfilerAnalysis.ProfileSessionDataRequest request,
        io.grpc.stub.StreamObserver<tensorflow.ProfilerAnalysis.ProfileSessionDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSessionToolDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNewSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tensorflow.ProfilerAnalysis.NewProfileSessionRequest,
                tensorflow.ProfilerAnalysis.NewProfileSessionResponse>(
                  this, METHODID_NEW_SESSION)))
          .addMethod(
            getEnumSessionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsRequest,
                tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsResponse>(
                  this, METHODID_ENUM_SESSIONS)))
          .addMethod(
            getGetSessionToolDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tensorflow.ProfilerAnalysis.ProfileSessionDataRequest,
                tensorflow.ProfilerAnalysis.ProfileSessionDataResponse>(
                  this, METHODID_GET_SESSION_TOOL_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   *&#47;/////////////////////////////////////////////////////////////////////////////
   * ProfileAnalysis service provide entry point for profiling TPU and for
   * serving profiled data to Tensorboard through GRPC
   * //////////////////////////////////////////////////////////////////////////////
   * </pre>
   */
  public static final class ProfileAnalysisStub extends io.grpc.stub.AbstractAsyncStub<ProfileAnalysisStub> {
    private ProfileAnalysisStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileAnalysisStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfileAnalysisStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts a profiling session, blocks until it completes.
     * TPUProfileAnalysis service delegate this to TPUProfiler service.
     * Populate the profiled data in repository, then return status to caller.
     * </pre>
     */
    public void newSession(tensorflow.ProfilerAnalysis.NewProfileSessionRequest request,
        io.grpc.stub.StreamObserver<tensorflow.ProfilerAnalysis.NewProfileSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enumerate existing sessions and return available profile tools.
     * </pre>
     */
    public void enumSessions(tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsRequest request,
        io.grpc.stub.StreamObserver<tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnumSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve specific tool's data for specific session.
     * </pre>
     */
    public void getSessionToolData(tensorflow.ProfilerAnalysis.ProfileSessionDataRequest request,
        io.grpc.stub.StreamObserver<tensorflow.ProfilerAnalysis.ProfileSessionDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSessionToolDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *&#47;/////////////////////////////////////////////////////////////////////////////
   * ProfileAnalysis service provide entry point for profiling TPU and for
   * serving profiled data to Tensorboard through GRPC
   * //////////////////////////////////////////////////////////////////////////////
   * </pre>
   */
  public static final class ProfileAnalysisBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProfileAnalysisBlockingStub> {
    private ProfileAnalysisBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileAnalysisBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfileAnalysisBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts a profiling session, blocks until it completes.
     * TPUProfileAnalysis service delegate this to TPUProfiler service.
     * Populate the profiled data in repository, then return status to caller.
     * </pre>
     */
    public tensorflow.ProfilerAnalysis.NewProfileSessionResponse newSession(tensorflow.ProfilerAnalysis.NewProfileSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enumerate existing sessions and return available profile tools.
     * </pre>
     */
    public tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsResponse enumSessions(tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnumSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve specific tool's data for specific session.
     * </pre>
     */
    public tensorflow.ProfilerAnalysis.ProfileSessionDataResponse getSessionToolData(tensorflow.ProfilerAnalysis.ProfileSessionDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSessionToolDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *&#47;/////////////////////////////////////////////////////////////////////////////
   * ProfileAnalysis service provide entry point for profiling TPU and for
   * serving profiled data to Tensorboard through GRPC
   * //////////////////////////////////////////////////////////////////////////////
   * </pre>
   */
  public static final class ProfileAnalysisFutureStub extends io.grpc.stub.AbstractFutureStub<ProfileAnalysisFutureStub> {
    private ProfileAnalysisFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileAnalysisFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfileAnalysisFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts a profiling session, blocks until it completes.
     * TPUProfileAnalysis service delegate this to TPUProfiler service.
     * Populate the profiled data in repository, then return status to caller.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.ProfilerAnalysis.NewProfileSessionResponse> newSession(
        tensorflow.ProfilerAnalysis.NewProfileSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enumerate existing sessions and return available profile tools.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsResponse> enumSessions(
        tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnumSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve specific tool's data for specific session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.ProfilerAnalysis.ProfileSessionDataResponse> getSessionToolData(
        tensorflow.ProfilerAnalysis.ProfileSessionDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSessionToolDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NEW_SESSION = 0;
  private static final int METHODID_ENUM_SESSIONS = 1;
  private static final int METHODID_GET_SESSION_TOOL_DATA = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProfileAnalysisImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProfileAnalysisImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NEW_SESSION:
          serviceImpl.newSession((tensorflow.ProfilerAnalysis.NewProfileSessionRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.ProfilerAnalysis.NewProfileSessionResponse>) responseObserver);
          break;
        case METHODID_ENUM_SESSIONS:
          serviceImpl.enumSessions((tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.ProfilerAnalysis.EnumProfileSessionsAndToolsResponse>) responseObserver);
          break;
        case METHODID_GET_SESSION_TOOL_DATA:
          serviceImpl.getSessionToolData((tensorflow.ProfilerAnalysis.ProfileSessionDataRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.ProfilerAnalysis.ProfileSessionDataResponse>) responseObserver);
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

  private static abstract class ProfileAnalysisBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProfileAnalysisBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tensorflow.ProfilerAnalysis.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProfileAnalysis");
    }
  }

  private static final class ProfileAnalysisFileDescriptorSupplier
      extends ProfileAnalysisBaseDescriptorSupplier {
    ProfileAnalysisFileDescriptorSupplier() {}
  }

  private static final class ProfileAnalysisMethodDescriptorSupplier
      extends ProfileAnalysisBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProfileAnalysisMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProfileAnalysisGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProfileAnalysisFileDescriptorSupplier())
              .addMethod(getNewSessionMethod())
              .addMethod(getEnumSessionsMethod())
              .addMethod(getGetSessionToolDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
