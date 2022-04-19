package in.premad.mvvmjava.Model;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class GetPlansDetails {

    @SerializedName("plan_id")
    @Expose
    private String planId;
    @SerializedName("plan_name")
    @Expose
    private String planName;
    @SerializedName("admission_fee")
    @Expose
    private String admissionFee;
    @SerializedName("plan_amount")
    @Expose
    private String planAmount;
    @SerializedName("tenure")
    @Expose
    private String tenure;
    @SerializedName("start_month")
    @Expose
    private String startMonth;
    @SerializedName("agent_commission")
    @Expose
    private String agentCommission;
    @SerializedName("emi")
    @Expose
    private String emi;
    @SerializedName("total_subscription")
    @Expose
    private String totalSubscription;
    @SerializedName("months_completed")
    @Expose
    private String monthsCompleted;
    @SerializedName("total_months")
    @Expose
    private String totalMonths;
    @SerializedName("groups_counts")
    @Expose
    private String groupsCounts;
    @SerializedName("end_date_for subscription")
    @Expose
    private Object endDateForSubscription;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("added_date")
    @Expose
    private String addedDate;
    @SerializedName("update_date")
    @Expose
    private String updateDate;

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getAdmissionFee() {
        return admissionFee;
    }

    public void setAdmissionFee(String admissionFee) {
        this.admissionFee = admissionFee;
    }

    public String getPlanAmount() {
        return planAmount;
    }

    public void setPlanAmount(String planAmount) {
        this.planAmount = planAmount;
    }

    public String getTenure() {
        return tenure;
    }

    public void setTenure(String tenure) {
        this.tenure = tenure;
    }

    public String getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    public String getAgentCommission() {
        return agentCommission;
    }

    public void setAgentCommission(String agentCommission) {
        this.agentCommission = agentCommission;
    }

    public String getEmi() {
        return emi;
    }

    public void setEmi(String emi) {
        this.emi = emi;
    }

    public String getTotalSubscription() {
        return totalSubscription;
    }

    public void setTotalSubscription(String totalSubscription) {
        this.totalSubscription = totalSubscription;
    }

    public String getMonthsCompleted() {
        return monthsCompleted;
    }

    public void setMonthsCompleted(String monthsCompleted) {
        this.monthsCompleted = monthsCompleted;
    }

    public String getTotalMonths() {
        return totalMonths;
    }

    public void setTotalMonths(String totalMonths) {
        this.totalMonths = totalMonths;
    }

    public String getGroupsCounts() {
        return groupsCounts;
    }

    public void setGroupsCounts(String groupsCounts) {
        this.groupsCounts = groupsCounts;
    }

    public Object getEndDateForSubscription() {
        return endDateForSubscription;
    }

    public void setEndDateForSubscription(Object endDateForSubscription) {
        this.endDateForSubscription = endDateForSubscription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

}