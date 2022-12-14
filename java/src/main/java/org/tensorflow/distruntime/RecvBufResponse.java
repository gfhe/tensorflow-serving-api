// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

/**
 * <pre>
 * Use of the fields below may vary by implementation.  Comments give
 * intended use.
 * </pre>
 *
 * Protobuf type {@code tensorflow.RecvBufResponse}
 */
public final class RecvBufResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.RecvBufResponse)
    RecvBufResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecvBufResponse.newBuilder() to construct.
  private RecvBufResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecvBufResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecvBufResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_RecvBufResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_RecvBufResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.RecvBufResponse.class, org.tensorflow.distruntime.RecvBufResponse.Builder.class);
  }

  public static final int BUF_PTR_FIELD_NUMBER = 1;
  private long bufPtr_ = 0L;
  /**
   * <pre>
   * Address of source field on server.
   * </pre>
   *
   * <code>fixed64 buf_ptr = 1;</code>
   * @return The bufPtr.
   */
  @java.lang.Override
  public long getBufPtr() {
    return bufPtr_;
  }

  public static final int NUM_BYTES_FIELD_NUMBER = 2;
  private long numBytes_ = 0L;
  /**
   * <pre>
   * Byte length of buf_ptr field, if set.
   * </pre>
   *
   * <code>int64 num_bytes = 2;</code>
   * @return The numBytes.
   */
  @java.lang.Override
  public long getNumBytes() {
    return numBytes_;
  }

  public static final int IS_DEAD_FIELD_NUMBER = 3;
  private boolean isDead_ = false;
  /**
   * <pre>
   * True if value is 'dead' like a tensor.
   * </pre>
   *
   * <code>bool is_dead = 3;</code>
   * @return The isDead.
   */
  @java.lang.Override
  public boolean getIsDead() {
    return isDead_;
  }

  public static final int TRANSPORT_OPTIONS_FIELD_NUMBER = 4;
  private com.google.protobuf.Any transportOptions_;
  /**
   * <pre>
   * Optional, implementation-specific data.
   * </pre>
   *
   * <code>.google.protobuf.Any transport_options = 4;</code>
   * @return Whether the transportOptions field is set.
   */
  @java.lang.Override
  public boolean hasTransportOptions() {
    return transportOptions_ != null;
  }
  /**
   * <pre>
   * Optional, implementation-specific data.
   * </pre>
   *
   * <code>.google.protobuf.Any transport_options = 4;</code>
   * @return The transportOptions.
   */
  @java.lang.Override
  public com.google.protobuf.Any getTransportOptions() {
    return transportOptions_ == null ? com.google.protobuf.Any.getDefaultInstance() : transportOptions_;
  }
  /**
   * <pre>
   * Optional, implementation-specific data.
   * </pre>
   *
   * <code>.google.protobuf.Any transport_options = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getTransportOptionsOrBuilder() {
    return transportOptions_ == null ? com.google.protobuf.Any.getDefaultInstance() : transportOptions_;
  }

  public static final int SEND_START_MICROS_FIELD_NUMBER = 5;
  private long sendStartMicros_ = 0L;
  /**
   * <pre>
   * Optional, for timeline.
   * </pre>
   *
   * <code>int64 send_start_micros = 5;</code>
   * @return The sendStartMicros.
   */
  @java.lang.Override
  public long getSendStartMicros() {
    return sendStartMicros_;
  }

  public static final int REQUIRE_ACK_FIELD_NUMBER = 6;
  private boolean requireAck_ = false;
  /**
   * <pre>
   * Whether the receiver should send a MarkRecvFinishedRequest to the sender
   * to ack the message.
   * </pre>
   *
   * <code>bool require_ack = 6;</code>
   * @return The requireAck.
   */
  @java.lang.Override
  public boolean getRequireAck() {
    return requireAck_;
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
    if (bufPtr_ != 0L) {
      output.writeFixed64(1, bufPtr_);
    }
    if (numBytes_ != 0L) {
      output.writeInt64(2, numBytes_);
    }
    if (isDead_ != false) {
      output.writeBool(3, isDead_);
    }
    if (transportOptions_ != null) {
      output.writeMessage(4, getTransportOptions());
    }
    if (sendStartMicros_ != 0L) {
      output.writeInt64(5, sendStartMicros_);
    }
    if (requireAck_ != false) {
      output.writeBool(6, requireAck_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bufPtr_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(1, bufPtr_);
    }
    if (numBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, numBytes_);
    }
    if (isDead_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isDead_);
    }
    if (transportOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getTransportOptions());
    }
    if (sendStartMicros_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, sendStartMicros_);
    }
    if (requireAck_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, requireAck_);
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
    if (!(obj instanceof org.tensorflow.distruntime.RecvBufResponse)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.RecvBufResponse other = (org.tensorflow.distruntime.RecvBufResponse) obj;

    if (getBufPtr()
        != other.getBufPtr()) return false;
    if (getNumBytes()
        != other.getNumBytes()) return false;
    if (getIsDead()
        != other.getIsDead()) return false;
    if (hasTransportOptions() != other.hasTransportOptions()) return false;
    if (hasTransportOptions()) {
      if (!getTransportOptions()
          .equals(other.getTransportOptions())) return false;
    }
    if (getSendStartMicros()
        != other.getSendStartMicros()) return false;
    if (getRequireAck()
        != other.getRequireAck()) return false;
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
    hash = (37 * hash) + BUF_PTR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBufPtr());
    hash = (37 * hash) + NUM_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumBytes());
    hash = (37 * hash) + IS_DEAD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsDead());
    if (hasTransportOptions()) {
      hash = (37 * hash) + TRANSPORT_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getTransportOptions().hashCode();
    }
    hash = (37 * hash) + SEND_START_MICROS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSendStartMicros());
    hash = (37 * hash) + REQUIRE_ACK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRequireAck());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.RecvBufResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.RecvBufResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.RecvBufResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.RecvBufResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.RecvBufResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.RecvBufResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.RecvBufResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.RecvBufResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.RecvBufResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.RecvBufResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.RecvBufResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.RecvBufResponse parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.RecvBufResponse prototype) {
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
   * <pre>
   * Use of the fields below may vary by implementation.  Comments give
   * intended use.
   * </pre>
   *
   * Protobuf type {@code tensorflow.RecvBufResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.RecvBufResponse)
      org.tensorflow.distruntime.RecvBufResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_RecvBufResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_RecvBufResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.RecvBufResponse.class, org.tensorflow.distruntime.RecvBufResponse.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.RecvBufResponse.newBuilder()
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
      bufPtr_ = 0L;
      numBytes_ = 0L;
      isDead_ = false;
      transportOptions_ = null;
      if (transportOptionsBuilder_ != null) {
        transportOptionsBuilder_.dispose();
        transportOptionsBuilder_ = null;
      }
      sendStartMicros_ = 0L;
      requireAck_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_RecvBufResponse_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.RecvBufResponse getDefaultInstanceForType() {
      return org.tensorflow.distruntime.RecvBufResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.RecvBufResponse build() {
      org.tensorflow.distruntime.RecvBufResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.RecvBufResponse buildPartial() {
      org.tensorflow.distruntime.RecvBufResponse result = new org.tensorflow.distruntime.RecvBufResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.tensorflow.distruntime.RecvBufResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bufPtr_ = bufPtr_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.numBytes_ = numBytes_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.isDead_ = isDead_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.transportOptions_ = transportOptionsBuilder_ == null
            ? transportOptions_
            : transportOptionsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.sendStartMicros_ = sendStartMicros_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.requireAck_ = requireAck_;
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
      if (other instanceof org.tensorflow.distruntime.RecvBufResponse) {
        return mergeFrom((org.tensorflow.distruntime.RecvBufResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.RecvBufResponse other) {
      if (other == org.tensorflow.distruntime.RecvBufResponse.getDefaultInstance()) return this;
      if (other.getBufPtr() != 0L) {
        setBufPtr(other.getBufPtr());
      }
      if (other.getNumBytes() != 0L) {
        setNumBytes(other.getNumBytes());
      }
      if (other.getIsDead() != false) {
        setIsDead(other.getIsDead());
      }
      if (other.hasTransportOptions()) {
        mergeTransportOptions(other.getTransportOptions());
      }
      if (other.getSendStartMicros() != 0L) {
        setSendStartMicros(other.getSendStartMicros());
      }
      if (other.getRequireAck() != false) {
        setRequireAck(other.getRequireAck());
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
            case 9: {
              bufPtr_ = input.readFixed64();
              bitField0_ |= 0x00000001;
              break;
            } // case 9
            case 16: {
              numBytes_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              isDead_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getTransportOptionsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              sendStartMicros_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              requireAck_ = input.readBool();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private long bufPtr_ ;
    /**
     * <pre>
     * Address of source field on server.
     * </pre>
     *
     * <code>fixed64 buf_ptr = 1;</code>
     * @return The bufPtr.
     */
    @java.lang.Override
    public long getBufPtr() {
      return bufPtr_;
    }
    /**
     * <pre>
     * Address of source field on server.
     * </pre>
     *
     * <code>fixed64 buf_ptr = 1;</code>
     * @param value The bufPtr to set.
     * @return This builder for chaining.
     */
    public Builder setBufPtr(long value) {
      
      bufPtr_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of source field on server.
     * </pre>
     *
     * <code>fixed64 buf_ptr = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBufPtr() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bufPtr_ = 0L;
      onChanged();
      return this;
    }

    private long numBytes_ ;
    /**
     * <pre>
     * Byte length of buf_ptr field, if set.
     * </pre>
     *
     * <code>int64 num_bytes = 2;</code>
     * @return The numBytes.
     */
    @java.lang.Override
    public long getNumBytes() {
      return numBytes_;
    }
    /**
     * <pre>
     * Byte length of buf_ptr field, if set.
     * </pre>
     *
     * <code>int64 num_bytes = 2;</code>
     * @param value The numBytes to set.
     * @return This builder for chaining.
     */
    public Builder setNumBytes(long value) {
      
      numBytes_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Byte length of buf_ptr field, if set.
     * </pre>
     *
     * <code>int64 num_bytes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumBytes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      numBytes_ = 0L;
      onChanged();
      return this;
    }

    private boolean isDead_ ;
    /**
     * <pre>
     * True if value is 'dead' like a tensor.
     * </pre>
     *
     * <code>bool is_dead = 3;</code>
     * @return The isDead.
     */
    @java.lang.Override
    public boolean getIsDead() {
      return isDead_;
    }
    /**
     * <pre>
     * True if value is 'dead' like a tensor.
     * </pre>
     *
     * <code>bool is_dead = 3;</code>
     * @param value The isDead to set.
     * @return This builder for chaining.
     */
    public Builder setIsDead(boolean value) {
      
      isDead_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if value is 'dead' like a tensor.
     * </pre>
     *
     * <code>bool is_dead = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsDead() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isDead_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any transportOptions_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> transportOptionsBuilder_;
    /**
     * <pre>
     * Optional, implementation-specific data.
     * </pre>
     *
     * <code>.google.protobuf.Any transport_options = 4;</code>
     * @return Whether the transportOptions field is set.
     */
    public boolean hasTransportOptions() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Optional, implementation-specific data.
     * </pre>
     *
     * <code>.google.protobuf.Any transport_options = 4;</code>
     * @return The transportOptions.
     */
    public com.google.protobuf.Any getTransportOptions() {
      if (transportOptionsBuilder_ == null) {
        return transportOptions_ == null ? com.google.protobuf.Any.getDefaultInstance() : transportOptions_;
      } else {
        return transportOptionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional, implementation-specific data.
     * </pre>
     *
     * <code>.google.protobuf.Any transport_options = 4;</code>
     */
    public Builder setTransportOptions(com.google.protobuf.Any value) {
      if (transportOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transportOptions_ = value;
      } else {
        transportOptionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional, implementation-specific data.
     * </pre>
     *
     * <code>.google.protobuf.Any transport_options = 4;</code>
     */
    public Builder setTransportOptions(
        com.google.protobuf.Any.Builder builderForValue) {
      if (transportOptionsBuilder_ == null) {
        transportOptions_ = builderForValue.build();
      } else {
        transportOptionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional, implementation-specific data.
     * </pre>
     *
     * <code>.google.protobuf.Any transport_options = 4;</code>
     */
    public Builder mergeTransportOptions(com.google.protobuf.Any value) {
      if (transportOptionsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          transportOptions_ != null &&
          transportOptions_ != com.google.protobuf.Any.getDefaultInstance()) {
          getTransportOptionsBuilder().mergeFrom(value);
        } else {
          transportOptions_ = value;
        }
      } else {
        transportOptionsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional, implementation-specific data.
     * </pre>
     *
     * <code>.google.protobuf.Any transport_options = 4;</code>
     */
    public Builder clearTransportOptions() {
      bitField0_ = (bitField0_ & ~0x00000008);
      transportOptions_ = null;
      if (transportOptionsBuilder_ != null) {
        transportOptionsBuilder_.dispose();
        transportOptionsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional, implementation-specific data.
     * </pre>
     *
     * <code>.google.protobuf.Any transport_options = 4;</code>
     */
    public com.google.protobuf.Any.Builder getTransportOptionsBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getTransportOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional, implementation-specific data.
     * </pre>
     *
     * <code>.google.protobuf.Any transport_options = 4;</code>
     */
    public com.google.protobuf.AnyOrBuilder getTransportOptionsOrBuilder() {
      if (transportOptionsBuilder_ != null) {
        return transportOptionsBuilder_.getMessageOrBuilder();
      } else {
        return transportOptions_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : transportOptions_;
      }
    }
    /**
     * <pre>
     * Optional, implementation-specific data.
     * </pre>
     *
     * <code>.google.protobuf.Any transport_options = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getTransportOptionsFieldBuilder() {
      if (transportOptionsBuilder_ == null) {
        transportOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getTransportOptions(),
                getParentForChildren(),
                isClean());
        transportOptions_ = null;
      }
      return transportOptionsBuilder_;
    }

    private long sendStartMicros_ ;
    /**
     * <pre>
     * Optional, for timeline.
     * </pre>
     *
     * <code>int64 send_start_micros = 5;</code>
     * @return The sendStartMicros.
     */
    @java.lang.Override
    public long getSendStartMicros() {
      return sendStartMicros_;
    }
    /**
     * <pre>
     * Optional, for timeline.
     * </pre>
     *
     * <code>int64 send_start_micros = 5;</code>
     * @param value The sendStartMicros to set.
     * @return This builder for chaining.
     */
    public Builder setSendStartMicros(long value) {
      
      sendStartMicros_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional, for timeline.
     * </pre>
     *
     * <code>int64 send_start_micros = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSendStartMicros() {
      bitField0_ = (bitField0_ & ~0x00000010);
      sendStartMicros_ = 0L;
      onChanged();
      return this;
    }

    private boolean requireAck_ ;
    /**
     * <pre>
     * Whether the receiver should send a MarkRecvFinishedRequest to the sender
     * to ack the message.
     * </pre>
     *
     * <code>bool require_ack = 6;</code>
     * @return The requireAck.
     */
    @java.lang.Override
    public boolean getRequireAck() {
      return requireAck_;
    }
    /**
     * <pre>
     * Whether the receiver should send a MarkRecvFinishedRequest to the sender
     * to ack the message.
     * </pre>
     *
     * <code>bool require_ack = 6;</code>
     * @param value The requireAck to set.
     * @return This builder for chaining.
     */
    public Builder setRequireAck(boolean value) {
      
      requireAck_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the receiver should send a MarkRecvFinishedRequest to the sender
     * to ack the message.
     * </pre>
     *
     * <code>bool require_ack = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequireAck() {
      bitField0_ = (bitField0_ & ~0x00000020);
      requireAck_ = false;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.RecvBufResponse)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.RecvBufResponse)
  private static final org.tensorflow.distruntime.RecvBufResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.RecvBufResponse();
  }

  public static org.tensorflow.distruntime.RecvBufResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecvBufResponse>
      PARSER = new com.google.protobuf.AbstractParser<RecvBufResponse>() {
    @java.lang.Override
    public RecvBufResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecvBufResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecvBufResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.RecvBufResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

