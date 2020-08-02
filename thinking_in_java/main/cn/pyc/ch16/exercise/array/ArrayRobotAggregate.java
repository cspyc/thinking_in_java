package cn.pyc.ch16.exercise.array;

import com.sun.jndi.ldap.Ber;

public class ArrayRobotAggregate extends ArrayRobot {

    @Override
    public Object[] produceArray() {
        BerylliumSphere[] berylliumSpheres = {
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere()
        };
        return berylliumSpheres;
    }
}
