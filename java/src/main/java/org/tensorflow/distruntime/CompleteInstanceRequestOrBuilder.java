// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

public interface CompleteInstanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.CompleteInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 type = 2;</code>
   * @return The type.
   */
  int getType();

  /**
   * <code>.tensorflow.DataType data_type = 3;</code>
   * @return The enum numeric value on the wire for dataType.
   */
  int getDataTypeValue();
  /**
   * <code>.tensorflow.DataType data_type = 3;</code>
   * @return The dataType.
   */
  org.tensorflow.framework.DataType getDataType();

  /**
   * <code>.tensorflow.TensorShapeProto shape = 4;</code>
   * @return Whether the shape field is set.
   */
  boolean hasShape();
  /**
   * <code>.tensorflow.TensorShapeProto shape = 4;</code>
   * @return The shape.
   */
  org.tensorflow.framework.TensorShapeProto getShape();
  /**
   * <code>.tensorflow.TensorShapeProto shape = 4;</code>
   */
  org.tensorflow.framework.TensorShapeProtoOrBuilder getShapeOrBuilder();

  /**
   * <code>int32 group_key = 5;</code>
   * @return The groupKey.
   */
  int getGroupKey();

  /**
   * <code>int32 group_size = 6;</code>
   * @return The groupSize.
   */
  int getGroupSize();

  /**
   * <code>int32 instance_key = 7;</code>
   * @return The instanceKey.
   */
  int getInstanceKey();

  /**
   * <code>string device_type = 8;</code>
   * @return The deviceType.
   */
  java.lang.String getDeviceType();
  /**
   * <code>string device_type = 8;</code>
   * @return The bytes for deviceType.
   */
  com.google.protobuf.ByteString
      getDeviceTypeBytes();

  /**
   * <code>repeated int32 subdiv_offset = 9;</code>
   * @return A list containing the subdivOffset.
   */
  java.util.List<java.lang.Integer> getSubdivOffsetList();
  /**
   * <code>repeated int32 subdiv_offset = 9;</code>
   * @return The count of subdivOffset.
   */
  int getSubdivOffsetCount();
  /**
   * <code>repeated int32 subdiv_offset = 9;</code>
   * @param index The index of the element to return.
   * @return The subdivOffset at the given index.
   */
  int getSubdivOffset(int index);

  /**
   * <code>string device = 10;</code>
   * @return The device.
   */
  java.lang.String getDevice();
  /**
   * <code>string device = 10;</code>
   * @return The bytes for device.
   */
  com.google.protobuf.ByteString
      getDeviceBytes();

  /**
   * <code>bool is_source = 11;</code>
   * @return The isSource.
   */
  boolean getIsSource();
}
