package com.example.advjavaassignment2;

import com.google.gson.annotations.SerializedName;

public class ElementDetails {
    @SerializedName("name")
    private String name;
    @SerializedName("atomic_mass")
    private double atomicMass;
    @SerializedName("boil")
    private double boil;
    @SerializedName("category")
    private String category;
    @SerializedName("density")
    private double density;
    @SerializedName("bohr_model_image")
    private String image;
    @SerializedName("discovered_by")
    private String discoveredBy;
    // You can add more fields as needed

    // Constructors

    public ElementDetails() {
    }

    public ElementDetails(String name, double atomicMass, double boil, String category, double density, String discoveredBy) {
        this.name = name;
        this.atomicMass = atomicMass;
        this.boil = boil;
        this.category = category;
        this.density = density;
        this.discoveredBy = discoveredBy;
    }

    // Getters

    public String getName() {
        return name;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public double getBoil() {
        return boil;
    }

    public String getCategory() {
        return category;
    }

    public double getDensity() {
        return density;
    }

    public String getDiscoveredBy() {
        return discoveredBy;
    }


    @Override
    public String toString() {
        return String.format("%s - %s", name, category);
    }

    public String getBohr_model_image() {
        return image;
    }
}
