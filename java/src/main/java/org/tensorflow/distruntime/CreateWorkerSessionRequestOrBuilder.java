// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

public interface CreateWorkerSessionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.CreateWorkerSessionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Sessions are identified by a given handle.
   * </pre>
   *
   * <code>string session_handle = 1;</code>
   * @return The sessionHandle.
   */
  java.lang.String getSessionHandle();
  /**
   * <pre>
   * Sessions are identified by a given handle.
   * </pre>
   *
   * <code>string session_handle = 1;</code>
   * @return The bytes for sessionHandle.
   */
  com.google.protobuf.ByteString
      getSessionHandleBytes();

  /**
   * <pre>
   * Defines the configuration of a TensorFlow worker.
   * </pre>
   *
   * <code>.tensorflow.ServerDef server_def = 2;</code>
   * @return Whether the serverDef field is set.
   */
  boolean hasServerDef();
  /**
   * <pre>
   * Defines the configuration of a TensorFlow worker.
   * </pre>
   *
   * <code>.tensorflow.ServerDef server_def = 2;</code>
   * @return The serverDef.
   */
  org.tensorflow.distruntime.ServerDef getServerDef();
  /**
   * <pre>
   * Defines the configuration of a TensorFlow worker.
   * </pre>
   *
   * <code>.tensorflow.ServerDef server_def = 2;</code>
   */
  org.tensorflow.distruntime.ServerDefOrBuilder getServerDefOrBuilder();

  /**
   * <pre>
   * If true, any resources such as Variables used in the session will not be
   * shared with other sessions.
   * </pre>
   *
   * <code>bool isolate_session_state = 3;</code>
   * @return The isolateSessionState.
   */
  boolean getIsolateSessionState();

  /**
   * <pre>
   * The device attributes of all the devices in the cluster.
   * </pre>
   *
   * <code>repeated .tensorflow.DeviceAttributes cluster_device_attributes = 4;</code>
   */
  java.util.List<org.tensorflow.framework.DeviceAttributes> 
      getClusterDeviceAttributesList();
  /**
   * <pre>
   * The device attributes of all the devices in the cluster.
   * </pre>
   *
   * <code>repeated .tensorflow.DeviceAttributes cluster_device_attributes = 4;</code>
   */
  org.tensorflow.framework.DeviceAttributes getClusterDeviceAttributes(int index);
  /**
   * <pre>
   * The device attributes of all the devices in the cluster.
   * </pre>
   *
   * <code>repeated .tensorflow.DeviceAttributes cluster_device_attributes = 4;</code>
   */
  int getClusterDeviceAttributesCount();
  /**
   * <pre>
   * The device attributes of all the devices in the cluster.
   * </pre>
   *
   * <code>repeated .tensorflow.DeviceAttributes cluster_device_attributes = 4;</code>
   */
  java.util.List<? extends org.tensorflow.framework.DeviceAttributesOrBuilder> 
      getClusterDeviceAttributesOrBuilderList();
  /**
   * <pre>
   * The device attributes of all the devices in the cluster.
   * </pre>
   *
   * <code>repeated .tensorflow.DeviceAttributes cluster_device_attributes = 4;</code>
   */
  org.tensorflow.framework.DeviceAttributesOrBuilder getClusterDeviceAttributesOrBuilder(
      int index);

  /**
   * <pre>
   * The master task name from which the request is sent.
   * </pre>
   *
   * <code>string master_task = 5;</code>
   * @return The masterTask.
   */
  java.lang.String getMasterTask();
  /**
   * <pre>
   * The master task name from which the request is sent.
   * </pre>
   *
   * <code>string master_task = 5;</code>
   * @return The bytes for masterTask.
   */
  com.google.protobuf.ByteString
      getMasterTaskBytes();

  /**
   * <pre>
   * The incarnation ID of the master task local CPU device.
   * If the target worker already has a WorkerSession created previously with
   * the same master task name but a different incarnation, it usually indicates
   * that the previous master failed before deleting the WorkerSession on the
   * worker. To prevent memory leaks, the worker should garbage collect the old
   * WorkerSessions.
   * </pre>
   *
   * <code>int64 master_incarnation = 6;</code>
   * @return The masterIncarnation.
   */
  long getMasterIncarnation();

  /**
   * <pre>
   * Configures coordination service within worker sessions.
   * </pre>
   *
   * <code>.tensorflow.CoordinationServiceConfig coordination_service_config = 7;</code>
   * @return Whether the coordinationServiceConfig field is set.
   */
  boolean hasCoordinationServiceConfig();
  /**
   * <pre>
   * Configures coordination service within worker sessions.
   * </pre>
   *
   * <code>.tensorflow.CoordinationServiceConfig coordination_service_config = 7;</code>
   * @return The coordinationServiceConfig.
   */
  tensorflow.CoordinationConfig.CoordinationServiceConfig getCoordinationServiceConfig();
  /**
   * <pre>
   * Configures coordination service within worker sessions.
   * </pre>
   *
   * <code>.tensorflow.CoordinationServiceConfig coordination_service_config = 7;</code>
   */
  tensorflow.CoordinationConfig.CoordinationServiceConfigOrBuilder getCoordinationServiceConfigOrBuilder();
}
