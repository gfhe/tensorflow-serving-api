// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

public interface GetStepSequenceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.GetStepSequenceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int64 graph_key = 1;</code>
   * @return A list containing the graphKey.
   */
  java.util.List<java.lang.Long> getGraphKeyList();
  /**
   * <code>repeated int64 graph_key = 1;</code>
   * @return The count of graphKey.
   */
  int getGraphKeyCount();
  /**
   * <code>repeated int64 graph_key = 1;</code>
   * @param index The index of the element to return.
   * @return The graphKey at the given index.
   */
  long getGraphKey(int index);
}
