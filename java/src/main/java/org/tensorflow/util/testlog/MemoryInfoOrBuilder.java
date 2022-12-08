// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/util/test_log.proto

package org.tensorflow.util.testlog;

public interface MemoryInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.MemoryInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Total virtual memory in bytes
   * </pre>
   *
   * <code>int64 total = 1;</code>
   * @return The total.
   */
  long getTotal();

  /**
   * <pre>
   * Immediately available memory in bytes
   * </pre>
   *
   * <code>int64 available = 2;</code>
   * @return The available.
   */
  long getAvailable();
}
