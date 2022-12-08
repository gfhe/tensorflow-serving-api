// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/graph_transfer_info.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.GraphTransferNodeOutputInfo}
 */
public final class GraphTransferNodeOutputInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.GraphTransferNodeOutputInfo)
    GraphTransferNodeOutputInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GraphTransferNodeOutputInfo.newBuilder() to construct.
  private GraphTransferNodeOutputInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GraphTransferNodeOutputInfo() {
    maxByteSize_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GraphTransferNodeOutputInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.GraphTransferInfoProto.internal_static_tensorflow_GraphTransferNodeOutputInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.GraphTransferInfoProto.internal_static_tensorflow_GraphTransferNodeOutputInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.GraphTransferNodeOutputInfo.class, org.tensorflow.framework.GraphTransferNodeOutputInfo.Builder.class);
  }

  public static final int NODE_ID_FIELD_NUMBER = 1;
  private int nodeId_ = 0;
  /**
   * <code>int32 node_id = 1;</code>
   * @return The nodeId.
   */
  @java.lang.Override
  public int getNodeId() {
    return nodeId_;
  }

  public static final int MAX_BYTE_SIZE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList maxByteSize_;
  /**
   * <code>repeated int32 max_byte_size = 2;</code>
   * @return A list containing the maxByteSize.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getMaxByteSizeList() {
    return maxByteSize_;
  }
  /**
   * <code>repeated int32 max_byte_size = 2;</code>
   * @return The count of maxByteSize.
   */
  public int getMaxByteSizeCount() {
    return maxByteSize_.size();
  }
  /**
   * <code>repeated int32 max_byte_size = 2;</code>
   * @param index The index of the element to return.
   * @return The maxByteSize at the given index.
   */
  public int getMaxByteSize(int index) {
    return maxByteSize_.getInt(index);
  }
  private int maxByteSizeMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (nodeId_ != 0) {
      output.writeInt32(1, nodeId_);
    }
    if (getMaxByteSizeList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(maxByteSizeMemoizedSerializedSize);
    }
    for (int i = 0; i < maxByteSize_.size(); i++) {
      output.writeInt32NoTag(maxByteSize_.getInt(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nodeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, nodeId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < maxByteSize_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(maxByteSize_.getInt(i));
      }
      size += dataSize;
      if (!getMaxByteSizeList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      maxByteSizeMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof org.tensorflow.framework.GraphTransferNodeOutputInfo)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.GraphTransferNodeOutputInfo other = (org.tensorflow.framework.GraphTransferNodeOutputInfo) obj;

    if (getNodeId()
        != other.getNodeId()) return false;
    if (!getMaxByteSizeList()
        .equals(other.getMaxByteSizeList())) return false;
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
    hash = (37 * hash) + NODE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNodeId();
    if (getMaxByteSizeCount() > 0) {
      hash = (37 * hash) + MAX_BYTE_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxByteSizeList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.GraphTransferNodeOutputInfo prototype) {
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
   * Protobuf type {@code tensorflow.GraphTransferNodeOutputInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.GraphTransferNodeOutputInfo)
      org.tensorflow.framework.GraphTransferNodeOutputInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.GraphTransferInfoProto.internal_static_tensorflow_GraphTransferNodeOutputInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.GraphTransferInfoProto.internal_static_tensorflow_GraphTransferNodeOutputInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.GraphTransferNodeOutputInfo.class, org.tensorflow.framework.GraphTransferNodeOutputInfo.Builder.class);
    }

    // Construct using org.tensorflow.framework.GraphTransferNodeOutputInfo.newBuilder()
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
      nodeId_ = 0;
      maxByteSize_ = emptyIntList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.GraphTransferInfoProto.internal_static_tensorflow_GraphTransferNodeOutputInfo_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.GraphTransferNodeOutputInfo getDefaultInstanceForType() {
      return org.tensorflow.framework.GraphTransferNodeOutputInfo.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.GraphTransferNodeOutputInfo build() {
      org.tensorflow.framework.GraphTransferNodeOutputInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.GraphTransferNodeOutputInfo buildPartial() {
      org.tensorflow.framework.GraphTransferNodeOutputInfo result = new org.tensorflow.framework.GraphTransferNodeOutputInfo(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.tensorflow.framework.GraphTransferNodeOutputInfo result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        maxByteSize_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.maxByteSize_ = maxByteSize_;
    }

    private void buildPartial0(org.tensorflow.framework.GraphTransferNodeOutputInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nodeId_ = nodeId_;
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
      if (other instanceof org.tensorflow.framework.GraphTransferNodeOutputInfo) {
        return mergeFrom((org.tensorflow.framework.GraphTransferNodeOutputInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.GraphTransferNodeOutputInfo other) {
      if (other == org.tensorflow.framework.GraphTransferNodeOutputInfo.getDefaultInstance()) return this;
      if (other.getNodeId() != 0) {
        setNodeId(other.getNodeId());
      }
      if (!other.maxByteSize_.isEmpty()) {
        if (maxByteSize_.isEmpty()) {
          maxByteSize_ = other.maxByteSize_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureMaxByteSizeIsMutable();
          maxByteSize_.addAll(other.maxByteSize_);
        }
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
            case 8: {
              nodeId_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              int v = input.readInt32();
              ensureMaxByteSizeIsMutable();
              maxByteSize_.addInt(v);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureMaxByteSizeIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                maxByteSize_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            } // case 18
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

    private int nodeId_ ;
    /**
     * <code>int32 node_id = 1;</code>
     * @return The nodeId.
     */
    @java.lang.Override
    public int getNodeId() {
      return nodeId_;
    }
    /**
     * <code>int32 node_id = 1;</code>
     * @param value The nodeId to set.
     * @return This builder for chaining.
     */
    public Builder setNodeId(int value) {
      
      nodeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 node_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNodeId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      nodeId_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList maxByteSize_ = emptyIntList();
    private void ensureMaxByteSizeIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        maxByteSize_ = mutableCopy(maxByteSize_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <code>repeated int32 max_byte_size = 2;</code>
     * @return A list containing the maxByteSize.
     */
    public java.util.List<java.lang.Integer>
        getMaxByteSizeList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(maxByteSize_) : maxByteSize_;
    }
    /**
     * <code>repeated int32 max_byte_size = 2;</code>
     * @return The count of maxByteSize.
     */
    public int getMaxByteSizeCount() {
      return maxByteSize_.size();
    }
    /**
     * <code>repeated int32 max_byte_size = 2;</code>
     * @param index The index of the element to return.
     * @return The maxByteSize at the given index.
     */
    public int getMaxByteSize(int index) {
      return maxByteSize_.getInt(index);
    }
    /**
     * <code>repeated int32 max_byte_size = 2;</code>
     * @param index The index to set the value at.
     * @param value The maxByteSize to set.
     * @return This builder for chaining.
     */
    public Builder setMaxByteSize(
        int index, int value) {
      
      ensureMaxByteSizeIsMutable();
      maxByteSize_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 max_byte_size = 2;</code>
     * @param value The maxByteSize to add.
     * @return This builder for chaining.
     */
    public Builder addMaxByteSize(int value) {
      
      ensureMaxByteSizeIsMutable();
      maxByteSize_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 max_byte_size = 2;</code>
     * @param values The maxByteSize to add.
     * @return This builder for chaining.
     */
    public Builder addAllMaxByteSize(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureMaxByteSizeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, maxByteSize_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 max_byte_size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxByteSize() {
      maxByteSize_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.GraphTransferNodeOutputInfo)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.GraphTransferNodeOutputInfo)
  private static final org.tensorflow.framework.GraphTransferNodeOutputInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.GraphTransferNodeOutputInfo();
  }

  public static org.tensorflow.framework.GraphTransferNodeOutputInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GraphTransferNodeOutputInfo>
      PARSER = new com.google.protobuf.AbstractParser<GraphTransferNodeOutputInfo>() {
    @java.lang.Override
    public GraphTransferNodeOutputInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<GraphTransferNodeOutputInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GraphTransferNodeOutputInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.GraphTransferNodeOutputInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

