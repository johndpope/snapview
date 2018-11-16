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
 * User model class
 */
@ApiModel(description = "User model class")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T09:48:31.039+02:00")
public class User {
  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("imageAsBase64String")
  private String imageAsBase64String = null;

  @SerializedName("annotationToolEnabled")
  private Boolean annotationToolEnabled = null;

  @SerializedName("annotationToolOptions")
  private String annotationToolOptions = null;

  @SerializedName("apiOnly")
  private Boolean apiOnly = null;

  @SerializedName("automaticRecordingSessionStart")
  private Boolean automaticRecordingSessionStart = null;

  @SerializedName("communicationChannels")
  private CommunicationChannels communicationChannels = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("screenSharingAdminsBlacklist")
  private String screenSharingAdminsBlacklist = null;

  @SerializedName("screenSharingAdminsWhitelist")
  private String screenSharingAdminsWhitelist = null;

  @SerializedName("screenSharingUsersBlacklist")
  private String screenSharingUsersBlacklist = null;

  @SerializedName("screenSharingUsersWhitelist")
  private String screenSharingUsersWhitelist = null;

  @SerializedName("invitationTemplate")
  private String invitationTemplate = null;

  @SerializedName("accountJoinsessionUrl")
  private String accountJoinsessionUrl = null;

  @SerializedName("viewerPointerEnabled")
  private Boolean viewerPointerEnabled = null;

  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Unique Identifier for the user
   * @return username
  **/
  @ApiModelProperty(required = true, value = "Unique Identifier for the user")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password should be at least 8 characters long. If ApiOnly is set to true, then the password will be ignored and not checked against constraints.
   * @return password
  **/
  @ApiModelProperty(value = "Password should be at least 8 characters long. If ApiOnly is set to true, then the password will be ignored and not checked against constraints.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Firstname of the user
   * @return firstName
  **/
  @ApiModelProperty(value = "Firstname of the user")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Lastname of the user
   * @return lastName
  **/
  @ApiModelProperty(value = "Lastname of the user")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the user
   * @return email
  **/
  @ApiModelProperty(value = "Email of the user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone of the user
   * @return phone
  **/
  @ApiModelProperty(value = "Phone of the user")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

   /**
   * Image of the user, as base64 string
   * @return imageAsBase64String
  **/
  @ApiModelProperty(value = "Image of the user, as base64 string")
  public String getImageAsBase64String() {
    return imageAsBase64String;
  }

  public User annotationToolEnabled(Boolean annotationToolEnabled) {
    this.annotationToolEnabled = annotationToolEnabled;
    return this;
  }

   /**
   * Annotation Tool can be used for this user
   * @return annotationToolEnabled
  **/
  @ApiModelProperty(value = "Annotation Tool can be used for this user")
  public Boolean isAnnotationToolEnabled() {
    return annotationToolEnabled;
  }

  public void setAnnotationToolEnabled(Boolean annotationToolEnabled) {
    this.annotationToolEnabled = annotationToolEnabled;
  }

  public User annotationToolOptions(String annotationToolOptions) {
    this.annotationToolOptions = annotationToolOptions;
    return this;
  }

   /**
   * Annotation Tool custom color and fade effect              ex.: (color #abcdefff) (fade 100)                where #abcdefff stands for hex value of RGBA color                and 100 after fade stands for
   * @return annotationToolOptions
  **/
  @ApiModelProperty(value = "Annotation Tool custom color and fade effect              ex.: (color #abcdefff) (fade 100)                where #abcdefff stands for hex value of RGBA color                and 100 after fade stands for")
  public String getAnnotationToolOptions() {
    return annotationToolOptions;
  }

  public void setAnnotationToolOptions(String annotationToolOptions) {
    this.annotationToolOptions = annotationToolOptions;
  }

  public User apiOnly(Boolean apiOnly) {
    this.apiOnly = apiOnly;
    return this;
  }

   /**
   * Is this user setup for API usage only?
   * @return apiOnly
  **/
  @ApiModelProperty(required = true, value = "Is this user setup for API usage only?")
  public Boolean isApiOnly() {
    return apiOnly;
  }

  public void setApiOnly(Boolean apiOnly) {
    this.apiOnly = apiOnly;
  }

  public User automaticRecordingSessionStart(Boolean automaticRecordingSessionStart) {
    this.automaticRecordingSessionStart = automaticRecordingSessionStart;
    return this;
  }

   /**
   * Session is recorded automatically at start
   * @return automaticRecordingSessionStart
  **/
  @ApiModelProperty(value = "Session is recorded automatically at start")
  public Boolean isAutomaticRecordingSessionStart() {
    return automaticRecordingSessionStart;
  }

  public void setAutomaticRecordingSessionStart(Boolean automaticRecordingSessionStart) {
    this.automaticRecordingSessionStart = automaticRecordingSessionStart;
  }

  public User communicationChannels(CommunicationChannels communicationChannels) {
    this.communicationChannels = communicationChannels;
    return this;
  }

   /**
   * The communication channels of this user
   * @return communicationChannels
  **/
  @ApiModelProperty(required = true, value = "The communication channels of this user")
  public CommunicationChannels getCommunicationChannels() {
    return communicationChannels;
  }

  public void setCommunicationChannels(CommunicationChannels communicationChannels) {
    this.communicationChannels = communicationChannels;
  }

  public User enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * The user is active
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "The user is active")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public User screenSharingAdminsBlacklist(String screenSharingAdminsBlacklist) {
    this.screenSharingAdminsBlacklist = screenSharingAdminsBlacklist;
    return this;
  }

   /**
   * \&quot;Masked Expression\&quot; blacklist of application titles for screen sharing filtering set by admins.
   * @return screenSharingAdminsBlacklist
  **/
  @ApiModelProperty(value = "\"Masked Expression\" blacklist of application titles for screen sharing filtering set by admins.")
  public String getScreenSharingAdminsBlacklist() {
    return screenSharingAdminsBlacklist;
  }

  public void setScreenSharingAdminsBlacklist(String screenSharingAdminsBlacklist) {
    this.screenSharingAdminsBlacklist = screenSharingAdminsBlacklist;
  }

  public User screenSharingAdminsWhitelist(String screenSharingAdminsWhitelist) {
    this.screenSharingAdminsWhitelist = screenSharingAdminsWhitelist;
    return this;
  }

   /**
   * \&quot;Masked Expression\&quot; whitelist of application titles for screen sharing filtering set by admins.
   * @return screenSharingAdminsWhitelist
  **/
  @ApiModelProperty(value = "\"Masked Expression\" whitelist of application titles for screen sharing filtering set by admins.")
  public String getScreenSharingAdminsWhitelist() {
    return screenSharingAdminsWhitelist;
  }

  public void setScreenSharingAdminsWhitelist(String screenSharingAdminsWhitelist) {
    this.screenSharingAdminsWhitelist = screenSharingAdminsWhitelist;
  }

  public User screenSharingUsersBlacklist(String screenSharingUsersBlacklist) {
    this.screenSharingUsersBlacklist = screenSharingUsersBlacklist;
    return this;
  }

   /**
   * \&quot;Masked Expression\&quot; blacklist of application titles for screen sharing filtering set by user.
   * @return screenSharingUsersBlacklist
  **/
  @ApiModelProperty(value = "\"Masked Expression\" blacklist of application titles for screen sharing filtering set by user.")
  public String getScreenSharingUsersBlacklist() {
    return screenSharingUsersBlacklist;
  }

  public void setScreenSharingUsersBlacklist(String screenSharingUsersBlacklist) {
    this.screenSharingUsersBlacklist = screenSharingUsersBlacklist;
  }

  public User screenSharingUsersWhitelist(String screenSharingUsersWhitelist) {
    this.screenSharingUsersWhitelist = screenSharingUsersWhitelist;
    return this;
  }

   /**
   * \&quot;Masked Expression\&quot; whitelist of application titles for screen sharing filtering set by user.
   * @return screenSharingUsersWhitelist
  **/
  @ApiModelProperty(value = "\"Masked Expression\" whitelist of application titles for screen sharing filtering set by user.")
  public String getScreenSharingUsersWhitelist() {
    return screenSharingUsersWhitelist;
  }

  public void setScreenSharingUsersWhitelist(String screenSharingUsersWhitelist) {
    this.screenSharingUsersWhitelist = screenSharingUsersWhitelist;
  }

  public User invitationTemplate(String invitationTemplate) {
    this.invitationTemplate = invitationTemplate;
    return this;
  }

   /**
   * Text template for Email and iCalendar messages. Limited to 1000 UTF-8 characters.
   * @return invitationTemplate
  **/
  @ApiModelProperty(value = "Text template for Email and iCalendar messages. Limited to 1000 UTF-8 characters.")
  public String getInvitationTemplate() {
    return invitationTemplate;
  }

  public void setInvitationTemplate(String invitationTemplate) {
    this.invitationTemplate = invitationTemplate;
  }

   /**
   * Custom joinsession URL stored on the account level.
   * @return accountJoinsessionUrl
  **/
  @ApiModelProperty(value = "Custom joinsession URL stored on the account level.")
  public String getAccountJoinsessionUrl() {
    return accountJoinsessionUrl;
  }

  public User viewerPointerEnabled(Boolean viewerPointerEnabled) {
    this.viewerPointerEnabled = viewerPointerEnabled;
    return this;
  }

   /**
   * Viewer Pointer can be used for this user
   * @return viewerPointerEnabled
  **/
  @ApiModelProperty(value = "Viewer Pointer can be used for this user")
  public Boolean isViewerPointerEnabled() {
    return viewerPointerEnabled;
  }

  public void setViewerPointerEnabled(Boolean viewerPointerEnabled) {
    this.viewerPointerEnabled = viewerPointerEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.username, user.username) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.imageAsBase64String, user.imageAsBase64String) &&
        Objects.equals(this.annotationToolEnabled, user.annotationToolEnabled) &&
        Objects.equals(this.annotationToolOptions, user.annotationToolOptions) &&
        Objects.equals(this.apiOnly, user.apiOnly) &&
        Objects.equals(this.automaticRecordingSessionStart, user.automaticRecordingSessionStart) &&
        Objects.equals(this.communicationChannels, user.communicationChannels) &&
        Objects.equals(this.enabled, user.enabled) &&
        Objects.equals(this.screenSharingAdminsBlacklist, user.screenSharingAdminsBlacklist) &&
        Objects.equals(this.screenSharingAdminsWhitelist, user.screenSharingAdminsWhitelist) &&
        Objects.equals(this.screenSharingUsersBlacklist, user.screenSharingUsersBlacklist) &&
        Objects.equals(this.screenSharingUsersWhitelist, user.screenSharingUsersWhitelist) &&
        Objects.equals(this.invitationTemplate, user.invitationTemplate) &&
        Objects.equals(this.accountJoinsessionUrl, user.accountJoinsessionUrl) &&
        Objects.equals(this.viewerPointerEnabled, user.viewerPointerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, firstName, lastName, email, phone, imageAsBase64String, annotationToolEnabled, annotationToolOptions, apiOnly, automaticRecordingSessionStart, communicationChannels, enabled, screenSharingAdminsBlacklist, screenSharingAdminsWhitelist, screenSharingUsersBlacklist, screenSharingUsersWhitelist, invitationTemplate, accountJoinsessionUrl, viewerPointerEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");

    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    imageAsBase64String: ").append(toIndentedString(imageAsBase64String)).append("\n");
    sb.append("    annotationToolEnabled: ").append(toIndentedString(annotationToolEnabled)).append("\n");
    sb.append("    annotationToolOptions: ").append(toIndentedString(annotationToolOptions)).append("\n");
    sb.append("    apiOnly: ").append(toIndentedString(apiOnly)).append("\n");
    sb.append("    automaticRecordingSessionStart: ").append(toIndentedString(automaticRecordingSessionStart)).append("\n");
    sb.append("    communicationChannels: ").append(toIndentedString(communicationChannels)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    screenSharingAdminsBlacklist: ").append(toIndentedString(screenSharingAdminsBlacklist)).append("\n");
    sb.append("    screenSharingAdminsWhitelist: ").append(toIndentedString(screenSharingAdminsWhitelist)).append("\n");
    sb.append("    screenSharingUsersBlacklist: ").append(toIndentedString(screenSharingUsersBlacklist)).append("\n");
    sb.append("    screenSharingUsersWhitelist: ").append(toIndentedString(screenSharingUsersWhitelist)).append("\n");
    sb.append("    invitationTemplate: ").append(toIndentedString(invitationTemplate)).append("\n");
    sb.append("    accountJoinsessionUrl: ").append(toIndentedString(accountJoinsessionUrl)).append("\n");
    sb.append("    viewerPointerEnabled: ").append(toIndentedString(viewerPointerEnabled)).append("\n");
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

