// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/log_memory.proto

package org.tensorflow.framework;

public interface MemoryLogTensorDeallocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.MemoryLogTensorDeallocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the tensor buffer being deallocated, used to match to a
   * corresponding allocation.
   * </pre>
   *
   * <code>int64 allocation_id = 1;</code>
   * @return The allocationId.
   */
  long getAllocationId();

  /**
   * <pre>
   * Name of the allocator used.
   * </pre>
   *
   * <code>string allocator_name = 2;</code>
   * @return The allocatorName.
   */
  java.lang.String getAllocatorName();
  /**
   * <pre>
   * Name of the allocator used.
   * </pre>
   *
   * <code>string allocator_name = 2;</code>
   * @return The bytes for allocatorName.
   */
  com.google.protobuf.ByteString
      getAllocatorNameBytes();
}
