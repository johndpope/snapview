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
 * Container class for model binding of method RenewSessionESignatureSession
 */
@ApiModel(description = "Container class for model binding of method RenewSessionESignatureSession")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T09:48:31.039+02:00")
public class RenewSessionIS2SessionRequestBody {
  @SerializedName("secureToken")
  private String secureToken = null;

  @SerializedName("demoSystem")
  private Boolean demoSystem = null;

  @SerializedName("eSignatureSession")
  private String eSignatureSession = null;

  @SerializedName("sessionDisplayName")
  private String sessionDisplayName = null;

  public RenewSessionIS2SessionRequestBody secureToken(String secureToken) {
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

  public RenewSessionIS2SessionRequestBody demoSystem(Boolean demoSystem) {
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

  public RenewSessionIS2SessionRequestBody eSignatureSession(String eSignatureSession) {
    this.eSignatureSession = eSignatureSession;
    return this;
  }

   /**
   * sessionid of the to be renewed eSignature system&#39;s session
   * @return eSignatureSession
  **/
  @ApiModelProperty(required = true, value = "sessionid of the to be renewed eSignature system's session")
  public String getESignatureSession() {
    return eSignatureSession;
  }

  public void setESignatureSession(String eSignatureSession) {
    this.eSignatureSession = eSignatureSession;
  }

  public RenewSessionIS2SessionRequestBody sessionDisplayName(String sessionDisplayName) {
    this.sessionDisplayName = sessionDisplayName;
    return this;
  }

   /**
   * IS2 system&#39;s session displayname for the the session clone instance.                Currently this field cannot be left out, due to issues with  external system&#39;s API method. The idea was to allow the takeover  of the title for the origin IS2 session, by not passing a value in  this field.  As soon as the issue is clarified, the field could be made optional.
   * @return sessionDisplayName
  **/
  @ApiModelProperty(required = true, value = "IS2 system's session displayname for the the session clone instance.                Currently this field cannot be left out, due to issues with  external system's API method. The idea was to allow the takeover  of the title for the origin IS2 session, by not passing a value in  this field.  As soon as the issue is clarified, the field could be made optional.")
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
    RenewSessionIS2SessionRequestBody renewSessionIS2SessionRequestBody = (RenewSessionIS2SessionRequestBody) o;
    return Objects.equals(this.secureToken, renewSessionIS2SessionRequestBody.secureToken) &&
        Objects.equals(this.demoSystem, renewSessionIS2SessionRequestBody.demoSystem) &&
        Objects.equals(this.eSignatureSession, renewSessionIS2SessionRequestBody.eSignatureSession) &&
        Objects.equals(this.sessionDisplayName, renewSessionIS2SessionRequestBody.sessionDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secureToken, demoSystem, eSignatureSession, sessionDisplayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewSessionIS2SessionRequestBody {\n");

    sb.append("    secureToken: ").append(toIndentedString(secureToken)).append("\n");
    sb.append("    demoSystem: ").append(toIndentedString(demoSystem)).append("\n");
    sb.append("    eSignatureSession: ").append(toIndentedString(eSignatureSession)).append("\n");
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

