// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/summary.proto

package org.tensorflow.framework;

/**
 * <pre>
 * Serialization format for histogram module in
 * core/lib/histogram/histogram.h
 * </pre>
 *
 * Protobuf type {@code tensorflow.HistogramProto}
 */
public final class HistogramProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.HistogramProto)
    HistogramProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HistogramProto.newBuilder() to construct.
  private HistogramProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HistogramProto() {
    bucketLimit_ = emptyDoubleList();
    bucket_ = emptyDoubleList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HistogramProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.SummaryProtos.internal_static_tensorflow_HistogramProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.SummaryProtos.internal_static_tensorflow_HistogramProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.HistogramProto.class, org.tensorflow.framework.HistogramProto.Builder.class);
  }

  public static final int MIN_FIELD_NUMBER = 1;
  private double min_ = 0D;
  /**
   * <code>double min = 1;</code>
   * @return The min.
   */
  @java.lang.Override
  public double getMin() {
    return min_;
  }

  public static final int MAX_FIELD_NUMBER = 2;
  private double max_ = 0D;
  /**
   * <code>double max = 2;</code>
   * @return The max.
   */
  @java.lang.Override
  public double getMax() {
    return max_;
  }

  public static final int NUM_FIELD_NUMBER = 3;
  private double num_ = 0D;
  /**
   * <code>double num = 3;</code>
   * @return The num.
   */
  @java.lang.Override
  public double getNum() {
    return num_;
  }

  public static final int SUM_FIELD_NUMBER = 4;
  private double sum_ = 0D;
  /**
   * <code>double sum = 4;</code>
   * @return The sum.
   */
  @java.lang.Override
  public double getSum() {
    return sum_;
  }

  public static final int SUM_SQUARES_FIELD_NUMBER = 5;
  private double sumSquares_ = 0D;
  /**
   * <code>double sum_squares = 5;</code>
   * @return The sumSquares.
   */
  @java.lang.Override
  public double getSumSquares() {
    return sumSquares_;
  }

  public static final int BUCKET_LIMIT_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.DoubleList bucketLimit_;
  /**
   * <pre>
   * Parallel arrays encoding the bucket boundaries and the bucket values.
   * bucket(i) is the count for the bucket i.  The range for
   * a bucket is:
   *   i == 0:  -DBL_MAX .. bucket_limit(0)
   *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
   * </pre>
   *
   * <code>repeated double bucket_limit = 6 [packed = true];</code>
   * @return A list containing the bucketLimit.
   */
  @java.lang.Override
  public java.util.List<java.lang.Double>
      getBucketLimitList() {
    return bucketLimit_;
  }
  /**
   * <pre>
   * Parallel arrays encoding the bucket boundaries and the bucket values.
   * bucket(i) is the count for the bucket i.  The range for
   * a bucket is:
   *   i == 0:  -DBL_MAX .. bucket_limit(0)
   *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
   * </pre>
   *
   * <code>repeated double bucket_limit = 6 [packed = true];</code>
   * @return The count of bucketLimit.
   */
  public int getBucketLimitCount() {
    return bucketLimit_.size();
  }
  /**
   * <pre>
   * Parallel arrays encoding the bucket boundaries and the bucket values.
   * bucket(i) is the count for the bucket i.  The range for
   * a bucket is:
   *   i == 0:  -DBL_MAX .. bucket_limit(0)
   *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
   * </pre>
   *
   * <code>repeated double bucket_limit = 6 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The bucketLimit at the given index.
   */
  public double getBucketLimit(int index) {
    return bucketLimit_.getDouble(index);
  }
  private int bucketLimitMemoizedSerializedSize = -1;

  public static final int BUCKET_FIELD_NUMBER = 7;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.DoubleList bucket_;
  /**
   * <code>repeated double bucket = 7 [packed = true];</code>
   * @return A list containing the bucket.
   */
  @java.lang.Override
  public java.util.List<java.lang.Double>
      getBucketList() {
    return bucket_;
  }
  /**
   * <code>repeated double bucket = 7 [packed = true];</code>
   * @return The count of bucket.
   */
  public int getBucketCount() {
    return bucket_.size();
  }
  /**
   * <code>repeated double bucket = 7 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The bucket at the given index.
   */
  public double getBucket(int index) {
    return bucket_.getDouble(index);
  }
  private int bucketMemoizedSerializedSize = -1;

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
    if (java.lang.Double.doubleToRawLongBits(min_) != 0) {
      output.writeDouble(1, min_);
    }
    if (java.lang.Double.doubleToRawLongBits(max_) != 0) {
      output.writeDouble(2, max_);
    }
    if (java.lang.Double.doubleToRawLongBits(num_) != 0) {
      output.writeDouble(3, num_);
    }
    if (java.lang.Double.doubleToRawLongBits(sum_) != 0) {
      output.writeDouble(4, sum_);
    }
    if (java.lang.Double.doubleToRawLongBits(sumSquares_) != 0) {
      output.writeDouble(5, sumSquares_);
    }
    if (getBucketLimitList().size() > 0) {
      output.writeUInt32NoTag(50);
      output.writeUInt32NoTag(bucketLimitMemoizedSerializedSize);
    }
    for (int i = 0; i < bucketLimit_.size(); i++) {
      output.writeDoubleNoTag(bucketLimit_.getDouble(i));
    }
    if (getBucketList().size() > 0) {
      output.writeUInt32NoTag(58);
      output.writeUInt32NoTag(bucketMemoizedSerializedSize);
    }
    for (int i = 0; i < bucket_.size(); i++) {
      output.writeDoubleNoTag(bucket_.getDouble(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(min_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, min_);
    }
    if (java.lang.Double.doubleToRawLongBits(max_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, max_);
    }
    if (java.lang.Double.doubleToRawLongBits(num_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, num_);
    }
    if (java.lang.Double.doubleToRawLongBits(sum_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, sum_);
    }
    if (java.lang.Double.doubleToRawLongBits(sumSquares_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, sumSquares_);
    }
    {
      int dataSize = 0;
      dataSize = 8 * getBucketLimitList().size();
      size += dataSize;
      if (!getBucketLimitList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      bucketLimitMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      dataSize = 8 * getBucketList().size();
      size += dataSize;
      if (!getBucketList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      bucketMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof org.tensorflow.framework.HistogramProto)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.HistogramProto other = (org.tensorflow.framework.HistogramProto) obj;

    if (java.lang.Double.doubleToLongBits(getMin())
        != java.lang.Double.doubleToLongBits(
            other.getMin())) return false;
    if (java.lang.Double.doubleToLongBits(getMax())
        != java.lang.Double.doubleToLongBits(
            other.getMax())) return false;
    if (java.lang.Double.doubleToLongBits(getNum())
        != java.lang.Double.doubleToLongBits(
            other.getNum())) return false;
    if (java.lang.Double.doubleToLongBits(getSum())
        != java.lang.Double.doubleToLongBits(
            other.getSum())) return false;
    if (java.lang.Double.doubleToLongBits(getSumSquares())
        != java.lang.Double.doubleToLongBits(
            other.getSumSquares())) return false;
    if (!getBucketLimitList()
        .equals(other.getBucketLimitList())) return false;
    if (!getBucketList()
        .equals(other.getBucketList())) return false;
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
    hash = (37 * hash) + MIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMin()));
    hash = (37 * hash) + MAX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMax()));
    hash = (37 * hash) + NUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNum()));
    hash = (37 * hash) + SUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSum()));
    hash = (37 * hash) + SUM_SQUARES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSumSquares()));
    if (getBucketLimitCount() > 0) {
      hash = (37 * hash) + BUCKET_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getBucketLimitList().hashCode();
    }
    if (getBucketCount() > 0) {
      hash = (37 * hash) + BUCKET_FIELD_NUMBER;
      hash = (53 * hash) + getBucketList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.HistogramProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.HistogramProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.HistogramProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.HistogramProto prototype) {
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
   * Serialization format for histogram module in
   * core/lib/histogram/histogram.h
   * </pre>
   *
   * Protobuf type {@code tensorflow.HistogramProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.HistogramProto)
      org.tensorflow.framework.HistogramProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.SummaryProtos.internal_static_tensorflow_HistogramProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.SummaryProtos.internal_static_tensorflow_HistogramProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.HistogramProto.class, org.tensorflow.framework.HistogramProto.Builder.class);
    }

    // Construct using org.tensorflow.framework.HistogramProto.newBuilder()
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
      min_ = 0D;
      max_ = 0D;
      num_ = 0D;
      sum_ = 0D;
      sumSquares_ = 0D;
      bucketLimit_ = emptyDoubleList();
      bucket_ = emptyDoubleList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.SummaryProtos.internal_static_tensorflow_HistogramProto_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.HistogramProto getDefaultInstanceForType() {
      return org.tensorflow.framework.HistogramProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.HistogramProto build() {
      org.tensorflow.framework.HistogramProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.HistogramProto buildPartial() {
      org.tensorflow.framework.HistogramProto result = new org.tensorflow.framework.HistogramProto(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.tensorflow.framework.HistogramProto result) {
      if (((bitField0_ & 0x00000020) != 0)) {
        bucketLimit_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000020);
      }
      result.bucketLimit_ = bucketLimit_;
      if (((bitField0_ & 0x00000040) != 0)) {
        bucket_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000040);
      }
      result.bucket_ = bucket_;
    }

    private void buildPartial0(org.tensorflow.framework.HistogramProto result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.min_ = min_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.max_ = max_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.num_ = num_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.sum_ = sum_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.sumSquares_ = sumSquares_;
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
      if (other instanceof org.tensorflow.framework.HistogramProto) {
        return mergeFrom((org.tensorflow.framework.HistogramProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.HistogramProto other) {
      if (other == org.tensorflow.framework.HistogramProto.getDefaultInstance()) return this;
      if (other.getMin() != 0D) {
        setMin(other.getMin());
      }
      if (other.getMax() != 0D) {
        setMax(other.getMax());
      }
      if (other.getNum() != 0D) {
        setNum(other.getNum());
      }
      if (other.getSum() != 0D) {
        setSum(other.getSum());
      }
      if (other.getSumSquares() != 0D) {
        setSumSquares(other.getSumSquares());
      }
      if (!other.bucketLimit_.isEmpty()) {
        if (bucketLimit_.isEmpty()) {
          bucketLimit_ = other.bucketLimit_;
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          ensureBucketLimitIsMutable();
          bucketLimit_.addAll(other.bucketLimit_);
        }
        onChanged();
      }
      if (!other.bucket_.isEmpty()) {
        if (bucket_.isEmpty()) {
          bucket_ = other.bucket_;
          bitField0_ = (bitField0_ & ~0x00000040);
        } else {
          ensureBucketIsMutable();
          bucket_.addAll(other.bucket_);
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
            case 9: {
              min_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 9
            case 17: {
              max_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
            case 25: {
              num_ = input.readDouble();
              bitField0_ |= 0x00000004;
              break;
            } // case 25
            case 33: {
              sum_ = input.readDouble();
              bitField0_ |= 0x00000008;
              break;
            } // case 33
            case 41: {
              sumSquares_ = input.readDouble();
              bitField0_ |= 0x00000010;
              break;
            } // case 41
            case 49: {
              double v = input.readDouble();
              ensureBucketLimitIsMutable();
              bucketLimit_.addDouble(v);
              break;
            } // case 49
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureBucketLimitIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                bucketLimit_.addDouble(input.readDouble());
              }
              input.popLimit(limit);
              break;
            } // case 50
            case 57: {
              double v = input.readDouble();
              ensureBucketIsMutable();
              bucket_.addDouble(v);
              break;
            } // case 57
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureBucketIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                bucket_.addDouble(input.readDouble());
              }
              input.popLimit(limit);
              break;
            } // case 58
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

    private double min_ ;
    /**
     * <code>double min = 1;</code>
     * @return The min.
     */
    @java.lang.Override
    public double getMin() {
      return min_;
    }
    /**
     * <code>double min = 1;</code>
     * @param value The min to set.
     * @return This builder for chaining.
     */
    public Builder setMin(double value) {
      
      min_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>double min = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMin() {
      bitField0_ = (bitField0_ & ~0x00000001);
      min_ = 0D;
      onChanged();
      return this;
    }

    private double max_ ;
    /**
     * <code>double max = 2;</code>
     * @return The max.
     */
    @java.lang.Override
    public double getMax() {
      return max_;
    }
    /**
     * <code>double max = 2;</code>
     * @param value The max to set.
     * @return This builder for chaining.
     */
    public Builder setMax(double value) {
      
      max_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>double max = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMax() {
      bitField0_ = (bitField0_ & ~0x00000002);
      max_ = 0D;
      onChanged();
      return this;
    }

    private double num_ ;
    /**
     * <code>double num = 3;</code>
     * @return The num.
     */
    @java.lang.Override
    public double getNum() {
      return num_;
    }
    /**
     * <code>double num = 3;</code>
     * @param value The num to set.
     * @return This builder for chaining.
     */
    public Builder setNum(double value) {
      
      num_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>double num = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNum() {
      bitField0_ = (bitField0_ & ~0x00000004);
      num_ = 0D;
      onChanged();
      return this;
    }

    private double sum_ ;
    /**
     * <code>double sum = 4;</code>
     * @return The sum.
     */
    @java.lang.Override
    public double getSum() {
      return sum_;
    }
    /**
     * <code>double sum = 4;</code>
     * @param value The sum to set.
     * @return This builder for chaining.
     */
    public Builder setSum(double value) {
      
      sum_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>double sum = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSum() {
      bitField0_ = (bitField0_ & ~0x00000008);
      sum_ = 0D;
      onChanged();
      return this;
    }

    private double sumSquares_ ;
    /**
     * <code>double sum_squares = 5;</code>
     * @return The sumSquares.
     */
    @java.lang.Override
    public double getSumSquares() {
      return sumSquares_;
    }
    /**
     * <code>double sum_squares = 5;</code>
     * @param value The sumSquares to set.
     * @return This builder for chaining.
     */
    public Builder setSumSquares(double value) {
      
      sumSquares_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>double sum_squares = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSumSquares() {
      bitField0_ = (bitField0_ & ~0x00000010);
      sumSquares_ = 0D;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.DoubleList bucketLimit_ = emptyDoubleList();
    private void ensureBucketLimitIsMutable() {
      if (!((bitField0_ & 0x00000020) != 0)) {
        bucketLimit_ = mutableCopy(bucketLimit_);
        bitField0_ |= 0x00000020;
      }
    }
    /**
     * <pre>
     * Parallel arrays encoding the bucket boundaries and the bucket values.
     * bucket(i) is the count for the bucket i.  The range for
     * a bucket is:
     *   i == 0:  -DBL_MAX .. bucket_limit(0)
     *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
     * </pre>
     *
     * <code>repeated double bucket_limit = 6 [packed = true];</code>
     * @return A list containing the bucketLimit.
     */
    public java.util.List<java.lang.Double>
        getBucketLimitList() {
      return ((bitField0_ & 0x00000020) != 0) ?
               java.util.Collections.unmodifiableList(bucketLimit_) : bucketLimit_;
    }
    /**
     * <pre>
     * Parallel arrays encoding the bucket boundaries and the bucket values.
     * bucket(i) is the count for the bucket i.  The range for
     * a bucket is:
     *   i == 0:  -DBL_MAX .. bucket_limit(0)
     *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
     * </pre>
     *
     * <code>repeated double bucket_limit = 6 [packed = true];</code>
     * @return The count of bucketLimit.
     */
    public int getBucketLimitCount() {
      return bucketLimit_.size();
    }
    /**
     * <pre>
     * Parallel arrays encoding the bucket boundaries and the bucket values.
     * bucket(i) is the count for the bucket i.  The range for
     * a bucket is:
     *   i == 0:  -DBL_MAX .. bucket_limit(0)
     *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
     * </pre>
     *
     * <code>repeated double bucket_limit = 6 [packed = true];</code>
     * @param index The index of the element to return.
     * @return The bucketLimit at the given index.
     */
    public double getBucketLimit(int index) {
      return bucketLimit_.getDouble(index);
    }
    /**
     * <pre>
     * Parallel arrays encoding the bucket boundaries and the bucket values.
     * bucket(i) is the count for the bucket i.  The range for
     * a bucket is:
     *   i == 0:  -DBL_MAX .. bucket_limit(0)
     *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
     * </pre>
     *
     * <code>repeated double bucket_limit = 6 [packed = true];</code>
     * @param index The index to set the value at.
     * @param value The bucketLimit to set.
     * @return This builder for chaining.
     */
    public Builder setBucketLimit(
        int index, double value) {
      
      ensureBucketLimitIsMutable();
      bucketLimit_.setDouble(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parallel arrays encoding the bucket boundaries and the bucket values.
     * bucket(i) is the count for the bucket i.  The range for
     * a bucket is:
     *   i == 0:  -DBL_MAX .. bucket_limit(0)
     *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
     * </pre>
     *
     * <code>repeated double bucket_limit = 6 [packed = true];</code>
     * @param value The bucketLimit to add.
     * @return This builder for chaining.
     */
    public Builder addBucketLimit(double value) {
      
      ensureBucketLimitIsMutable();
      bucketLimit_.addDouble(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parallel arrays encoding the bucket boundaries and the bucket values.
     * bucket(i) is the count for the bucket i.  The range for
     * a bucket is:
     *   i == 0:  -DBL_MAX .. bucket_limit(0)
     *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
     * </pre>
     *
     * <code>repeated double bucket_limit = 6 [packed = true];</code>
     * @param values The bucketLimit to add.
     * @return This builder for chaining.
     */
    public Builder addAllBucketLimit(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensureBucketLimitIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, bucketLimit_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parallel arrays encoding the bucket boundaries and the bucket values.
     * bucket(i) is the count for the bucket i.  The range for
     * a bucket is:
     *   i == 0:  -DBL_MAX .. bucket_limit(0)
     *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
     * </pre>
     *
     * <code>repeated double bucket_limit = 6 [packed = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearBucketLimit() {
      bucketLimit_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.DoubleList bucket_ = emptyDoubleList();
    private void ensureBucketIsMutable() {
      if (!((bitField0_ & 0x00000040) != 0)) {
        bucket_ = mutableCopy(bucket_);
        bitField0_ |= 0x00000040;
      }
    }
    /**
     * <code>repeated double bucket = 7 [packed = true];</code>
     * @return A list containing the bucket.
     */
    public java.util.List<java.lang.Double>
        getBucketList() {
      return ((bitField0_ & 0x00000040) != 0) ?
               java.util.Collections.unmodifiableList(bucket_) : bucket_;
    }
    /**
     * <code>repeated double bucket = 7 [packed = true];</code>
     * @return The count of bucket.
     */
    public int getBucketCount() {
      return bucket_.size();
    }
    /**
     * <code>repeated double bucket = 7 [packed = true];</code>
     * @param index The index of the element to return.
     * @return The bucket at the given index.
     */
    public double getBucket(int index) {
      return bucket_.getDouble(index);
    }
    /**
     * <code>repeated double bucket = 7 [packed = true];</code>
     * @param index The index to set the value at.
     * @param value The bucket to set.
     * @return This builder for chaining.
     */
    public Builder setBucket(
        int index, double value) {
      
      ensureBucketIsMutable();
      bucket_.setDouble(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double bucket = 7 [packed = true];</code>
     * @param value The bucket to add.
     * @return This builder for chaining.
     */
    public Builder addBucket(double value) {
      
      ensureBucketIsMutable();
      bucket_.addDouble(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double bucket = 7 [packed = true];</code>
     * @param values The bucket to add.
     * @return This builder for chaining.
     */
    public Builder addAllBucket(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensureBucketIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, bucket_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double bucket = 7 [packed = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearBucket() {
      bucket_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000040);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.HistogramProto)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.HistogramProto)
  private static final org.tensorflow.framework.HistogramProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.HistogramProto();
  }

  public static org.tensorflow.framework.HistogramProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HistogramProto>
      PARSER = new com.google.protobuf.AbstractParser<HistogramProto>() {
    @java.lang.Override
    public HistogramProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<HistogramProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HistogramProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.HistogramProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

