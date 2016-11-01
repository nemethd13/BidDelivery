package hu.unideb.biddelivery.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "vehicle")
public class Vehicle {

    public enum VehicleCategory {
        CATEGORY_3_5_TONS,
        CATEGORY_7_TONS,
        CATEGORY_40_TONS,
        CATEGORY_TRAILER
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(max = 50)
    @Column(name = "brand", nullable = false)
    private String brand;
    @Size(max = 50)
    @Column(name = "type", nullable = false)
    private String type;
    @Size(max = 50)
    @Column(name = "category", nullable = false)
    private VehicleCategory category;
    @Size(max = 50)
    @Column(name = "platenumber", nullable = false)
    private String plateNumber;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public VehicleCategory getCategory() {
        return category;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCategory(VehicleCategory category) {
        this.category = category;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
