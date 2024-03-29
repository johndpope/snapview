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
 * Container class for model binding of methods CreateUser and EditUser
 */
@ApiModel(description = "Container class for model binding of methods CreateUser and EditUser")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T09:48:31.039+02:00")
public class UserRequestBody {
  @SerializedName("authentication")
  private Authentication authentication = null;

  @SerializedName("user")
  private User user = null;

  public UserRequestBody authentication(Authentication authentication) {
    this.authentication = authentication;
    return this;
  }

   /**
   * Authentication information
   * @return authentication
  **/
  @ApiModelProperty(required = true, value = "Authentication information")
  public Authentication getAuthentication() {
    return authentication;
  }

  public void setAuthentication(Authentication authentication) {
    this.authentication = authentication;
  }

  public UserRequestBody user(User user) {
    this.user = user;
    return this;
  }

   /**
   * User information
   * @return user
  **/
  @ApiModelProperty(required = true, value = "User information")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRequestBody userRequestBody = (UserRequestBody) o;
    return Objects.equals(this.authentication, userRequestBody.authentication) &&
        Objects.equals(this.user, userRequestBody.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRequestBody {\n");

    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

