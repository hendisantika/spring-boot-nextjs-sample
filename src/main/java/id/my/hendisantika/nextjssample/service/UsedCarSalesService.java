package id.my.hendisantika.nextjssample.service;

import id.my.hendisantika.nextjssample.repository.UsedCarSalesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-nextjs-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/06/24
 * Time: 07.36
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class UsedCarSalesService {

    private final UsedCarSalesRepository usedCarSalesRepository;
}
