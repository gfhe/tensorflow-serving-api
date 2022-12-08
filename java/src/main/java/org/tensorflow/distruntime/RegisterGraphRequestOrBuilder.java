// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

public interface RegisterGraphRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.RegisterGraphRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Subgraphs are scoped within one session.
   * </pre>
   *
   * <code>string session_handle = 1;</code>
   * @return The sessionHandle.
   */
  java.lang.String getSessionHandle();
  /**
   * <pre>
   * Subgraphs are scoped within one session.
   * </pre>
   *
   * <code>string session_handle = 1;</code>
   * @return The bytes for sessionHandle.
   */
  com.google.protobuf.ByteString
      getSessionHandleBytes();

  /**
   * <pre>
   * Set to true if `CreateWorkerSession` was called for `session_handle`.
   * </pre>
   *
   * <code>bool create_worker_session_called = 6;</code>
   * @return The createWorkerSessionCalled.
   */
  boolean getCreateWorkerSessionCalled();

  /**
   * <pre>
   * "graph_def" has the subgraph of nodes for this worker, with each node
   * having its device_name filled in.
   * </pre>
   *
   * <code>.tensorflow.GraphDef graph_def = 2;</code>
   * @return Whether the graphDef field is set.
   */
  boolean hasGraphDef();
  /**
   * <pre>
   * "graph_def" has the subgraph of nodes for this worker, with each node
   * having its device_name filled in.
   * </pre>
   *
   * <code>.tensorflow.GraphDef graph_def = 2;</code>
   * @return The graphDef.
   */
  org.tensorflow.framework.GraphDef getGraphDef();
  /**
   * <pre>
   * "graph_def" has the subgraph of nodes for this worker, with each node
   * having its device_name filled in.
   * </pre>
   *
   * <code>.tensorflow.GraphDef graph_def = 2;</code>
   */
  org.tensorflow.framework.GraphDefOrBuilder getGraphDefOrBuilder();

  /**
   * <pre>
   * True iff the graph (before partitioning) contains control flow nodes.
   * As of 01/11/2015, this is no longer set by clients.
   * </pre>
   *
   * <code>bool has_control_flow = 3 [deprecated = true];</code>
   * @deprecated tensorflow.RegisterGraphRequest.has_control_flow is deprecated.
   *     See tensorflow/core/protobuf/worker.proto;l=134
   * @return The hasControlFlow.
   */
  @java.lang.Deprecated boolean getHasControlFlow();

  /**
   * <pre>
   * Configuration options for the session in which this graph was created.
   * </pre>
   *
   * <code>.tensorflow.GraphOptions graph_options = 4;</code>
   * @return Whether the graphOptions field is set.
   */
  boolean hasGraphOptions();
  /**
   * <pre>
   * Configuration options for the session in which this graph was created.
   * </pre>
   *
   * <code>.tensorflow.GraphOptions graph_options = 4;</code>
   * @return The graphOptions.
   */
  org.tensorflow.framework.GraphOptions getGraphOptions();
  /**
   * <pre>
   * Configuration options for the session in which this graph was created.
   * </pre>
   *
   * <code>.tensorflow.GraphOptions graph_options = 4;</code>
   */
  org.tensorflow.framework.GraphOptionsOrBuilder getGraphOptionsOrBuilder();

  /**
   * <pre>
   * Field(s) used by TensorFlow Debugger (tfdbg).
   * </pre>
   *
   * <code>.tensorflow.DebugOptions debug_options = 5;</code>
   * @return Whether the debugOptions field is set.
   */
  boolean hasDebugOptions();
  /**
   * <pre>
   * Field(s) used by TensorFlow Debugger (tfdbg).
   * </pre>
   *
   * <code>.tensorflow.DebugOptions debug_options = 5;</code>
   * @return The debugOptions.
   */
  org.tensorflow.framework.DebugOptions getDebugOptions();
  /**
   * <pre>
   * Field(s) used by TensorFlow Debugger (tfdbg).
   * </pre>
   *
   * <code>.tensorflow.DebugOptions debug_options = 5;</code>
   */
  org.tensorflow.framework.DebugOptionsOrBuilder getDebugOptionsOrBuilder();

  /**
   * <pre>
   * If graph_def contains any collective ops this must be a positive
   * integer used to coordinate execution with other graphs.  All
   * graphs in a distributed execution with the same
   * collective_graph_key will coordinate to use the same step_id
   * concurrently so that BufRendezvous entries will make the correct
   * values accessible.
   * </pre>
   *
   * <code>int64 collective_graph_key = 7;</code>
   * @return The collectiveGraphKey.
   */
  long getCollectiveGraphKey();

  /**
   * <pre>
   * ConfigProto from the session in which this graph was created.
   * Contains additional parameters beyond graph_options, including
   * the name of the requested executor.
   * </pre>
   *
   * <code>.tensorflow.ConfigProto config_proto = 8;</code>
   * @return Whether the configProto field is set.
   */
  boolean hasConfigProto();
  /**
   * <pre>
   * ConfigProto from the session in which this graph was created.
   * Contains additional parameters beyond graph_options, including
   * the name of the requested executor.
   * </pre>
   *
   * <code>.tensorflow.ConfigProto config_proto = 8;</code>
   * @return The configProto.
   */
  org.tensorflow.framework.ConfigProto getConfigProto();
  /**
   * <pre>
   * ConfigProto from the session in which this graph was created.
   * Contains additional parameters beyond graph_options, including
   * the name of the requested executor.
   * </pre>
   *
   * <code>.tensorflow.ConfigProto config_proto = 8;</code>
   */
  org.tensorflow.framework.ConfigProtoOrBuilder getConfigProtoOrBuilder();
}
