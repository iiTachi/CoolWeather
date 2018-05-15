package Entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "OffShelve", schema = "Supermarket", catalog = "")
public class OffShelveEntity {
    private int offId;
    private Time time;
    private String reason;

    @Id
    @Column(name = "off_id")
    public int getOffId() {
        return offId;
    }

    public void setOffId(int offId) {
        this.offId = offId;
    }

    @Basic
    @Column(name = "time")
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Basic
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OffShelveEntity that = (OffShelveEntity) o;
        return offId == that.offId &&
                Objects.equals(time, that.time) &&
                Objects.equals(reason, that.reason);
    }

    @Override
    public int hashCode() {

        return Objects.hash(offId, time, reason);
    }
}
