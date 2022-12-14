// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/util/test_log.proto

package org.tensorflow.util.testlog;

public interface BenchmarkEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.BenchmarkEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the specific benchmark or test
   * (e.g. BM_AdjustContrast_gpu_B_W_H)
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the specific benchmark or test
   * (e.g. BM_AdjustContrast_gpu_B_W_H)
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If a benchmark, how many iterations it was run for
   * </pre>
   *
   * <code>int64 iters = 2;</code>
   * @return The iters.
   */
  long getIters();

  /**
   * <pre>
   * Total cpu time used for all iterations (in seconds)
   * </pre>
   *
   * <code>double cpu_time = 3;</code>
   * @return The cpuTime.
   */
  double getCpuTime();

  /**
   * <pre>
   * Total wall time used for all iterations (in seconds)
   * </pre>
   *
   * <code>double wall_time = 4;</code>
   * @return The wallTime.
   */
  double getWallTime();

  /**
   * <pre>
   * Throughput (in MB/s)
   * </pre>
   *
   * <code>double throughput = 5;</code>
   * @return The throughput.
   */
  double getThroughput();

  /**
   * <pre>
   * Generic map from result key to value.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.EntryValue&gt; extras = 6;</code>
   */
  int getExtrasCount();
  /**
   * <pre>
   * Generic map from result key to value.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.EntryValue&gt; extras = 6;</code>
   */
  boolean containsExtras(
      java.lang.String key);
  /**
   * Use {@link #getExtrasMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.tensorflow.util.testlog.EntryValue>
  getExtras();
  /**
   * <pre>
   * Generic map from result key to value.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.EntryValue&gt; extras = 6;</code>
   */
  java.util.Map<java.lang.String, org.tensorflow.util.testlog.EntryValue>
  getExtrasMap();
  /**
   * <pre>
   * Generic map from result key to value.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.EntryValue&gt; extras = 6;</code>
   */
  /* nullable */
org.tensorflow.util.testlog.EntryValue getExtrasOrDefault(
      java.lang.String key,
      /* nullable */
org.tensorflow.util.testlog.EntryValue defaultValue);
  /**
   * <pre>
   * Generic map from result key to value.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.EntryValue&gt; extras = 6;</code>
   */
  org.tensorflow.util.testlog.EntryValue getExtrasOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Metric name, value and expected range. This can include accuracy metrics
   * typically used to determine whether the accuracy test has passed
   * </pre>
   *
   * <code>repeated .tensorflow.MetricEntry metrics = 7;</code>
   */
  java.util.List<org.tensorflow.util.testlog.MetricEntry> 
      getMetricsList();
  /**
   * <pre>
   * Metric name, value and expected range. This can include accuracy metrics
   * typically used to determine whether the accuracy test has passed
   * </pre>
   *
   * <code>repeated .tensorflow.MetricEntry metrics = 7;</code>
   */
  org.tensorflow.util.testlog.MetricEntry getMetrics(int index);
  /**
   * <pre>
   * Metric name, value and expected range. This can include accuracy metrics
   * typically used to determine whether the accuracy test has passed
   * </pre>
   *
   * <code>repeated .tensorflow.MetricEntry metrics = 7;</code>
   */
  int getMetricsCount();
  /**
   * <pre>
   * Metric name, value and expected range. This can include accuracy metrics
   * typically used to determine whether the accuracy test has passed
   * </pre>
   *
   * <code>repeated .tensorflow.MetricEntry metrics = 7;</code>
   */
  java.util.List<? extends org.tensorflow.util.testlog.MetricEntryOrBuilder> 
      getMetricsOrBuilderList();
  /**
   * <pre>
   * Metric name, value and expected range. This can include accuracy metrics
   * typically used to determine whether the accuracy test has passed
   * </pre>
   *
   * <code>repeated .tensorflow.MetricEntry metrics = 7;</code>
   */
  org.tensorflow.util.testlog.MetricEntryOrBuilder getMetricsOrBuilder(
      int index);
}
