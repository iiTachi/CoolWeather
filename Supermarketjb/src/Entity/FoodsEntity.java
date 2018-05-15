package Entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Foods", schema = "Supermarket", catalog = "")
public class FoodsEntity {
    private int foodsId;
    private String name;
    private String origin;
    private Date deadDate;

    @Id
    @Column(name = "foods_id")
    public int getFoodsId() {
        return foodsId;
    }

    public void setFoodsId(int foodsId) {
        this.foodsId = foodsId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "origin")
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Basic
    @Column(name = "dead_date")
    public Date getDeadDate() {
        return deadDate;
    }

    public void setDeadDate(Date deadDate) {
        this.deadDate = deadDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodsEntity that = (FoodsEntity) o;
        return foodsId == that.foodsId &&
                Objects.equals(name, that.name) &&
                Objects.equals(origin, that.origin) &&
                Objects.equals(deadDate, that.deadDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(foodsId, name, origin, deadDate);
    }
}
