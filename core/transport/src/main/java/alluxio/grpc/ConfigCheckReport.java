// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/meta_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.meta.ConfigCheckReport}
 */
public  final class ConfigCheckReport extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.meta.ConfigCheckReport)
    ConfigCheckReportOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConfigCheckReport.newBuilder() to construct.
  private ConfigCheckReport(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConfigCheckReport() {
    status_ = 1;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConfigCheckReport(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              errors_ = com.google.protobuf.MapField.newMapField(
                  ErrorsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, alluxio.grpc.InconsistentProperties>
            errors__ = input.readMessage(
                ErrorsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            errors_.getMutableMap().put(
                errors__.getKey(), errors__.getValue());
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              warns_ = com.google.protobuf.MapField.newMapField(
                  WarnsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, alluxio.grpc.InconsistentProperties>
            warns__ = input.readMessage(
                WarnsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            warns_.getMutableMap().put(
                warns__.getKey(), warns__.getValue());
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            alluxio.grpc.ConfigStatus value = alluxio.grpc.ConfigStatus.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(3, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              status_ = rawValue;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.MetaMasterProto.internal_static_alluxio_grpc_meta_ConfigCheckReport_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetErrors();
      case 2:
        return internalGetWarns();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.MetaMasterProto.internal_static_alluxio_grpc_meta_ConfigCheckReport_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.ConfigCheckReport.class, alluxio.grpc.ConfigCheckReport.Builder.class);
  }

  private int bitField0_;
  public static final int ERRORS_FIELD_NUMBER = 1;
  private static final class ErrorsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, alluxio.grpc.InconsistentProperties> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, alluxio.grpc.InconsistentProperties>newDefaultInstance(
                alluxio.grpc.MetaMasterProto.internal_static_alluxio_grpc_meta_ConfigCheckReport_ErrorsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                alluxio.grpc.InconsistentProperties.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, alluxio.grpc.InconsistentProperties> errors_;
  private com.google.protobuf.MapField<java.lang.String, alluxio.grpc.InconsistentProperties>
  internalGetErrors() {
    if (errors_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ErrorsDefaultEntryHolder.defaultEntry);
    }
    return errors_;
  }

  public int getErrorsCount() {
    return internalGetErrors().getMap().size();
  }
  /**
   * <pre>
   * Scope name as key
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; errors = 1;</code>
   */

  public boolean containsErrors(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetErrors().getMap().containsKey(key);
  }
  /**
   * Use {@link #getErrorsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> getErrors() {
    return getErrorsMap();
  }
  /**
   * <pre>
   * Scope name as key
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; errors = 1;</code>
   */

  public java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> getErrorsMap() {
    return internalGetErrors().getMap();
  }
  /**
   * <pre>
   * Scope name as key
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; errors = 1;</code>
   */

  public alluxio.grpc.InconsistentProperties getErrorsOrDefault(
      java.lang.String key,
      alluxio.grpc.InconsistentProperties defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> map =
        internalGetErrors().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Scope name as key
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; errors = 1;</code>
   */

  public alluxio.grpc.InconsistentProperties getErrorsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> map =
        internalGetErrors().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int WARNS_FIELD_NUMBER = 2;
  private static final class WarnsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, alluxio.grpc.InconsistentProperties> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, alluxio.grpc.InconsistentProperties>newDefaultInstance(
                alluxio.grpc.MetaMasterProto.internal_static_alluxio_grpc_meta_ConfigCheckReport_WarnsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                alluxio.grpc.InconsistentProperties.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, alluxio.grpc.InconsistentProperties> warns_;
  private com.google.protobuf.MapField<java.lang.String, alluxio.grpc.InconsistentProperties>
  internalGetWarns() {
    if (warns_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          WarnsDefaultEntryHolder.defaultEntry);
    }
    return warns_;
  }

  public int getWarnsCount() {
    return internalGetWarns().getMap().size();
  }
  /**
   * <pre>
   * Scope name as key
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; warns = 2;</code>
   */

  public boolean containsWarns(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetWarns().getMap().containsKey(key);
  }
  /**
   * Use {@link #getWarnsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> getWarns() {
    return getWarnsMap();
  }
  /**
   * <pre>
   * Scope name as key
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; warns = 2;</code>
   */

  public java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> getWarnsMap() {
    return internalGetWarns().getMap();
  }
  /**
   * <pre>
   * Scope name as key
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; warns = 2;</code>
   */

  public alluxio.grpc.InconsistentProperties getWarnsOrDefault(
      java.lang.String key,
      alluxio.grpc.InconsistentProperties defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> map =
        internalGetWarns().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Scope name as key
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; warns = 2;</code>
   */

  public alluxio.grpc.InconsistentProperties getWarnsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> map =
        internalGetWarns().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>optional .alluxio.grpc.meta.ConfigStatus status = 3;</code>
   */
  public boolean hasStatus() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .alluxio.grpc.meta.ConfigStatus status = 3;</code>
   */
  public alluxio.grpc.ConfigStatus getStatus() {
    alluxio.grpc.ConfigStatus result = alluxio.grpc.ConfigStatus.valueOf(status_);
    return result == null ? alluxio.grpc.ConfigStatus.PASSED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetErrors(),
        ErrorsDefaultEntryHolder.defaultEntry,
        1);
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetWarns(),
        WarnsDefaultEntryHolder.defaultEntry,
        2);
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeEnum(3, status_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, alluxio.grpc.InconsistentProperties> entry
         : internalGetErrors().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, alluxio.grpc.InconsistentProperties>
      errors__ = ErrorsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, errors__);
    }
    for (java.util.Map.Entry<java.lang.String, alluxio.grpc.InconsistentProperties> entry
         : internalGetWarns().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, alluxio.grpc.InconsistentProperties>
      warns__ = WarnsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, warns__);
    }
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof alluxio.grpc.ConfigCheckReport)) {
      return super.equals(obj);
    }
    alluxio.grpc.ConfigCheckReport other = (alluxio.grpc.ConfigCheckReport) obj;

    boolean result = true;
    result = result && internalGetErrors().equals(
        other.internalGetErrors());
    result = result && internalGetWarns().equals(
        other.internalGetWarns());
    result = result && (hasStatus() == other.hasStatus());
    if (hasStatus()) {
      result = result && status_ == other.status_;
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetErrors().getMap().isEmpty()) {
      hash = (37 * hash) + ERRORS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetErrors().hashCode();
    }
    if (!internalGetWarns().getMap().isEmpty()) {
      hash = (37 * hash) + WARNS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetWarns().hashCode();
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + status_;
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.ConfigCheckReport parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.ConfigCheckReport parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.ConfigCheckReport parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.ConfigCheckReport parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.ConfigCheckReport parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.ConfigCheckReport parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.ConfigCheckReport parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.ConfigCheckReport parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.ConfigCheckReport parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.ConfigCheckReport parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.ConfigCheckReport parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.ConfigCheckReport parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.ConfigCheckReport prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code alluxio.grpc.meta.ConfigCheckReport}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.meta.ConfigCheckReport)
      alluxio.grpc.ConfigCheckReportOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.MetaMasterProto.internal_static_alluxio_grpc_meta_ConfigCheckReport_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetErrors();
        case 2:
          return internalGetWarns();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableErrors();
        case 2:
          return internalGetMutableWarns();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.MetaMasterProto.internal_static_alluxio_grpc_meta_ConfigCheckReport_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.ConfigCheckReport.class, alluxio.grpc.ConfigCheckReport.Builder.class);
    }

    // Construct using alluxio.grpc.ConfigCheckReport.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      internalGetMutableErrors().clear();
      internalGetMutableWarns().clear();
      status_ = 1;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.MetaMasterProto.internal_static_alluxio_grpc_meta_ConfigCheckReport_descriptor;
    }

    public alluxio.grpc.ConfigCheckReport getDefaultInstanceForType() {
      return alluxio.grpc.ConfigCheckReport.getDefaultInstance();
    }

    public alluxio.grpc.ConfigCheckReport build() {
      alluxio.grpc.ConfigCheckReport result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.ConfigCheckReport buildPartial() {
      alluxio.grpc.ConfigCheckReport result = new alluxio.grpc.ConfigCheckReport(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.errors_ = internalGetErrors();
      result.errors_.makeImmutable();
      result.warns_ = internalGetWarns();
      result.warns_.makeImmutable();
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000001;
      }
      result.status_ = status_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.ConfigCheckReport) {
        return mergeFrom((alluxio.grpc.ConfigCheckReport)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.ConfigCheckReport other) {
      if (other == alluxio.grpc.ConfigCheckReport.getDefaultInstance()) return this;
      internalGetMutableErrors().mergeFrom(
          other.internalGetErrors());
      internalGetMutableWarns().mergeFrom(
          other.internalGetWarns());
      if (other.hasStatus()) {
        setStatus(other.getStatus());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.ConfigCheckReport parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.ConfigCheckReport) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, alluxio.grpc.InconsistentProperties> errors_;
    private com.google.protobuf.MapField<java.lang.String, alluxio.grpc.InconsistentProperties>
    internalGetErrors() {
      if (errors_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ErrorsDefaultEntryHolder.defaultEntry);
      }
      return errors_;
    }
    private com.google.protobuf.MapField<java.lang.String, alluxio.grpc.InconsistentProperties>
    internalGetMutableErrors() {
      onChanged();;
      if (errors_ == null) {
        errors_ = com.google.protobuf.MapField.newMapField(
            ErrorsDefaultEntryHolder.defaultEntry);
      }
      if (!errors_.isMutable()) {
        errors_ = errors_.copy();
      }
      return errors_;
    }

    public int getErrorsCount() {
      return internalGetErrors().getMap().size();
    }
    /**
     * <pre>
     * Scope name as key
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; errors = 1;</code>
     */

    public boolean containsErrors(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetErrors().getMap().containsKey(key);
    }
    /**
     * Use {@link #getErrorsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> getErrors() {
      return getErrorsMap();
    }
    /**
     * <pre>
     * Scope name as key
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; errors = 1;</code>
     */

    public java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> getErrorsMap() {
      return internalGetErrors().getMap();
    }
    /**
     * <pre>
     * Scope name as key
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; errors = 1;</code>
     */

    public alluxio.grpc.InconsistentProperties getErrorsOrDefault(
        java.lang.String key,
        alluxio.grpc.InconsistentProperties defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> map =
          internalGetErrors().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Scope name as key
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; errors = 1;</code>
     */

    public alluxio.grpc.InconsistentProperties getErrorsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> map =
          internalGetErrors().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearErrors() {
      internalGetMutableErrors().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Scope name as key
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; errors = 1;</code>
     */

    public Builder removeErrors(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableErrors().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties>
    getMutableErrors() {
      return internalGetMutableErrors().getMutableMap();
    }
    /**
     * <pre>
     * Scope name as key
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; errors = 1;</code>
     */
    public Builder putErrors(
        java.lang.String key,
        alluxio.grpc.InconsistentProperties value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableErrors().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Scope name as key
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; errors = 1;</code>
     */

    public Builder putAllErrors(
        java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> values) {
      internalGetMutableErrors().getMutableMap()
          .putAll(values);
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, alluxio.grpc.InconsistentProperties> warns_;
    private com.google.protobuf.MapField<java.lang.String, alluxio.grpc.InconsistentProperties>
    internalGetWarns() {
      if (warns_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            WarnsDefaultEntryHolder.defaultEntry);
      }
      return warns_;
    }
    private com.google.protobuf.MapField<java.lang.String, alluxio.grpc.InconsistentProperties>
    internalGetMutableWarns() {
      onChanged();;
      if (warns_ == null) {
        warns_ = com.google.protobuf.MapField.newMapField(
            WarnsDefaultEntryHolder.defaultEntry);
      }
      if (!warns_.isMutable()) {
        warns_ = warns_.copy();
      }
      return warns_;
    }

    public int getWarnsCount() {
      return internalGetWarns().getMap().size();
    }
    /**
     * <pre>
     * Scope name as key
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; warns = 2;</code>
     */

    public boolean containsWarns(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetWarns().getMap().containsKey(key);
    }
    /**
     * Use {@link #getWarnsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> getWarns() {
      return getWarnsMap();
    }
    /**
     * <pre>
     * Scope name as key
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; warns = 2;</code>
     */

    public java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> getWarnsMap() {
      return internalGetWarns().getMap();
    }
    /**
     * <pre>
     * Scope name as key
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; warns = 2;</code>
     */

    public alluxio.grpc.InconsistentProperties getWarnsOrDefault(
        java.lang.String key,
        alluxio.grpc.InconsistentProperties defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> map =
          internalGetWarns().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Scope name as key
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; warns = 2;</code>
     */

    public alluxio.grpc.InconsistentProperties getWarnsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> map =
          internalGetWarns().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearWarns() {
      internalGetMutableWarns().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Scope name as key
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; warns = 2;</code>
     */

    public Builder removeWarns(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableWarns().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties>
    getMutableWarns() {
      return internalGetMutableWarns().getMutableMap();
    }
    /**
     * <pre>
     * Scope name as key
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; warns = 2;</code>
     */
    public Builder putWarns(
        java.lang.String key,
        alluxio.grpc.InconsistentProperties value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableWarns().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Scope name as key
     * </pre>
     *
     * <code>map&lt;string, .alluxio.grpc.meta.InconsistentProperties&gt; warns = 2;</code>
     */

    public Builder putAllWarns(
        java.util.Map<java.lang.String, alluxio.grpc.InconsistentProperties> values) {
      internalGetMutableWarns().getMutableMap()
          .putAll(values);
      return this;
    }

    private int status_ = 1;
    /**
     * <code>optional .alluxio.grpc.meta.ConfigStatus status = 3;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .alluxio.grpc.meta.ConfigStatus status = 3;</code>
     */
    public alluxio.grpc.ConfigStatus getStatus() {
      alluxio.grpc.ConfigStatus result = alluxio.grpc.ConfigStatus.valueOf(status_);
      return result == null ? alluxio.grpc.ConfigStatus.PASSED : result;
    }
    /**
     * <code>optional .alluxio.grpc.meta.ConfigStatus status = 3;</code>
     */
    public Builder setStatus(alluxio.grpc.ConfigStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.meta.ConfigStatus status = 3;</code>
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      status_ = 1;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.meta.ConfigCheckReport)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.meta.ConfigCheckReport)
  private static final alluxio.grpc.ConfigCheckReport DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.ConfigCheckReport();
  }

  public static alluxio.grpc.ConfigCheckReport getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ConfigCheckReport>
      PARSER = new com.google.protobuf.AbstractParser<ConfigCheckReport>() {
    public ConfigCheckReport parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConfigCheckReport(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConfigCheckReport> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfigCheckReport> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.ConfigCheckReport getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

