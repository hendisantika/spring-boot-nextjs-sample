package id.my.hendisantika.nextjssample.repository;

import id.my.hendisantika.nextjssample.entity.UsedCarSales;
import id.my.hendisantika.nextjssample.model.CarSearchParameters;
import io.micrometer.common.util.StringUtils;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-nextjs-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/06/24
 * Time: 07.12
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface UsedCarSalesRepository extends JpaRepository<UsedCarSales, Long>,
        JpaSpecificationExecutor<UsedCarSales> { // Added JpaSpecificationExecutor

    List<UsedCarSales> findByMake(String make);

    default List<UsedCarSales> findByParameter(CarSearchParameters carSearchParameters) {
        return findAll((Specification<UsedCarSales>) (root, query, criteriaBuilder) -> {
            Predicate predicate = criteriaBuilder.conjunction();

            if (!StringUtils.isEmpty(carSearchParameters.getMaker())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("make"), carSearchParameters.getMaker()));
            }

            if (!StringUtils.isEmpty(carSearchParameters.getModel())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("model"), carSearchParameters.getModel()));
            }

            if (carSearchParameters.getYear() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("year"), carSearchParameters.getYear()));
            }

            if (carSearchParameters.getYearFrom() != null && carSearchParameters.getYearTo() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.between(root.get("year"), carSearchParameters.getYearFrom(),
                                carSearchParameters.getYearTo()));
            }

            if (carSearchParameters.getOdometerFrom() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.greaterThanOrEqualTo(root.get("odometer"), carSearchParameters.getOdometerFrom()));
            }

            if (carSearchParameters.getOdometerTo() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.lessThanOrEqualTo(root.get("odometer"), carSearchParameters.getOdometerTo()));
            }

            if (!StringUtils.isEmpty(carSearchParameters.getVehicleCondition())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("vehiclecondition"), carSearchParameters.getVehicleCondition()));
            }

            if (!StringUtils.isEmpty(carSearchParameters.getStates())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("states"), carSearchParameters.getStates()));
            }

            if (carSearchParameters.getCustomDate() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.greaterThanOrEqualTo(root.get("saledate"), carSearchParameters.getCustomDate()));
            }

            if (!StringUtils.isEmpty(carSearchParameters.getSaleCategory())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("salecategory"), carSearchParameters.getSaleCategory()));
            }

            if (!StringUtils.isEmpty(carSearchParameters.getBadges())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("badges"), carSearchParameters.getBadges()));
            }

            if (!StringUtils.isEmpty(carSearchParameters.getBodyType())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("bodytype"), carSearchParameters.getBodyType()));
            }

            if (!StringUtils.isEmpty(carSearchParameters.getBodyTypeConfig())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("bodytypeconfig"), carSearchParameters.getBodyTypeConfig()));
            }

            if (!StringUtils.isEmpty(carSearchParameters.getFuelType())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("fueltype"), carSearchParameters.getFuelType()));
            }

            if (!StringUtils.isEmpty(carSearchParameters.getTransmission())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("transmission"), carSearchParameters.getTransmission()));
            }

            if (!StringUtils.isEmpty(carSearchParameters.getEngine())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("engine"), carSearchParameters.getEngine()));
            }

            if (carSearchParameters.getCylinders() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("cylinders"), carSearchParameters.getCylinders()));
            }

            if (!StringUtils.isEmpty(carSearchParameters.getDivision())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("division"), carSearchParameters.getDivision()));
            }

            if (!StringUtils.isEmpty(carSearchParameters.getDrive())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("drive"), carSearchParameters.getDrive()));
            }

            if (carSearchParameters.getSeat() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("seat"), carSearchParameters.getSeat()));
            }

            if (carSearchParameters.getDoors() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("doors"), carSearchParameters.getDoors()));
            }

            if (!StringUtils.isEmpty(carSearchParameters.getDescription())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.like(root.get("description"), "%" + carSearchParameters.getDescription() + "%"));
            }

            // Sorting
            if (!StringUtils.isEmpty(carSearchParameters.getSort())) {
                if (!StringUtils.isEmpty(carSearchParameters.getAsc()) && carSearchParameters.getAsc()
                        .equalsIgnoreCase("asc")) {
                    query.orderBy(criteriaBuilder.asc(root.get(carSearchParameters.getSort())));
                } else {
                    query.orderBy(criteriaBuilder.desc(root.get(carSearchParameters.getSort())));
                }
            }

            return predicate;
        });
    }
}
