// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/tensorflow_server.proto

package org.tensorflow.distruntime;

public final class ServerProtos {
  private ServerProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ServerDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ServerDef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0tensorflow/core/protobuf/tensorflow_se" +
      "rver.proto\022\ntensorflow\032&tensorflow/core/" +
      "protobuf/cluster.proto\032%tensorflow/core/" +
      "protobuf/config.proto\032-tensorflow/core/p" +
      "rotobuf/device_filters.proto\"\365\001\n\tServerD" +
      "ef\022\'\n\007cluster\030\001 \001(\0132\026.tensorflow.Cluster" +
      "Def\022\020\n\010job_name\030\002 \001(\t\022\022\n\ntask_index\030\003 \001(" +
      "\005\0227\n\026default_session_config\030\004 \001(\0132\027.tens" +
      "orflow.ConfigProto\022\020\n\010protocol\030\005 \001(\t\022\014\n\004" +
      "port\030\006 \001(\005\022@\n\026cluster_device_filters\030\007 \001" +
      "(\0132 .tensorflow.ClusterDeviceFiltersB\206\001\n" +
      "\032org.tensorflow.distruntimeB\014ServerProto" +
      "sP\001ZUgithub.com/tensorflow/tensorflow/te" +
      "nsorflow/go/core/protobuf/for_core_proto" +
      "s_go_proto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.distruntime.ClusterProtos.getDescriptor(),
          org.tensorflow.framework.ConfigProtos.getDescriptor(),
          org.tensorflow.distruntime.DeviceFiltersProtos.getDescriptor(),
        });
    internal_static_tensorflow_ServerDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_ServerDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ServerDef_descriptor,
        new java.lang.String[] { "Cluster", "JobName", "TaskIndex", "DefaultSessionConfig", "Protocol", "Port", "ClusterDeviceFilters", });
    org.tensorflow.distruntime.ClusterProtos.getDescriptor();
    org.tensorflow.framework.ConfigProtos.getDescriptor();
    org.tensorflow.distruntime.DeviceFiltersProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}