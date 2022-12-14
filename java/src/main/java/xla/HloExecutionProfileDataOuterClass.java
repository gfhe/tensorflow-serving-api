// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/compiler/xla/service/hlo_execution_profile_data.proto

package xla;

public final class HloExecutionProfileDataOuterClass {
  private HloExecutionProfileDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HloExecutionProfileDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:xla.HloExecutionProfileData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.xla.HloProfilePrinterData printer_data = 1;</code>
     * @return Whether the printerData field is set.
     */
    boolean hasPrinterData();
    /**
     * <code>.xla.HloProfilePrinterData printer_data = 1;</code>
     * @return The printerData.
     */
    xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData getPrinterData();
    /**
     * <code>.xla.HloProfilePrinterData printer_data = 1;</code>
     */
    xla.HloProfilePrinterDataOuterClass.HloProfilePrinterDataOrBuilder getPrinterDataOrBuilder();

    /**
     * <code>repeated int64 profile_counters = 2;</code>
     * @return A list containing the profileCounters.
     */
    java.util.List<java.lang.Long> getProfileCountersList();
    /**
     * <code>repeated int64 profile_counters = 2;</code>
     * @return The count of profileCounters.
     */
    int getProfileCountersCount();
    /**
     * <code>repeated int64 profile_counters = 2;</code>
     * @param index The index of the element to return.
     * @return The profileCounters at the given index.
     */
    long getProfileCounters(int index);
  }
  /**
   * Protobuf type {@code xla.HloExecutionProfileData}
   */
  public static final class HloExecutionProfileData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:xla.HloExecutionProfileData)
      HloExecutionProfileDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HloExecutionProfileData.newBuilder() to construct.
    private HloExecutionProfileData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HloExecutionProfileData() {
      profileCounters_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HloExecutionProfileData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xla.HloExecutionProfileDataOuterClass.internal_static_xla_HloExecutionProfileData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xla.HloExecutionProfileDataOuterClass.internal_static_xla_HloExecutionProfileData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData.class, xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData.Builder.class);
    }

    public static final int PRINTER_DATA_FIELD_NUMBER = 1;
    private xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData printerData_;
    /**
     * <code>.xla.HloProfilePrinterData printer_data = 1;</code>
     * @return Whether the printerData field is set.
     */
    @java.lang.Override
    public boolean hasPrinterData() {
      return printerData_ != null;
    }
    /**
     * <code>.xla.HloProfilePrinterData printer_data = 1;</code>
     * @return The printerData.
     */
    @java.lang.Override
    public xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData getPrinterData() {
      return printerData_ == null ? xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData.getDefaultInstance() : printerData_;
    }
    /**
     * <code>.xla.HloProfilePrinterData printer_data = 1;</code>
     */
    @java.lang.Override
    public xla.HloProfilePrinterDataOuterClass.HloProfilePrinterDataOrBuilder getPrinterDataOrBuilder() {
      return printerData_ == null ? xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData.getDefaultInstance() : printerData_;
    }

    public static final int PROFILE_COUNTERS_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList profileCounters_;
    /**
     * <code>repeated int64 profile_counters = 2;</code>
     * @return A list containing the profileCounters.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getProfileCountersList() {
      return profileCounters_;
    }
    /**
     * <code>repeated int64 profile_counters = 2;</code>
     * @return The count of profileCounters.
     */
    public int getProfileCountersCount() {
      return profileCounters_.size();
    }
    /**
     * <code>repeated int64 profile_counters = 2;</code>
     * @param index The index of the element to return.
     * @return The profileCounters at the given index.
     */
    public long getProfileCounters(int index) {
      return profileCounters_.getLong(index);
    }
    private int profileCountersMemoizedSerializedSize = -1;

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
      if (printerData_ != null) {
        output.writeMessage(1, getPrinterData());
      }
      if (getProfileCountersList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(profileCountersMemoizedSerializedSize);
      }
      for (int i = 0; i < profileCounters_.size(); i++) {
        output.writeInt64NoTag(profileCounters_.getLong(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (printerData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getPrinterData());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < profileCounters_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt64SizeNoTag(profileCounters_.getLong(i));
        }
        size += dataSize;
        if (!getProfileCountersList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        profileCountersMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData)) {
        return super.equals(obj);
      }
      xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData other = (xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData) obj;

      if (hasPrinterData() != other.hasPrinterData()) return false;
      if (hasPrinterData()) {
        if (!getPrinterData()
            .equals(other.getPrinterData())) return false;
      }
      if (!getProfileCountersList()
          .equals(other.getProfileCountersList())) return false;
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
      if (hasPrinterData()) {
        hash = (37 * hash) + PRINTER_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getPrinterData().hashCode();
      }
      if (getProfileCountersCount() > 0) {
        hash = (37 * hash) + PROFILE_COUNTERS_FIELD_NUMBER;
        hash = (53 * hash) + getProfileCountersList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData parseFrom(
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
    public static Builder newBuilder(xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData prototype) {
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
     * Protobuf type {@code xla.HloExecutionProfileData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:xla.HloExecutionProfileData)
        xla.HloExecutionProfileDataOuterClass.HloExecutionProfileDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return xla.HloExecutionProfileDataOuterClass.internal_static_xla_HloExecutionProfileData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return xla.HloExecutionProfileDataOuterClass.internal_static_xla_HloExecutionProfileData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData.class, xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData.Builder.class);
      }

      // Construct using xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData.newBuilder()
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
        printerData_ = null;
        if (printerDataBuilder_ != null) {
          printerDataBuilder_.dispose();
          printerDataBuilder_ = null;
        }
        profileCounters_ = emptyLongList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return xla.HloExecutionProfileDataOuterClass.internal_static_xla_HloExecutionProfileData_descriptor;
      }

      @java.lang.Override
      public xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData getDefaultInstanceForType() {
        return xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData.getDefaultInstance();
      }

      @java.lang.Override
      public xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData build() {
        xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData buildPartial() {
        xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData result = new xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData result) {
        if (((bitField0_ & 0x00000002) != 0)) {
          profileCounters_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.profileCounters_ = profileCounters_;
      }

      private void buildPartial0(xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.printerData_ = printerDataBuilder_ == null
              ? printerData_
              : printerDataBuilder_.build();
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
        if (other instanceof xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData) {
          return mergeFrom((xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData other) {
        if (other == xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData.getDefaultInstance()) return this;
        if (other.hasPrinterData()) {
          mergePrinterData(other.getPrinterData());
        }
        if (!other.profileCounters_.isEmpty()) {
          if (profileCounters_.isEmpty()) {
            profileCounters_ = other.profileCounters_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureProfileCountersIsMutable();
            profileCounters_.addAll(other.profileCounters_);
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
              case 10: {
                input.readMessage(
                    getPrinterDataFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                long v = input.readInt64();
                ensureProfileCountersIsMutable();
                profileCounters_.addLong(v);
                break;
              } // case 16
              case 18: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureProfileCountersIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  profileCounters_.addLong(input.readInt64());
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

      private xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData printerData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData, xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData.Builder, xla.HloProfilePrinterDataOuterClass.HloProfilePrinterDataOrBuilder> printerDataBuilder_;
      /**
       * <code>.xla.HloProfilePrinterData printer_data = 1;</code>
       * @return Whether the printerData field is set.
       */
      public boolean hasPrinterData() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.xla.HloProfilePrinterData printer_data = 1;</code>
       * @return The printerData.
       */
      public xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData getPrinterData() {
        if (printerDataBuilder_ == null) {
          return printerData_ == null ? xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData.getDefaultInstance() : printerData_;
        } else {
          return printerDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.xla.HloProfilePrinterData printer_data = 1;</code>
       */
      public Builder setPrinterData(xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData value) {
        if (printerDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          printerData_ = value;
        } else {
          printerDataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.xla.HloProfilePrinterData printer_data = 1;</code>
       */
      public Builder setPrinterData(
          xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData.Builder builderForValue) {
        if (printerDataBuilder_ == null) {
          printerData_ = builderForValue.build();
        } else {
          printerDataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.xla.HloProfilePrinterData printer_data = 1;</code>
       */
      public Builder mergePrinterData(xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData value) {
        if (printerDataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            printerData_ != null &&
            printerData_ != xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData.getDefaultInstance()) {
            getPrinterDataBuilder().mergeFrom(value);
          } else {
            printerData_ = value;
          }
        } else {
          printerDataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.xla.HloProfilePrinterData printer_data = 1;</code>
       */
      public Builder clearPrinterData() {
        bitField0_ = (bitField0_ & ~0x00000001);
        printerData_ = null;
        if (printerDataBuilder_ != null) {
          printerDataBuilder_.dispose();
          printerDataBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.xla.HloProfilePrinterData printer_data = 1;</code>
       */
      public xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData.Builder getPrinterDataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPrinterDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.xla.HloProfilePrinterData printer_data = 1;</code>
       */
      public xla.HloProfilePrinterDataOuterClass.HloProfilePrinterDataOrBuilder getPrinterDataOrBuilder() {
        if (printerDataBuilder_ != null) {
          return printerDataBuilder_.getMessageOrBuilder();
        } else {
          return printerData_ == null ?
              xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData.getDefaultInstance() : printerData_;
        }
      }
      /**
       * <code>.xla.HloProfilePrinterData printer_data = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData, xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData.Builder, xla.HloProfilePrinterDataOuterClass.HloProfilePrinterDataOrBuilder> 
          getPrinterDataFieldBuilder() {
        if (printerDataBuilder_ == null) {
          printerDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData, xla.HloProfilePrinterDataOuterClass.HloProfilePrinterData.Builder, xla.HloProfilePrinterDataOuterClass.HloProfilePrinterDataOrBuilder>(
                  getPrinterData(),
                  getParentForChildren(),
                  isClean());
          printerData_ = null;
        }
        return printerDataBuilder_;
      }

      private com.google.protobuf.Internal.LongList profileCounters_ = emptyLongList();
      private void ensureProfileCountersIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          profileCounters_ = mutableCopy(profileCounters_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated int64 profile_counters = 2;</code>
       * @return A list containing the profileCounters.
       */
      public java.util.List<java.lang.Long>
          getProfileCountersList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(profileCounters_) : profileCounters_;
      }
      /**
       * <code>repeated int64 profile_counters = 2;</code>
       * @return The count of profileCounters.
       */
      public int getProfileCountersCount() {
        return profileCounters_.size();
      }
      /**
       * <code>repeated int64 profile_counters = 2;</code>
       * @param index The index of the element to return.
       * @return The profileCounters at the given index.
       */
      public long getProfileCounters(int index) {
        return profileCounters_.getLong(index);
      }
      /**
       * <code>repeated int64 profile_counters = 2;</code>
       * @param index The index to set the value at.
       * @param value The profileCounters to set.
       * @return This builder for chaining.
       */
      public Builder setProfileCounters(
          int index, long value) {
        
        ensureProfileCountersIsMutable();
        profileCounters_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 profile_counters = 2;</code>
       * @param value The profileCounters to add.
       * @return This builder for chaining.
       */
      public Builder addProfileCounters(long value) {
        
        ensureProfileCountersIsMutable();
        profileCounters_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 profile_counters = 2;</code>
       * @param values The profileCounters to add.
       * @return This builder for chaining.
       */
      public Builder addAllProfileCounters(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureProfileCountersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, profileCounters_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 profile_counters = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearProfileCounters() {
        profileCounters_ = emptyLongList();
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


      // @@protoc_insertion_point(builder_scope:xla.HloExecutionProfileData)
    }

    // @@protoc_insertion_point(class_scope:xla.HloExecutionProfileData)
    private static final xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData();
    }

    public static xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HloExecutionProfileData>
        PARSER = new com.google.protobuf.AbstractParser<HloExecutionProfileData>() {
      @java.lang.Override
      public HloExecutionProfileData parsePartialFrom(
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

    public static com.google.protobuf.Parser<HloExecutionProfileData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HloExecutionProfileData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public xla.HloExecutionProfileDataOuterClass.HloExecutionProfileData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xla_HloExecutionProfileData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xla_HloExecutionProfileData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@tensorflow/compiler/xla/service/hlo_ex" +
      "ecution_profile_data.proto\022\003xla\032>tensorf" +
      "low/compiler/xla/service/hlo_profile_pri" +
      "nter_data.proto\"e\n\027HloExecutionProfileDa" +
      "ta\0220\n\014printer_data\030\001 \001(\0132\032.xla.HloProfil" +
      "ePrinterData\022\030\n\020profile_counters\030\002 \003(\003B\003" +
      "\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          xla.HloProfilePrinterDataOuterClass.getDescriptor(),
        });
    internal_static_xla_HloExecutionProfileData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xla_HloExecutionProfileData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xla_HloExecutionProfileData_descriptor,
        new java.lang.String[] { "PrinterData", "ProfileCounters", });
    xla.HloProfilePrinterDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
