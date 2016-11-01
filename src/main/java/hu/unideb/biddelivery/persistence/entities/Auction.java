package hu.unideb.biddelivery.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class Auction {

    public enum AuctionState {
        OPEN,
        IN_PROGRESS,
        CLOSED
    }

    @Column(name = "startDate", nullable = false)
    private Date startDate;
    @Column(name = "enddate", nullable = false)
    private Date endDate;
    @Column(name = "state", nullable = false)
    private AuctionState State;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public AuctionState getState() {
        return State;
    }

    public void setState(AuctionState state) {
        State = state;
    }
}
