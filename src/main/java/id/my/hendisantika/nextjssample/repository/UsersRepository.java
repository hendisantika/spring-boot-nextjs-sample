package id.my.hendisantika.nextjssample.repository;

import id.my.hendisantika.nextjssample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-nextjs-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/06/24
 * Time: 07.13
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
