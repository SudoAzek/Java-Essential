package com.mezonworks.javaEssential.LSN9_Class_Object.ex_004_class_object_equals_overridden;

public class Car {
    private int id;

    public Car(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        if(id != car.id) return false;
        return true;
    }

}
