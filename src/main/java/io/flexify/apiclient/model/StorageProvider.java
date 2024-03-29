/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.14.2
 * Contact: info@flexify.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.flexify.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Storage Provider
 */
@ApiModel(description = "Storage Provider")

public class StorageProvider {
  @JsonProperty("allowOverwriteEndpoint")
  private Boolean allowOverwriteEndpoint = null;

  @JsonProperty("bucketDotEncode")
  private Boolean bucketDotEncode = null;

  @JsonProperty("canCreateBucketsWithUppercase")
  private Boolean canCreateBucketsWithUppercase = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("defaultRegion")
  private String defaultRegion = null;

  @JsonProperty("disabledAsDestination")
  private Boolean disabledAsDestination = null;

  @JsonProperty("endpoint")
  private String endpoint = null;

  @JsonProperty("endpointPattern")
  private String endpointPattern = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("maxUploadSize")
  private Long maxUploadSize = null;

  @JsonProperty("multiRegional")
  private Boolean multiRegional = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("portHttp")
  private Integer portHttp = null;

  @JsonProperty("portHttps")
  private Integer portHttps = null;

  @JsonProperty("privateEndpoint")
  private String privateEndpoint = null;

  @JsonProperty("privateEndpointPattern")
  private String privateEndpointPattern = null;

  @JsonProperty("productName")
  private String productName = null;

  /**
   * Storage protocol this provider uses
   */
  public enum ProtocolEnum {
    AZURE("AZURE"),
    
    B2("B2"),
    
    DROPBOX("DROPBOX"),
    
    DROPBOX_TEAM("DROPBOX_TEAM"),
    
    S3("S3");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProtocolEnum fromValue(String value) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("protocol")
  private ProtocolEnum protocol = null;

  /**
   * Gets or Sets supportedOAuthProviders
   */
  public enum SupportedOAuthProvidersEnum {
    DROPBOX("DROPBOX"),
    
    DROPBOX_TEAM("DROPBOX_TEAM"),
    
    MICROSOFT("MICROSOFT");

    private String value;

    SupportedOAuthProvidersEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SupportedOAuthProvidersEnum fromValue(String value) {
      for (SupportedOAuthProvidersEnum b : SupportedOAuthProvidersEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("supportedOAuthProviders")
  private List<SupportedOAuthProvidersEnum> supportedOAuthProviders = null;

  @JsonProperty("supportsCredential")
  private Boolean supportsCredential = null;

  @JsonProperty("supportsHttp")
  private Boolean supportsHttp = null;

  @JsonProperty("supportsHttps")
  private Boolean supportsHttps = null;

  @JsonProperty("supportsMultipartUpload")
  private Boolean supportsMultipartUpload = null;

  public StorageProvider allowOverwriteEndpoint(Boolean allowOverwriteEndpoint) {
    this.allowOverwriteEndpoint = allowOverwriteEndpoint;
    return this;
  }

   /**
   * If customEndpoint can be used to overwrite the default endpoint
   * @return allowOverwriteEndpoint
  **/
  @ApiModelProperty(value = "If customEndpoint can be used to overwrite the default endpoint")
  public Boolean isAllowOverwriteEndpoint() {
    return allowOverwriteEndpoint;
  }

  public void setAllowOverwriteEndpoint(Boolean allowOverwriteEndpoint) {
    this.allowOverwriteEndpoint = allowOverwriteEndpoint;
  }

  public StorageProvider bucketDotEncode(Boolean bucketDotEncode) {
    this.bucketDotEncode = bucketDotEncode;
    return this;
  }

   /**
   * Indicates that the provider does not support dots in bucket names and how dots should be encoded
   * @return bucketDotEncode
  **/
  @ApiModelProperty(example = "false", value = "Indicates that the provider does not support dots in bucket names and how dots should be encoded")
  public Boolean isBucketDotEncode() {
    return bucketDotEncode;
  }

  public void setBucketDotEncode(Boolean bucketDotEncode) {
    this.bucketDotEncode = bucketDotEncode;
  }

  public StorageProvider canCreateBucketsWithUppercase(Boolean canCreateBucketsWithUppercase) {
    this.canCreateBucketsWithUppercase = canCreateBucketsWithUppercase;
    return this;
  }

   /**
   * Indicates that this provider allow creating bucket with uppercase in names
   * @return canCreateBucketsWithUppercase
  **/
  @ApiModelProperty(example = "false", value = "Indicates that this provider allow creating bucket with uppercase in names")
  public Boolean isCanCreateBucketsWithUppercase() {
    return canCreateBucketsWithUppercase;
  }

  public void setCanCreateBucketsWithUppercase(Boolean canCreateBucketsWithUppercase) {
    this.canCreateBucketsWithUppercase = canCreateBucketsWithUppercase;
  }

  public StorageProvider code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code of this cloud provider
   * @return code
  **/
  @ApiModelProperty(value = "Code of this cloud provider")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public StorageProvider defaultRegion(String defaultRegion) {
    this.defaultRegion = defaultRegion;
    return this;
  }

   /**
   * Default region for this provider
   * @return defaultRegion
  **/
  @ApiModelProperty(example = "us-east-1", value = "Default region for this provider")
  public String getDefaultRegion() {
    return defaultRegion;
  }

  public void setDefaultRegion(String defaultRegion) {
    this.defaultRegion = defaultRegion;
  }

  public StorageProvider disabledAsDestination(Boolean disabledAsDestination) {
    this.disabledAsDestination = disabledAsDestination;
    return this;
  }

   /**
   * Storage is not allowed to be used as a default storage in endpoint or as a migration destination)
   * @return disabledAsDestination
  **/
  @ApiModelProperty(example = "false", value = "Storage is not allowed to be used as a default storage in endpoint or as a migration destination)")
  public Boolean isDisabledAsDestination() {
    return disabledAsDestination;
  }

  public void setDisabledAsDestination(Boolean disabledAsDestination) {
    this.disabledAsDestination = disabledAsDestination;
  }

  public StorageProvider endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Endpoint to access this provider or null for custom providers
   * @return endpoint
  **/
  @ApiModelProperty(example = "s3.amazonaws.com", value = "Endpoint to access this provider or null for custom providers")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public StorageProvider endpointPattern(String endpointPattern) {
    this.endpointPattern = endpointPattern;
    return this;
  }

   /**
   * Endpoint pattern to access specific region of this provider
   * @return endpointPattern
  **/
  @ApiModelProperty(example = "s3.{region}.amazonaws.com", value = "Endpoint pattern to access specific region of this provider")
  public String getEndpointPattern() {
    return endpointPattern;
  }

  public void setEndpointPattern(String endpointPattern) {
    this.endpointPattern = endpointPattern;
  }

  public StorageProvider id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the provider in the system
   * @return id
  **/
  @ApiModelProperty(value = "Id of the provider in the system")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public StorageProvider maxUploadSize(Long maxUploadSize) {
    this.maxUploadSize = maxUploadSize;
    return this;
  }

   /**
   * Maximum size of a single upload w/o multipart
   * @return maxUploadSize
  **/
  @ApiModelProperty(example = "500000000", value = "Maximum size of a single upload w/o multipart")
  public Long getMaxUploadSize() {
    return maxUploadSize;
  }

  public void setMaxUploadSize(Long maxUploadSize) {
    this.maxUploadSize = maxUploadSize;
  }

  public StorageProvider multiRegional(Boolean multiRegional) {
    this.multiRegional = multiRegional;
    return this;
  }

   /**
   * This cloud provider supports multiple regions
   * @return multiRegional
  **/
  @ApiModelProperty(example = "true", value = "This cloud provider supports multiple regions")
  public Boolean isMultiRegional() {
    return multiRegional;
  }

  public void setMultiRegional(Boolean multiRegional) {
    this.multiRegional = multiRegional;
  }

  public StorageProvider name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the provider
   * @return name
  **/
  @ApiModelProperty(example = "Amazon S3", value = "Name of the provider")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StorageProvider portHttp(Integer portHttp) {
    this.portHttp = portHttp;
    return this;
  }

   /**
   * Port for HTTP request (null for default 80)
   * @return portHttp
  **/
  @ApiModelProperty(value = "Port for HTTP request (null for default 80)")
  public Integer getPortHttp() {
    return portHttp;
  }

  public void setPortHttp(Integer portHttp) {
    this.portHttp = portHttp;
  }

  public StorageProvider portHttps(Integer portHttps) {
    this.portHttps = portHttps;
    return this;
  }

   /**
   * Port for HTTPS request (null for default 443)
   * @return portHttps
  **/
  @ApiModelProperty(value = "Port for HTTPS request (null for default 443)")
  public Integer getPortHttps() {
    return portHttps;
  }

  public void setPortHttps(Integer portHttps) {
    this.portHttps = portHttps;
  }

  public StorageProvider privateEndpoint(String privateEndpoint) {
    this.privateEndpoint = privateEndpoint;
    return this;
  }

   /**
   * Endpoint used by engines (or null if only public endpoint is used)
   * @return privateEndpoint
  **/
  @ApiModelProperty(example = "s3.private.amazonaws.com", value = "Endpoint used by engines (or null if only public endpoint is used)")
  public String getPrivateEndpoint() {
    return privateEndpoint;
  }

  public void setPrivateEndpoint(String privateEndpoint) {
    this.privateEndpoint = privateEndpoint;
  }

  public StorageProvider privateEndpointPattern(String privateEndpointPattern) {
    this.privateEndpointPattern = privateEndpointPattern;
    return this;
  }

   /**
   * Endpoint pattern used by engines for specific region
   * @return privateEndpointPattern
  **/
  @ApiModelProperty(example = "s3.{region}.private.amazonaws.com", value = "Endpoint pattern used by engines for specific region")
  public String getPrivateEndpointPattern() {
    return privateEndpointPattern;
  }

  public void setPrivateEndpointPattern(String privateEndpointPattern) {
    this.privateEndpointPattern = privateEndpointPattern;
  }

  public StorageProvider productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Name of product/region for this provider
   * @return productName
  **/
  @ApiModelProperty(example = "Blob Storage", value = "Name of product/region for this provider")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public StorageProvider protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Storage protocol this provider uses
   * @return protocol
  **/
  @ApiModelProperty(example = "S3", value = "Storage protocol this provider uses")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public StorageProvider supportedOAuthProviders(List<SupportedOAuthProvidersEnum> supportedOAuthProviders) {
    this.supportedOAuthProviders = supportedOAuthProviders;
    return this;
  }

  public StorageProvider addSupportedOAuthProvidersItem(SupportedOAuthProvidersEnum supportedOAuthProvidersItem) {
    if (this.supportedOAuthProviders == null) {
      this.supportedOAuthProviders = new ArrayList<SupportedOAuthProvidersEnum>();
    }
    this.supportedOAuthProviders.add(supportedOAuthProvidersItem);
    return this;
  }

   /**
   * The list of OAuth providers that can be used with this storage provider (instead of storage keys)
   * @return supportedOAuthProviders
  **/
  @ApiModelProperty(value = "The list of OAuth providers that can be used with this storage provider (instead of storage keys)")
  public List<SupportedOAuthProvidersEnum> getSupportedOAuthProviders() {
    return supportedOAuthProviders;
  }

  public void setSupportedOAuthProviders(List<SupportedOAuthProvidersEnum> supportedOAuthProviders) {
    this.supportedOAuthProviders = supportedOAuthProviders;
  }

  public StorageProvider supportsCredential(Boolean supportsCredential) {
    this.supportsCredential = supportsCredential;
    return this;
  }

   /**
   * If the provider supports auth with credential (storage keys)
   * @return supportsCredential
  **/
  @ApiModelProperty(example = "false", value = "If the provider supports auth with credential (storage keys)")
  public Boolean isSupportsCredential() {
    return supportsCredential;
  }

  public void setSupportsCredential(Boolean supportsCredential) {
    this.supportsCredential = supportsCredential;
  }

  public StorageProvider supportsHttp(Boolean supportsHttp) {
    this.supportsHttp = supportsHttp;
    return this;
  }

   /**
   * Indicates that HTTP is supported
   * @return supportsHttp
  **/
  @ApiModelProperty(example = "true", value = "Indicates that HTTP is supported")
  public Boolean isSupportsHttp() {
    return supportsHttp;
  }

  public void setSupportsHttp(Boolean supportsHttp) {
    this.supportsHttp = supportsHttp;
  }

  public StorageProvider supportsHttps(Boolean supportsHttps) {
    this.supportsHttps = supportsHttps;
    return this;
  }

   /**
   * Indicates that HTTPS (SSL) is supported
   * @return supportsHttps
  **/
  @ApiModelProperty(example = "true", value = "Indicates that HTTPS (SSL) is supported")
  public Boolean isSupportsHttps() {
    return supportsHttps;
  }

  public void setSupportsHttps(Boolean supportsHttps) {
    this.supportsHttps = supportsHttps;
  }

  public StorageProvider supportsMultipartUpload(Boolean supportsMultipartUpload) {
    this.supportsMultipartUpload = supportsMultipartUpload;
    return this;
  }

   /**
   * Indicates that the provider supports multipart upload
   * @return supportsMultipartUpload
  **/
  @ApiModelProperty(example = "true", value = "Indicates that the provider supports multipart upload")
  public Boolean isSupportsMultipartUpload() {
    return supportsMultipartUpload;
  }

  public void setSupportsMultipartUpload(Boolean supportsMultipartUpload) {
    this.supportsMultipartUpload = supportsMultipartUpload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageProvider storageProvider = (StorageProvider) o;
    return Objects.equals(this.allowOverwriteEndpoint, storageProvider.allowOverwriteEndpoint) &&
        Objects.equals(this.bucketDotEncode, storageProvider.bucketDotEncode) &&
        Objects.equals(this.canCreateBucketsWithUppercase, storageProvider.canCreateBucketsWithUppercase) &&
        Objects.equals(this.code, storageProvider.code) &&
        Objects.equals(this.defaultRegion, storageProvider.defaultRegion) &&
        Objects.equals(this.disabledAsDestination, storageProvider.disabledAsDestination) &&
        Objects.equals(this.endpoint, storageProvider.endpoint) &&
        Objects.equals(this.endpointPattern, storageProvider.endpointPattern) &&
        Objects.equals(this.id, storageProvider.id) &&
        Objects.equals(this.maxUploadSize, storageProvider.maxUploadSize) &&
        Objects.equals(this.multiRegional, storageProvider.multiRegional) &&
        Objects.equals(this.name, storageProvider.name) &&
        Objects.equals(this.portHttp, storageProvider.portHttp) &&
        Objects.equals(this.portHttps, storageProvider.portHttps) &&
        Objects.equals(this.privateEndpoint, storageProvider.privateEndpoint) &&
        Objects.equals(this.privateEndpointPattern, storageProvider.privateEndpointPattern) &&
        Objects.equals(this.productName, storageProvider.productName) &&
        Objects.equals(this.protocol, storageProvider.protocol) &&
        Objects.equals(this.supportedOAuthProviders, storageProvider.supportedOAuthProviders) &&
        Objects.equals(this.supportsCredential, storageProvider.supportsCredential) &&
        Objects.equals(this.supportsHttp, storageProvider.supportsHttp) &&
        Objects.equals(this.supportsHttps, storageProvider.supportsHttps) &&
        Objects.equals(this.supportsMultipartUpload, storageProvider.supportsMultipartUpload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowOverwriteEndpoint, bucketDotEncode, canCreateBucketsWithUppercase, code, defaultRegion, disabledAsDestination, endpoint, endpointPattern, id, maxUploadSize, multiRegional, name, portHttp, portHttps, privateEndpoint, privateEndpointPattern, productName, protocol, supportedOAuthProviders, supportsCredential, supportsHttp, supportsHttps, supportsMultipartUpload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageProvider {\n");
    
    sb.append("    allowOverwriteEndpoint: ").append(toIndentedString(allowOverwriteEndpoint)).append("\n");
    sb.append("    bucketDotEncode: ").append(toIndentedString(bucketDotEncode)).append("\n");
    sb.append("    canCreateBucketsWithUppercase: ").append(toIndentedString(canCreateBucketsWithUppercase)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    defaultRegion: ").append(toIndentedString(defaultRegion)).append("\n");
    sb.append("    disabledAsDestination: ").append(toIndentedString(disabledAsDestination)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    endpointPattern: ").append(toIndentedString(endpointPattern)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxUploadSize: ").append(toIndentedString(maxUploadSize)).append("\n");
    sb.append("    multiRegional: ").append(toIndentedString(multiRegional)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    portHttp: ").append(toIndentedString(portHttp)).append("\n");
    sb.append("    portHttps: ").append(toIndentedString(portHttps)).append("\n");
    sb.append("    privateEndpoint: ").append(toIndentedString(privateEndpoint)).append("\n");
    sb.append("    privateEndpointPattern: ").append(toIndentedString(privateEndpointPattern)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    supportedOAuthProviders: ").append(toIndentedString(supportedOAuthProviders)).append("\n");
    sb.append("    supportsCredential: ").append(toIndentedString(supportsCredential)).append("\n");
    sb.append("    supportsHttp: ").append(toIndentedString(supportsHttp)).append("\n");
    sb.append("    supportsHttps: ").append(toIndentedString(supportsHttps)).append("\n");
    sb.append("    supportsMultipartUpload: ").append(toIndentedString(supportsMultipartUpload)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

