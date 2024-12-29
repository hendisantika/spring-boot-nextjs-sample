package id.my.hendisantika.nextjssample.controller;

import id.my.hendisantika.nextjssample.model.CarSearchParameters;
import id.my.hendisantika.nextjssample.model.Response;
import id.my.hendisantika.nextjssample.model.ResponseMessage;
import id.my.hendisantika.nextjssample.model.ResponseStatus;
import id.my.hendisantika.nextjssample.service.UsedCarSalesService;
import id.my.hendisantika.nextjssample.util.CarSearchParametersUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-nextjs-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/06/24
 * Time: 07.42
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class UsedCarSalesController {

    public final UsedCarSalesService usedCarSalesService;

    @GetMapping
    public Response getCars(
            @RequestParam(required = false) String maker,
            @RequestParam(required = false) String model,
            @RequestParam(required = false) String year,
            @RequestParam(required = false) String odometer,
            @RequestParam(required = false) String vehicleCondition,
            @RequestParam(required = false) String states,
            @RequestParam(required = false) String customDate,
            @RequestParam(required = false) String saleCategory,
            @RequestParam(required = false) String badges,
            @RequestParam(required = false) String bodyType,
            @RequestParam(required = false) String bodyTypeConfig,
            @RequestParam(required = false) String fuelType,
            @RequestParam(required = false) String transmission,
            @RequestParam(required = false) String engine,
            @RequestParam(required = false) String cylinders,
            @RequestParam(required = false) String division,
            @RequestParam(required = false) String drive,
            @RequestParam(required = false) String seat,
            @RequestParam(required = false) String doors,
            @RequestParam(required = false) String description,
            @RequestParam(required = false) String sort,
            @RequestParam(required = false) String asc) {

        try {
            CarSearchParameters carSearchParameters = CarSearchParametersUtil.assembleCarSearchParameters(maker, model, year,
                    odometer, vehicleCondition, states, customDate, saleCategory,
                    badges, bodyType, bodyTypeConfig, fuelType, transmission, engine, cylinders, division,
                    drive, seat, doors, description, sort, asc);

            log.info("carSearchParameters {}", carSearchParameters);

            return new Response(ResponseStatus.SUCCESS, ResponseMessage.SUCCESS,
                    usedCarSalesService.findByParameter(carSearchParameters));
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseStatus.FAIL, ResponseMessage.ERROR, null);
        }

    }
}
