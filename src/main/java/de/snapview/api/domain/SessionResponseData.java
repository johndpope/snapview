package de.snapview.api.domain;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * Data element of a response to a create session request.
 */
public class SessionResponseData {

    @SerializedName("nineDigitKey")
    @Getter
    @Setter
    private String nineDigitKey = null;

    @SerializedName("secureToken")
    @Getter @Setter
    private String secureToken = null;

    @SerializedName("plannedStartUTC")
    @Getter @Setter
    private String plannedStartUTC = null;

    @SerializedName("plannedStartTimeForLocalZone")
    @Getter @Setter
    private String plannedStartTimeForLocalZone = null;

    @SerializedName("timeZoneOffset")
    @Getter @Setter
    private String timeZoneOffset = null;

    @SerializedName("username")
    @Getter @Setter
    private String username = null;

    @SerializedName("freeField1")
    @Getter @Setter
    private String freeField1 = null;

    @SerializedName("freeField2")
    @Getter @Setter
    private String freeField2 = null;

    @SerializedName("freeField3")
    @Getter @Setter
    private String freeField3 = null;

    @SerializedName("password")
    @Getter @Setter
    private String password = null;

    @SerializedName("topic")
    @Getter @Setter
    private String topic = null;

    @SerializedName("duration")
    @Getter @Setter
    private Integer duration = null;

    @SerializedName("status")
    @Getter @Setter
    private String status = null;

}
