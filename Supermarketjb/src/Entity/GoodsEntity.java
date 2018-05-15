package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Goods", schema = "Supermarket", catalog = "")
public class GoodsEntity {
    private int goodsId;
    private String name;
    private String brand;
    private double price;
    private int quantity;

    @Id
    @Column(name = "goods_id")
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "gname")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsEntity that = (GoodsEntity) o;
        return goodsId == that.goodsId &&
                Double.compare(that.price, price) == 0 &&
                quantity == that.quantity &&
                Objects.equals(name, that.name) &&
                Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {

        return Objects.hash(goodsId, name, brand, price, quantity);
    }
}
