package Entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "InRecords", schema = "Supermarket", catalog = "")
public class InRecordsEntity {
    private int recordsId;
    private Time time;
    private double single;
    private int number;
    private double total;

    @Id
    @Column(name = "records_id")
    public int getRecordsId() {
        return recordsId;
    }

    public void setRecordsId(int recordsId) {
        this.recordsId = recordsId;
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
    @Column(name = "single")
    public double getSingle() {
        return single;
    }

    public void setSingle(double single) {
        this.single = single;
    }

    @Basic
    @Column(name = "number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Basic
    @Column(name = "total")
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InRecordsEntity that = (InRecordsEntity) o;
        return recordsId == that.recordsId &&
                Double.compare(that.single, single) == 0 &&
                number == that.number &&
                Double.compare(that.total, total) == 0 &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {

        return Objects.hash(recordsId, time, single, number, total);
    }
}
