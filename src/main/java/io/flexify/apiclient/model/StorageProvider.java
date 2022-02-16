/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.9-SNAPSHOT
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
  @JsonProperty("canCreateBucketsWithUppercase")
  private Boolean canCreateBucketsWithUppercase = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("defaultRegion")
  private String defaultRegion = null;

  @JsonProperty("disabledAsDestination")
  private Boolean disabledAsDestination = null;

  @JsonProperty("dotEncode")
  private String dotEncode = null;

  @JsonProperty("endpoint")
  private String endpoint = null;

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
    public static ProtocolEnum fromValue(String text) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("protocol")
  private ProtocolEnum protocol = null;

  @JsonProperty("regions")
  private List<String> regions = null;

  @JsonProperty("supportsHttp")
  private Boolean supportsHttp = null;

  @JsonProperty("supportsHttps")
  private Boolean supportsHttps = null;

  @JsonProperty("supportsMultipartUpload")
  private Boolean supportsMultipartUpload = null;

  @JsonProperty("supportsOAuth")
  private Boolean supportsOAuth = null;

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

  public StorageProvider dotEncode(String dotEncode) {
    this.dotEncode = dotEncode;
    return this;
  }

   /**
   * Indicates that the provider does not support dots in bucket names and how dots should be encoded
   * @return dotEncode
  **/
  @ApiModelProperty(value = "Indicates that the provider does not support dots in bucket names and how dots should be encoded")
  public String getDotEncode() {
    return dotEncode;
  }

  public void setDotEncode(String dotEncode) {
    this.dotEncode = dotEncode;
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

  public StorageProvider regions(List<String> regions) {
    this.regions = regions;
    return this;
  }

  public StorageProvider addRegionsItem(String regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<String>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * List of regions supported for this provider (or null if regions are not supported
   * @return regions
  **/
  @ApiModelProperty(value = "List of regions supported for this provider (or null if regions are not supported")
  public List<String> getRegions() {
    return regions;
  }

  public void setRegions(List<String> regions) {
    this.regions = regions;
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

  public StorageProvider supportsOAuth(Boolean supportsOAuth) {
    this.supportsOAuth = supportsOAuth;
    return this;
  }

   /**
   * If the provider supports OAuth (instead of storage keys)
   * @return supportsOAuth
  **/
  @ApiModelProperty(example = "false", value = "If the provider supports OAuth (instead of storage keys)")
  public Boolean isSupportsOAuth() {
    return supportsOAuth;
  }

  public void setSupportsOAuth(Boolean supportsOAuth) {
    this.supportsOAuth = supportsOAuth;
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
    return Objects.equals(this.canCreateBucketsWithUppercase, storageProvider.canCreateBucketsWithUppercase) &&
        Objects.equals(this.code, storageProvider.code) &&
        Objects.equals(this.defaultRegion, storageProvider.defaultRegion) &&
        Objects.equals(this.disabledAsDestination, storageProvider.disabledAsDestination) &&
        Objects.equals(this.dotEncode, storageProvider.dotEncode) &&
        Objects.equals(this.endpoint, storageProvider.endpoint) &&
        Objects.equals(this.id, storageProvider.id) &&
        Objects.equals(this.maxUploadSize, storageProvider.maxUploadSize) &&
        Objects.equals(this.multiRegional, storageProvider.multiRegional) &&
        Objects.equals(this.name, storageProvider.name) &&
        Objects.equals(this.portHttp, storageProvider.portHttp) &&
        Objects.equals(this.portHttps, storageProvider.portHttps) &&
        Objects.equals(this.privateEndpoint, storageProvider.privateEndpoint) &&
        Objects.equals(this.productName, storageProvider.productName) &&
        Objects.equals(this.protocol, storageProvider.protocol) &&
        Objects.equals(this.regions, storageProvider.regions) &&
        Objects.equals(this.supportsHttp, storageProvider.supportsHttp) &&
        Objects.equals(this.supportsHttps, storageProvider.supportsHttps) &&
        Objects.equals(this.supportsMultipartUpload, storageProvider.supportsMultipartUpload) &&
        Objects.equals(this.supportsOAuth, storageProvider.supportsOAuth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canCreateBucketsWithUppercase, code, defaultRegion, disabledAsDestination, dotEncode, endpoint, id, maxUploadSize, multiRegional, name, portHttp, portHttps, privateEndpoint, productName, protocol, regions, supportsHttp, supportsHttps, supportsMultipartUpload, supportsOAuth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageProvider {\n");
    
    sb.append("    canCreateBucketsWithUppercase: ").append(toIndentedString(canCreateBucketsWithUppercase)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    defaultRegion: ").append(toIndentedString(defaultRegion)).append("\n");
    sb.append("    disabledAsDestination: ").append(toIndentedString(disabledAsDestination)).append("\n");
    sb.append("    dotEncode: ").append(toIndentedString(dotEncode)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxUploadSize: ").append(toIndentedString(maxUploadSize)).append("\n");
    sb.append("    multiRegional: ").append(toIndentedString(multiRegional)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    portHttp: ").append(toIndentedString(portHttp)).append("\n");
    sb.append("    portHttps: ").append(toIndentedString(portHttps)).append("\n");
    sb.append("    privateEndpoint: ").append(toIndentedString(privateEndpoint)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    supportsHttp: ").append(toIndentedString(supportsHttp)).append("\n");
    sb.append("    supportsHttps: ").append(toIndentedString(supportsHttps)).append("\n");
    sb.append("    supportsMultipartUpload: ").append(toIndentedString(supportsMultipartUpload)).append("\n");
    sb.append("    supportsOAuth: ").append(toIndentedString(supportsOAuth)).append("\n");
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

