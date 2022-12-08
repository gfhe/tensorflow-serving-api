// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/device_attributes.proto

package org.tensorflow.framework;

public interface DeviceAttributesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.DeviceAttributes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Fully specified name of the device within a cluster.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Fully specified name of the device within a cluster.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * String representation of device_type.
   * </pre>
   *
   * <code>string device_type = 2;</code>
   * @return The deviceType.
   */
  java.lang.String getDeviceType();
  /**
   * <pre>
   * String representation of device_type.
   * </pre>
   *
   * <code>string device_type = 2;</code>
   * @return The bytes for deviceType.
   */
  com.google.protobuf.ByteString
      getDeviceTypeBytes();

  /**
   * <pre>
   * Memory capacity of device in bytes.
   * </pre>
   *
   * <code>int64 memory_limit = 4;</code>
   * @return The memoryLimit.
   */
  long getMemoryLimit();

  /**
   * <pre>
   * Platform-specific data about device that may be useful
   * for supporting efficient data transfers.
   * </pre>
   *
   * <code>.tensorflow.DeviceLocality locality = 5;</code>
   * @return Whether the locality field is set.
   */
  boolean hasLocality();
  /**
   * <pre>
   * Platform-specific data about device that may be useful
   * for supporting efficient data transfers.
   * </pre>
   *
   * <code>.tensorflow.DeviceLocality locality = 5;</code>
   * @return The locality.
   */
  org.tensorflow.framework.DeviceLocality getLocality();
  /**
   * <pre>
   * Platform-specific data about device that may be useful
   * for supporting efficient data transfers.
   * </pre>
   *
   * <code>.tensorflow.DeviceLocality locality = 5;</code>
   */
  org.tensorflow.framework.DeviceLocalityOrBuilder getLocalityOrBuilder();

  /**
   * <pre>
   * A device is assigned a global unique number each time it is
   * initialized. "incarnation" should never be 0.
   * </pre>
   *
   * <code>fixed64 incarnation = 6;</code>
   * @return The incarnation.
   */
  long getIncarnation();

  /**
   * <pre>
   * String representation of the physical device that this device maps to.
   * </pre>
   *
   * <code>string physical_device_desc = 7;</code>
   * @return The physicalDeviceDesc.
   */
  java.lang.String getPhysicalDeviceDesc();
  /**
   * <pre>
   * String representation of the physical device that this device maps to.
   * </pre>
   *
   * <code>string physical_device_desc = 7;</code>
   * @return The bytes for physicalDeviceDesc.
   */
  com.google.protobuf.ByteString
      getPhysicalDeviceDescBytes();

  /**
   * <pre>
   * A physical device ID for use in XLA DeviceAssignments, unique across
   * clients in a multi-client setup. Set to -1 if unavailable, non-negative
   * otherwise.
   * </pre>
   *
   * <code>int64 xla_global_id = 8;</code>
   * @return The xlaGlobalId.
   */
  long getXlaGlobalId();
}
