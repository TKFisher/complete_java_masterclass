package com.Section_8_Composition;

public class Cable {

    private String provider;
    private String servicePackage;
    private int numConnections;

    public Cable(String provider, String servicePackage, int numConnections) {
        this.provider = provider;
        this.servicePackage = servicePackage;
        this.numConnections = numConnections;
    }

    public Cable() {

    }


    public void customCablePackage(String provider, String packageOffering, int numConnections) {
        System.out.println("Your cable package from " + provider + " includes " + packageOffering +
                " with " + numConnections + " connections.");
    }

    public String getProvider() {
        return provider;
    }

    public String getServicePackage() {
        return servicePackage;
    }

    public int getNumConnections() {
        return numConnections;
    }
}
