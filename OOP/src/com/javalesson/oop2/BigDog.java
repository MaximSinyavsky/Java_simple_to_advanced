package com.javalesson.oop2;

import com.javalesson.oop.Dog;

public class BigDog extends Dog {
    @Override
    public void setSize(String size) {
        super.setSize(size);
    }
    //private
    //package private or default
    //protected
    //public

    @Override
    protected void setPaws(int paws) {
        super.setPaws(paws);
    }
}
