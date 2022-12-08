// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/named_tensor.proto

package org.tensorflow.framework;

/**
 * <pre>
 * A pair of tensor name and tensor values.
 * </pre>
 *
 * Protobuf type {@code tensorflow.NamedTensorProto}
 */
public final class NamedTensorProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.NamedTensorProto)
    NamedTensorProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NamedTensorProto.newBuilder() to construct.
  private NamedTensorProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NamedTensorProto() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NamedTensorProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.NamedTensorProtos.internal_static_tensorflow_NamedTensorProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.NamedTensorProtos.internal_static_tensorflow_NamedTensorProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.NamedTensorProto.class, org.tensorflow.framework.NamedTensorProto.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Name of the tensor.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the tensor.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TENSOR_FIELD_NUMBER = 2;
  private org.tensorflow.framework.TensorProto tensor_;
  /**
   * <pre>
   * The client can populate a TensorProto using a tensorflow::Tensor`, or
   * directly using the protobuf field accessors.
   * The client specifies whether the returned tensor values should be
   * filled tensor fields (float_val, int_val, etc.) or encoded in a
   * compact form in tensor.tensor_content.
   * </pre>
   *
   * <code>.tensorflow.TensorProto tensor = 2;</code>
   * @return Whether the tensor field is set.
   */
  @java.lang.Override
  public boolean hasTensor() {
    return tensor_ != null;
  }
  /**
   * <pre>
   * The client can populate a TensorProto using a tensorflow::Tensor`, or
   * directly using the protobuf field accessors.
   * The client specifies whether the returned tensor values should be
   * filled tensor fields (float_val, int_val, etc.) or encoded in a
   * compact form in tensor.tensor_content.
   * </pre>
   *
   * <code>.tensorflow.TensorProto tensor = 2;</code>
   * @return The tensor.
   */
  @java.lang.Override
  public org.tensorflow.framework.TensorProto getTensor() {
    return tensor_ == null ? org.tensorflow.framework.TensorProto.getDefaultInstance() : tensor_;
  }
  /**
   * <pre>
   * The client can populate a TensorProto using a tensorflow::Tensor`, or
   * directly using the protobuf field accessors.
   * The client specifies whether the returned tensor values should be
   * filled tensor fields (float_val, int_val, etc.) or encoded in a
   * compact form in tensor.tensor_content.
   * </pre>
   *
   * <code>.tensorflow.TensorProto tensor = 2;</code>
   */
  @java.lang.Override
  public org.tensorflow.framework.TensorProtoOrBuilder getTensorOrBuilder() {
    return tensor_ == null ? org.tensorflow.framework.TensorProto.getDefaultInstance() : tensor_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (tensor_ != null) {
      output.writeMessage(2, getTensor());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (tensor_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTensor());
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
    if (!(obj instanceof org.tensorflow.framework.NamedTensorProto)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.NamedTensorProto other = (org.tensorflow.framework.NamedTensorProto) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasTensor() != other.hasTensor()) return false;
    if (hasTensor()) {
      if (!getTensor()
          .equals(other.getTensor())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasTensor()) {
      hash = (37 * hash) + TENSOR_FIELD_NUMBER;
      hash = (53 * hash) + getTensor().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.NamedTensorProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.NamedTensorProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.NamedTensorProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.NamedTensorProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.NamedTensorProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.NamedTensorProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.NamedTensorProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.NamedTensorProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.NamedTensorProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.NamedTensorProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.NamedTensorProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.NamedTensorProto parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.NamedTensorProto prototype) {
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
   * A pair of tensor name and tensor values.
   * </pre>
   *
   * Protobuf type {@code tensorflow.NamedTensorProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.NamedTensorProto)
      org.tensorflow.framework.NamedTensorProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.NamedTensorProtos.internal_static_tensorflow_NamedTensorProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.NamedTensorProtos.internal_static_tensorflow_NamedTensorProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.NamedTensorProto.class, org.tensorflow.framework.NamedTensorProto.Builder.class);
    }

    // Construct using org.tensorflow.framework.NamedTensorProto.newBuilder()
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
      name_ = "";
      tensor_ = null;
      if (tensorBuilder_ != null) {
        tensorBuilder_.dispose();
        tensorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.NamedTensorProtos.internal_static_tensorflow_NamedTensorProto_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.NamedTensorProto getDefaultInstanceForType() {
      return org.tensorflow.framework.NamedTensorProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.NamedTensorProto build() {
      org.tensorflow.framework.NamedTensorProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.NamedTensorProto buildPartial() {
      org.tensorflow.framework.NamedTensorProto result = new org.tensorflow.framework.NamedTensorProto(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.tensorflow.framework.NamedTensorProto result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tensor_ = tensorBuilder_ == null
            ? tensor_
            : tensorBuilder_.build();
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
      if (other instanceof org.tensorflow.framework.NamedTensorProto) {
        return mergeFrom((org.tensorflow.framework.NamedTensorProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.NamedTensorProto other) {
      if (other == org.tensorflow.framework.NamedTensorProto.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasTensor()) {
        mergeTensor(other.getTensor());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTensorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Name of the tensor.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the tensor.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the tensor.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the tensor.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the tensor.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private org.tensorflow.framework.TensorProto tensor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder> tensorBuilder_;
    /**
     * <pre>
     * The client can populate a TensorProto using a tensorflow::Tensor`, or
     * directly using the protobuf field accessors.
     * The client specifies whether the returned tensor values should be
     * filled tensor fields (float_val, int_val, etc.) or encoded in a
     * compact form in tensor.tensor_content.
     * </pre>
     *
     * <code>.tensorflow.TensorProto tensor = 2;</code>
     * @return Whether the tensor field is set.
     */
    public boolean hasTensor() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The client can populate a TensorProto using a tensorflow::Tensor`, or
     * directly using the protobuf field accessors.
     * The client specifies whether the returned tensor values should be
     * filled tensor fields (float_val, int_val, etc.) or encoded in a
     * compact form in tensor.tensor_content.
     * </pre>
     *
     * <code>.tensorflow.TensorProto tensor = 2;</code>
     * @return The tensor.
     */
    public org.tensorflow.framework.TensorProto getTensor() {
      if (tensorBuilder_ == null) {
        return tensor_ == null ? org.tensorflow.framework.TensorProto.getDefaultInstance() : tensor_;
      } else {
        return tensorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The client can populate a TensorProto using a tensorflow::Tensor`, or
     * directly using the protobuf field accessors.
     * The client specifies whether the returned tensor values should be
     * filled tensor fields (float_val, int_val, etc.) or encoded in a
     * compact form in tensor.tensor_content.
     * </pre>
     *
     * <code>.tensorflow.TensorProto tensor = 2;</code>
     */
    public Builder setTensor(org.tensorflow.framework.TensorProto value) {
      if (tensorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tensor_ = value;
      } else {
        tensorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The client can populate a TensorProto using a tensorflow::Tensor`, or
     * directly using the protobuf field accessors.
     * The client specifies whether the returned tensor values should be
     * filled tensor fields (float_val, int_val, etc.) or encoded in a
     * compact form in tensor.tensor_content.
     * </pre>
     *
     * <code>.tensorflow.TensorProto tensor = 2;</code>
     */
    public Builder setTensor(
        org.tensorflow.framework.TensorProto.Builder builderForValue) {
      if (tensorBuilder_ == null) {
        tensor_ = builderForValue.build();
      } else {
        tensorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The client can populate a TensorProto using a tensorflow::Tensor`, or
     * directly using the protobuf field accessors.
     * The client specifies whether the returned tensor values should be
     * filled tensor fields (float_val, int_val, etc.) or encoded in a
     * compact form in tensor.tensor_content.
     * </pre>
     *
     * <code>.tensorflow.TensorProto tensor = 2;</code>
     */
    public Builder mergeTensor(org.tensorflow.framework.TensorProto value) {
      if (tensorBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          tensor_ != null &&
          tensor_ != org.tensorflow.framework.TensorProto.getDefaultInstance()) {
          getTensorBuilder().mergeFrom(value);
        } else {
          tensor_ = value;
        }
      } else {
        tensorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The client can populate a TensorProto using a tensorflow::Tensor`, or
     * directly using the protobuf field accessors.
     * The client specifies whether the returned tensor values should be
     * filled tensor fields (float_val, int_val, etc.) or encoded in a
     * compact form in tensor.tensor_content.
     * </pre>
     *
     * <code>.tensorflow.TensorProto tensor = 2;</code>
     */
    public Builder clearTensor() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tensor_ = null;
      if (tensorBuilder_ != null) {
        tensorBuilder_.dispose();
        tensorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The client can populate a TensorProto using a tensorflow::Tensor`, or
     * directly using the protobuf field accessors.
     * The client specifies whether the returned tensor values should be
     * filled tensor fields (float_val, int_val, etc.) or encoded in a
     * compact form in tensor.tensor_content.
     * </pre>
     *
     * <code>.tensorflow.TensorProto tensor = 2;</code>
     */
    public org.tensorflow.framework.TensorProto.Builder getTensorBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTensorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The client can populate a TensorProto using a tensorflow::Tensor`, or
     * directly using the protobuf field accessors.
     * The client specifies whether the returned tensor values should be
     * filled tensor fields (float_val, int_val, etc.) or encoded in a
     * compact form in tensor.tensor_content.
     * </pre>
     *
     * <code>.tensorflow.TensorProto tensor = 2;</code>
     */
    public org.tensorflow.framework.TensorProtoOrBuilder getTensorOrBuilder() {
      if (tensorBuilder_ != null) {
        return tensorBuilder_.getMessageOrBuilder();
      } else {
        return tensor_ == null ?
            org.tensorflow.framework.TensorProto.getDefaultInstance() : tensor_;
      }
    }
    /**
     * <pre>
     * The client can populate a TensorProto using a tensorflow::Tensor`, or
     * directly using the protobuf field accessors.
     * The client specifies whether the returned tensor values should be
     * filled tensor fields (float_val, int_val, etc.) or encoded in a
     * compact form in tensor.tensor_content.
     * </pre>
     *
     * <code>.tensorflow.TensorProto tensor = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder> 
        getTensorFieldBuilder() {
      if (tensorBuilder_ == null) {
        tensorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder>(
                getTensor(),
                getParentForChildren(),
                isClean());
        tensor_ = null;
      }
      return tensorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.NamedTensorProto)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.NamedTensorProto)
  private static final org.tensorflow.framework.NamedTensorProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.NamedTensorProto();
  }

  public static org.tensorflow.framework.NamedTensorProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NamedTensorProto>
      PARSER = new com.google.protobuf.AbstractParser<NamedTensorProto>() {
    @java.lang.Override
    public NamedTensorProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<NamedTensorProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NamedTensorProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.NamedTensorProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

