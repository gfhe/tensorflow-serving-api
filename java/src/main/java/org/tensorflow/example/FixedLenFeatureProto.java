// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/example/example_parser_configuration.proto

package org.tensorflow.example;

/**
 * Protobuf type {@code tensorflow.FixedLenFeatureProto}
 */
public final class FixedLenFeatureProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.FixedLenFeatureProto)
    FixedLenFeatureProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FixedLenFeatureProto.newBuilder() to construct.
  private FixedLenFeatureProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FixedLenFeatureProto() {
    dtype_ = 0;
    valuesOutputTensorName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FixedLenFeatureProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.example.ExampleParserConfigurationProtos.internal_static_tensorflow_FixedLenFeatureProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.example.ExampleParserConfigurationProtos.internal_static_tensorflow_FixedLenFeatureProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.example.FixedLenFeatureProto.class, org.tensorflow.example.FixedLenFeatureProto.Builder.class);
  }

  public static final int DTYPE_FIELD_NUMBER = 1;
  private int dtype_ = 0;
  /**
   * <code>.tensorflow.DataType dtype = 1;</code>
   * @return The enum numeric value on the wire for dtype.
   */
  @java.lang.Override public int getDtypeValue() {
    return dtype_;
  }
  /**
   * <code>.tensorflow.DataType dtype = 1;</code>
   * @return The dtype.
   */
  @java.lang.Override public org.tensorflow.framework.DataType getDtype() {
    org.tensorflow.framework.DataType result = org.tensorflow.framework.DataType.forNumber(dtype_);
    return result == null ? org.tensorflow.framework.DataType.UNRECOGNIZED : result;
  }

  public static final int SHAPE_FIELD_NUMBER = 2;
  private org.tensorflow.framework.TensorShapeProto shape_;
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   * @return Whether the shape field is set.
   */
  @java.lang.Override
  public boolean hasShape() {
    return shape_ != null;
  }
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   * @return The shape.
   */
  @java.lang.Override
  public org.tensorflow.framework.TensorShapeProto getShape() {
    return shape_ == null ? org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : shape_;
  }
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  @java.lang.Override
  public org.tensorflow.framework.TensorShapeProtoOrBuilder getShapeOrBuilder() {
    return shape_ == null ? org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : shape_;
  }

  public static final int DEFAULT_VALUE_FIELD_NUMBER = 3;
  private org.tensorflow.framework.TensorProto defaultValue_;
  /**
   * <code>.tensorflow.TensorProto default_value = 3;</code>
   * @return Whether the defaultValue field is set.
   */
  @java.lang.Override
  public boolean hasDefaultValue() {
    return defaultValue_ != null;
  }
  /**
   * <code>.tensorflow.TensorProto default_value = 3;</code>
   * @return The defaultValue.
   */
  @java.lang.Override
  public org.tensorflow.framework.TensorProto getDefaultValue() {
    return defaultValue_ == null ? org.tensorflow.framework.TensorProto.getDefaultInstance() : defaultValue_;
  }
  /**
   * <code>.tensorflow.TensorProto default_value = 3;</code>
   */
  @java.lang.Override
  public org.tensorflow.framework.TensorProtoOrBuilder getDefaultValueOrBuilder() {
    return defaultValue_ == null ? org.tensorflow.framework.TensorProto.getDefaultInstance() : defaultValue_;
  }

  public static final int VALUES_OUTPUT_TENSOR_NAME_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object valuesOutputTensorName_ = "";
  /**
   * <code>string values_output_tensor_name = 4;</code>
   * @return The valuesOutputTensorName.
   */
  @java.lang.Override
  public java.lang.String getValuesOutputTensorName() {
    java.lang.Object ref = valuesOutputTensorName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      valuesOutputTensorName_ = s;
      return s;
    }
  }
  /**
   * <code>string values_output_tensor_name = 4;</code>
   * @return The bytes for valuesOutputTensorName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValuesOutputTensorNameBytes() {
    java.lang.Object ref = valuesOutputTensorName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      valuesOutputTensorName_ = b;
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
    if (dtype_ != org.tensorflow.framework.DataType.DT_INVALID.getNumber()) {
      output.writeEnum(1, dtype_);
    }
    if (shape_ != null) {
      output.writeMessage(2, getShape());
    }
    if (defaultValue_ != null) {
      output.writeMessage(3, getDefaultValue());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valuesOutputTensorName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, valuesOutputTensorName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dtype_ != org.tensorflow.framework.DataType.DT_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dtype_);
    }
    if (shape_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getShape());
    }
    if (defaultValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDefaultValue());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valuesOutputTensorName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, valuesOutputTensorName_);
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
    if (!(obj instanceof org.tensorflow.example.FixedLenFeatureProto)) {
      return super.equals(obj);
    }
    org.tensorflow.example.FixedLenFeatureProto other = (org.tensorflow.example.FixedLenFeatureProto) obj;

    if (dtype_ != other.dtype_) return false;
    if (hasShape() != other.hasShape()) return false;
    if (hasShape()) {
      if (!getShape()
          .equals(other.getShape())) return false;
    }
    if (hasDefaultValue() != other.hasDefaultValue()) return false;
    if (hasDefaultValue()) {
      if (!getDefaultValue()
          .equals(other.getDefaultValue())) return false;
    }
    if (!getValuesOutputTensorName()
        .equals(other.getValuesOutputTensorName())) return false;
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
    hash = (37 * hash) + DTYPE_FIELD_NUMBER;
    hash = (53 * hash) + dtype_;
    if (hasShape()) {
      hash = (37 * hash) + SHAPE_FIELD_NUMBER;
      hash = (53 * hash) + getShape().hashCode();
    }
    if (hasDefaultValue()) {
      hash = (37 * hash) + DEFAULT_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getDefaultValue().hashCode();
    }
    hash = (37 * hash) + VALUES_OUTPUT_TENSOR_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getValuesOutputTensorName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
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
  public static Builder newBuilder(org.tensorflow.example.FixedLenFeatureProto prototype) {
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
   * Protobuf type {@code tensorflow.FixedLenFeatureProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.FixedLenFeatureProto)
      org.tensorflow.example.FixedLenFeatureProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.example.ExampleParserConfigurationProtos.internal_static_tensorflow_FixedLenFeatureProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.example.ExampleParserConfigurationProtos.internal_static_tensorflow_FixedLenFeatureProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.example.FixedLenFeatureProto.class, org.tensorflow.example.FixedLenFeatureProto.Builder.class);
    }

    // Construct using org.tensorflow.example.FixedLenFeatureProto.newBuilder()
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
      dtype_ = 0;
      shape_ = null;
      if (shapeBuilder_ != null) {
        shapeBuilder_.dispose();
        shapeBuilder_ = null;
      }
      defaultValue_ = null;
      if (defaultValueBuilder_ != null) {
        defaultValueBuilder_.dispose();
        defaultValueBuilder_ = null;
      }
      valuesOutputTensorName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.example.ExampleParserConfigurationProtos.internal_static_tensorflow_FixedLenFeatureProto_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.example.FixedLenFeatureProto getDefaultInstanceForType() {
      return org.tensorflow.example.FixedLenFeatureProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.example.FixedLenFeatureProto build() {
      org.tensorflow.example.FixedLenFeatureProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.example.FixedLenFeatureProto buildPartial() {
      org.tensorflow.example.FixedLenFeatureProto result = new org.tensorflow.example.FixedLenFeatureProto(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.tensorflow.example.FixedLenFeatureProto result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dtype_ = dtype_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.shape_ = shapeBuilder_ == null
            ? shape_
            : shapeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.defaultValue_ = defaultValueBuilder_ == null
            ? defaultValue_
            : defaultValueBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.valuesOutputTensorName_ = valuesOutputTensorName_;
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
      if (other instanceof org.tensorflow.example.FixedLenFeatureProto) {
        return mergeFrom((org.tensorflow.example.FixedLenFeatureProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.example.FixedLenFeatureProto other) {
      if (other == org.tensorflow.example.FixedLenFeatureProto.getDefaultInstance()) return this;
      if (other.dtype_ != 0) {
        setDtypeValue(other.getDtypeValue());
      }
      if (other.hasShape()) {
        mergeShape(other.getShape());
      }
      if (other.hasDefaultValue()) {
        mergeDefaultValue(other.getDefaultValue());
      }
      if (!other.getValuesOutputTensorName().isEmpty()) {
        valuesOutputTensorName_ = other.valuesOutputTensorName_;
        bitField0_ |= 0x00000008;
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
              dtype_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getShapeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getDefaultValueFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              valuesOutputTensorName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private int dtype_ = 0;
    /**
     * <code>.tensorflow.DataType dtype = 1;</code>
     * @return The enum numeric value on the wire for dtype.
     */
    @java.lang.Override public int getDtypeValue() {
      return dtype_;
    }
    /**
     * <code>.tensorflow.DataType dtype = 1;</code>
     * @param value The enum numeric value on the wire for dtype to set.
     * @return This builder for chaining.
     */
    public Builder setDtypeValue(int value) {
      dtype_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.DataType dtype = 1;</code>
     * @return The dtype.
     */
    @java.lang.Override
    public org.tensorflow.framework.DataType getDtype() {
      org.tensorflow.framework.DataType result = org.tensorflow.framework.DataType.forNumber(dtype_);
      return result == null ? org.tensorflow.framework.DataType.UNRECOGNIZED : result;
    }
    /**
     * <code>.tensorflow.DataType dtype = 1;</code>
     * @param value The dtype to set.
     * @return This builder for chaining.
     */
    public Builder setDtype(org.tensorflow.framework.DataType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      dtype_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.DataType dtype = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDtype() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dtype_ = 0;
      onChanged();
      return this;
    }

    private org.tensorflow.framework.TensorShapeProto shape_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorShapeProto, org.tensorflow.framework.TensorShapeProto.Builder, org.tensorflow.framework.TensorShapeProtoOrBuilder> shapeBuilder_;
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     * @return Whether the shape field is set.
     */
    public boolean hasShape() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     * @return The shape.
     */
    public org.tensorflow.framework.TensorShapeProto getShape() {
      if (shapeBuilder_ == null) {
        return shape_ == null ? org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : shape_;
      } else {
        return shapeBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder setShape(org.tensorflow.framework.TensorShapeProto value) {
      if (shapeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        shape_ = value;
      } else {
        shapeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder setShape(
        org.tensorflow.framework.TensorShapeProto.Builder builderForValue) {
      if (shapeBuilder_ == null) {
        shape_ = builderForValue.build();
      } else {
        shapeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder mergeShape(org.tensorflow.framework.TensorShapeProto value) {
      if (shapeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          shape_ != null &&
          shape_ != org.tensorflow.framework.TensorShapeProto.getDefaultInstance()) {
          getShapeBuilder().mergeFrom(value);
        } else {
          shape_ = value;
        }
      } else {
        shapeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder clearShape() {
      bitField0_ = (bitField0_ & ~0x00000002);
      shape_ = null;
      if (shapeBuilder_ != null) {
        shapeBuilder_.dispose();
        shapeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public org.tensorflow.framework.TensorShapeProto.Builder getShapeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getShapeFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public org.tensorflow.framework.TensorShapeProtoOrBuilder getShapeOrBuilder() {
      if (shapeBuilder_ != null) {
        return shapeBuilder_.getMessageOrBuilder();
      } else {
        return shape_ == null ?
            org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : shape_;
      }
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorShapeProto, org.tensorflow.framework.TensorShapeProto.Builder, org.tensorflow.framework.TensorShapeProtoOrBuilder> 
        getShapeFieldBuilder() {
      if (shapeBuilder_ == null) {
        shapeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.TensorShapeProto, org.tensorflow.framework.TensorShapeProto.Builder, org.tensorflow.framework.TensorShapeProtoOrBuilder>(
                getShape(),
                getParentForChildren(),
                isClean());
        shape_ = null;
      }
      return shapeBuilder_;
    }

    private org.tensorflow.framework.TensorProto defaultValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder> defaultValueBuilder_;
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     * @return Whether the defaultValue field is set.
     */
    public boolean hasDefaultValue() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     * @return The defaultValue.
     */
    public org.tensorflow.framework.TensorProto getDefaultValue() {
      if (defaultValueBuilder_ == null) {
        return defaultValue_ == null ? org.tensorflow.framework.TensorProto.getDefaultInstance() : defaultValue_;
      } else {
        return defaultValueBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public Builder setDefaultValue(org.tensorflow.framework.TensorProto value) {
      if (defaultValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        defaultValue_ = value;
      } else {
        defaultValueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public Builder setDefaultValue(
        org.tensorflow.framework.TensorProto.Builder builderForValue) {
      if (defaultValueBuilder_ == null) {
        defaultValue_ = builderForValue.build();
      } else {
        defaultValueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public Builder mergeDefaultValue(org.tensorflow.framework.TensorProto value) {
      if (defaultValueBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          defaultValue_ != null &&
          defaultValue_ != org.tensorflow.framework.TensorProto.getDefaultInstance()) {
          getDefaultValueBuilder().mergeFrom(value);
        } else {
          defaultValue_ = value;
        }
      } else {
        defaultValueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public Builder clearDefaultValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      defaultValue_ = null;
      if (defaultValueBuilder_ != null) {
        defaultValueBuilder_.dispose();
        defaultValueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public org.tensorflow.framework.TensorProto.Builder getDefaultValueBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDefaultValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public org.tensorflow.framework.TensorProtoOrBuilder getDefaultValueOrBuilder() {
      if (defaultValueBuilder_ != null) {
        return defaultValueBuilder_.getMessageOrBuilder();
      } else {
        return defaultValue_ == null ?
            org.tensorflow.framework.TensorProto.getDefaultInstance() : defaultValue_;
      }
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder> 
        getDefaultValueFieldBuilder() {
      if (defaultValueBuilder_ == null) {
        defaultValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder>(
                getDefaultValue(),
                getParentForChildren(),
                isClean());
        defaultValue_ = null;
      }
      return defaultValueBuilder_;
    }

    private java.lang.Object valuesOutputTensorName_ = "";
    /**
     * <code>string values_output_tensor_name = 4;</code>
     * @return The valuesOutputTensorName.
     */
    public java.lang.String getValuesOutputTensorName() {
      java.lang.Object ref = valuesOutputTensorName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        valuesOutputTensorName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string values_output_tensor_name = 4;</code>
     * @return The bytes for valuesOutputTensorName.
     */
    public com.google.protobuf.ByteString
        getValuesOutputTensorNameBytes() {
      java.lang.Object ref = valuesOutputTensorName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        valuesOutputTensorName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string values_output_tensor_name = 4;</code>
     * @param value The valuesOutputTensorName to set.
     * @return This builder for chaining.
     */
    public Builder setValuesOutputTensorName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      valuesOutputTensorName_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string values_output_tensor_name = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearValuesOutputTensorName() {
      valuesOutputTensorName_ = getDefaultInstance().getValuesOutputTensorName();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string values_output_tensor_name = 4;</code>
     * @param value The bytes for valuesOutputTensorName to set.
     * @return This builder for chaining.
     */
    public Builder setValuesOutputTensorNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      valuesOutputTensorName_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.FixedLenFeatureProto)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.FixedLenFeatureProto)
  private static final org.tensorflow.example.FixedLenFeatureProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.example.FixedLenFeatureProto();
  }

  public static org.tensorflow.example.FixedLenFeatureProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FixedLenFeatureProto>
      PARSER = new com.google.protobuf.AbstractParser<FixedLenFeatureProto>() {
    @java.lang.Override
    public FixedLenFeatureProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<FixedLenFeatureProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FixedLenFeatureProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.example.FixedLenFeatureProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

