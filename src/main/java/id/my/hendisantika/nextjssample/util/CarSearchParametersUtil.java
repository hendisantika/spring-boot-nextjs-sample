package id.my.hendisantika.nextjssample.util;

import id.my.hendisantika.nextjssample.model.CarSearchParameters;
import org.springframework.util.StringUtils;

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
public class CarSearchParametersUtil {
    public static CarSearchParameters assembleCarSearchParameters(String maker, String model, String year,
                                                                  String odometer, String vehicleCondition, String states, String customDate, String saleCategory, String badges,
                                                                  String bodyType, String bodyTypeConfig, String fuelType, String transmission, String engine, String cylinders,
                                                                  String division, String drive, String seat, String doors, String description, String sort, String asc) {

        CarSearchParameters parameters = new CarSearchParameters();
        parameters.setMaker(maker);
        parameters.setModel(!"Family".equals(model) ? model : null);

        if (year == null || "".equals(year) || "Year".equals(year) || "year".equals(year)) {
            parameters.setYear(null);
            parameters.setYearFrom(null);
            parameters.setYearTo(null);
        } else {
            if (splitStringIntoRange(year) == null) {
                parameters.setYear(Integer.parseInt(year));
            } else {
                parameters.setYearFrom(
                        StringUtils.hasText(year) && !"Year".equals(year) ? splitStringIntoRange(year).getStart() : null);
                parameters.setYearTo(
                        StringUtils.hasText(year) && !"Year".equals(year) ? splitStringIntoRange(year).getEnd() : null);
            }
        }

        parameters.setOdometerFrom(
                StringUtils.hasText(odometer) && !"Odometer".equals(odometer) ? splitOdometerIntoRange(odometer).getStart()
                        : null);
        parameters.setOdometerTo(
                StringUtils.hasText(odometer) && !"Odometer".equals(odometer) ? splitOdometerIntoRange(odometer).getEnd()
                        : null);

        parameters.setVehicleCondition(!"AllCarConditions".equals(vehicleCondition) ? vehicleCondition : null);
        parameters.setStates(!"States".equals(states) ? states : null);
        parameters.setCustomDate(
                StringUtils.hasText(customDate) && !"Custom Date".equals(customDate) ? getDateFromCustomDate(customDate)
                        : null);
        parameters.setSaleCategory(!"Sale Category".equals(saleCategory) ? saleCategory : null);
        parameters.setBadges(!"Badges".equals(badges) ? badges : null);
        parameters.setBodyType(!"Body Type".equals(bodyType) ? bodyType : null);
        parameters.setBodyTypeConfig(!"Body Type Config".equals(bodyTypeConfig) ? bodyTypeConfig : null);
        parameters.setFuelType(!"Fuel Type".equals(fuelType) ? fuelType : null);
        parameters.setTransmission(!"Transmission".equals(transmission) ? transmission : null);
        parameters.setEngine(!"Engine".equals(engine) ? engine : null);
        parameters.setCylinders(
                StringUtils.hasText(cylinders) && !"Cylinders".equals(cylinders) ? Integer.parseInt(cylinders) : null);
        parameters.setDivision(!"Division".equals(division) ? division : null);
        parameters.setDrive(!"Drive".equals(drive) ? drive : null);
        parameters.setSeat(StringUtils.hasText(seat) && !"Seat".equals(seat) ? Integer.parseInt(seat) : null);
        parameters.setDoors(StringUtils.hasText(doors) && !"Doors".equals(doors) ? Integer.parseInt(doors) : null);
        parameters.setDescription(description);
        parameters.setSort(StringUtils.hasText(sort) ? getPropertyFromSortString(sort) : null);

        parameters.setAsc(asc);

        return parameters;
    }

    public static Range splitStringIntoRange(String input) {
        String[] parts = input.split("\\s*-\\s*");
        if (parts.length == 1) {
            return null;
        } else {
            int start = Integer.parseInt(parts[0]);
            int end = Integer.parseInt(parts[1]);
            return new Range(start, end);
        }
    }

    public static class Range {

        private final int start;
        private final int end;

        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }

    public static DistanceRange splitOdometerIntoRange(String input) {
        String[] parts = input.split("\\s*-\\s*");
        int start = parseDistance(parts[0]);
        int end = parseDistance(parts[1]);
        return new DistanceRange(start, end);
    }

    public static int parseDistance(String distanceStr) {
        // Remove "km" from the distance string and trim any whitespace
        distanceStr = distanceStr.replaceAll("[^\\d]", "").trim();
        return Integer.parseInt(distanceStr);
    }

    public static class DistanceRange {

        private final int start;
        private final int end;

        public DistanceRange(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
}




