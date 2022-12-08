// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/op_def.proto

package org.tensorflow.framework;

/**
 * <pre>
 * A collection of OpDefs
 * </pre>
 *
 * Protobuf type {@code tensorflow.OpList}
 */
public final class OpList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.OpList)
    OpListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OpList.newBuilder() to construct.
  private OpList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OpList() {
    op_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OpList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.OpDefProtos.internal_static_tensorflow_OpList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.OpDefProtos.internal_static_tensorflow_OpList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.OpList.class, org.tensorflow.framework.OpList.Builder.class);
  }

  public static final int OP_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.tensorflow.framework.OpDef> op_;
  /**
   * <code>repeated .tensorflow.OpDef op = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.tensorflow.framework.OpDef> getOpList() {
    return op_;
  }
  /**
   * <code>repeated .tensorflow.OpDef op = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.tensorflow.framework.OpDefOrBuilder> 
      getOpOrBuilderList() {
    return op_;
  }
  /**
   * <code>repeated .tensorflow.OpDef op = 1;</code>
   */
  @java.lang.Override
  public int getOpCount() {
    return op_.size();
  }
  /**
   * <code>repeated .tensorflow.OpDef op = 1;</code>
   */
  @java.lang.Override
  public org.tensorflow.framework.OpDef getOp(int index) {
    return op_.get(index);
  }
  /**
   * <code>repeated .tensorflow.OpDef op = 1;</code>
   */
  @java.lang.Override
  public org.tensorflow.framework.OpDefOrBuilder getOpOrBuilder(
      int index) {
    return op_.get(index);
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
    for (int i = 0; i < op_.size(); i++) {
      output.writeMessage(1, op_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < op_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, op_.get(i));
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
    if (!(obj instanceof org.tensorflow.framework.OpList)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.OpList other = (org.tensorflow.framework.OpList) obj;

    if (!getOpList()
        .equals(other.getOpList())) return false;
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
    if (getOpCount() > 0) {
      hash = (37 * hash) + OP_FIELD_NUMBER;
      hash = (53 * hash) + getOpList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.OpList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.OpList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.OpList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.OpList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.OpList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.OpList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.OpList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.OpList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.OpList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.OpList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.OpList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.OpList parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.OpList prototype) {
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
   * A collection of OpDefs
   * </pre>
   *
   * Protobuf type {@code tensorflow.OpList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.OpList)
      org.tensorflow.framework.OpListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.OpDefProtos.internal_static_tensorflow_OpList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.OpDefProtos.internal_static_tensorflow_OpList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.OpList.class, org.tensorflow.framework.OpList.Builder.class);
    }

    // Construct using org.tensorflow.framework.OpList.newBuilder()
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
      if (opBuilder_ == null) {
        op_ = java.util.Collections.emptyList();
      } else {
        op_ = null;
        opBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.OpDefProtos.internal_static_tensorflow_OpList_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.OpList getDefaultInstanceForType() {
      return org.tensorflow.framework.OpList.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.OpList build() {
      org.tensorflow.framework.OpList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.OpList buildPartial() {
      org.tensorflow.framework.OpList result = new org.tensorflow.framework.OpList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.tensorflow.framework.OpList result) {
      if (opBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          op_ = java.util.Collections.unmodifiableList(op_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.op_ = op_;
      } else {
        result.op_ = opBuilder_.build();
      }
    }

    private void buildPartial0(org.tensorflow.framework.OpList result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof org.tensorflow.framework.OpList) {
        return mergeFrom((org.tensorflow.framework.OpList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.OpList other) {
      if (other == org.tensorflow.framework.OpList.getDefaultInstance()) return this;
      if (opBuilder_ == null) {
        if (!other.op_.isEmpty()) {
          if (op_.isEmpty()) {
            op_ = other.op_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOpIsMutable();
            op_.addAll(other.op_);
          }
          onChanged();
        }
      } else {
        if (!other.op_.isEmpty()) {
          if (opBuilder_.isEmpty()) {
            opBuilder_.dispose();
            opBuilder_ = null;
            op_ = other.op_;
            bitField0_ = (bitField0_ & ~0x00000001);
            opBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOpFieldBuilder() : null;
          } else {
            opBuilder_.addAllMessages(other.op_);
          }
        }
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
              org.tensorflow.framework.OpDef m =
                  input.readMessage(
                      org.tensorflow.framework.OpDef.parser(),
                      extensionRegistry);
              if (opBuilder_ == null) {
                ensureOpIsMutable();
                op_.add(m);
              } else {
                opBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<org.tensorflow.framework.OpDef> op_ =
      java.util.Collections.emptyList();
    private void ensureOpIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        op_ = new java.util.ArrayList<org.tensorflow.framework.OpDef>(op_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.OpDef, org.tensorflow.framework.OpDef.Builder, org.tensorflow.framework.OpDefOrBuilder> opBuilder_;

    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public java.util.List<org.tensorflow.framework.OpDef> getOpList() {
      if (opBuilder_ == null) {
        return java.util.Collections.unmodifiableList(op_);
      } else {
        return opBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public int getOpCount() {
      if (opBuilder_ == null) {
        return op_.size();
      } else {
        return opBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public org.tensorflow.framework.OpDef getOp(int index) {
      if (opBuilder_ == null) {
        return op_.get(index);
      } else {
        return opBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public Builder setOp(
        int index, org.tensorflow.framework.OpDef value) {
      if (opBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOpIsMutable();
        op_.set(index, value);
        onChanged();
      } else {
        opBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public Builder setOp(
        int index, org.tensorflow.framework.OpDef.Builder builderForValue) {
      if (opBuilder_ == null) {
        ensureOpIsMutable();
        op_.set(index, builderForValue.build());
        onChanged();
      } else {
        opBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public Builder addOp(org.tensorflow.framework.OpDef value) {
      if (opBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOpIsMutable();
        op_.add(value);
        onChanged();
      } else {
        opBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public Builder addOp(
        int index, org.tensorflow.framework.OpDef value) {
      if (opBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOpIsMutable();
        op_.add(index, value);
        onChanged();
      } else {
        opBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public Builder addOp(
        org.tensorflow.framework.OpDef.Builder builderForValue) {
      if (opBuilder_ == null) {
        ensureOpIsMutable();
        op_.add(builderForValue.build());
        onChanged();
      } else {
        opBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public Builder addOp(
        int index, org.tensorflow.framework.OpDef.Builder builderForValue) {
      if (opBuilder_ == null) {
        ensureOpIsMutable();
        op_.add(index, builderForValue.build());
        onChanged();
      } else {
        opBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public Builder addAllOp(
        java.lang.Iterable<? extends org.tensorflow.framework.OpDef> values) {
      if (opBuilder_ == null) {
        ensureOpIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, op_);
        onChanged();
      } else {
        opBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public Builder clearOp() {
      if (opBuilder_ == null) {
        op_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        opBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public Builder removeOp(int index) {
      if (opBuilder_ == null) {
        ensureOpIsMutable();
        op_.remove(index);
        onChanged();
      } else {
        opBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public org.tensorflow.framework.OpDef.Builder getOpBuilder(
        int index) {
      return getOpFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public org.tensorflow.framework.OpDefOrBuilder getOpOrBuilder(
        int index) {
      if (opBuilder_ == null) {
        return op_.get(index);  } else {
        return opBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public java.util.List<? extends org.tensorflow.framework.OpDefOrBuilder> 
         getOpOrBuilderList() {
      if (opBuilder_ != null) {
        return opBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(op_);
      }
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public org.tensorflow.framework.OpDef.Builder addOpBuilder() {
      return getOpFieldBuilder().addBuilder(
          org.tensorflow.framework.OpDef.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public org.tensorflow.framework.OpDef.Builder addOpBuilder(
        int index) {
      return getOpFieldBuilder().addBuilder(
          index, org.tensorflow.framework.OpDef.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.OpDef op = 1;</code>
     */
    public java.util.List<org.tensorflow.framework.OpDef.Builder> 
         getOpBuilderList() {
      return getOpFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.OpDef, org.tensorflow.framework.OpDef.Builder, org.tensorflow.framework.OpDefOrBuilder> 
        getOpFieldBuilder() {
      if (opBuilder_ == null) {
        opBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.framework.OpDef, org.tensorflow.framework.OpDef.Builder, org.tensorflow.framework.OpDefOrBuilder>(
                op_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        op_ = null;
      }
      return opBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.OpList)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.OpList)
  private static final org.tensorflow.framework.OpList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.OpList();
  }

  public static org.tensorflow.framework.OpList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpList>
      PARSER = new com.google.protobuf.AbstractParser<OpList>() {
    @java.lang.Override
    public OpList parsePartialFrom(
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

  public static com.google.protobuf.Parser<OpList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.OpList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

