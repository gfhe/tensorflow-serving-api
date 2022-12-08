// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/tensor_bundle.proto

package org.tensorflow.util;

/**
 * <pre>
 * Special header that is associated with a bundle.
 * TODO(zongheng,zhifengc): maybe in the future, we can add information about
 * which binary produced this checkpoint, timestamp, etc. Sometime, these can be
 * valuable debugging information. And if needed, these can be used as defensive
 * information ensuring reader (binary version) of the checkpoint and the writer
 * (binary version) must match within certain range, etc.
 * </pre>
 *
 * Protobuf type {@code tensorflow.BundleHeaderProto}
 */
public final class BundleHeaderProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.BundleHeaderProto)
    BundleHeaderProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BundleHeaderProto.newBuilder() to construct.
  private BundleHeaderProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BundleHeaderProto() {
    endianness_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BundleHeaderProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.util.TensorBundleProtos.internal_static_tensorflow_BundleHeaderProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.util.TensorBundleProtos.internal_static_tensorflow_BundleHeaderProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.util.BundleHeaderProto.class, org.tensorflow.util.BundleHeaderProto.Builder.class);
  }

  /**
   * <pre>
   * An enum indicating the endianness of the platform that produced this
   * bundle.  A bundle can only be read by a platform with matching endianness.
   * Defaults to LITTLE, as most modern platforms are little-endian.
   * Affects the binary tensor data bytes only, not the metadata in protobufs.
   * </pre>
   *
   * Protobuf enum {@code tensorflow.BundleHeaderProto.Endianness}
   */
  public enum Endianness
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>LITTLE = 0;</code>
     */
    LITTLE(0),
    /**
     * <code>BIG = 1;</code>
     */
    BIG(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>LITTLE = 0;</code>
     */
    public static final int LITTLE_VALUE = 0;
    /**
     * <code>BIG = 1;</code>
     */
    public static final int BIG_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Endianness valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Endianness forNumber(int value) {
      switch (value) {
        case 0: return LITTLE;
        case 1: return BIG;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Endianness>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Endianness> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Endianness>() {
            public Endianness findValueByNumber(int number) {
              return Endianness.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.tensorflow.util.BundleHeaderProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Endianness[] VALUES = values();

    public static Endianness valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Endianness(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:tensorflow.BundleHeaderProto.Endianness)
  }

  public static final int NUM_SHARDS_FIELD_NUMBER = 1;
  private int numShards_ = 0;
  /**
   * <pre>
   * Number of data files in the bundle.
   * </pre>
   *
   * <code>int32 num_shards = 1;</code>
   * @return The numShards.
   */
  @java.lang.Override
  public int getNumShards() {
    return numShards_;
  }

  public static final int ENDIANNESS_FIELD_NUMBER = 2;
  private int endianness_ = 0;
  /**
   * <code>.tensorflow.BundleHeaderProto.Endianness endianness = 2;</code>
   * @return The enum numeric value on the wire for endianness.
   */
  @java.lang.Override public int getEndiannessValue() {
    return endianness_;
  }
  /**
   * <code>.tensorflow.BundleHeaderProto.Endianness endianness = 2;</code>
   * @return The endianness.
   */
  @java.lang.Override public org.tensorflow.util.BundleHeaderProto.Endianness getEndianness() {
    org.tensorflow.util.BundleHeaderProto.Endianness result = org.tensorflow.util.BundleHeaderProto.Endianness.forNumber(endianness_);
    return result == null ? org.tensorflow.util.BundleHeaderProto.Endianness.UNRECOGNIZED : result;
  }

  public static final int VERSION_FIELD_NUMBER = 3;
  private org.tensorflow.framework.VersionDef version_;
  /**
   * <pre>
   * Versioning of the tensor bundle format.
   * </pre>
   *
   * <code>.tensorflow.VersionDef version = 3;</code>
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return version_ != null;
  }
  /**
   * <pre>
   * Versioning of the tensor bundle format.
   * </pre>
   *
   * <code>.tensorflow.VersionDef version = 3;</code>
   * @return The version.
   */
  @java.lang.Override
  public org.tensorflow.framework.VersionDef getVersion() {
    return version_ == null ? org.tensorflow.framework.VersionDef.getDefaultInstance() : version_;
  }
  /**
   * <pre>
   * Versioning of the tensor bundle format.
   * </pre>
   *
   * <code>.tensorflow.VersionDef version = 3;</code>
   */
  @java.lang.Override
  public org.tensorflow.framework.VersionDefOrBuilder getVersionOrBuilder() {
    return version_ == null ? org.tensorflow.framework.VersionDef.getDefaultInstance() : version_;
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
    if (numShards_ != 0) {
      output.writeInt32(1, numShards_);
    }
    if (endianness_ != org.tensorflow.util.BundleHeaderProto.Endianness.LITTLE.getNumber()) {
      output.writeEnum(2, endianness_);
    }
    if (version_ != null) {
      output.writeMessage(3, getVersion());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numShards_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, numShards_);
    }
    if (endianness_ != org.tensorflow.util.BundleHeaderProto.Endianness.LITTLE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, endianness_);
    }
    if (version_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getVersion());
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
    if (!(obj instanceof org.tensorflow.util.BundleHeaderProto)) {
      return super.equals(obj);
    }
    org.tensorflow.util.BundleHeaderProto other = (org.tensorflow.util.BundleHeaderProto) obj;

    if (getNumShards()
        != other.getNumShards()) return false;
    if (endianness_ != other.endianness_) return false;
    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion()
          .equals(other.getVersion())) return false;
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
    hash = (37 * hash) + NUM_SHARDS_FIELD_NUMBER;
    hash = (53 * hash) + getNumShards();
    hash = (37 * hash) + ENDIANNESS_FIELD_NUMBER;
    hash = (53 * hash) + endianness_;
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.util.BundleHeaderProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.BundleHeaderProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.BundleHeaderProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.BundleHeaderProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.BundleHeaderProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.BundleHeaderProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.BundleHeaderProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.BundleHeaderProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.util.BundleHeaderProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.BundleHeaderProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.util.BundleHeaderProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.BundleHeaderProto parseFrom(
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
  public static Builder newBuilder(org.tensorflow.util.BundleHeaderProto prototype) {
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
   * Special header that is associated with a bundle.
   * TODO(zongheng,zhifengc): maybe in the future, we can add information about
   * which binary produced this checkpoint, timestamp, etc. Sometime, these can be
   * valuable debugging information. And if needed, these can be used as defensive
   * information ensuring reader (binary version) of the checkpoint and the writer
   * (binary version) must match within certain range, etc.
   * </pre>
   *
   * Protobuf type {@code tensorflow.BundleHeaderProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.BundleHeaderProto)
      org.tensorflow.util.BundleHeaderProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.util.TensorBundleProtos.internal_static_tensorflow_BundleHeaderProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.util.TensorBundleProtos.internal_static_tensorflow_BundleHeaderProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.util.BundleHeaderProto.class, org.tensorflow.util.BundleHeaderProto.Builder.class);
    }

    // Construct using org.tensorflow.util.BundleHeaderProto.newBuilder()
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
      numShards_ = 0;
      endianness_ = 0;
      version_ = null;
      if (versionBuilder_ != null) {
        versionBuilder_.dispose();
        versionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.util.TensorBundleProtos.internal_static_tensorflow_BundleHeaderProto_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.util.BundleHeaderProto getDefaultInstanceForType() {
      return org.tensorflow.util.BundleHeaderProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.util.BundleHeaderProto build() {
      org.tensorflow.util.BundleHeaderProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.util.BundleHeaderProto buildPartial() {
      org.tensorflow.util.BundleHeaderProto result = new org.tensorflow.util.BundleHeaderProto(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.tensorflow.util.BundleHeaderProto result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.numShards_ = numShards_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endianness_ = endianness_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.version_ = versionBuilder_ == null
            ? version_
            : versionBuilder_.build();
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
      if (other instanceof org.tensorflow.util.BundleHeaderProto) {
        return mergeFrom((org.tensorflow.util.BundleHeaderProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.util.BundleHeaderProto other) {
      if (other == org.tensorflow.util.BundleHeaderProto.getDefaultInstance()) return this;
      if (other.getNumShards() != 0) {
        setNumShards(other.getNumShards());
      }
      if (other.endianness_ != 0) {
        setEndiannessValue(other.getEndiannessValue());
      }
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
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
              numShards_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              endianness_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getVersionFieldBuilder().getBuilder(),
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

    private int numShards_ ;
    /**
     * <pre>
     * Number of data files in the bundle.
     * </pre>
     *
     * <code>int32 num_shards = 1;</code>
     * @return The numShards.
     */
    @java.lang.Override
    public int getNumShards() {
      return numShards_;
    }
    /**
     * <pre>
     * Number of data files in the bundle.
     * </pre>
     *
     * <code>int32 num_shards = 1;</code>
     * @param value The numShards to set.
     * @return This builder for chaining.
     */
    public Builder setNumShards(int value) {
      
      numShards_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of data files in the bundle.
     * </pre>
     *
     * <code>int32 num_shards = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumShards() {
      bitField0_ = (bitField0_ & ~0x00000001);
      numShards_ = 0;
      onChanged();
      return this;
    }

    private int endianness_ = 0;
    /**
     * <code>.tensorflow.BundleHeaderProto.Endianness endianness = 2;</code>
     * @return The enum numeric value on the wire for endianness.
     */
    @java.lang.Override public int getEndiannessValue() {
      return endianness_;
    }
    /**
     * <code>.tensorflow.BundleHeaderProto.Endianness endianness = 2;</code>
     * @param value The enum numeric value on the wire for endianness to set.
     * @return This builder for chaining.
     */
    public Builder setEndiannessValue(int value) {
      endianness_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.BundleHeaderProto.Endianness endianness = 2;</code>
     * @return The endianness.
     */
    @java.lang.Override
    public org.tensorflow.util.BundleHeaderProto.Endianness getEndianness() {
      org.tensorflow.util.BundleHeaderProto.Endianness result = org.tensorflow.util.BundleHeaderProto.Endianness.forNumber(endianness_);
      return result == null ? org.tensorflow.util.BundleHeaderProto.Endianness.UNRECOGNIZED : result;
    }
    /**
     * <code>.tensorflow.BundleHeaderProto.Endianness endianness = 2;</code>
     * @param value The endianness to set.
     * @return This builder for chaining.
     */
    public Builder setEndianness(org.tensorflow.util.BundleHeaderProto.Endianness value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      endianness_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.BundleHeaderProto.Endianness endianness = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndianness() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endianness_ = 0;
      onChanged();
      return this;
    }

    private org.tensorflow.framework.VersionDef version_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.VersionDef, org.tensorflow.framework.VersionDef.Builder, org.tensorflow.framework.VersionDefOrBuilder> versionBuilder_;
    /**
     * <pre>
     * Versioning of the tensor bundle format.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 3;</code>
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Versioning of the tensor bundle format.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 3;</code>
     * @return The version.
     */
    public org.tensorflow.framework.VersionDef getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null ? org.tensorflow.framework.VersionDef.getDefaultInstance() : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Versioning of the tensor bundle format.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 3;</code>
     */
    public Builder setVersion(org.tensorflow.framework.VersionDef value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
      } else {
        versionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Versioning of the tensor bundle format.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 3;</code>
     */
    public Builder setVersion(
        org.tensorflow.framework.VersionDef.Builder builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Versioning of the tensor bundle format.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 3;</code>
     */
    public Builder mergeVersion(org.tensorflow.framework.VersionDef value) {
      if (versionBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          version_ != null &&
          version_ != org.tensorflow.framework.VersionDef.getDefaultInstance()) {
          getVersionBuilder().mergeFrom(value);
        } else {
          version_ = value;
        }
      } else {
        versionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Versioning of the tensor bundle format.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 3;</code>
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000004);
      version_ = null;
      if (versionBuilder_ != null) {
        versionBuilder_.dispose();
        versionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Versioning of the tensor bundle format.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 3;</code>
     */
    public org.tensorflow.framework.VersionDef.Builder getVersionBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Versioning of the tensor bundle format.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 3;</code>
     */
    public org.tensorflow.framework.VersionDefOrBuilder getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null ?
            org.tensorflow.framework.VersionDef.getDefaultInstance() : version_;
      }
    }
    /**
     * <pre>
     * Versioning of the tensor bundle format.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.VersionDef, org.tensorflow.framework.VersionDef.Builder, org.tensorflow.framework.VersionDefOrBuilder> 
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.VersionDef, org.tensorflow.framework.VersionDef.Builder, org.tensorflow.framework.VersionDefOrBuilder>(
                getVersion(),
                getParentForChildren(),
                isClean());
        version_ = null;
      }
      return versionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.BundleHeaderProto)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.BundleHeaderProto)
  private static final org.tensorflow.util.BundleHeaderProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.util.BundleHeaderProto();
  }

  public static org.tensorflow.util.BundleHeaderProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BundleHeaderProto>
      PARSER = new com.google.protobuf.AbstractParser<BundleHeaderProto>() {
    @java.lang.Override
    public BundleHeaderProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<BundleHeaderProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BundleHeaderProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.util.BundleHeaderProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

