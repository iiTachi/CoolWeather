package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Clothes", schema = "Supermarket", catalog = "")
public class ClothesEntity {
    private int clothesId;
    private String name;
    private String color;
    private String size;
    private String crowd;

    @Id
    @Column(name = "clothes_id")
    public int getClothesId() {
        return clothesId;
    }

    public void setClothesId(int clothesId) {
        this.clothesId = clothesId;
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
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "crowd")
    public String getCrowd() {
        return crowd;
    }

    public void setCrowd(String crowd) {
        this.crowd = crowd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClothesEntity that = (ClothesEntity) o;
        return clothesId == that.clothesId &&
                Objects.equals(name, that.name) &&
                Objects.equals(color, that.color) &&
                Objects.equals(size, that.size) &&
                Objects.equals(crowd, that.crowd);
    }

    @Override
    public int hashCode() {

        return Objects.hash(clothesId, name, color, size, crowd);
    }
}
