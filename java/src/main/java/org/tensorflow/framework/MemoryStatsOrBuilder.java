// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/step_stats.proto

package org.tensorflow.framework;

public interface MemoryStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.MemoryStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 temp_memory_size = 1;</code>
   * @return The tempMemorySize.
   */
  long getTempMemorySize();

  /**
   * <code>int64 persistent_memory_size = 3;</code>
   * @return The persistentMemorySize.
   */
  long getPersistentMemorySize();

  /**
   * <code>repeated int64 persistent_tensor_alloc_ids = 5;</code>
   * @return A list containing the persistentTensorAllocIds.
   */
  java.util.List<java.lang.Long> getPersistentTensorAllocIdsList();
  /**
   * <code>repeated int64 persistent_tensor_alloc_ids = 5;</code>
   * @return The count of persistentTensorAllocIds.
   */
  int getPersistentTensorAllocIdsCount();
  /**
   * <code>repeated int64 persistent_tensor_alloc_ids = 5;</code>
   * @param index The index of the element to return.
   * @return The persistentTensorAllocIds at the given index.
   */
  long getPersistentTensorAllocIds(int index);

  /**
   * <code>int64 device_temp_memory_size = 2 [deprecated = true];</code>
   * @deprecated tensorflow.MemoryStats.device_temp_memory_size is deprecated.
   *     See tensorflow/core/framework/step_stats.proto;l=48
   * @return The deviceTempMemorySize.
   */
  @java.lang.Deprecated long getDeviceTempMemorySize();

  /**
   * <code>int64 device_persistent_memory_size = 4 [deprecated = true];</code>
   * @deprecated tensorflow.MemoryStats.device_persistent_memory_size is deprecated.
   *     See tensorflow/core/framework/step_stats.proto;l=49
   * @return The devicePersistentMemorySize.
   */
  @java.lang.Deprecated long getDevicePersistentMemorySize();

  /**
   * <code>repeated int64 device_persistent_tensor_alloc_ids = 6 [deprecated = true];</code>
   * @deprecated tensorflow.MemoryStats.device_persistent_tensor_alloc_ids is deprecated.
   *     See tensorflow/core/framework/step_stats.proto;l=50
   * @return A list containing the devicePersistentTensorAllocIds.
   */
  @java.lang.Deprecated java.util.List<java.lang.Long> getDevicePersistentTensorAllocIdsList();
  /**
   * <code>repeated int64 device_persistent_tensor_alloc_ids = 6 [deprecated = true];</code>
   * @deprecated tensorflow.MemoryStats.device_persistent_tensor_alloc_ids is deprecated.
   *     See tensorflow/core/framework/step_stats.proto;l=50
   * @return The count of devicePersistentTensorAllocIds.
   */
  @java.lang.Deprecated int getDevicePersistentTensorAllocIdsCount();
  /**
   * <code>repeated int64 device_persistent_tensor_alloc_ids = 6 [deprecated = true];</code>
   * @deprecated tensorflow.MemoryStats.device_persistent_tensor_alloc_ids is deprecated.
   *     See tensorflow/core/framework/step_stats.proto;l=50
   * @param index The index of the element to return.
   * @return The devicePersistentTensorAllocIds at the given index.
   */
  @java.lang.Deprecated long getDevicePersistentTensorAllocIds(int index);
}