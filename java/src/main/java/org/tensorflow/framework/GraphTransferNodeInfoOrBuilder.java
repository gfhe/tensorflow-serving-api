// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/graph_transfer_info.proto

package org.tensorflow.framework;

public interface GraphTransferNodeInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.GraphTransferNodeInfo)
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
   * <code>int32 node_id = 2;</code>
   * @return The nodeId.
   */
  int getNodeId();

  /**
   * <code>string type_name = 3;</code>
   * @return The typeName.
   */
  java.lang.String getTypeName();
  /**
   * <code>string type_name = 3;</code>
   * @return The bytes for typeName.
   */
  com.google.protobuf.ByteString
      getTypeNameBytes();

  /**
   * <code>int32 soc_op_id = 4;</code>
   * @return The socOpId.
   */
  int getSocOpId();

  /**
   * <code>int32 padding_id = 5;</code>
   * @return The paddingId.
   */
  int getPaddingId();

  /**
   * <code>int32 input_count = 6;</code>
   * @return The inputCount.
   */
  int getInputCount();

  /**
   * <code>int32 output_count = 7;</code>
   * @return The outputCount.
   */
  int getOutputCount();
}
