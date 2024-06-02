package id.my.hendisantika.nextjssample.controller;

import id.my.hendisantika.nextjssample.service.UsedCarSalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RestController
@CrossOrigin
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class UsedCarSalesController {

    public final UsedCarSalesService usedCarSalesService;
}
