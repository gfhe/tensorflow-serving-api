// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

public interface LabeledStepStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.LabeledStepStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 step_id = 1;</code>
   * @return The stepId.
   */
  long getStepId();

  /**
   * <code>.tensorflow.StepStats step_stats = 2;</code>
   * @return Whether the stepStats field is set.
   */
  boolean hasStepStats();
  /**
   * <code>.tensorflow.StepStats step_stats = 2;</code>
   * @return The stepStats.
   */
  org.tensorflow.framework.StepStats getStepStats();
  /**
   * <code>.tensorflow.StepStats step_stats = 2;</code>
   */
  org.tensorflow.framework.StepStatsOrBuilder getStepStatsOrBuilder();
}
