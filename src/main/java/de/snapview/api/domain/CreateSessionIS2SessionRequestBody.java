/*
 * Snapview6 API
 * Official API available to Snapview customers
 *
 * OpenAPI spec version: v1
 * Contact: support@snapview.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.snapview.api.domain;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Container class for model binding of method CreateSessionESignatureSession
 */
@ApiModel(description = "Container class for model binding of method CreateSessionESignatureSession")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T09:48:31.039+02:00")
public class CreateSessionIS2SessionRequestBody {
  @SerializedName("secureToken")
  private String secureToken = null;

  @SerializedName("demoSystem")
  private Boolean demoSystem = null;

  @SerializedName("sessionDisplayName")
  private String sessionDisplayName = null;

  public CreateSessionIS2SessionRequestBody secureToken(String secureToken) {
    this.secureToken = secureToken;
    return this;
  }

   /**
   * Session&#39;s secure token used to authorise the request
   * @return secureToken
  **/
  @ApiModelProperty(required = true, value = "Session's secure token used to authorise the request")
  public String getSecureToken() {
    return secureToken;
  }

  public void setSecureToken(String secureToken) {
    this.secureToken = secureToken;
  }

  public CreateSessionIS2SessionRequestBody demoSystem(Boolean demoSystem) {
    this.demoSystem = demoSystem;
    return this;
  }

   /**
   * indicates whether production or demonstration eSignature system should be queried
   * @return demoSystem
  **/
  @ApiModelProperty(required = true, value = "indicates whether production or demonstration eSignature system should be queried")
  public Boolean isDemoSystem() {
    return demoSystem;
  }

  public void setDemoSystem(Boolean demoSystem) {
    this.demoSystem = demoSystem;
  }

  public CreateSessionIS2SessionRequestBody sessionDisplayName(String sessionDisplayName) {
    this.sessionDisplayName = sessionDisplayName;
    return this;
  }

   /**
   * IS2 system&#39;s session displayname.  New session needs a non empty topic
   * @return sessionDisplayName
  **/
  @ApiModelProperty(required = true, value = "IS2 system's session displayname.  New session needs a non empty topic")
  public String getSessionDisplayName() {
    return sessionDisplayName;
  }

  public void setSessionDisplayName(String sessionDisplayName) {
    this.sessionDisplayName = sessionDisplayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSessionIS2SessionRequestBody createSessionIS2SessionRequestBody = (CreateSessionIS2SessionRequestBody) o;
    return Objects.equals(this.secureToken, createSessionIS2SessionRequestBody.secureToken) &&
        Objects.equals(this.demoSystem, createSessionIS2SessionRequestBody.demoSystem) &&
        Objects.equals(this.sessionDisplayName, createSessionIS2SessionRequestBody.sessionDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secureToken, demoSystem, sessionDisplayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSessionIS2SessionRequestBody {\n");

    sb.append("    secureToken: ").append(toIndentedString(secureToken)).append("\n");
    sb.append("    demoSystem: ").append(toIndentedString(demoSystem)).append("\n");
    sb.append("    sessionDisplayName: ").append(toIndentedString(sessionDisplayName)).append("\n");
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

