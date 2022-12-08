// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/master.proto

package org.tensorflow.distruntime;

/**
 * Protobuf type {@code tensorflow.CreateSessionRequest}
 */
public final class CreateSessionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.CreateSessionRequest)
    CreateSessionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSessionRequest.newBuilder() to construct.
  private CreateSessionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSessionRequest() {
    target_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSessionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_CreateSessionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_CreateSessionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.CreateSessionRequest.class, org.tensorflow.distruntime.CreateSessionRequest.Builder.class);
  }

  public static final int GRAPH_DEF_FIELD_NUMBER = 1;
  private org.tensorflow.framework.GraphDef graphDef_;
  /**
   * <pre>
   * The initial graph definition.
   * </pre>
   *
   * <code>.tensorflow.GraphDef graph_def = 1;</code>
   * @return Whether the graphDef field is set.
   */
  @java.lang.Override
  public boolean hasGraphDef() {
    return graphDef_ != null;
  }
  /**
   * <pre>
   * The initial graph definition.
   * </pre>
   *
   * <code>.tensorflow.GraphDef graph_def = 1;</code>
   * @return The graphDef.
   */
  @java.lang.Override
  public org.tensorflow.framework.GraphDef getGraphDef() {
    return graphDef_ == null ? org.tensorflow.framework.GraphDef.getDefaultInstance() : graphDef_;
  }
  /**
   * <pre>
   * The initial graph definition.
   * </pre>
   *
   * <code>.tensorflow.GraphDef graph_def = 1;</code>
   */
  @java.lang.Override
  public org.tensorflow.framework.GraphDefOrBuilder getGraphDefOrBuilder() {
    return graphDef_ == null ? org.tensorflow.framework.GraphDef.getDefaultInstance() : graphDef_;
  }

  public static final int CONFIG_FIELD_NUMBER = 2;
  private org.tensorflow.framework.ConfigProto config_;
  /**
   * <pre>
   * Configuration options.
   * </pre>
   *
   * <code>.tensorflow.ConfigProto config = 2;</code>
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   * <pre>
   * Configuration options.
   * </pre>
   *
   * <code>.tensorflow.ConfigProto config = 2;</code>
   * @return The config.
   */
  @java.lang.Override
  public org.tensorflow.framework.ConfigProto getConfig() {
    return config_ == null ? org.tensorflow.framework.ConfigProto.getDefaultInstance() : config_;
  }
  /**
   * <pre>
   * Configuration options.
   * </pre>
   *
   * <code>.tensorflow.ConfigProto config = 2;</code>
   */
  @java.lang.Override
  public org.tensorflow.framework.ConfigProtoOrBuilder getConfigOrBuilder() {
    return config_ == null ? org.tensorflow.framework.ConfigProto.getDefaultInstance() : config_;
  }

  public static final int TARGET_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object target_ = "";
  /**
   * <pre>
   * The target string used from the client's perspective.
   * </pre>
   *
   * <code>string target = 3;</code>
   * @return The target.
   */
  @java.lang.Override
  public java.lang.String getTarget() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      target_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The target string used from the client's perspective.
   * </pre>
   *
   * <code>string target = 3;</code>
   * @return The bytes for target.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTargetBytes() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      target_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (graphDef_ != null) {
      output.writeMessage(1, getGraphDef());
    }
    if (config_ != null) {
      output.writeMessage(2, getConfig());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(target_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, target_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (graphDef_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGraphDef());
    }
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConfig());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(target_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, target_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.distruntime.CreateSessionRequest)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.CreateSessionRequest other = (org.tensorflow.distruntime.CreateSessionRequest) obj;

    if (hasGraphDef() != other.hasGraphDef()) return false;
    if (hasGraphDef()) {
      if (!getGraphDef()
          .equals(other.getGraphDef())) return false;
    }
    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig()
          .equals(other.getConfig())) return false;
    }
    if (!getTarget()
        .equals(other.getTarget())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasGraphDef()) {
      hash = (37 * hash) + GRAPH_DEF_FIELD_NUMBER;
      hash = (53 * hash) + getGraphDef().hashCode();
    }
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    hash = (37 * hash) + TARGET_FIELD_NUMBER;
    hash = (53 * hash) + getTarget().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.CreateSessionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CreateSessionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CreateSessionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CreateSessionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CreateSessionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CreateSessionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CreateSessionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CreateSessionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CreateSessionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CreateSessionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CreateSessionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CreateSessionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.distruntime.CreateSessionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tensorflow.CreateSessionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.CreateSessionRequest)
      org.tensorflow.distruntime.CreateSessionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_CreateSessionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_CreateSessionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.CreateSessionRequest.class, org.tensorflow.distruntime.CreateSessionRequest.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.CreateSessionRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      graphDef_ = null;
      if (graphDefBuilder_ != null) {
        graphDefBuilder_.dispose();
        graphDefBuilder_ = null;
      }
      config_ = null;
      if (configBuilder_ != null) {
        configBuilder_.dispose();
        configBuilder_ = null;
      }
      target_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_CreateSessionRequest_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.CreateSessionRequest getDefaultInstanceForType() {
      return org.tensorflow.distruntime.CreateSessionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.CreateSessionRequest build() {
      org.tensorflow.distruntime.CreateSessionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.CreateSessionRequest buildPartial() {
      org.tensorflow.distruntime.CreateSessionRequest result = new org.tensorflow.distruntime.CreateSessionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.tensorflow.distruntime.CreateSessionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.graphDef_ = graphDefBuilder_ == null
            ? graphDef_
            : graphDefBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.config_ = configBuilder_ == null
            ? config_
            : configBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.target_ = target_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.distruntime.CreateSessionRequest) {
        return mergeFrom((org.tensorflow.distruntime.CreateSessionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.CreateSessionRequest other) {
      if (other == org.tensorflow.distruntime.CreateSessionRequest.getDefaultInstance()) return this;
      if (other.hasGraphDef()) {
        mergeGraphDef(other.getGraphDef());
      }
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
      }
      if (!other.getTarget().isEmpty()) {
        target_ = other.target_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getGraphDefFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              target_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private org.tensorflow.framework.GraphDef graphDef_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.GraphDef, org.tensorflow.framework.GraphDef.Builder, org.tensorflow.framework.GraphDefOrBuilder> graphDefBuilder_;
    /**
     * <pre>
     * The initial graph definition.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 1;</code>
     * @return Whether the graphDef field is set.
     */
    public boolean hasGraphDef() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The initial graph definition.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 1;</code>
     * @return The graphDef.
     */
    public org.tensorflow.framework.GraphDef getGraphDef() {
      if (graphDefBuilder_ == null) {
        return graphDef_ == null ? org.tensorflow.framework.GraphDef.getDefaultInstance() : graphDef_;
      } else {
        return graphDefBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The initial graph definition.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 1;</code>
     */
    public Builder setGraphDef(org.tensorflow.framework.GraphDef value) {
      if (graphDefBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        graphDef_ = value;
      } else {
        graphDefBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The initial graph definition.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 1;</code>
     */
    public Builder setGraphDef(
        org.tensorflow.framework.GraphDef.Builder builderForValue) {
      if (graphDefBuilder_ == null) {
        graphDef_ = builderForValue.build();
      } else {
        graphDefBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The initial graph definition.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 1;</code>
     */
    public Builder mergeGraphDef(org.tensorflow.framework.GraphDef value) {
      if (graphDefBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          graphDef_ != null &&
          graphDef_ != org.tensorflow.framework.GraphDef.getDefaultInstance()) {
          getGraphDefBuilder().mergeFrom(value);
        } else {
          graphDef_ = value;
        }
      } else {
        graphDefBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The initial graph definition.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 1;</code>
     */
    public Builder clearGraphDef() {
      bitField0_ = (bitField0_ & ~0x00000001);
      graphDef_ = null;
      if (graphDefBuilder_ != null) {
        graphDefBuilder_.dispose();
        graphDefBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The initial graph definition.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 1;</code>
     */
    public org.tensorflow.framework.GraphDef.Builder getGraphDefBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGraphDefFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The initial graph definition.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 1;</code>
     */
    public org.tensorflow.framework.GraphDefOrBuilder getGraphDefOrBuilder() {
      if (graphDefBuilder_ != null) {
        return graphDefBuilder_.getMessageOrBuilder();
      } else {
        return graphDef_ == null ?
            org.tensorflow.framework.GraphDef.getDefaultInstance() : graphDef_;
      }
    }
    /**
     * <pre>
     * The initial graph definition.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.GraphDef, org.tensorflow.framework.GraphDef.Builder, org.tensorflow.framework.GraphDefOrBuilder> 
        getGraphDefFieldBuilder() {
      if (graphDefBuilder_ == null) {
        graphDefBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.GraphDef, org.tensorflow.framework.GraphDef.Builder, org.tensorflow.framework.GraphDefOrBuilder>(
                getGraphDef(),
                getParentForChildren(),
                isClean());
        graphDef_ = null;
      }
      return graphDefBuilder_;
    }

    private org.tensorflow.framework.ConfigProto config_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.ConfigProto, org.tensorflow.framework.ConfigProto.Builder, org.tensorflow.framework.ConfigProtoOrBuilder> configBuilder_;
    /**
     * <pre>
     * Configuration options.
     * </pre>
     *
     * <code>.tensorflow.ConfigProto config = 2;</code>
     * @return Whether the config field is set.
     */
    public boolean hasConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Configuration options.
     * </pre>
     *
     * <code>.tensorflow.ConfigProto config = 2;</code>
     * @return The config.
     */
    public org.tensorflow.framework.ConfigProto getConfig() {
      if (configBuilder_ == null) {
        return config_ == null ? org.tensorflow.framework.ConfigProto.getDefaultInstance() : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Configuration options.
     * </pre>
     *
     * <code>.tensorflow.ConfigProto config = 2;</code>
     */
    public Builder setConfig(org.tensorflow.framework.ConfigProto value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
      } else {
        configBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Configuration options.
     * </pre>
     *
     * <code>.tensorflow.ConfigProto config = 2;</code>
     */
    public Builder setConfig(
        org.tensorflow.framework.ConfigProto.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Configuration options.
     * </pre>
     *
     * <code>.tensorflow.ConfigProto config = 2;</code>
     */
    public Builder mergeConfig(org.tensorflow.framework.ConfigProto value) {
      if (configBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          config_ != null &&
          config_ != org.tensorflow.framework.ConfigProto.getDefaultInstance()) {
          getConfigBuilder().mergeFrom(value);
        } else {
          config_ = value;
        }
      } else {
        configBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Configuration options.
     * </pre>
     *
     * <code>.tensorflow.ConfigProto config = 2;</code>
     */
    public Builder clearConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      config_ = null;
      if (configBuilder_ != null) {
        configBuilder_.dispose();
        configBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Configuration options.
     * </pre>
     *
     * <code>.tensorflow.ConfigProto config = 2;</code>
     */
    public org.tensorflow.framework.ConfigProto.Builder getConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Configuration options.
     * </pre>
     *
     * <code>.tensorflow.ConfigProto config = 2;</code>
     */
    public org.tensorflow.framework.ConfigProtoOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null ?
            org.tensorflow.framework.ConfigProto.getDefaultInstance() : config_;
      }
    }
    /**
     * <pre>
     * Configuration options.
     * </pre>
     *
     * <code>.tensorflow.ConfigProto config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.ConfigProto, org.tensorflow.framework.ConfigProto.Builder, org.tensorflow.framework.ConfigProtoOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.ConfigProto, org.tensorflow.framework.ConfigProto.Builder, org.tensorflow.framework.ConfigProtoOrBuilder>(
                getConfig(),
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      return configBuilder_;
    }

    private java.lang.Object target_ = "";
    /**
     * <pre>
     * The target string used from the client's perspective.
     * </pre>
     *
     * <code>string target = 3;</code>
     * @return The target.
     */
    public java.lang.String getTarget() {
      java.lang.Object ref = target_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        target_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The target string used from the client's perspective.
     * </pre>
     *
     * <code>string target = 3;</code>
     * @return The bytes for target.
     */
    public com.google.protobuf.ByteString
        getTargetBytes() {
      java.lang.Object ref = target_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        target_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The target string used from the client's perspective.
     * </pre>
     *
     * <code>string target = 3;</code>
     * @param value The target to set.
     * @return This builder for chaining.
     */
    public Builder setTarget(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      target_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The target string used from the client's perspective.
     * </pre>
     *
     * <code>string target = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTarget() {
      target_ = getDefaultInstance().getTarget();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The target string used from the client's perspective.
     * </pre>
     *
     * <code>string target = 3;</code>
     * @param value The bytes for target to set.
     * @return This builder for chaining.
     */
    public Builder setTargetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      target_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.CreateSessionRequest)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.CreateSessionRequest)
  private static final org.tensorflow.distruntime.CreateSessionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.CreateSessionRequest();
  }

  public static org.tensorflow.distruntime.CreateSessionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSessionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSessionRequest>() {
    @java.lang.Override
    public CreateSessionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CreateSessionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSessionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.CreateSessionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

