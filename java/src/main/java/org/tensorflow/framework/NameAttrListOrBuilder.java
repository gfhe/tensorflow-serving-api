// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/attr_value.proto

package org.tensorflow.framework;

public interface NameAttrListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.NameAttrList)
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
   * <code>map&lt;string, .tensorflow.AttrValue&gt; attr = 2;</code>
   */
  int getAttrCount();
  /**
   * <code>map&lt;string, .tensorflow.AttrValue&gt; attr = 2;</code>
   */
  boolean containsAttr(
      java.lang.String key);
  /**
   * Use {@link #getAttrMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.tensorflow.framework.AttrValue>
  getAttr();
  /**
   * <code>map&lt;string, .tensorflow.AttrValue&gt; attr = 2;</code>
   */
  java.util.Map<java.lang.String, org.tensorflow.framework.AttrValue>
  getAttrMap();
  /**
   * <code>map&lt;string, .tensorflow.AttrValue&gt; attr = 2;</code>
   */
  /* nullable */
org.tensorflow.framework.AttrValue getAttrOrDefault(
      java.lang.String key,
      /* nullable */
org.tensorflow.framework.AttrValue defaultValue);
  /**
   * <code>map&lt;string, .tensorflow.AttrValue&gt; attr = 2;</code>
   */
  org.tensorflow.framework.AttrValue getAttrOrThrow(
      java.lang.String key);
}
