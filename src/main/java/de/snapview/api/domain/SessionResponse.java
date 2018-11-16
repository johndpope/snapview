package de.snapview.api.domain;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * Response to a create session request.
 */
public class SessionResponse {

    @SerializedName("data")
    @Getter @Setter
    private SessionResponseData data = null;

    @SerializedName("requestUri")
    @Getter @Setter
    private String requestUri = null;

    @SerializedName("success")
    @Getter @Setter
    private Boolean success = null;

    @SerializedName("message")
    @Getter @Setter
    private String message = null;

}
