// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/compiler/xla/rpc/xla_service.proto

package xla;

public final class XlaServiceOuterClass {
  private XlaServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-tensorflow/compiler/xla/rpc/xla_servic" +
      "e.proto\022\003xla\032!tensorflow/compiler/xla/xl" +
      "a.proto2\352\n\n\nXlaService\022?\n\nUnregister\022\026.x" +
      "la.UnregisterRequest\032\027.xla.UnregisterRes" +
      "ponse\"\000\022Q\n\020DeconstructTuple\022\034.xla.Decons" +
      "tructTupleRequest\032\035.xla.DeconstructTuple" +
      "Response\"\000\0223\n\006Unpack\022\022.xla.UnpackRequest" +
      "\032\023.xla.UnpackResponse\"\000\0229\n\010GetShape\022\024.xl" +
      "a.GetShapeRequest\032\025.xla.GetShapeResponse" +
      "\"\000\022^\n\030GetComputationGraphStats\022!.xla.Com" +
      "putationGraphStatsRequest\032\035.xla.Computat" +
      "ionStatsResponse\"\000\0229\n\010LoadData\022\024.xla.Loa" +
      "dDataRequest\032\025.xla.LoadDataResponse\"\000\022Q\n" +
      "\020TransferToClient\022\034.xla.TransferToClient" +
      "Request\032\035.xla.TransferToClientResponse\"\000" +
      "\022Q\n\020TransferToServer\022\034.xla.TransferToSer" +
      "verRequest\032\035.xla.TransferToServerRespons" +
      "e\"\000\022Q\n\020TransferToInfeed\022\034.xla.TransferTo" +
      "InfeedRequest\032\035.xla.TransferToInfeedResp" +
      "onse\"\000\022Z\n\023TransferFromOutfeed\022\037.xla.Tran" +
      "sferFromOutfeedRequest\032 .xla.TransferFro" +
      "mOutfeedResponse\"\000\022B\n\013ResetDevice\022\027.xla." +
      "ResetDeviceRequest\032\030.xla.ResetDeviceResp" +
      "onse\"\000\022X\n\024ComputeConstantGraph\022 .xla.Com" +
      "puteConstantGraphRequest\032\034.xla.ComputeCo" +
      "nstantResponse\"\000\022Q\n\020GetDeviceHandles\022\034.x" +
      "la.GetDeviceHandlesRequest\032\035.xla.GetDevi" +
      "ceHandlesResponse\"\000\022Z\n\023CreateChannelHand" +
      "le\022\037.xla.CreateChannelHandleRequest\032 .xl" +
      "a.CreateChannelHandleResponse\"\000\0226\n\007Compi" +
      "le\022\023.xla.CompileRequest\032\024.xla.CompileRes" +
      "ponse\"\000\0226\n\007Execute\022\023.xla.ExecuteRequest\032" +
      "\024.xla.ExecuteResponse\"\000\022X\n\024ExecuteGraphP" +
      "arallel\022 .xla.ExecuteGraphParallelReques" +
      "t\032\034.xla.ExecuteParallelResponse\"\000\022Q\n\020Wai" +
      "tForExecution\022\034.xla.WaitForExecutionRequ" +
      "est\032\035.xla.WaitForExecutionResponse\"\000b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          xla.Xla.getDescriptor(),
        });
    xla.Xla.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
