// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_serving/sources/storage_path/static_storage_path_source.proto

package tensorflow.serving;

public final class StaticStoragePathSource {
  private StaticStoragePathSource() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StaticStoragePathSourceConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tensorflow.serving.StaticStoragePathSourceConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The single servable name, version number and path to supply statically.
     * </pre>
     *
     * <code>string servable_name = 1;</code>
     * @return The servableName.
     */
    java.lang.String getServableName();
    /**
     * <pre>
     * The single servable name, version number and path to supply statically.
     * </pre>
     *
     * <code>string servable_name = 1;</code>
     * @return The bytes for servableName.
     */
    com.google.protobuf.ByteString
        getServableNameBytes();

    /**
     * <code>int64 version_num = 2;</code>
     * @return The versionNum.
     */
    long getVersionNum();

    /**
     * <code>string version_path = 3;</code>
     * @return The versionPath.
     */
    java.lang.String getVersionPath();
    /**
     * <code>string version_path = 3;</code>
     * @return The bytes for versionPath.
     */
    com.google.protobuf.ByteString
        getVersionPathBytes();
  }
  /**
   * <pre>
   * Config proto for StaticStoragePathSource.
   * </pre>
   *
   * Protobuf type {@code tensorflow.serving.StaticStoragePathSourceConfig}
   */
  public static final class StaticStoragePathSourceConfig extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tensorflow.serving.StaticStoragePathSourceConfig)
      StaticStoragePathSourceConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StaticStoragePathSourceConfig.newBuilder() to construct.
    private StaticStoragePathSourceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StaticStoragePathSourceConfig() {
      servableName_ = "";
      versionPath_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StaticStoragePathSourceConfig();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tensorflow.serving.StaticStoragePathSource.internal_static_tensorflow_serving_StaticStoragePathSourceConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tensorflow.serving.StaticStoragePathSource.internal_static_tensorflow_serving_StaticStoragePathSourceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig.class, tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig.Builder.class);
    }

    public static final int SERVABLE_NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object servableName_ = "";
    /**
     * <pre>
     * The single servable name, version number and path to supply statically.
     * </pre>
     *
     * <code>string servable_name = 1;</code>
     * @return The servableName.
     */
    @java.lang.Override
    public java.lang.String getServableName() {
      java.lang.Object ref = servableName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        servableName_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * The single servable name, version number and path to supply statically.
     * </pre>
     *
     * <code>string servable_name = 1;</code>
     * @return The bytes for servableName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getServableNameBytes() {
      java.lang.Object ref = servableName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        servableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VERSION_NUM_FIELD_NUMBER = 2;
    private long versionNum_ = 0L;
    /**
     * <code>int64 version_num = 2;</code>
     * @return The versionNum.
     */
    @java.lang.Override
    public long getVersionNum() {
      return versionNum_;
    }

    public static final int VERSION_PATH_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object versionPath_ = "";
    /**
     * <code>string version_path = 3;</code>
     * @return The versionPath.
     */
    @java.lang.Override
    public java.lang.String getVersionPath() {
      java.lang.Object ref = versionPath_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        versionPath_ = s;
        return s;
      }
    }
    /**
     * <code>string version_path = 3;</code>
     * @return The bytes for versionPath.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getVersionPathBytes() {
      java.lang.Object ref = versionPath_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        versionPath_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(servableName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, servableName_);
      }
      if (versionNum_ != 0L) {
        output.writeInt64(2, versionNum_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(versionPath_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, versionPath_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(servableName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, servableName_);
      }
      if (versionNum_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, versionNum_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(versionPath_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, versionPath_);
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
      if (!(obj instanceof tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig)) {
        return super.equals(obj);
      }
      tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig other = (tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig) obj;

      if (!getServableName()
          .equals(other.getServableName())) return false;
      if (getVersionNum()
          != other.getVersionNum()) return false;
      if (!getVersionPath()
          .equals(other.getVersionPath())) return false;
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
      hash = (37 * hash) + SERVABLE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getServableName().hashCode();
      hash = (37 * hash) + VERSION_NUM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getVersionNum());
      hash = (37 * hash) + VERSION_PATH_FIELD_NUMBER;
      hash = (53 * hash) + getVersionPath().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig parseFrom(
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
    public static Builder newBuilder(tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig prototype) {
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
     * Config proto for StaticStoragePathSource.
     * </pre>
     *
     * Protobuf type {@code tensorflow.serving.StaticStoragePathSourceConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tensorflow.serving.StaticStoragePathSourceConfig)
        tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tensorflow.serving.StaticStoragePathSource.internal_static_tensorflow_serving_StaticStoragePathSourceConfig_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tensorflow.serving.StaticStoragePathSource.internal_static_tensorflow_serving_StaticStoragePathSourceConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig.class, tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig.Builder.class);
      }

      // Construct using tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig.newBuilder()
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
        servableName_ = "";
        versionNum_ = 0L;
        versionPath_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tensorflow.serving.StaticStoragePathSource.internal_static_tensorflow_serving_StaticStoragePathSourceConfig_descriptor;
      }

      @java.lang.Override
      public tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig getDefaultInstanceForType() {
        return tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig.getDefaultInstance();
      }

      @java.lang.Override
      public tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig build() {
        tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig buildPartial() {
        tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig result = new tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.servableName_ = servableName_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.versionNum_ = versionNum_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.versionPath_ = versionPath_;
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
        if (other instanceof tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig) {
          return mergeFrom((tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig other) {
        if (other == tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig.getDefaultInstance()) return this;
        if (!other.getServableName().isEmpty()) {
          servableName_ = other.servableName_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.getVersionNum() != 0L) {
          setVersionNum(other.getVersionNum());
        }
        if (!other.getVersionPath().isEmpty()) {
          versionPath_ = other.versionPath_;
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
                servableName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                versionNum_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                versionPath_ = input.readStringRequireUtf8();
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

      private java.lang.Object servableName_ = "";
      /**
       * <pre>
       * The single servable name, version number and path to supply statically.
       * </pre>
       *
       * <code>string servable_name = 1;</code>
       * @return The servableName.
       */
      public java.lang.String getServableName() {
        java.lang.Object ref = servableName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          servableName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * The single servable name, version number and path to supply statically.
       * </pre>
       *
       * <code>string servable_name = 1;</code>
       * @return The bytes for servableName.
       */
      public com.google.protobuf.ByteString
          getServableNameBytes() {
        java.lang.Object ref = servableName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          servableName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * The single servable name, version number and path to supply statically.
       * </pre>
       *
       * <code>string servable_name = 1;</code>
       * @param value The servableName to set.
       * @return This builder for chaining.
       */
      public Builder setServableName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        servableName_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The single servable name, version number and path to supply statically.
       * </pre>
       *
       * <code>string servable_name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearServableName() {
        servableName_ = getDefaultInstance().getServableName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The single servable name, version number and path to supply statically.
       * </pre>
       *
       * <code>string servable_name = 1;</code>
       * @param value The bytes for servableName to set.
       * @return This builder for chaining.
       */
      public Builder setServableNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        servableName_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private long versionNum_ ;
      /**
       * <code>int64 version_num = 2;</code>
       * @return The versionNum.
       */
      @java.lang.Override
      public long getVersionNum() {
        return versionNum_;
      }
      /**
       * <code>int64 version_num = 2;</code>
       * @param value The versionNum to set.
       * @return This builder for chaining.
       */
      public Builder setVersionNum(long value) {
        
        versionNum_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int64 version_num = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearVersionNum() {
        bitField0_ = (bitField0_ & ~0x00000002);
        versionNum_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object versionPath_ = "";
      /**
       * <code>string version_path = 3;</code>
       * @return The versionPath.
       */
      public java.lang.String getVersionPath() {
        java.lang.Object ref = versionPath_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          versionPath_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string version_path = 3;</code>
       * @return The bytes for versionPath.
       */
      public com.google.protobuf.ByteString
          getVersionPathBytes() {
        java.lang.Object ref = versionPath_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          versionPath_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string version_path = 3;</code>
       * @param value The versionPath to set.
       * @return This builder for chaining.
       */
      public Builder setVersionPath(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        versionPath_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string version_path = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearVersionPath() {
        versionPath_ = getDefaultInstance().getVersionPath();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string version_path = 3;</code>
       * @param value The bytes for versionPath to set.
       * @return This builder for chaining.
       */
      public Builder setVersionPathBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        versionPath_ = value;
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


      // @@protoc_insertion_point(builder_scope:tensorflow.serving.StaticStoragePathSourceConfig)
    }

    // @@protoc_insertion_point(class_scope:tensorflow.serving.StaticStoragePathSourceConfig)
    private static final tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig();
    }

    public static tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StaticStoragePathSourceConfig>
        PARSER = new com.google.protobuf.AbstractParser<StaticStoragePathSourceConfig>() {
      @java.lang.Override
      public StaticStoragePathSourceConfig parsePartialFrom(
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

    public static com.google.protobuf.Parser<StaticStoragePathSourceConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StaticStoragePathSourceConfig> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tensorflow.serving.StaticStoragePathSource.StaticStoragePathSourceConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_serving_StaticStoragePathSourceConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_serving_StaticStoragePathSourceConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHtensorflow_serving/sources/storage_pat" +
      "h/static_storage_path_source.proto\022\022tens" +
      "orflow.serving\"a\n\035StaticStoragePathSourc" +
      "eConfig\022\025\n\rservable_name\030\001 \001(\t\022\023\n\013versio" +
      "n_num\030\002 \001(\003\022\024\n\014version_path\030\003 \001(\tb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tensorflow_serving_StaticStoragePathSourceConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_serving_StaticStoragePathSourceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_serving_StaticStoragePathSourceConfig_descriptor,
        new java.lang.String[] { "ServableName", "VersionNum", "VersionPath", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
