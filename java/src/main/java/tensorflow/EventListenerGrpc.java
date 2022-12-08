package tensorflow;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * EventListener: Receives Event protos, e.g., from debugged TensorFlow
 * runtime(s).
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: tensorflow/core/debug/debug_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EventListenerGrpc {

  private EventListenerGrpc() {}

  public static final String SERVICE_NAME = "tensorflow.EventListener";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.tensorflow.util.Event,
      tensorflow.DebugService.EventReply> getSendEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEvents",
      requestType = org.tensorflow.util.Event.class,
      responseType = tensorflow.DebugService.EventReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.tensorflow.util.Event,
      tensorflow.DebugService.EventReply> getSendEventsMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.util.Event, tensorflow.DebugService.EventReply> getSendEventsMethod;
    if ((getSendEventsMethod = EventListenerGrpc.getSendEventsMethod) == null) {
      synchronized (EventListenerGrpc.class) {
        if ((getSendEventsMethod = EventListenerGrpc.getSendEventsMethod) == null) {
          EventListenerGrpc.getSendEventsMethod = getSendEventsMethod =
              io.grpc.MethodDescriptor.<org.tensorflow.util.Event, tensorflow.DebugService.EventReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.util.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.DebugService.EventReply.getDefaultInstance()))
              .setSchemaDescriptor(new EventListenerMethodDescriptorSupplier("SendEvents"))
              .build();
        }
      }
    }
    return getSendEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tensorflow.DebugService.CallTraceback,
      tensorflow.DebugService.EventReply> getSendTracebacksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendTracebacks",
      requestType = tensorflow.DebugService.CallTraceback.class,
      responseType = tensorflow.DebugService.EventReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.DebugService.CallTraceback,
      tensorflow.DebugService.EventReply> getSendTracebacksMethod() {
    io.grpc.MethodDescriptor<tensorflow.DebugService.CallTraceback, tensorflow.DebugService.EventReply> getSendTracebacksMethod;
    if ((getSendTracebacksMethod = EventListenerGrpc.getSendTracebacksMethod) == null) {
      synchronized (EventListenerGrpc.class) {
        if ((getSendTracebacksMethod = EventListenerGrpc.getSendTracebacksMethod) == null) {
          EventListenerGrpc.getSendTracebacksMethod = getSendTracebacksMethod =
              io.grpc.MethodDescriptor.<tensorflow.DebugService.CallTraceback, tensorflow.DebugService.EventReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendTracebacks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.DebugService.CallTraceback.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.DebugService.EventReply.getDefaultInstance()))
              .setSchemaDescriptor(new EventListenerMethodDescriptorSupplier("SendTracebacks"))
              .build();
        }
      }
    }
    return getSendTracebacksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tensorflow.framework.DebuggedSourceFiles,
      tensorflow.DebugService.EventReply> getSendSourceFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendSourceFiles",
      requestType = org.tensorflow.framework.DebuggedSourceFiles.class,
      responseType = tensorflow.DebugService.EventReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tensorflow.framework.DebuggedSourceFiles,
      tensorflow.DebugService.EventReply> getSendSourceFilesMethod() {
    io.grpc.MethodDescriptor<org.tensorflow.framework.DebuggedSourceFiles, tensorflow.DebugService.EventReply> getSendSourceFilesMethod;
    if ((getSendSourceFilesMethod = EventListenerGrpc.getSendSourceFilesMethod) == null) {
      synchronized (EventListenerGrpc.class) {
        if ((getSendSourceFilesMethod = EventListenerGrpc.getSendSourceFilesMethod) == null) {
          EventListenerGrpc.getSendSourceFilesMethod = getSendSourceFilesMethod =
              io.grpc.MethodDescriptor.<org.tensorflow.framework.DebuggedSourceFiles, tensorflow.DebugService.EventReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendSourceFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tensorflow.framework.DebuggedSourceFiles.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.DebugService.EventReply.getDefaultInstance()))
              .setSchemaDescriptor(new EventListenerMethodDescriptorSupplier("SendSourceFiles"))
              .build();
        }
      }
    }
    return getSendSourceFilesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventListenerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventListenerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventListenerStub>() {
        @java.lang.Override
        public EventListenerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventListenerStub(channel, callOptions);
        }
      };
    return EventListenerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventListenerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventListenerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventListenerBlockingStub>() {
        @java.lang.Override
        public EventListenerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventListenerBlockingStub(channel, callOptions);
        }
      };
    return EventListenerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventListenerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventListenerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventListenerFutureStub>() {
        @java.lang.Override
        public EventListenerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventListenerFutureStub(channel, callOptions);
        }
      };
    return EventListenerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * EventListener: Receives Event protos, e.g., from debugged TensorFlow
   * runtime(s).
   * </pre>
   */
  public static abstract class EventListenerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Client(s) can use this RPC method to send the EventListener Event protos.
     * The Event protos can hold information such as:
     *   1) intermediate tensors from a debugged graph being executed, which can
     *      be sent from DebugIdentity ops configured with grpc URLs.
     *   2) GraphDefs of partition graphs, which can be sent from special debug
     *      ops that get executed immediately after the beginning of the graph
     *      execution.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.tensorflow.util.Event> sendEvents(
        io.grpc.stub.StreamObserver<tensorflow.DebugService.EventReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send the tracebacks of a TensorFlow execution call.
     * </pre>
     */
    public void sendTracebacks(tensorflow.DebugService.CallTraceback request,
        io.grpc.stub.StreamObserver<tensorflow.DebugService.EventReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendTracebacksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send a collection of source code files being debugged.
     * </pre>
     */
    public void sendSourceFiles(org.tensorflow.framework.DebuggedSourceFiles request,
        io.grpc.stub.StreamObserver<tensorflow.DebugService.EventReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendSourceFilesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendEventsMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.tensorflow.util.Event,
                tensorflow.DebugService.EventReply>(
                  this, METHODID_SEND_EVENTS)))
          .addMethod(
            getSendTracebacksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tensorflow.DebugService.CallTraceback,
                tensorflow.DebugService.EventReply>(
                  this, METHODID_SEND_TRACEBACKS)))
          .addMethod(
            getSendSourceFilesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tensorflow.framework.DebuggedSourceFiles,
                tensorflow.DebugService.EventReply>(
                  this, METHODID_SEND_SOURCE_FILES)))
          .build();
    }
  }

  /**
   * <pre>
   * EventListener: Receives Event protos, e.g., from debugged TensorFlow
   * runtime(s).
   * </pre>
   */
  public static final class EventListenerStub extends io.grpc.stub.AbstractAsyncStub<EventListenerStub> {
    private EventListenerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventListenerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventListenerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client(s) can use this RPC method to send the EventListener Event protos.
     * The Event protos can hold information such as:
     *   1) intermediate tensors from a debugged graph being executed, which can
     *      be sent from DebugIdentity ops configured with grpc URLs.
     *   2) GraphDefs of partition graphs, which can be sent from special debug
     *      ops that get executed immediately after the beginning of the graph
     *      execution.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.tensorflow.util.Event> sendEvents(
        io.grpc.stub.StreamObserver<tensorflow.DebugService.EventReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSendEventsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Send the tracebacks of a TensorFlow execution call.
     * </pre>
     */
    public void sendTracebacks(tensorflow.DebugService.CallTraceback request,
        io.grpc.stub.StreamObserver<tensorflow.DebugService.EventReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendTracebacksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send a collection of source code files being debugged.
     * </pre>
     */
    public void sendSourceFiles(org.tensorflow.framework.DebuggedSourceFiles request,
        io.grpc.stub.StreamObserver<tensorflow.DebugService.EventReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendSourceFilesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * EventListener: Receives Event protos, e.g., from debugged TensorFlow
   * runtime(s).
   * </pre>
   */
  public static final class EventListenerBlockingStub extends io.grpc.stub.AbstractBlockingStub<EventListenerBlockingStub> {
    private EventListenerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventListenerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventListenerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send the tracebacks of a TensorFlow execution call.
     * </pre>
     */
    public tensorflow.DebugService.EventReply sendTracebacks(tensorflow.DebugService.CallTraceback request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendTracebacksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a collection of source code files being debugged.
     * </pre>
     */
    public tensorflow.DebugService.EventReply sendSourceFiles(org.tensorflow.framework.DebuggedSourceFiles request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendSourceFilesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * EventListener: Receives Event protos, e.g., from debugged TensorFlow
   * runtime(s).
   * </pre>
   */
  public static final class EventListenerFutureStub extends io.grpc.stub.AbstractFutureStub<EventListenerFutureStub> {
    private EventListenerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventListenerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventListenerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send the tracebacks of a TensorFlow execution call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.DebugService.EventReply> sendTracebacks(
        tensorflow.DebugService.CallTraceback request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendTracebacksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send a collection of source code files being debugged.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.DebugService.EventReply> sendSourceFiles(
        org.tensorflow.framework.DebuggedSourceFiles request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendSourceFilesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_TRACEBACKS = 0;
  private static final int METHODID_SEND_SOURCE_FILES = 1;
  private static final int METHODID_SEND_EVENTS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventListenerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventListenerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_TRACEBACKS:
          serviceImpl.sendTracebacks((tensorflow.DebugService.CallTraceback) request,
              (io.grpc.stub.StreamObserver<tensorflow.DebugService.EventReply>) responseObserver);
          break;
        case METHODID_SEND_SOURCE_FILES:
          serviceImpl.sendSourceFiles((org.tensorflow.framework.DebuggedSourceFiles) request,
              (io.grpc.stub.StreamObserver<tensorflow.DebugService.EventReply>) responseObserver);
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
        case METHODID_SEND_EVENTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendEvents(
              (io.grpc.stub.StreamObserver<tensorflow.DebugService.EventReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EventListenerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventListenerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tensorflow.DebugService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventListener");
    }
  }

  private static final class EventListenerFileDescriptorSupplier
      extends EventListenerBaseDescriptorSupplier {
    EventListenerFileDescriptorSupplier() {}
  }

  private static final class EventListenerMethodDescriptorSupplier
      extends EventListenerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventListenerMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventListenerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventListenerFileDescriptorSupplier())
              .addMethod(getSendEventsMethod())
              .addMethod(getSendTracebacksMethod())
              .addMethod(getSendSourceFilesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
