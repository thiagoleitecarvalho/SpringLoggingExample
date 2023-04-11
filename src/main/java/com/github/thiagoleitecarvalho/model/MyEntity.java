package com.github.thiagoleitecarvalho.model;

/**
 * Simple entity to help for creating simple business logic.
 * @author Thiago Leite
 */
public class MyEntity {

    /**
     * Attribute1.
     */
    private String attribute1;

    /**
     * Attribute2.
     */
    private double attribute2;

    /**
     * Attribute3.
     */
    private boolean attribute3;

    /**
     * Attribute4.
     */
    private long attribute4;

    public String getAttribute1() {
        return this.attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public double getAttribute2() {
        return this.attribute2;
    }

    public void setAttribute2(double attribute2) {
        this.attribute2 = attribute2;
    }

    public boolean isAttribute3() {
        return this.attribute3;
    }

    public void setAttribute3(boolean attribute3) {
        this.attribute3 = attribute3;
    }

    public long getAttribute4() {
        return this.attribute4;
    }

    public void setAttribute4(long attribute4) {
        this.attribute4 = attribute4;
    }

}
