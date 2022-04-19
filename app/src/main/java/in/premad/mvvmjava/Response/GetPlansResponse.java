package in.premad.mvvmjava.Response;


import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import in.premad.mvvmjava.Model.GetPlansDetails;

@Generated("jsonschema2pojo")
public class GetPlansResponse {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<GetPlansDetails> data = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<GetPlansDetails> getData() {
        return data;
    }

    public void setData(List<GetPlansDetails> data) {
        this.data = data;
    }

}