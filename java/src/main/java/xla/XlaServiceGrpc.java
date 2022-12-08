package xla;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *&#47;//////////////////////
 * Global data requests
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: tensorflow/compiler/xla/rpc/xla_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class XlaServiceGrpc {

  private XlaServiceGrpc() {}

  public static final String SERVICE_NAME = "xla.XlaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<xla.Xla.UnregisterRequest,
      xla.Xla.UnregisterResponse> getUnregisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unregister",
      requestType = xla.Xla.UnregisterRequest.class,
      responseType = xla.Xla.UnregisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.UnregisterRequest,
      xla.Xla.UnregisterResponse> getUnregisterMethod() {
    io.grpc.MethodDescriptor<xla.Xla.UnregisterRequest, xla.Xla.UnregisterResponse> getUnregisterMethod;
    if ((getUnregisterMethod = XlaServiceGrpc.getUnregisterMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getUnregisterMethod = XlaServiceGrpc.getUnregisterMethod) == null) {
          XlaServiceGrpc.getUnregisterMethod = getUnregisterMethod =
              io.grpc.MethodDescriptor.<xla.Xla.UnregisterRequest, xla.Xla.UnregisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unregister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.UnregisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.UnregisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("Unregister"))
              .build();
        }
      }
    }
    return getUnregisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.DeconstructTupleRequest,
      xla.Xla.DeconstructTupleResponse> getDeconstructTupleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeconstructTuple",
      requestType = xla.Xla.DeconstructTupleRequest.class,
      responseType = xla.Xla.DeconstructTupleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.DeconstructTupleRequest,
      xla.Xla.DeconstructTupleResponse> getDeconstructTupleMethod() {
    io.grpc.MethodDescriptor<xla.Xla.DeconstructTupleRequest, xla.Xla.DeconstructTupleResponse> getDeconstructTupleMethod;
    if ((getDeconstructTupleMethod = XlaServiceGrpc.getDeconstructTupleMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getDeconstructTupleMethod = XlaServiceGrpc.getDeconstructTupleMethod) == null) {
          XlaServiceGrpc.getDeconstructTupleMethod = getDeconstructTupleMethod =
              io.grpc.MethodDescriptor.<xla.Xla.DeconstructTupleRequest, xla.Xla.DeconstructTupleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeconstructTuple"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.DeconstructTupleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.DeconstructTupleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("DeconstructTuple"))
              .build();
        }
      }
    }
    return getDeconstructTupleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.UnpackRequest,
      xla.Xla.UnpackResponse> getUnpackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unpack",
      requestType = xla.Xla.UnpackRequest.class,
      responseType = xla.Xla.UnpackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.UnpackRequest,
      xla.Xla.UnpackResponse> getUnpackMethod() {
    io.grpc.MethodDescriptor<xla.Xla.UnpackRequest, xla.Xla.UnpackResponse> getUnpackMethod;
    if ((getUnpackMethod = XlaServiceGrpc.getUnpackMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getUnpackMethod = XlaServiceGrpc.getUnpackMethod) == null) {
          XlaServiceGrpc.getUnpackMethod = getUnpackMethod =
              io.grpc.MethodDescriptor.<xla.Xla.UnpackRequest, xla.Xla.UnpackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unpack"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.UnpackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.UnpackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("Unpack"))
              .build();
        }
      }
    }
    return getUnpackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.GetShapeRequest,
      xla.Xla.GetShapeResponse> getGetShapeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetShape",
      requestType = xla.Xla.GetShapeRequest.class,
      responseType = xla.Xla.GetShapeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.GetShapeRequest,
      xla.Xla.GetShapeResponse> getGetShapeMethod() {
    io.grpc.MethodDescriptor<xla.Xla.GetShapeRequest, xla.Xla.GetShapeResponse> getGetShapeMethod;
    if ((getGetShapeMethod = XlaServiceGrpc.getGetShapeMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getGetShapeMethod = XlaServiceGrpc.getGetShapeMethod) == null) {
          XlaServiceGrpc.getGetShapeMethod = getGetShapeMethod =
              io.grpc.MethodDescriptor.<xla.Xla.GetShapeRequest, xla.Xla.GetShapeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetShape"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.GetShapeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.GetShapeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("GetShape"))
              .build();
        }
      }
    }
    return getGetShapeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.ComputationGraphStatsRequest,
      xla.Xla.ComputationStatsResponse> getGetComputationGraphStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetComputationGraphStats",
      requestType = xla.Xla.ComputationGraphStatsRequest.class,
      responseType = xla.Xla.ComputationStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.ComputationGraphStatsRequest,
      xla.Xla.ComputationStatsResponse> getGetComputationGraphStatsMethod() {
    io.grpc.MethodDescriptor<xla.Xla.ComputationGraphStatsRequest, xla.Xla.ComputationStatsResponse> getGetComputationGraphStatsMethod;
    if ((getGetComputationGraphStatsMethod = XlaServiceGrpc.getGetComputationGraphStatsMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getGetComputationGraphStatsMethod = XlaServiceGrpc.getGetComputationGraphStatsMethod) == null) {
          XlaServiceGrpc.getGetComputationGraphStatsMethod = getGetComputationGraphStatsMethod =
              io.grpc.MethodDescriptor.<xla.Xla.ComputationGraphStatsRequest, xla.Xla.ComputationStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetComputationGraphStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.ComputationGraphStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.ComputationStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("GetComputationGraphStats"))
              .build();
        }
      }
    }
    return getGetComputationGraphStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.LoadDataRequest,
      xla.Xla.LoadDataResponse> getLoadDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoadData",
      requestType = xla.Xla.LoadDataRequest.class,
      responseType = xla.Xla.LoadDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.LoadDataRequest,
      xla.Xla.LoadDataResponse> getLoadDataMethod() {
    io.grpc.MethodDescriptor<xla.Xla.LoadDataRequest, xla.Xla.LoadDataResponse> getLoadDataMethod;
    if ((getLoadDataMethod = XlaServiceGrpc.getLoadDataMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getLoadDataMethod = XlaServiceGrpc.getLoadDataMethod) == null) {
          XlaServiceGrpc.getLoadDataMethod = getLoadDataMethod =
              io.grpc.MethodDescriptor.<xla.Xla.LoadDataRequest, xla.Xla.LoadDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoadData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.LoadDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.LoadDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("LoadData"))
              .build();
        }
      }
    }
    return getLoadDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.TransferToClientRequest,
      xla.Xla.TransferToClientResponse> getTransferToClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferToClient",
      requestType = xla.Xla.TransferToClientRequest.class,
      responseType = xla.Xla.TransferToClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.TransferToClientRequest,
      xla.Xla.TransferToClientResponse> getTransferToClientMethod() {
    io.grpc.MethodDescriptor<xla.Xla.TransferToClientRequest, xla.Xla.TransferToClientResponse> getTransferToClientMethod;
    if ((getTransferToClientMethod = XlaServiceGrpc.getTransferToClientMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getTransferToClientMethod = XlaServiceGrpc.getTransferToClientMethod) == null) {
          XlaServiceGrpc.getTransferToClientMethod = getTransferToClientMethod =
              io.grpc.MethodDescriptor.<xla.Xla.TransferToClientRequest, xla.Xla.TransferToClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferToClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.TransferToClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.TransferToClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("TransferToClient"))
              .build();
        }
      }
    }
    return getTransferToClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.TransferToServerRequest,
      xla.Xla.TransferToServerResponse> getTransferToServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferToServer",
      requestType = xla.Xla.TransferToServerRequest.class,
      responseType = xla.Xla.TransferToServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.TransferToServerRequest,
      xla.Xla.TransferToServerResponse> getTransferToServerMethod() {
    io.grpc.MethodDescriptor<xla.Xla.TransferToServerRequest, xla.Xla.TransferToServerResponse> getTransferToServerMethod;
    if ((getTransferToServerMethod = XlaServiceGrpc.getTransferToServerMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getTransferToServerMethod = XlaServiceGrpc.getTransferToServerMethod) == null) {
          XlaServiceGrpc.getTransferToServerMethod = getTransferToServerMethod =
              io.grpc.MethodDescriptor.<xla.Xla.TransferToServerRequest, xla.Xla.TransferToServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferToServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.TransferToServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.TransferToServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("TransferToServer"))
              .build();
        }
      }
    }
    return getTransferToServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.TransferToInfeedRequest,
      xla.Xla.TransferToInfeedResponse> getTransferToInfeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferToInfeed",
      requestType = xla.Xla.TransferToInfeedRequest.class,
      responseType = xla.Xla.TransferToInfeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.TransferToInfeedRequest,
      xla.Xla.TransferToInfeedResponse> getTransferToInfeedMethod() {
    io.grpc.MethodDescriptor<xla.Xla.TransferToInfeedRequest, xla.Xla.TransferToInfeedResponse> getTransferToInfeedMethod;
    if ((getTransferToInfeedMethod = XlaServiceGrpc.getTransferToInfeedMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getTransferToInfeedMethod = XlaServiceGrpc.getTransferToInfeedMethod) == null) {
          XlaServiceGrpc.getTransferToInfeedMethod = getTransferToInfeedMethod =
              io.grpc.MethodDescriptor.<xla.Xla.TransferToInfeedRequest, xla.Xla.TransferToInfeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferToInfeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.TransferToInfeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.TransferToInfeedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("TransferToInfeed"))
              .build();
        }
      }
    }
    return getTransferToInfeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.TransferFromOutfeedRequest,
      xla.Xla.TransferFromOutfeedResponse> getTransferFromOutfeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferFromOutfeed",
      requestType = xla.Xla.TransferFromOutfeedRequest.class,
      responseType = xla.Xla.TransferFromOutfeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.TransferFromOutfeedRequest,
      xla.Xla.TransferFromOutfeedResponse> getTransferFromOutfeedMethod() {
    io.grpc.MethodDescriptor<xla.Xla.TransferFromOutfeedRequest, xla.Xla.TransferFromOutfeedResponse> getTransferFromOutfeedMethod;
    if ((getTransferFromOutfeedMethod = XlaServiceGrpc.getTransferFromOutfeedMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getTransferFromOutfeedMethod = XlaServiceGrpc.getTransferFromOutfeedMethod) == null) {
          XlaServiceGrpc.getTransferFromOutfeedMethod = getTransferFromOutfeedMethod =
              io.grpc.MethodDescriptor.<xla.Xla.TransferFromOutfeedRequest, xla.Xla.TransferFromOutfeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferFromOutfeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.TransferFromOutfeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.TransferFromOutfeedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("TransferFromOutfeed"))
              .build();
        }
      }
    }
    return getTransferFromOutfeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.ResetDeviceRequest,
      xla.Xla.ResetDeviceResponse> getResetDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetDevice",
      requestType = xla.Xla.ResetDeviceRequest.class,
      responseType = xla.Xla.ResetDeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.ResetDeviceRequest,
      xla.Xla.ResetDeviceResponse> getResetDeviceMethod() {
    io.grpc.MethodDescriptor<xla.Xla.ResetDeviceRequest, xla.Xla.ResetDeviceResponse> getResetDeviceMethod;
    if ((getResetDeviceMethod = XlaServiceGrpc.getResetDeviceMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getResetDeviceMethod = XlaServiceGrpc.getResetDeviceMethod) == null) {
          XlaServiceGrpc.getResetDeviceMethod = getResetDeviceMethod =
              io.grpc.MethodDescriptor.<xla.Xla.ResetDeviceRequest, xla.Xla.ResetDeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.ResetDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.ResetDeviceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("ResetDevice"))
              .build();
        }
      }
    }
    return getResetDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.ComputeConstantGraphRequest,
      xla.Xla.ComputeConstantResponse> getComputeConstantGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ComputeConstantGraph",
      requestType = xla.Xla.ComputeConstantGraphRequest.class,
      responseType = xla.Xla.ComputeConstantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.ComputeConstantGraphRequest,
      xla.Xla.ComputeConstantResponse> getComputeConstantGraphMethod() {
    io.grpc.MethodDescriptor<xla.Xla.ComputeConstantGraphRequest, xla.Xla.ComputeConstantResponse> getComputeConstantGraphMethod;
    if ((getComputeConstantGraphMethod = XlaServiceGrpc.getComputeConstantGraphMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getComputeConstantGraphMethod = XlaServiceGrpc.getComputeConstantGraphMethod) == null) {
          XlaServiceGrpc.getComputeConstantGraphMethod = getComputeConstantGraphMethod =
              io.grpc.MethodDescriptor.<xla.Xla.ComputeConstantGraphRequest, xla.Xla.ComputeConstantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ComputeConstantGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.ComputeConstantGraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.ComputeConstantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("ComputeConstantGraph"))
              .build();
        }
      }
    }
    return getComputeConstantGraphMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.GetDeviceHandlesRequest,
      xla.Xla.GetDeviceHandlesResponse> getGetDeviceHandlesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeviceHandles",
      requestType = xla.Xla.GetDeviceHandlesRequest.class,
      responseType = xla.Xla.GetDeviceHandlesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.GetDeviceHandlesRequest,
      xla.Xla.GetDeviceHandlesResponse> getGetDeviceHandlesMethod() {
    io.grpc.MethodDescriptor<xla.Xla.GetDeviceHandlesRequest, xla.Xla.GetDeviceHandlesResponse> getGetDeviceHandlesMethod;
    if ((getGetDeviceHandlesMethod = XlaServiceGrpc.getGetDeviceHandlesMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getGetDeviceHandlesMethod = XlaServiceGrpc.getGetDeviceHandlesMethod) == null) {
          XlaServiceGrpc.getGetDeviceHandlesMethod = getGetDeviceHandlesMethod =
              io.grpc.MethodDescriptor.<xla.Xla.GetDeviceHandlesRequest, xla.Xla.GetDeviceHandlesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDeviceHandles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.GetDeviceHandlesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.GetDeviceHandlesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("GetDeviceHandles"))
              .build();
        }
      }
    }
    return getGetDeviceHandlesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.CreateChannelHandleRequest,
      xla.Xla.CreateChannelHandleResponse> getCreateChannelHandleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateChannelHandle",
      requestType = xla.Xla.CreateChannelHandleRequest.class,
      responseType = xla.Xla.CreateChannelHandleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.CreateChannelHandleRequest,
      xla.Xla.CreateChannelHandleResponse> getCreateChannelHandleMethod() {
    io.grpc.MethodDescriptor<xla.Xla.CreateChannelHandleRequest, xla.Xla.CreateChannelHandleResponse> getCreateChannelHandleMethod;
    if ((getCreateChannelHandleMethod = XlaServiceGrpc.getCreateChannelHandleMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getCreateChannelHandleMethod = XlaServiceGrpc.getCreateChannelHandleMethod) == null) {
          XlaServiceGrpc.getCreateChannelHandleMethod = getCreateChannelHandleMethod =
              io.grpc.MethodDescriptor.<xla.Xla.CreateChannelHandleRequest, xla.Xla.CreateChannelHandleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateChannelHandle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.CreateChannelHandleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.CreateChannelHandleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("CreateChannelHandle"))
              .build();
        }
      }
    }
    return getCreateChannelHandleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.CompileRequest,
      xla.Xla.CompileResponse> getCompileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Compile",
      requestType = xla.Xla.CompileRequest.class,
      responseType = xla.Xla.CompileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.CompileRequest,
      xla.Xla.CompileResponse> getCompileMethod() {
    io.grpc.MethodDescriptor<xla.Xla.CompileRequest, xla.Xla.CompileResponse> getCompileMethod;
    if ((getCompileMethod = XlaServiceGrpc.getCompileMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getCompileMethod = XlaServiceGrpc.getCompileMethod) == null) {
          XlaServiceGrpc.getCompileMethod = getCompileMethod =
              io.grpc.MethodDescriptor.<xla.Xla.CompileRequest, xla.Xla.CompileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Compile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.CompileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.CompileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("Compile"))
              .build();
        }
      }
    }
    return getCompileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.ExecuteRequest,
      xla.Xla.ExecuteResponse> getExecuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Execute",
      requestType = xla.Xla.ExecuteRequest.class,
      responseType = xla.Xla.ExecuteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.ExecuteRequest,
      xla.Xla.ExecuteResponse> getExecuteMethod() {
    io.grpc.MethodDescriptor<xla.Xla.ExecuteRequest, xla.Xla.ExecuteResponse> getExecuteMethod;
    if ((getExecuteMethod = XlaServiceGrpc.getExecuteMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getExecuteMethod = XlaServiceGrpc.getExecuteMethod) == null) {
          XlaServiceGrpc.getExecuteMethod = getExecuteMethod =
              io.grpc.MethodDescriptor.<xla.Xla.ExecuteRequest, xla.Xla.ExecuteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Execute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.ExecuteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.ExecuteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("Execute"))
              .build();
        }
      }
    }
    return getExecuteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.ExecuteGraphParallelRequest,
      xla.Xla.ExecuteParallelResponse> getExecuteGraphParallelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteGraphParallel",
      requestType = xla.Xla.ExecuteGraphParallelRequest.class,
      responseType = xla.Xla.ExecuteParallelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.ExecuteGraphParallelRequest,
      xla.Xla.ExecuteParallelResponse> getExecuteGraphParallelMethod() {
    io.grpc.MethodDescriptor<xla.Xla.ExecuteGraphParallelRequest, xla.Xla.ExecuteParallelResponse> getExecuteGraphParallelMethod;
    if ((getExecuteGraphParallelMethod = XlaServiceGrpc.getExecuteGraphParallelMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getExecuteGraphParallelMethod = XlaServiceGrpc.getExecuteGraphParallelMethod) == null) {
          XlaServiceGrpc.getExecuteGraphParallelMethod = getExecuteGraphParallelMethod =
              io.grpc.MethodDescriptor.<xla.Xla.ExecuteGraphParallelRequest, xla.Xla.ExecuteParallelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteGraphParallel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.ExecuteGraphParallelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.ExecuteParallelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("ExecuteGraphParallel"))
              .build();
        }
      }
    }
    return getExecuteGraphParallelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xla.Xla.WaitForExecutionRequest,
      xla.Xla.WaitForExecutionResponse> getWaitForExecutionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WaitForExecution",
      requestType = xla.Xla.WaitForExecutionRequest.class,
      responseType = xla.Xla.WaitForExecutionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xla.Xla.WaitForExecutionRequest,
      xla.Xla.WaitForExecutionResponse> getWaitForExecutionMethod() {
    io.grpc.MethodDescriptor<xla.Xla.WaitForExecutionRequest, xla.Xla.WaitForExecutionResponse> getWaitForExecutionMethod;
    if ((getWaitForExecutionMethod = XlaServiceGrpc.getWaitForExecutionMethod) == null) {
      synchronized (XlaServiceGrpc.class) {
        if ((getWaitForExecutionMethod = XlaServiceGrpc.getWaitForExecutionMethod) == null) {
          XlaServiceGrpc.getWaitForExecutionMethod = getWaitForExecutionMethod =
              io.grpc.MethodDescriptor.<xla.Xla.WaitForExecutionRequest, xla.Xla.WaitForExecutionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WaitForExecution"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.WaitForExecutionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xla.Xla.WaitForExecutionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XlaServiceMethodDescriptorSupplier("WaitForExecution"))
              .build();
        }
      }
    }
    return getWaitForExecutionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static XlaServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<XlaServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<XlaServiceStub>() {
        @java.lang.Override
        public XlaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new XlaServiceStub(channel, callOptions);
        }
      };
    return XlaServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static XlaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<XlaServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<XlaServiceBlockingStub>() {
        @java.lang.Override
        public XlaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new XlaServiceBlockingStub(channel, callOptions);
        }
      };
    return XlaServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static XlaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<XlaServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<XlaServiceFutureStub>() {
        @java.lang.Override
        public XlaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new XlaServiceFutureStub(channel, callOptions);
        }
      };
    return XlaServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *&#47;//////////////////////
   * Global data requests
   * </pre>
   */
  public static abstract class XlaServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unregisters a global allocation.
     * If the handle given is not currently allocated, a NOT_FOUND status is
     * returned.
     * </pre>
     */
    public void unregister(xla.Xla.UnregisterRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.UnregisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnregisterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deconstructs a tuple. Returns a newly created GlobalDataHandle for each
     * element in the tuple.
     * </pre>
     */
    public void deconstructTuple(xla.Xla.DeconstructTupleRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.DeconstructTupleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeconstructTupleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unpack requests that a global data handle, with a tuple shape, has global
     * data handles created for each of its constituent members. This is the
     * equivalent of the "destructuring assignment" present in various programming
     * languages.
     * </pre>
     */
    public void unpack(xla.Xla.UnpackRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.UnpackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnpackMethod(), responseObserver);
    }

    /**
     * <pre>
     * Requests the shape of the referenced global data.
     * </pre>
     */
    public void getShape(xla.Xla.GetShapeRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.GetShapeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetShapeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Requests the statistics of the given computation.
     * </pre>
     */
    public void getComputationGraphStats(xla.Xla.ComputationGraphStatsRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.ComputationStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetComputationGraphStatsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Loads a variable number of values with a given element type from ColumnIO.
     * </pre>
     */
    public void loadData(xla.Xla.LoadDataRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.LoadDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoadDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transfers the given global data to the client in the form of a Literal.
     * </pre>
     */
    public void transferToClient(xla.Xla.TransferToClientRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.TransferToClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferToClientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transfers the given literal to the server to be stored in a global
     * allocation, which is returned.
     * </pre>
     */
    public void transferToServer(xla.Xla.TransferToServerRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.TransferToServerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferToServerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transfers the given literal to the Infeed buffer of the device.
     * </pre>
     */
    public void transferToInfeed(xla.Xla.TransferToInfeedRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.TransferToInfeedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferToInfeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transferred literal from the Outfeed buffer of the device.
     * </pre>
     */
    public void transferFromOutfeed(xla.Xla.TransferFromOutfeedRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.TransferFromOutfeedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferFromOutfeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resets the device, clearing all existing state on the device.
     * </pre>
     */
    public void resetDevice(xla.Xla.ResetDeviceRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.ResetDeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Computes the value of a constant expression. The request contains the
     * computation graph for the constant expression.
     * </pre>
     */
    public void computeConstantGraph(xla.Xla.ComputeConstantGraphRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.ComputeConstantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getComputeConstantGraphMethod(), responseObserver);
    }

    /**
     * <pre>
     * Requests one or more device handles from the target. The returned device
     * handles can be used to specify the device on which to execute computations
     * or transfer data.
     * </pre>
     */
    public void getDeviceHandles(xla.Xla.GetDeviceHandlesRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.GetDeviceHandlesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeviceHandlesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a channel handle that can be used to transfer data between
     * two computations via a pair of Send and Recv instructions.
     * </pre>
     */
    public void createChannelHandle(xla.Xla.CreateChannelHandleRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.CreateChannelHandleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateChannelHandleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Compiles the provided computation into executable. Returns the handle of
     * the executable.
     * </pre>
     */
    public void compile(xla.Xla.CompileRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.CompileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Invokes the provided executable with the provided global data passed as
     * immutable arguments. The request contains the handle to the executable.
     * Returns global data output and execution timing.
     * </pre>
     */
    public void execute(xla.Xla.ExecuteRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.ExecuteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Invokes the provided list of computations in parallel with the provided
     * global data for each computation. Returns a list of global data output and
     * execution timing.
     * </pre>
     */
    public void executeGraphParallel(xla.Xla.ExecuteGraphParallelRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.ExecuteParallelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteGraphParallelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Waits until the given execution (aysnchronously launched) is complete, and
     * returns the global data output.
     * </pre>
     */
    public void waitForExecution(xla.Xla.WaitForExecutionRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.WaitForExecutionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWaitForExecutionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUnregisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.UnregisterRequest,
                xla.Xla.UnregisterResponse>(
                  this, METHODID_UNREGISTER)))
          .addMethod(
            getDeconstructTupleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.DeconstructTupleRequest,
                xla.Xla.DeconstructTupleResponse>(
                  this, METHODID_DECONSTRUCT_TUPLE)))
          .addMethod(
            getUnpackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.UnpackRequest,
                xla.Xla.UnpackResponse>(
                  this, METHODID_UNPACK)))
          .addMethod(
            getGetShapeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.GetShapeRequest,
                xla.Xla.GetShapeResponse>(
                  this, METHODID_GET_SHAPE)))
          .addMethod(
            getGetComputationGraphStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.ComputationGraphStatsRequest,
                xla.Xla.ComputationStatsResponse>(
                  this, METHODID_GET_COMPUTATION_GRAPH_STATS)))
          .addMethod(
            getLoadDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.LoadDataRequest,
                xla.Xla.LoadDataResponse>(
                  this, METHODID_LOAD_DATA)))
          .addMethod(
            getTransferToClientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.TransferToClientRequest,
                xla.Xla.TransferToClientResponse>(
                  this, METHODID_TRANSFER_TO_CLIENT)))
          .addMethod(
            getTransferToServerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.TransferToServerRequest,
                xla.Xla.TransferToServerResponse>(
                  this, METHODID_TRANSFER_TO_SERVER)))
          .addMethod(
            getTransferToInfeedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.TransferToInfeedRequest,
                xla.Xla.TransferToInfeedResponse>(
                  this, METHODID_TRANSFER_TO_INFEED)))
          .addMethod(
            getTransferFromOutfeedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.TransferFromOutfeedRequest,
                xla.Xla.TransferFromOutfeedResponse>(
                  this, METHODID_TRANSFER_FROM_OUTFEED)))
          .addMethod(
            getResetDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.ResetDeviceRequest,
                xla.Xla.ResetDeviceResponse>(
                  this, METHODID_RESET_DEVICE)))
          .addMethod(
            getComputeConstantGraphMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.ComputeConstantGraphRequest,
                xla.Xla.ComputeConstantResponse>(
                  this, METHODID_COMPUTE_CONSTANT_GRAPH)))
          .addMethod(
            getGetDeviceHandlesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.GetDeviceHandlesRequest,
                xla.Xla.GetDeviceHandlesResponse>(
                  this, METHODID_GET_DEVICE_HANDLES)))
          .addMethod(
            getCreateChannelHandleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.CreateChannelHandleRequest,
                xla.Xla.CreateChannelHandleResponse>(
                  this, METHODID_CREATE_CHANNEL_HANDLE)))
          .addMethod(
            getCompileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.CompileRequest,
                xla.Xla.CompileResponse>(
                  this, METHODID_COMPILE)))
          .addMethod(
            getExecuteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.ExecuteRequest,
                xla.Xla.ExecuteResponse>(
                  this, METHODID_EXECUTE)))
          .addMethod(
            getExecuteGraphParallelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.ExecuteGraphParallelRequest,
                xla.Xla.ExecuteParallelResponse>(
                  this, METHODID_EXECUTE_GRAPH_PARALLEL)))
          .addMethod(
            getWaitForExecutionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                xla.Xla.WaitForExecutionRequest,
                xla.Xla.WaitForExecutionResponse>(
                  this, METHODID_WAIT_FOR_EXECUTION)))
          .build();
    }
  }

  /**
   * <pre>
   *&#47;//////////////////////
   * Global data requests
   * </pre>
   */
  public static final class XlaServiceStub extends io.grpc.stub.AbstractAsyncStub<XlaServiceStub> {
    private XlaServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected XlaServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new XlaServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unregisters a global allocation.
     * If the handle given is not currently allocated, a NOT_FOUND status is
     * returned.
     * </pre>
     */
    public void unregister(xla.Xla.UnregisterRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.UnregisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnregisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deconstructs a tuple. Returns a newly created GlobalDataHandle for each
     * element in the tuple.
     * </pre>
     */
    public void deconstructTuple(xla.Xla.DeconstructTupleRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.DeconstructTupleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeconstructTupleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unpack requests that a global data handle, with a tuple shape, has global
     * data handles created for each of its constituent members. This is the
     * equivalent of the "destructuring assignment" present in various programming
     * languages.
     * </pre>
     */
    public void unpack(xla.Xla.UnpackRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.UnpackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnpackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Requests the shape of the referenced global data.
     * </pre>
     */
    public void getShape(xla.Xla.GetShapeRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.GetShapeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetShapeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Requests the statistics of the given computation.
     * </pre>
     */
    public void getComputationGraphStats(xla.Xla.ComputationGraphStatsRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.ComputationStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetComputationGraphStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Loads a variable number of values with a given element type from ColumnIO.
     * </pre>
     */
    public void loadData(xla.Xla.LoadDataRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.LoadDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoadDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transfers the given global data to the client in the form of a Literal.
     * </pre>
     */
    public void transferToClient(xla.Xla.TransferToClientRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.TransferToClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferToClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transfers the given literal to the server to be stored in a global
     * allocation, which is returned.
     * </pre>
     */
    public void transferToServer(xla.Xla.TransferToServerRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.TransferToServerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferToServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transfers the given literal to the Infeed buffer of the device.
     * </pre>
     */
    public void transferToInfeed(xla.Xla.TransferToInfeedRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.TransferToInfeedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferToInfeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transferred literal from the Outfeed buffer of the device.
     * </pre>
     */
    public void transferFromOutfeed(xla.Xla.TransferFromOutfeedRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.TransferFromOutfeedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferFromOutfeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resets the device, clearing all existing state on the device.
     * </pre>
     */
    public void resetDevice(xla.Xla.ResetDeviceRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.ResetDeviceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Computes the value of a constant expression. The request contains the
     * computation graph for the constant expression.
     * </pre>
     */
    public void computeConstantGraph(xla.Xla.ComputeConstantGraphRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.ComputeConstantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getComputeConstantGraphMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Requests one or more device handles from the target. The returned device
     * handles can be used to specify the device on which to execute computations
     * or transfer data.
     * </pre>
     */
    public void getDeviceHandles(xla.Xla.GetDeviceHandlesRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.GetDeviceHandlesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeviceHandlesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a channel handle that can be used to transfer data between
     * two computations via a pair of Send and Recv instructions.
     * </pre>
     */
    public void createChannelHandle(xla.Xla.CreateChannelHandleRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.CreateChannelHandleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateChannelHandleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Compiles the provided computation into executable. Returns the handle of
     * the executable.
     * </pre>
     */
    public void compile(xla.Xla.CompileRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.CompileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Invokes the provided executable with the provided global data passed as
     * immutable arguments. The request contains the handle to the executable.
     * Returns global data output and execution timing.
     * </pre>
     */
    public void execute(xla.Xla.ExecuteRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.ExecuteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Invokes the provided list of computations in parallel with the provided
     * global data for each computation. Returns a list of global data output and
     * execution timing.
     * </pre>
     */
    public void executeGraphParallel(xla.Xla.ExecuteGraphParallelRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.ExecuteParallelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteGraphParallelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Waits until the given execution (aysnchronously launched) is complete, and
     * returns the global data output.
     * </pre>
     */
    public void waitForExecution(xla.Xla.WaitForExecutionRequest request,
        io.grpc.stub.StreamObserver<xla.Xla.WaitForExecutionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWaitForExecutionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *&#47;//////////////////////
   * Global data requests
   * </pre>
   */
  public static final class XlaServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<XlaServiceBlockingStub> {
    private XlaServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected XlaServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new XlaServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unregisters a global allocation.
     * If the handle given is not currently allocated, a NOT_FOUND status is
     * returned.
     * </pre>
     */
    public xla.Xla.UnregisterResponse unregister(xla.Xla.UnregisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnregisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deconstructs a tuple. Returns a newly created GlobalDataHandle for each
     * element in the tuple.
     * </pre>
     */
    public xla.Xla.DeconstructTupleResponse deconstructTuple(xla.Xla.DeconstructTupleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeconstructTupleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unpack requests that a global data handle, with a tuple shape, has global
     * data handles created for each of its constituent members. This is the
     * equivalent of the "destructuring assignment" present in various programming
     * languages.
     * </pre>
     */
    public xla.Xla.UnpackResponse unpack(xla.Xla.UnpackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnpackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Requests the shape of the referenced global data.
     * </pre>
     */
    public xla.Xla.GetShapeResponse getShape(xla.Xla.GetShapeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetShapeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Requests the statistics of the given computation.
     * </pre>
     */
    public xla.Xla.ComputationStatsResponse getComputationGraphStats(xla.Xla.ComputationGraphStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetComputationGraphStatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Loads a variable number of values with a given element type from ColumnIO.
     * </pre>
     */
    public xla.Xla.LoadDataResponse loadData(xla.Xla.LoadDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoadDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transfers the given global data to the client in the form of a Literal.
     * </pre>
     */
    public xla.Xla.TransferToClientResponse transferToClient(xla.Xla.TransferToClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferToClientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transfers the given literal to the server to be stored in a global
     * allocation, which is returned.
     * </pre>
     */
    public xla.Xla.TransferToServerResponse transferToServer(xla.Xla.TransferToServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferToServerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transfers the given literal to the Infeed buffer of the device.
     * </pre>
     */
    public xla.Xla.TransferToInfeedResponse transferToInfeed(xla.Xla.TransferToInfeedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferToInfeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transferred literal from the Outfeed buffer of the device.
     * </pre>
     */
    public xla.Xla.TransferFromOutfeedResponse transferFromOutfeed(xla.Xla.TransferFromOutfeedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferFromOutfeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resets the device, clearing all existing state on the device.
     * </pre>
     */
    public xla.Xla.ResetDeviceResponse resetDevice(xla.Xla.ResetDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Computes the value of a constant expression. The request contains the
     * computation graph for the constant expression.
     * </pre>
     */
    public xla.Xla.ComputeConstantResponse computeConstantGraph(xla.Xla.ComputeConstantGraphRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getComputeConstantGraphMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Requests one or more device handles from the target. The returned device
     * handles can be used to specify the device on which to execute computations
     * or transfer data.
     * </pre>
     */
    public xla.Xla.GetDeviceHandlesResponse getDeviceHandles(xla.Xla.GetDeviceHandlesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeviceHandlesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a channel handle that can be used to transfer data between
     * two computations via a pair of Send and Recv instructions.
     * </pre>
     */
    public xla.Xla.CreateChannelHandleResponse createChannelHandle(xla.Xla.CreateChannelHandleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateChannelHandleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compiles the provided computation into executable. Returns the handle of
     * the executable.
     * </pre>
     */
    public xla.Xla.CompileResponse compile(xla.Xla.CompileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Invokes the provided executable with the provided global data passed as
     * immutable arguments. The request contains the handle to the executable.
     * Returns global data output and execution timing.
     * </pre>
     */
    public xla.Xla.ExecuteResponse execute(xla.Xla.ExecuteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Invokes the provided list of computations in parallel with the provided
     * global data for each computation. Returns a list of global data output and
     * execution timing.
     * </pre>
     */
    public xla.Xla.ExecuteParallelResponse executeGraphParallel(xla.Xla.ExecuteGraphParallelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteGraphParallelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Waits until the given execution (aysnchronously launched) is complete, and
     * returns the global data output.
     * </pre>
     */
    public xla.Xla.WaitForExecutionResponse waitForExecution(xla.Xla.WaitForExecutionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWaitForExecutionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *&#47;//////////////////////
   * Global data requests
   * </pre>
   */
  public static final class XlaServiceFutureStub extends io.grpc.stub.AbstractFutureStub<XlaServiceFutureStub> {
    private XlaServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected XlaServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new XlaServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unregisters a global allocation.
     * If the handle given is not currently allocated, a NOT_FOUND status is
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.UnregisterResponse> unregister(
        xla.Xla.UnregisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnregisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deconstructs a tuple. Returns a newly created GlobalDataHandle for each
     * element in the tuple.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.DeconstructTupleResponse> deconstructTuple(
        xla.Xla.DeconstructTupleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeconstructTupleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unpack requests that a global data handle, with a tuple shape, has global
     * data handles created for each of its constituent members. This is the
     * equivalent of the "destructuring assignment" present in various programming
     * languages.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.UnpackResponse> unpack(
        xla.Xla.UnpackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnpackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Requests the shape of the referenced global data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.GetShapeResponse> getShape(
        xla.Xla.GetShapeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetShapeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Requests the statistics of the given computation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.ComputationStatsResponse> getComputationGraphStats(
        xla.Xla.ComputationGraphStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetComputationGraphStatsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Loads a variable number of values with a given element type from ColumnIO.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.LoadDataResponse> loadData(
        xla.Xla.LoadDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoadDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transfers the given global data to the client in the form of a Literal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.TransferToClientResponse> transferToClient(
        xla.Xla.TransferToClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferToClientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transfers the given literal to the server to be stored in a global
     * allocation, which is returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.TransferToServerResponse> transferToServer(
        xla.Xla.TransferToServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferToServerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transfers the given literal to the Infeed buffer of the device.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.TransferToInfeedResponse> transferToInfeed(
        xla.Xla.TransferToInfeedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferToInfeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transferred literal from the Outfeed buffer of the device.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.TransferFromOutfeedResponse> transferFromOutfeed(
        xla.Xla.TransferFromOutfeedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferFromOutfeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resets the device, clearing all existing state on the device.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.ResetDeviceResponse> resetDevice(
        xla.Xla.ResetDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Computes the value of a constant expression. The request contains the
     * computation graph for the constant expression.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.ComputeConstantResponse> computeConstantGraph(
        xla.Xla.ComputeConstantGraphRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getComputeConstantGraphMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Requests one or more device handles from the target. The returned device
     * handles can be used to specify the device on which to execute computations
     * or transfer data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.GetDeviceHandlesResponse> getDeviceHandles(
        xla.Xla.GetDeviceHandlesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeviceHandlesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a channel handle that can be used to transfer data between
     * two computations via a pair of Send and Recv instructions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.CreateChannelHandleResponse> createChannelHandle(
        xla.Xla.CreateChannelHandleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateChannelHandleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Compiles the provided computation into executable. Returns the handle of
     * the executable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.CompileResponse> compile(
        xla.Xla.CompileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Invokes the provided executable with the provided global data passed as
     * immutable arguments. The request contains the handle to the executable.
     * Returns global data output and execution timing.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.ExecuteResponse> execute(
        xla.Xla.ExecuteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Invokes the provided list of computations in parallel with the provided
     * global data for each computation. Returns a list of global data output and
     * execution timing.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.ExecuteParallelResponse> executeGraphParallel(
        xla.Xla.ExecuteGraphParallelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteGraphParallelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Waits until the given execution (aysnchronously launched) is complete, and
     * returns the global data output.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xla.Xla.WaitForExecutionResponse> waitForExecution(
        xla.Xla.WaitForExecutionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWaitForExecutionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNREGISTER = 0;
  private static final int METHODID_DECONSTRUCT_TUPLE = 1;
  private static final int METHODID_UNPACK = 2;
  private static final int METHODID_GET_SHAPE = 3;
  private static final int METHODID_GET_COMPUTATION_GRAPH_STATS = 4;
  private static final int METHODID_LOAD_DATA = 5;
  private static final int METHODID_TRANSFER_TO_CLIENT = 6;
  private static final int METHODID_TRANSFER_TO_SERVER = 7;
  private static final int METHODID_TRANSFER_TO_INFEED = 8;
  private static final int METHODID_TRANSFER_FROM_OUTFEED = 9;
  private static final int METHODID_RESET_DEVICE = 10;
  private static final int METHODID_COMPUTE_CONSTANT_GRAPH = 11;
  private static final int METHODID_GET_DEVICE_HANDLES = 12;
  private static final int METHODID_CREATE_CHANNEL_HANDLE = 13;
  private static final int METHODID_COMPILE = 14;
  private static final int METHODID_EXECUTE = 15;
  private static final int METHODID_EXECUTE_GRAPH_PARALLEL = 16;
  private static final int METHODID_WAIT_FOR_EXECUTION = 17;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final XlaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(XlaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNREGISTER:
          serviceImpl.unregister((xla.Xla.UnregisterRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.UnregisterResponse>) responseObserver);
          break;
        case METHODID_DECONSTRUCT_TUPLE:
          serviceImpl.deconstructTuple((xla.Xla.DeconstructTupleRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.DeconstructTupleResponse>) responseObserver);
          break;
        case METHODID_UNPACK:
          serviceImpl.unpack((xla.Xla.UnpackRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.UnpackResponse>) responseObserver);
          break;
        case METHODID_GET_SHAPE:
          serviceImpl.getShape((xla.Xla.GetShapeRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.GetShapeResponse>) responseObserver);
          break;
        case METHODID_GET_COMPUTATION_GRAPH_STATS:
          serviceImpl.getComputationGraphStats((xla.Xla.ComputationGraphStatsRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.ComputationStatsResponse>) responseObserver);
          break;
        case METHODID_LOAD_DATA:
          serviceImpl.loadData((xla.Xla.LoadDataRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.LoadDataResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_TO_CLIENT:
          serviceImpl.transferToClient((xla.Xla.TransferToClientRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.TransferToClientResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_TO_SERVER:
          serviceImpl.transferToServer((xla.Xla.TransferToServerRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.TransferToServerResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_TO_INFEED:
          serviceImpl.transferToInfeed((xla.Xla.TransferToInfeedRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.TransferToInfeedResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_FROM_OUTFEED:
          serviceImpl.transferFromOutfeed((xla.Xla.TransferFromOutfeedRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.TransferFromOutfeedResponse>) responseObserver);
          break;
        case METHODID_RESET_DEVICE:
          serviceImpl.resetDevice((xla.Xla.ResetDeviceRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.ResetDeviceResponse>) responseObserver);
          break;
        case METHODID_COMPUTE_CONSTANT_GRAPH:
          serviceImpl.computeConstantGraph((xla.Xla.ComputeConstantGraphRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.ComputeConstantResponse>) responseObserver);
          break;
        case METHODID_GET_DEVICE_HANDLES:
          serviceImpl.getDeviceHandles((xla.Xla.GetDeviceHandlesRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.GetDeviceHandlesResponse>) responseObserver);
          break;
        case METHODID_CREATE_CHANNEL_HANDLE:
          serviceImpl.createChannelHandle((xla.Xla.CreateChannelHandleRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.CreateChannelHandleResponse>) responseObserver);
          break;
        case METHODID_COMPILE:
          serviceImpl.compile((xla.Xla.CompileRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.CompileResponse>) responseObserver);
          break;
        case METHODID_EXECUTE:
          serviceImpl.execute((xla.Xla.ExecuteRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.ExecuteResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_GRAPH_PARALLEL:
          serviceImpl.executeGraphParallel((xla.Xla.ExecuteGraphParallelRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.ExecuteParallelResponse>) responseObserver);
          break;
        case METHODID_WAIT_FOR_EXECUTION:
          serviceImpl.waitForExecution((xla.Xla.WaitForExecutionRequest) request,
              (io.grpc.stub.StreamObserver<xla.Xla.WaitForExecutionResponse>) responseObserver);
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

  private static abstract class XlaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    XlaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return xla.XlaServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("XlaService");
    }
  }

  private static final class XlaServiceFileDescriptorSupplier
      extends XlaServiceBaseDescriptorSupplier {
    XlaServiceFileDescriptorSupplier() {}
  }

  private static final class XlaServiceMethodDescriptorSupplier
      extends XlaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    XlaServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (XlaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new XlaServiceFileDescriptorSupplier())
              .addMethod(getUnregisterMethod())
              .addMethod(getDeconstructTupleMethod())
              .addMethod(getUnpackMethod())
              .addMethod(getGetShapeMethod())
              .addMethod(getGetComputationGraphStatsMethod())
              .addMethod(getLoadDataMethod())
              .addMethod(getTransferToClientMethod())
              .addMethod(getTransferToServerMethod())
              .addMethod(getTransferToInfeedMethod())
              .addMethod(getTransferFromOutfeedMethod())
              .addMethod(getResetDeviceMethod())
              .addMethod(getComputeConstantGraphMethod())
              .addMethod(getGetDeviceHandlesMethod())
              .addMethod(getCreateChannelHandleMethod())
              .addMethod(getCompileMethod())
              .addMethod(getExecuteMethod())
              .addMethod(getExecuteGraphParallelMethod())
              .addMethod(getWaitForExecutionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
