package guru.springframework.spring5webapp.domain;

import javax.persistence.*;

import java.util.Objects;

@Entity
public class ReturnedPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private Float amount;
    private String paymentDate;
    private String scheduleDate;
    private String returnedStatus;

    public ReturnedPayment() {
    }

    public ReturnedPayment(String type, Float amount, String paymentDate, String scheduleDate, String returnedStatus) {
        this.type = type;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.scheduleDate = scheduleDate;
        this.returnedStatus = returnedStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getReturnedStatus() {
        return returnedStatus;
    }

    public void setReturnedStatus(String returnedStatus) {
        this.returnedStatus = returnedStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ReturnedPayment{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", paymentDate='" + paymentDate + '\'' +
                ", scheduleDate='" + scheduleDate + '\'' +
                ", returnedStatus='" + returnedStatus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReturnedPayment that = (ReturnedPayment) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
