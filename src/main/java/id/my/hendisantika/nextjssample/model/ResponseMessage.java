package id.my.hendisantika.nextjssample.model;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-nextjs-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/06/24
 * Time: 07.10
 * To change this template use File | Settings | File Templates.
 */
public class ResponseMessage {
    public static final String SUCCESS = "Request processed successfully";
    public static final String FAIL = "Request failed to process";
    public static final String ERROR = "An error occurred while processing the request";
    public static final String NOT_FOUND = "No data found for the request";
    public static final String UNAUTHORIZED = "Unauthorized access. Permission denied";
    public static final String INVALID_PARAMETERS = "Invalid parameters provided";
    public static final String DATABASE_ERROR = "A database error occurred while processing the request";
    public static final String SERVER_ERROR = "An internal server error occurred";
}
