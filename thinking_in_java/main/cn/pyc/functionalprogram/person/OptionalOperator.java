package cn.pyc.functionalprogram.person;

import java.util.Optional;

/**
 * @author pi
 * @date 2020/8/13 20:42:39
 */
public class OptionalOperator {
    Optional<Car> optCar = Optional.empty();

    public String getCarInsuranceName(Optional<Person> person){
        return person.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
    }
}
