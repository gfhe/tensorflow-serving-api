// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_serving/config/ssl_config.proto

package tensorflow.serving;

public final class SslConfig {
  private SslConfig() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SSLConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tensorflow.serving.SSLConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * private server key for SSL
     * </pre>
     *
     * <code>string server_key = 1;</code>
     * @return The serverKey.
     */
    java.lang.String getServerKey();
    /**
     * <pre>
     * private server key for SSL
     * </pre>
     *
     * <code>string server_key = 1;</code>
     * @return The bytes for serverKey.
     */
    com.google.protobuf.ByteString
        getServerKeyBytes();

    /**
     * <pre>
     * public server certificate
     * </pre>
     *
     * <code>string server_cert = 2;</code>
     * @return The serverCert.
     */
    java.lang.String getServerCert();
    /**
     * <pre>
     * public server certificate
     * </pre>
     *
     * <code>string server_cert = 2;</code>
     * @return The bytes for serverCert.
     */
    com.google.protobuf.ByteString
        getServerCertBytes();

    /**
     * <pre>
     *  custom certificate authority
     * </pre>
     *
     * <code>string custom_ca = 3;</code>
     * @return The customCa.
     */
    java.lang.String getCustomCa();
    /**
     * <pre>
     *  custom certificate authority
     * </pre>
     *
     * <code>string custom_ca = 3;</code>
     * @return The bytes for customCa.
     */
    com.google.protobuf.ByteString
        getCustomCaBytes();

    /**
     * <pre>
     * valid client certificate required ?
     * </pre>
     *
     * <code>bool client_verify = 4;</code>
     * @return The clientVerify.
     */
    boolean getClientVerify();
  }
  /**
   * <pre>
   * Configuration for a secure gRPC channel
   * </pre>
   *
   * Protobuf type {@code tensorflow.serving.SSLConfig}
   */
  public static final class SSLConfig extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tensorflow.serving.SSLConfig)
      SSLConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SSLConfig.newBuilder() to construct.
    private SSLConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SSLConfig() {
      serverKey_ = "";
      serverCert_ = "";
      customCa_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SSLConfig();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tensorflow.serving.SslConfig.internal_static_tensorflow_serving_SSLConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tensorflow.serving.SslConfig.internal_static_tensorflow_serving_SSLConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tensorflow.serving.SslConfig.SSLConfig.class, tensorflow.serving.SslConfig.SSLConfig.Builder.class);
    }

    public static final int SERVER_KEY_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object serverKey_ = "";
    /**
     * <pre>
     * private server key for SSL
     * </pre>
     *
     * <code>string server_key = 1;</code>
     * @return The serverKey.
     */
    @java.lang.Override
    public java.lang.String getServerKey() {
      java.lang.Object ref = serverKey_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serverKey_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * private server key for SSL
     * </pre>
     *
     * <code>string server_key = 1;</code>
     * @return The bytes for serverKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getServerKeyBytes() {
      java.lang.Object ref = serverKey_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SERVER_CERT_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object serverCert_ = "";
    /**
     * <pre>
     * public server certificate
     * </pre>
     *
     * <code>string server_cert = 2;</code>
     * @return The serverCert.
     */
    @java.lang.Override
    public java.lang.String getServerCert() {
      java.lang.Object ref = serverCert_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serverCert_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * public server certificate
     * </pre>
     *
     * <code>string server_cert = 2;</code>
     * @return The bytes for serverCert.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getServerCertBytes() {
      java.lang.Object ref = serverCert_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverCert_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CUSTOM_CA_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object customCa_ = "";
    /**
     * <pre>
     *  custom certificate authority
     * </pre>
     *
     * <code>string custom_ca = 3;</code>
     * @return The customCa.
     */
    @java.lang.Override
    public java.lang.String getCustomCa() {
      java.lang.Object ref = customCa_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customCa_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *  custom certificate authority
     * </pre>
     *
     * <code>string custom_ca = 3;</code>
     * @return The bytes for customCa.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCustomCaBytes() {
      java.lang.Object ref = customCa_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customCa_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CLIENT_VERIFY_FIELD_NUMBER = 4;
    private boolean clientVerify_ = false;
    /**
     * <pre>
     * valid client certificate required ?
     * </pre>
     *
     * <code>bool client_verify = 4;</code>
     * @return The clientVerify.
     */
    @java.lang.Override
    public boolean getClientVerify() {
      return clientVerify_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serverKey_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serverKey_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serverCert_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serverCert_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customCa_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, customCa_);
      }
      if (clientVerify_ != false) {
        output.writeBool(4, clientVerify_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serverKey_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serverKey_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serverCert_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serverCert_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customCa_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, customCa_);
      }
      if (clientVerify_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, clientVerify_);
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
      if (!(obj instanceof tensorflow.serving.SslConfig.SSLConfig)) {
        return super.equals(obj);
      }
      tensorflow.serving.SslConfig.SSLConfig other = (tensorflow.serving.SslConfig.SSLConfig) obj;

      if (!getServerKey()
          .equals(other.getServerKey())) return false;
      if (!getServerCert()
          .equals(other.getServerCert())) return false;
      if (!getCustomCa()
          .equals(other.getCustomCa())) return false;
      if (getClientVerify()
          != other.getClientVerify()) return false;
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
      hash = (37 * hash) + SERVER_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getServerKey().hashCode();
      hash = (37 * hash) + SERVER_CERT_FIELD_NUMBER;
      hash = (53 * hash) + getServerCert().hashCode();
      hash = (37 * hash) + CUSTOM_CA_FIELD_NUMBER;
      hash = (53 * hash) + getCustomCa().hashCode();
      hash = (37 * hash) + CLIENT_VERIFY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getClientVerify());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tensorflow.serving.SslConfig.SSLConfig parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.serving.SslConfig.SSLConfig parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.serving.SslConfig.SSLConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.serving.SslConfig.SSLConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.serving.SslConfig.SSLConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.serving.SslConfig.SSLConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.serving.SslConfig.SSLConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tensorflow.serving.SslConfig.SSLConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static tensorflow.serving.SslConfig.SSLConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static tensorflow.serving.SslConfig.SSLConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tensorflow.serving.SslConfig.SSLConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tensorflow.serving.SslConfig.SSLConfig parseFrom(
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
    public static Builder newBuilder(tensorflow.serving.SslConfig.SSLConfig prototype) {
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
     * Configuration for a secure gRPC channel
     * </pre>
     *
     * Protobuf type {@code tensorflow.serving.SSLConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tensorflow.serving.SSLConfig)
        tensorflow.serving.SslConfig.SSLConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tensorflow.serving.SslConfig.internal_static_tensorflow_serving_SSLConfig_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tensorflow.serving.SslConfig.internal_static_tensorflow_serving_SSLConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tensorflow.serving.SslConfig.SSLConfig.class, tensorflow.serving.SslConfig.SSLConfig.Builder.class);
      }

      // Construct using tensorflow.serving.SslConfig.SSLConfig.newBuilder()
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
        serverKey_ = "";
        serverCert_ = "";
        customCa_ = "";
        clientVerify_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tensorflow.serving.SslConfig.internal_static_tensorflow_serving_SSLConfig_descriptor;
      }

      @java.lang.Override
      public tensorflow.serving.SslConfig.SSLConfig getDefaultInstanceForType() {
        return tensorflow.serving.SslConfig.SSLConfig.getDefaultInstance();
      }

      @java.lang.Override
      public tensorflow.serving.SslConfig.SSLConfig build() {
        tensorflow.serving.SslConfig.SSLConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tensorflow.serving.SslConfig.SSLConfig buildPartial() {
        tensorflow.serving.SslConfig.SSLConfig result = new tensorflow.serving.SslConfig.SSLConfig(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(tensorflow.serving.SslConfig.SSLConfig result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.serverKey_ = serverKey_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.serverCert_ = serverCert_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.customCa_ = customCa_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.clientVerify_ = clientVerify_;
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
        if (other instanceof tensorflow.serving.SslConfig.SSLConfig) {
          return mergeFrom((tensorflow.serving.SslConfig.SSLConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tensorflow.serving.SslConfig.SSLConfig other) {
        if (other == tensorflow.serving.SslConfig.SSLConfig.getDefaultInstance()) return this;
        if (!other.getServerKey().isEmpty()) {
          serverKey_ = other.serverKey_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getServerCert().isEmpty()) {
          serverCert_ = other.serverCert_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getCustomCa().isEmpty()) {
          customCa_ = other.customCa_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (other.getClientVerify() != false) {
          setClientVerify(other.getClientVerify());
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
                serverKey_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                serverCert_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                customCa_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 32: {
                clientVerify_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

      private java.lang.Object serverKey_ = "";
      /**
       * <pre>
       * private server key for SSL
       * </pre>
       *
       * <code>string server_key = 1;</code>
       * @return The serverKey.
       */
      public java.lang.String getServerKey() {
        java.lang.Object ref = serverKey_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          serverKey_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * private server key for SSL
       * </pre>
       *
       * <code>string server_key = 1;</code>
       * @return The bytes for serverKey.
       */
      public com.google.protobuf.ByteString
          getServerKeyBytes() {
        java.lang.Object ref = serverKey_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          serverKey_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * private server key for SSL
       * </pre>
       *
       * <code>string server_key = 1;</code>
       * @param value The serverKey to set.
       * @return This builder for chaining.
       */
      public Builder setServerKey(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        serverKey_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * private server key for SSL
       * </pre>
       *
       * <code>string server_key = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerKey() {
        serverKey_ = getDefaultInstance().getServerKey();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * private server key for SSL
       * </pre>
       *
       * <code>string server_key = 1;</code>
       * @param value The bytes for serverKey to set.
       * @return This builder for chaining.
       */
      public Builder setServerKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        serverKey_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object serverCert_ = "";
      /**
       * <pre>
       * public server certificate
       * </pre>
       *
       * <code>string server_cert = 2;</code>
       * @return The serverCert.
       */
      public java.lang.String getServerCert() {
        java.lang.Object ref = serverCert_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          serverCert_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * public server certificate
       * </pre>
       *
       * <code>string server_cert = 2;</code>
       * @return The bytes for serverCert.
       */
      public com.google.protobuf.ByteString
          getServerCertBytes() {
        java.lang.Object ref = serverCert_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          serverCert_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * public server certificate
       * </pre>
       *
       * <code>string server_cert = 2;</code>
       * @param value The serverCert to set.
       * @return This builder for chaining.
       */
      public Builder setServerCert(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        serverCert_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * public server certificate
       * </pre>
       *
       * <code>string server_cert = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerCert() {
        serverCert_ = getDefaultInstance().getServerCert();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * public server certificate
       * </pre>
       *
       * <code>string server_cert = 2;</code>
       * @param value The bytes for serverCert to set.
       * @return This builder for chaining.
       */
      public Builder setServerCertBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        serverCert_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object customCa_ = "";
      /**
       * <pre>
       *  custom certificate authority
       * </pre>
       *
       * <code>string custom_ca = 3;</code>
       * @return The customCa.
       */
      public java.lang.String getCustomCa() {
        java.lang.Object ref = customCa_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          customCa_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *  custom certificate authority
       * </pre>
       *
       * <code>string custom_ca = 3;</code>
       * @return The bytes for customCa.
       */
      public com.google.protobuf.ByteString
          getCustomCaBytes() {
        java.lang.Object ref = customCa_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          customCa_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *  custom certificate authority
       * </pre>
       *
       * <code>string custom_ca = 3;</code>
       * @param value The customCa to set.
       * @return This builder for chaining.
       */
      public Builder setCustomCa(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        customCa_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *  custom certificate authority
       * </pre>
       *
       * <code>string custom_ca = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCustomCa() {
        customCa_ = getDefaultInstance().getCustomCa();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *  custom certificate authority
       * </pre>
       *
       * <code>string custom_ca = 3;</code>
       * @param value The bytes for customCa to set.
       * @return This builder for chaining.
       */
      public Builder setCustomCaBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        customCa_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private boolean clientVerify_ ;
      /**
       * <pre>
       * valid client certificate required ?
       * </pre>
       *
       * <code>bool client_verify = 4;</code>
       * @return The clientVerify.
       */
      @java.lang.Override
      public boolean getClientVerify() {
        return clientVerify_;
      }
      /**
       * <pre>
       * valid client certificate required ?
       * </pre>
       *
       * <code>bool client_verify = 4;</code>
       * @param value The clientVerify to set.
       * @return This builder for chaining.
       */
      public Builder setClientVerify(boolean value) {
        
        clientVerify_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * valid client certificate required ?
       * </pre>
       *
       * <code>bool client_verify = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientVerify() {
        bitField0_ = (bitField0_ & ~0x00000008);
        clientVerify_ = false;
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


      // @@protoc_insertion_point(builder_scope:tensorflow.serving.SSLConfig)
    }

    // @@protoc_insertion_point(class_scope:tensorflow.serving.SSLConfig)
    private static final tensorflow.serving.SslConfig.SSLConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tensorflow.serving.SslConfig.SSLConfig();
    }

    public static tensorflow.serving.SslConfig.SSLConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SSLConfig>
        PARSER = new com.google.protobuf.AbstractParser<SSLConfig>() {
      @java.lang.Override
      public SSLConfig parsePartialFrom(
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

    public static com.google.protobuf.Parser<SSLConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SSLConfig> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tensorflow.serving.SslConfig.SSLConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_serving_SSLConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_serving_SSLConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*tensorflow_serving/config/ssl_config.p" +
      "roto\022\022tensorflow.serving\"^\n\tSSLConfig\022\022\n" +
      "\nserver_key\030\001 \001(\t\022\023\n\013server_cert\030\002 \001(\t\022\021" +
      "\n\tcustom_ca\030\003 \001(\t\022\025\n\rclient_verify\030\004 \001(\010" +
      "B\003\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tensorflow_serving_SSLConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_serving_SSLConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_serving_SSLConfig_descriptor,
        new java.lang.String[] { "ServerKey", "ServerCert", "CustomCa", "ClientVerify", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
