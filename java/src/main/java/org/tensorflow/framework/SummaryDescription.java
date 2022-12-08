// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/summary.proto

package org.tensorflow.framework;

/**
 * <pre>
 * Metadata associated with a series of Summary data
 * </pre>
 *
 * Protobuf type {@code tensorflow.SummaryDescription}
 */
public final class SummaryDescription extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.SummaryDescription)
    SummaryDescriptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SummaryDescription.newBuilder() to construct.
  private SummaryDescription(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SummaryDescription() {
    typeHint_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SummaryDescription();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.SummaryProtos.internal_static_tensorflow_SummaryDescription_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.SummaryProtos.internal_static_tensorflow_SummaryDescription_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.SummaryDescription.class, org.tensorflow.framework.SummaryDescription.Builder.class);
  }

  public static final int TYPE_HINT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object typeHint_ = "";
  /**
   * <pre>
   * Hint on how plugins should process the data in this series.
   * Supported values include "scalar", "histogram", "image", "audio"
   * </pre>
   *
   * <code>string type_hint = 1;</code>
   * @return The typeHint.
   */
  @java.lang.Override
  public java.lang.String getTypeHint() {
    java.lang.Object ref = typeHint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      typeHint_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Hint on how plugins should process the data in this series.
   * Supported values include "scalar", "histogram", "image", "audio"
   * </pre>
   *
   * <code>string type_hint = 1;</code>
   * @return The bytes for typeHint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeHintBytes() {
    java.lang.Object ref = typeHint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      typeHint_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(typeHint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, typeHint_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(typeHint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, typeHint_);
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
    if (!(obj instanceof org.tensorflow.framework.SummaryDescription)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.SummaryDescription other = (org.tensorflow.framework.SummaryDescription) obj;

    if (!getTypeHint()
        .equals(other.getTypeHint())) return false;
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
    hash = (37 * hash) + TYPE_HINT_FIELD_NUMBER;
    hash = (53 * hash) + getTypeHint().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.SummaryDescription parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.SummaryDescription parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.SummaryDescription parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.SummaryDescription parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.SummaryDescription parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.SummaryDescription parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.SummaryDescription parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.SummaryDescription parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.SummaryDescription parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.SummaryDescription parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.SummaryDescription parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.SummaryDescription parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.SummaryDescription prototype) {
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
   * Metadata associated with a series of Summary data
   * </pre>
   *
   * Protobuf type {@code tensorflow.SummaryDescription}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.SummaryDescription)
      org.tensorflow.framework.SummaryDescriptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.SummaryProtos.internal_static_tensorflow_SummaryDescription_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.SummaryProtos.internal_static_tensorflow_SummaryDescription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.SummaryDescription.class, org.tensorflow.framework.SummaryDescription.Builder.class);
    }

    // Construct using org.tensorflow.framework.SummaryDescription.newBuilder()
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
      typeHint_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.SummaryProtos.internal_static_tensorflow_SummaryDescription_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.SummaryDescription getDefaultInstanceForType() {
      return org.tensorflow.framework.SummaryDescription.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.SummaryDescription build() {
      org.tensorflow.framework.SummaryDescription result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.SummaryDescription buildPartial() {
      org.tensorflow.framework.SummaryDescription result = new org.tensorflow.framework.SummaryDescription(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.tensorflow.framework.SummaryDescription result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.typeHint_ = typeHint_;
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
      if (other instanceof org.tensorflow.framework.SummaryDescription) {
        return mergeFrom((org.tensorflow.framework.SummaryDescription)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.SummaryDescription other) {
      if (other == org.tensorflow.framework.SummaryDescription.getDefaultInstance()) return this;
      if (!other.getTypeHint().isEmpty()) {
        typeHint_ = other.typeHint_;
        bitField0_ |= 0x00000001;
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
              typeHint_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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

    private java.lang.Object typeHint_ = "";
    /**
     * <pre>
     * Hint on how plugins should process the data in this series.
     * Supported values include "scalar", "histogram", "image", "audio"
     * </pre>
     *
     * <code>string type_hint = 1;</code>
     * @return The typeHint.
     */
    public java.lang.String getTypeHint() {
      java.lang.Object ref = typeHint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        typeHint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Hint on how plugins should process the data in this series.
     * Supported values include "scalar", "histogram", "image", "audio"
     * </pre>
     *
     * <code>string type_hint = 1;</code>
     * @return The bytes for typeHint.
     */
    public com.google.protobuf.ByteString
        getTypeHintBytes() {
      java.lang.Object ref = typeHint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        typeHint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Hint on how plugins should process the data in this series.
     * Supported values include "scalar", "histogram", "image", "audio"
     * </pre>
     *
     * <code>string type_hint = 1;</code>
     * @param value The typeHint to set.
     * @return This builder for chaining.
     */
    public Builder setTypeHint(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      typeHint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Hint on how plugins should process the data in this series.
     * Supported values include "scalar", "histogram", "image", "audio"
     * </pre>
     *
     * <code>string type_hint = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTypeHint() {
      typeHint_ = getDefaultInstance().getTypeHint();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Hint on how plugins should process the data in this series.
     * Supported values include "scalar", "histogram", "image", "audio"
     * </pre>
     *
     * <code>string type_hint = 1;</code>
     * @param value The bytes for typeHint to set.
     * @return This builder for chaining.
     */
    public Builder setTypeHintBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      typeHint_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.SummaryDescription)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.SummaryDescription)
  private static final org.tensorflow.framework.SummaryDescription DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.SummaryDescription();
  }

  public static org.tensorflow.framework.SummaryDescription getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SummaryDescription>
      PARSER = new com.google.protobuf.AbstractParser<SummaryDescription>() {
    @java.lang.Override
    public SummaryDescription parsePartialFrom(
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

  public static com.google.protobuf.Parser<SummaryDescription> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SummaryDescription> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.SummaryDescription getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

