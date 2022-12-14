// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/device_filters.proto

package org.tensorflow.distruntime;

public interface JobDeviceFiltersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.JobDeviceFilters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of this job.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of this job.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Mapping from task ID to task device filters.
   * </pre>
   *
   * <code>map&lt;int32, .tensorflow.TaskDeviceFilters&gt; tasks = 2;</code>
   */
  int getTasksCount();
  /**
   * <pre>
   * Mapping from task ID to task device filters.
   * </pre>
   *
   * <code>map&lt;int32, .tensorflow.TaskDeviceFilters&gt; tasks = 2;</code>
   */
  boolean containsTasks(
      int key);
  /**
   * Use {@link #getTasksMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, org.tensorflow.distruntime.TaskDeviceFilters>
  getTasks();
  /**
   * <pre>
   * Mapping from task ID to task device filters.
   * </pre>
   *
   * <code>map&lt;int32, .tensorflow.TaskDeviceFilters&gt; tasks = 2;</code>
   */
  java.util.Map<java.lang.Integer, org.tensorflow.distruntime.TaskDeviceFilters>
  getTasksMap();
  /**
   * <pre>
   * Mapping from task ID to task device filters.
   * </pre>
   *
   * <code>map&lt;int32, .tensorflow.TaskDeviceFilters&gt; tasks = 2;</code>
   */
  /* nullable */
org.tensorflow.distruntime.TaskDeviceFilters getTasksOrDefault(
      int key,
      /* nullable */
org.tensorflow.distruntime.TaskDeviceFilters defaultValue);
  /**
   * <pre>
   * Mapping from task ID to task device filters.
   * </pre>
   *
   * <code>map&lt;int32, .tensorflow.TaskDeviceFilters&gt; tasks = 2;</code>
   */
  org.tensorflow.distruntime.TaskDeviceFilters getTasksOrThrow(
      int key);
}
