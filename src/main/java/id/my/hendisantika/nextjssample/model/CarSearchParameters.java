package id.my.hendisantika.nextjssample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-nextjs-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/06/24
 * Time: 07.11
 * To change this template use File | Settings | File Templates.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarSearchParameters {
    private String maker;
    private String model;
    private Integer year;
    private Integer yearFrom;
    private Integer yearTo;
    private Integer odometerFrom;
    private Integer odometerTo;
    private String vehicleCondition;
    private String states;
    private Date customDate;// eg. last 7 days
    private String saleCategory;
    private String badges;
    private String bodyType;
    private String bodyTypeConfig;
    private String fuelType;
    private String transmission;
    private String engine;
    private Integer cylinders;
    private String division;
    private String drive;
    private Integer seat;
    private Integer doors;
    private String description;
    private String sort;
    private String asc;
}
