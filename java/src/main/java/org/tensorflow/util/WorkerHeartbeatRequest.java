// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/util/event.proto

package org.tensorflow.util;

/**
 * Protobuf type {@code tensorflow.WorkerHeartbeatRequest}
 */
public final class WorkerHeartbeatRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.WorkerHeartbeatRequest)
    WorkerHeartbeatRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WorkerHeartbeatRequest.newBuilder() to construct.
  private WorkerHeartbeatRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkerHeartbeatRequest() {
    shutdownMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WorkerHeartbeatRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.util.EventProtos.internal_static_tensorflow_WorkerHeartbeatRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.util.EventProtos.internal_static_tensorflow_WorkerHeartbeatRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.util.WorkerHeartbeatRequest.class, org.tensorflow.util.WorkerHeartbeatRequest.Builder.class);
  }

  public static final int SHUTDOWN_MODE_FIELD_NUMBER = 1;
  private int shutdownMode_ = 0;
  /**
   * <code>.tensorflow.WorkerShutdownMode shutdown_mode = 1;</code>
   * @return The enum numeric value on the wire for shutdownMode.
   */
  @java.lang.Override public int getShutdownModeValue() {
    return shutdownMode_;
  }
  /**
   * <code>.tensorflow.WorkerShutdownMode shutdown_mode = 1;</code>
   * @return The shutdownMode.
   */
  @java.lang.Override public org.tensorflow.util.WorkerShutdownMode getShutdownMode() {
    org.tensorflow.util.WorkerShutdownMode result = org.tensorflow.util.WorkerShutdownMode.forNumber(shutdownMode_);
    return result == null ? org.tensorflow.util.WorkerShutdownMode.UNRECOGNIZED : result;
  }

  public static final int WATCHDOG_CONFIG_FIELD_NUMBER = 2;
  private org.tensorflow.util.WatchdogConfig watchdogConfig_;
  /**
   * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
   * @return Whether the watchdogConfig field is set.
   */
  @java.lang.Override
  public boolean hasWatchdogConfig() {
    return watchdogConfig_ != null;
  }
  /**
   * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
   * @return The watchdogConfig.
   */
  @java.lang.Override
  public org.tensorflow.util.WatchdogConfig getWatchdogConfig() {
    return watchdogConfig_ == null ? org.tensorflow.util.WatchdogConfig.getDefaultInstance() : watchdogConfig_;
  }
  /**
   * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
   */
  @java.lang.Override
  public org.tensorflow.util.WatchdogConfigOrBuilder getWatchdogConfigOrBuilder() {
    return watchdogConfig_ == null ? org.tensorflow.util.WatchdogConfig.getDefaultInstance() : watchdogConfig_;
  }

  public static final int EXIT_CODE_FIELD_NUMBER = 3;
  private org.tensorflow.util.RequestedExitCode exitCode_;
  /**
   * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
   * @return Whether the exitCode field is set.
   */
  @java.lang.Override
  public boolean hasExitCode() {
    return exitCode_ != null;
  }
  /**
   * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
   * @return The exitCode.
   */
  @java.lang.Override
  public org.tensorflow.util.RequestedExitCode getExitCode() {
    return exitCode_ == null ? org.tensorflow.util.RequestedExitCode.getDefaultInstance() : exitCode_;
  }
  /**
   * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
   */
  @java.lang.Override
  public org.tensorflow.util.RequestedExitCodeOrBuilder getExitCodeOrBuilder() {
    return exitCode_ == null ? org.tensorflow.util.RequestedExitCode.getDefaultInstance() : exitCode_;
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
    if (shutdownMode_ != org.tensorflow.util.WorkerShutdownMode.DEFAULT.getNumber()) {
      output.writeEnum(1, shutdownMode_);
    }
    if (watchdogConfig_ != null) {
      output.writeMessage(2, getWatchdogConfig());
    }
    if (exitCode_ != null) {
      output.writeMessage(3, getExitCode());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (shutdownMode_ != org.tensorflow.util.WorkerShutdownMode.DEFAULT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, shutdownMode_);
    }
    if (watchdogConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getWatchdogConfig());
    }
    if (exitCode_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getExitCode());
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
    if (!(obj instanceof org.tensorflow.util.WorkerHeartbeatRequest)) {
      return super.equals(obj);
    }
    org.tensorflow.util.WorkerHeartbeatRequest other = (org.tensorflow.util.WorkerHeartbeatRequest) obj;

    if (shutdownMode_ != other.shutdownMode_) return false;
    if (hasWatchdogConfig() != other.hasWatchdogConfig()) return false;
    if (hasWatchdogConfig()) {
      if (!getWatchdogConfig()
          .equals(other.getWatchdogConfig())) return false;
    }
    if (hasExitCode() != other.hasExitCode()) return false;
    if (hasExitCode()) {
      if (!getExitCode()
          .equals(other.getExitCode())) return false;
    }
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
    hash = (37 * hash) + SHUTDOWN_MODE_FIELD_NUMBER;
    hash = (53 * hash) + shutdownMode_;
    if (hasWatchdogConfig()) {
      hash = (37 * hash) + WATCHDOG_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getWatchdogConfig().hashCode();
    }
    if (hasExitCode()) {
      hash = (37 * hash) + EXIT_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getExitCode().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.util.WorkerHeartbeatRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.WorkerHeartbeatRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.WorkerHeartbeatRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.WorkerHeartbeatRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.WorkerHeartbeatRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.WorkerHeartbeatRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.WorkerHeartbeatRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.WorkerHeartbeatRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.util.WorkerHeartbeatRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.WorkerHeartbeatRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.util.WorkerHeartbeatRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.WorkerHeartbeatRequest parseFrom(
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
  public static Builder newBuilder(org.tensorflow.util.WorkerHeartbeatRequest prototype) {
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
   * Protobuf type {@code tensorflow.WorkerHeartbeatRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.WorkerHeartbeatRequest)
      org.tensorflow.util.WorkerHeartbeatRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.util.EventProtos.internal_static_tensorflow_WorkerHeartbeatRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.util.EventProtos.internal_static_tensorflow_WorkerHeartbeatRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.util.WorkerHeartbeatRequest.class, org.tensorflow.util.WorkerHeartbeatRequest.Builder.class);
    }

    // Construct using org.tensorflow.util.WorkerHeartbeatRequest.newBuilder()
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
      shutdownMode_ = 0;
      watchdogConfig_ = null;
      if (watchdogConfigBuilder_ != null) {
        watchdogConfigBuilder_.dispose();
        watchdogConfigBuilder_ = null;
      }
      exitCode_ = null;
      if (exitCodeBuilder_ != null) {
        exitCodeBuilder_.dispose();
        exitCodeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.util.EventProtos.internal_static_tensorflow_WorkerHeartbeatRequest_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.util.WorkerHeartbeatRequest getDefaultInstanceForType() {
      return org.tensorflow.util.WorkerHeartbeatRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.util.WorkerHeartbeatRequest build() {
      org.tensorflow.util.WorkerHeartbeatRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.util.WorkerHeartbeatRequest buildPartial() {
      org.tensorflow.util.WorkerHeartbeatRequest result = new org.tensorflow.util.WorkerHeartbeatRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.tensorflow.util.WorkerHeartbeatRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.shutdownMode_ = shutdownMode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.watchdogConfig_ = watchdogConfigBuilder_ == null
            ? watchdogConfig_
            : watchdogConfigBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.exitCode_ = exitCodeBuilder_ == null
            ? exitCode_
            : exitCodeBuilder_.build();
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
      if (other instanceof org.tensorflow.util.WorkerHeartbeatRequest) {
        return mergeFrom((org.tensorflow.util.WorkerHeartbeatRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.util.WorkerHeartbeatRequest other) {
      if (other == org.tensorflow.util.WorkerHeartbeatRequest.getDefaultInstance()) return this;
      if (other.shutdownMode_ != 0) {
        setShutdownModeValue(other.getShutdownModeValue());
      }
      if (other.hasWatchdogConfig()) {
        mergeWatchdogConfig(other.getWatchdogConfig());
      }
      if (other.hasExitCode()) {
        mergeExitCode(other.getExitCode());
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
            case 8: {
              shutdownMode_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getWatchdogConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getExitCodeFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private int shutdownMode_ = 0;
    /**
     * <code>.tensorflow.WorkerShutdownMode shutdown_mode = 1;</code>
     * @return The enum numeric value on the wire for shutdownMode.
     */
    @java.lang.Override public int getShutdownModeValue() {
      return shutdownMode_;
    }
    /**
     * <code>.tensorflow.WorkerShutdownMode shutdown_mode = 1;</code>
     * @param value The enum numeric value on the wire for shutdownMode to set.
     * @return This builder for chaining.
     */
    public Builder setShutdownModeValue(int value) {
      shutdownMode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.WorkerShutdownMode shutdown_mode = 1;</code>
     * @return The shutdownMode.
     */
    @java.lang.Override
    public org.tensorflow.util.WorkerShutdownMode getShutdownMode() {
      org.tensorflow.util.WorkerShutdownMode result = org.tensorflow.util.WorkerShutdownMode.forNumber(shutdownMode_);
      return result == null ? org.tensorflow.util.WorkerShutdownMode.UNRECOGNIZED : result;
    }
    /**
     * <code>.tensorflow.WorkerShutdownMode shutdown_mode = 1;</code>
     * @param value The shutdownMode to set.
     * @return This builder for chaining.
     */
    public Builder setShutdownMode(org.tensorflow.util.WorkerShutdownMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      shutdownMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.WorkerShutdownMode shutdown_mode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearShutdownMode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      shutdownMode_ = 0;
      onChanged();
      return this;
    }

    private org.tensorflow.util.WatchdogConfig watchdogConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.util.WatchdogConfig, org.tensorflow.util.WatchdogConfig.Builder, org.tensorflow.util.WatchdogConfigOrBuilder> watchdogConfigBuilder_;
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     * @return Whether the watchdogConfig field is set.
     */
    public boolean hasWatchdogConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     * @return The watchdogConfig.
     */
    public org.tensorflow.util.WatchdogConfig getWatchdogConfig() {
      if (watchdogConfigBuilder_ == null) {
        return watchdogConfig_ == null ? org.tensorflow.util.WatchdogConfig.getDefaultInstance() : watchdogConfig_;
      } else {
        return watchdogConfigBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    public Builder setWatchdogConfig(org.tensorflow.util.WatchdogConfig value) {
      if (watchdogConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        watchdogConfig_ = value;
      } else {
        watchdogConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    public Builder setWatchdogConfig(
        org.tensorflow.util.WatchdogConfig.Builder builderForValue) {
      if (watchdogConfigBuilder_ == null) {
        watchdogConfig_ = builderForValue.build();
      } else {
        watchdogConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    public Builder mergeWatchdogConfig(org.tensorflow.util.WatchdogConfig value) {
      if (watchdogConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          watchdogConfig_ != null &&
          watchdogConfig_ != org.tensorflow.util.WatchdogConfig.getDefaultInstance()) {
          getWatchdogConfigBuilder().mergeFrom(value);
        } else {
          watchdogConfig_ = value;
        }
      } else {
        watchdogConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    public Builder clearWatchdogConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      watchdogConfig_ = null;
      if (watchdogConfigBuilder_ != null) {
        watchdogConfigBuilder_.dispose();
        watchdogConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    public org.tensorflow.util.WatchdogConfig.Builder getWatchdogConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWatchdogConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    public org.tensorflow.util.WatchdogConfigOrBuilder getWatchdogConfigOrBuilder() {
      if (watchdogConfigBuilder_ != null) {
        return watchdogConfigBuilder_.getMessageOrBuilder();
      } else {
        return watchdogConfig_ == null ?
            org.tensorflow.util.WatchdogConfig.getDefaultInstance() : watchdogConfig_;
      }
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.util.WatchdogConfig, org.tensorflow.util.WatchdogConfig.Builder, org.tensorflow.util.WatchdogConfigOrBuilder> 
        getWatchdogConfigFieldBuilder() {
      if (watchdogConfigBuilder_ == null) {
        watchdogConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.util.WatchdogConfig, org.tensorflow.util.WatchdogConfig.Builder, org.tensorflow.util.WatchdogConfigOrBuilder>(
                getWatchdogConfig(),
                getParentForChildren(),
                isClean());
        watchdogConfig_ = null;
      }
      return watchdogConfigBuilder_;
    }

    private org.tensorflow.util.RequestedExitCode exitCode_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.util.RequestedExitCode, org.tensorflow.util.RequestedExitCode.Builder, org.tensorflow.util.RequestedExitCodeOrBuilder> exitCodeBuilder_;
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     * @return Whether the exitCode field is set.
     */
    public boolean hasExitCode() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     * @return The exitCode.
     */
    public org.tensorflow.util.RequestedExitCode getExitCode() {
      if (exitCodeBuilder_ == null) {
        return exitCode_ == null ? org.tensorflow.util.RequestedExitCode.getDefaultInstance() : exitCode_;
      } else {
        return exitCodeBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    public Builder setExitCode(org.tensorflow.util.RequestedExitCode value) {
      if (exitCodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        exitCode_ = value;
      } else {
        exitCodeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    public Builder setExitCode(
        org.tensorflow.util.RequestedExitCode.Builder builderForValue) {
      if (exitCodeBuilder_ == null) {
        exitCode_ = builderForValue.build();
      } else {
        exitCodeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    public Builder mergeExitCode(org.tensorflow.util.RequestedExitCode value) {
      if (exitCodeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          exitCode_ != null &&
          exitCode_ != org.tensorflow.util.RequestedExitCode.getDefaultInstance()) {
          getExitCodeBuilder().mergeFrom(value);
        } else {
          exitCode_ = value;
        }
      } else {
        exitCodeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    public Builder clearExitCode() {
      bitField0_ = (bitField0_ & ~0x00000004);
      exitCode_ = null;
      if (exitCodeBuilder_ != null) {
        exitCodeBuilder_.dispose();
        exitCodeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    public org.tensorflow.util.RequestedExitCode.Builder getExitCodeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getExitCodeFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    public org.tensorflow.util.RequestedExitCodeOrBuilder getExitCodeOrBuilder() {
      if (exitCodeBuilder_ != null) {
        return exitCodeBuilder_.getMessageOrBuilder();
      } else {
        return exitCode_ == null ?
            org.tensorflow.util.RequestedExitCode.getDefaultInstance() : exitCode_;
      }
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.util.RequestedExitCode, org.tensorflow.util.RequestedExitCode.Builder, org.tensorflow.util.RequestedExitCodeOrBuilder> 
        getExitCodeFieldBuilder() {
      if (exitCodeBuilder_ == null) {
        exitCodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.util.RequestedExitCode, org.tensorflow.util.RequestedExitCode.Builder, org.tensorflow.util.RequestedExitCodeOrBuilder>(
                getExitCode(),
                getParentForChildren(),
                isClean());
        exitCode_ = null;
      }
      return exitCodeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.WorkerHeartbeatRequest)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.WorkerHeartbeatRequest)
  private static final org.tensorflow.util.WorkerHeartbeatRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.util.WorkerHeartbeatRequest();
  }

  public static org.tensorflow.util.WorkerHeartbeatRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkerHeartbeatRequest>
      PARSER = new com.google.protobuf.AbstractParser<WorkerHeartbeatRequest>() {
    @java.lang.Override
    public WorkerHeartbeatRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<WorkerHeartbeatRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkerHeartbeatRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.util.WorkerHeartbeatRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

