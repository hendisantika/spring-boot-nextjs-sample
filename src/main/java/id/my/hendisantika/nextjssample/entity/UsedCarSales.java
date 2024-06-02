package id.my.hendisantika.nextjssample.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-nextjs-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/06/24
 * Time: 07.05
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "used_car_sales")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsedCarSales {
    @Id
    @Column(name = "id", length = 36)
    private String id;

    @Column(name = "make", length = 20)
    private String make;

    @Column(name = "model", length = 20)
    private String model;

    @Column(name = "year")
    private Integer year;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "odometer")
    private Integer odometer;

    @Column(name = "vehiclecondition", length = 20)
    private String vehiclecondition;

    @Column(name = "salelocation", length = 32)
    private String salelocation;

    @Column(name = "salecategory", length = 100)
    private String salecategory;

    @Column(name = "salvagevehicle", length = 3)
    private String salvagevehicle;

    @Column(name = "saledate")
    private Date saledate;

    @Column(name = "saleprice", precision = 10, scale = 2)
    private BigDecimal saleprice;

    @Column(name = "colour", length = 10)
    private String colour;

    @Column(name = "engine", length = 32)
    private String engine;

    @Column(name = "transmission", length = 100)
    private String transmission;

    @Column(name = "accessories", length = 32)
    private String accessories;

    @Column(name = "states", length = 10)
    private String states;

    @Column(name = "customdate")
    private Integer customdate;

    @Column(name = "badges", length = 20)
    private String badges;

    @Column(name = "bodytype", length = 10)
    private String bodytype;

    @Column(name = "bodytypeconfig", length = 20)
    private String bodytypeconfig;

    @Column(name = "fueltype", length = 6)
    private String fueltype;

    @Column(name = "cylinders")
    private Integer cylinders;

    @Column(name = "division", length = 20)
    private String division;

    @Column(name = "drive", length = 20)
    private String drive;

    @Column(name = "seat")
    private Integer seat;

    @Column(name = "doors")
    private Integer doors;
}
