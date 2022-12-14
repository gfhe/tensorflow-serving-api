// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/util/test_log.proto

package org.tensorflow.util.testlog;

public final class TestLogProtos {
  private TestLogProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_EntryValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_EntryValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_MetricEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_MetricEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_BenchmarkEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_BenchmarkEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_BenchmarkEntry_ExtrasEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_BenchmarkEntry_ExtrasEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_BenchmarkEntries_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_BenchmarkEntries_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_BuildConfiguration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_BuildConfiguration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CommitId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CommitId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CPUInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CPUInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CPUInfo_CacheSizeEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CPUInfo_CacheSizeEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_MemoryInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_MemoryInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GPUInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GPUInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_PlatformInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_PlatformInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_AvailableDeviceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_AvailableDeviceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_MachineConfiguration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_MachineConfiguration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunConfiguration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunConfiguration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunConfiguration_EnvVarsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunConfiguration_EnvVarsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_TestResults_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_TestResults_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#tensorflow/core/util/test_log.proto\022\nt" +
      "ensorflow\032\031google/protobuf/any.proto\032\036go" +
      "ogle/protobuf/wrappers.proto\"D\n\nEntryVal" +
      "ue\022\026\n\014double_value\030\001 \001(\001H\000\022\026\n\014string_val" +
      "ue\030\002 \001(\tH\000B\006\n\004kind\"\214\001\n\013MetricEntry\022\014\n\004na" +
      "me\030\001 \001(\t\022\r\n\005value\030\002 \001(\001\022/\n\tmin_value\030\003 \001" +
      "(\0132\034.google.protobuf.DoubleValue\022/\n\tmax_" +
      "value\030\004 \001(\0132\034.google.protobuf.DoubleValu" +
      "e\"\217\002\n\016BenchmarkEntry\022\014\n\004name\030\001 \001(\t\022\r\n\005it" +
      "ers\030\002 \001(\003\022\020\n\010cpu_time\030\003 \001(\001\022\021\n\twall_time" +
      "\030\004 \001(\001\022\022\n\nthroughput\030\005 \001(\001\0226\n\006extras\030\006 \003" +
      "(\0132&.tensorflow.BenchmarkEntry.ExtrasEnt" +
      "ry\022(\n\007metrics\030\007 \003(\0132\027.tensorflow.MetricE" +
      "ntry\032E\n\013ExtrasEntry\022\013\n\003key\030\001 \001(\t\022%\n\005valu" +
      "e\030\002 \001(\0132\026.tensorflow.EntryValue:\0028\001\"=\n\020B" +
      "enchmarkEntries\022)\n\005entry\030\001 \003(\0132\032.tensorf" +
      "low.BenchmarkEntry\"B\n\022BuildConfiguration" +
      "\022\014\n\004mode\030\001 \001(\t\022\020\n\010cc_flags\030\002 \003(\t\022\014\n\004opts" +
      "\030\003 \003(\t\"f\n\010CommitId\022\024\n\nchangelist\030\001 \001(\003H\000" +
      "\022\016\n\004hash\030\002 \001(\tH\000\022\020\n\010snapshot\030\003 \001(\t\022\032\n\022pe" +
      "nding_changelist\030\004 \001(\003B\006\n\004kind\"\336\001\n\007CPUIn" +
      "fo\022\021\n\tnum_cores\030\001 \001(\003\022\031\n\021num_cores_allow" +
      "ed\030\002 \001(\003\022\023\n\013mhz_per_cpu\030\003 \001(\001\022\020\n\010cpu_inf" +
      "o\030\004 \001(\t\022\024\n\014cpu_governor\030\005 \001(\t\0226\n\ncache_s" +
      "ize\030\006 \003(\0132\".tensorflow.CPUInfo.CacheSize" +
      "Entry\0320\n\016CacheSizeEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005" +
      "value\030\002 \001(\003:\0028\001\".\n\nMemoryInfo\022\r\n\005total\030\001" +
      " \001(\003\022\021\n\tavailable\030\002 \001(\003\"6\n\007GPUInfo\022\r\n\005mo" +
      "del\030\001 \001(\t\022\014\n\004uuid\030\002 \001(\t\022\016\n\006bus_id\030\003 \001(\t\"" +
      "p\n\014PlatformInfo\022\014\n\004bits\030\001 \001(\t\022\017\n\007linkage" +
      "\030\002 \001(\t\022\017\n\007machine\030\003 \001(\t\022\017\n\007release\030\004 \001(\t" +
      "\022\016\n\006system\030\005 \001(\t\022\017\n\007version\030\006 \001(\t\"e\n\023Ava" +
      "ilableDeviceInfo\022\014\n\004name\030\001 \001(\t\022\014\n\004type\030\002" +
      " \001(\t\022\024\n\014memory_limit\030\003 \001(\003\022\034\n\024physical_d" +
      "escription\030\004 \001(\t\"\263\002\n\024MachineConfiguratio" +
      "n\022\020\n\010hostname\030\001 \001(\t\022\031\n\021serial_identifier" +
      "\030\007 \001(\t\022/\n\rplatform_info\030\002 \001(\0132\030.tensorfl" +
      "ow.PlatformInfo\022%\n\010cpu_info\030\003 \001(\0132\023.tens" +
      "orflow.CPUInfo\022)\n\013device_info\030\004 \003(\0132\024.go" +
      "ogle.protobuf.Any\022>\n\025available_device_in" +
      "fo\030\005 \003(\0132\037.tensorflow.AvailableDeviceInf" +
      "o\022+\n\013memory_info\030\006 \001(\0132\026.tensorflow.Memo" +
      "ryInfo\"\221\001\n\020RunConfiguration\022\020\n\010argument\030" +
      "\001 \003(\t\022;\n\010env_vars\030\002 \003(\0132).tensorflow.Run" +
      "Configuration.EnvVarsEntry\032.\n\014EnvVarsEnt" +
      "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\320\004\n\013T" +
      "estResults\022\016\n\006target\030\001 \001(\t\022-\n\007entries\030\002 " +
      "\001(\0132\034.tensorflow.BenchmarkEntries\022;\n\023bui" +
      "ld_configuration\030\003 \001(\0132\036.tensorflow.Buil" +
      "dConfiguration\022\'\n\tcommit_id\030\004 \001(\0132\024.tens" +
      "orflow.CommitId\022\022\n\nstart_time\030\005 \001(\003\022\020\n\010r" +
      "un_time\030\006 \001(\001\022?\n\025machine_configuration\030\007" +
      " \001(\0132 .tensorflow.MachineConfiguration\0227" +
      "\n\021run_configuration\030\010 \001(\0132\034.tensorflow.R" +
      "unConfiguration\022\014\n\004name\030\t \001(\t\022=\n\016benchma" +
      "rk_type\030\n \001(\0162%.tensorflow.TestResults.B" +
      "enchmarkType\022\020\n\010run_mode\030\013 \001(\t\022\022\n\ntf_ver" +
      "sion\030\014 \001(\t\"\210\001\n\rBenchmarkType\022\013\n\007UNKNOWN\020" +
      "\000\022\026\n\022CPP_MICROBENCHMARK\020\001\022\024\n\020PYTHON_BENC" +
      "HMARK\020\002\022\025\n\021ANDROID_BENCHMARK\020\003\022\022\n\016EDGE_B" +
      "ENCHMARK\020\004\022\021\n\rIOS_BENCHMARK\020\005B1\n\033org.ten" +
      "sorflow.util.testlogB\rTestLogProtosP\001\370\001\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_tensorflow_EntryValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_EntryValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_EntryValue_descriptor,
        new java.lang.String[] { "DoubleValue", "StringValue", "Kind", });
    internal_static_tensorflow_MetricEntry_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_MetricEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_MetricEntry_descriptor,
        new java.lang.String[] { "Name", "Value", "MinValue", "MaxValue", });
    internal_static_tensorflow_BenchmarkEntry_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_BenchmarkEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_BenchmarkEntry_descriptor,
        new java.lang.String[] { "Name", "Iters", "CpuTime", "WallTime", "Throughput", "Extras", "Metrics", });
    internal_static_tensorflow_BenchmarkEntry_ExtrasEntry_descriptor =
      internal_static_tensorflow_BenchmarkEntry_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_BenchmarkEntry_ExtrasEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_BenchmarkEntry_ExtrasEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_BenchmarkEntries_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_BenchmarkEntries_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_BenchmarkEntries_descriptor,
        new java.lang.String[] { "Entry", });
    internal_static_tensorflow_BuildConfiguration_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_BuildConfiguration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_BuildConfiguration_descriptor,
        new java.lang.String[] { "Mode", "CcFlags", "Opts", });
    internal_static_tensorflow_CommitId_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_CommitId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CommitId_descriptor,
        new java.lang.String[] { "Changelist", "Hash", "Snapshot", "PendingChangelist", "Kind", });
    internal_static_tensorflow_CPUInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_CPUInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CPUInfo_descriptor,
        new java.lang.String[] { "NumCores", "NumCoresAllowed", "MhzPerCpu", "CpuInfo", "CpuGovernor", "CacheSize", });
    internal_static_tensorflow_CPUInfo_CacheSizeEntry_descriptor =
      internal_static_tensorflow_CPUInfo_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_CPUInfo_CacheSizeEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CPUInfo_CacheSizeEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_MemoryInfo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tensorflow_MemoryInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_MemoryInfo_descriptor,
        new java.lang.String[] { "Total", "Available", });
    internal_static_tensorflow_GPUInfo_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_tensorflow_GPUInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GPUInfo_descriptor,
        new java.lang.String[] { "Model", "Uuid", "BusId", });
    internal_static_tensorflow_PlatformInfo_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_tensorflow_PlatformInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_PlatformInfo_descriptor,
        new java.lang.String[] { "Bits", "Linkage", "Machine", "Release", "System", "Version", });
    internal_static_tensorflow_AvailableDeviceInfo_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_tensorflow_AvailableDeviceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_AvailableDeviceInfo_descriptor,
        new java.lang.String[] { "Name", "Type", "MemoryLimit", "PhysicalDescription", });
    internal_static_tensorflow_MachineConfiguration_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_tensorflow_MachineConfiguration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_MachineConfiguration_descriptor,
        new java.lang.String[] { "Hostname", "SerialIdentifier", "PlatformInfo", "CpuInfo", "DeviceInfo", "AvailableDeviceInfo", "MemoryInfo", });
    internal_static_tensorflow_RunConfiguration_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_tensorflow_RunConfiguration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunConfiguration_descriptor,
        new java.lang.String[] { "Argument", "EnvVars", });
    internal_static_tensorflow_RunConfiguration_EnvVarsEntry_descriptor =
      internal_static_tensorflow_RunConfiguration_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_RunConfiguration_EnvVarsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunConfiguration_EnvVarsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_TestResults_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_tensorflow_TestResults_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_TestResults_descriptor,
        new java.lang.String[] { "Target", "Entries", "BuildConfiguration", "CommitId", "StartTime", "RunTime", "MachineConfiguration", "RunConfiguration", "Name", "BenchmarkType", "RunMode", "TfVersion", });
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
