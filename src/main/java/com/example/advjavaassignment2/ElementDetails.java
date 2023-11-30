package com.example.advjavaassignment2;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ElementDetails {
    @SerializedName("name")
    private String name;

    @SerializedName("appearance")
    private String appearance;

    @SerializedName("atomic_mass")
    private double atomicMass;

    @SerializedName("boil")
    private double boil;

    @SerializedName("category")
    private String category;

    @SerializedName("density")
    private double density;

    @SerializedName("discovered_by")
    private String discoveredBy;

    @SerializedName("melt")
    private double melt;

    @SerializedName("molar_heat")
    private Double molarHeat; // Use Double for nullable values

    @SerializedName("named_by")
    private String namedBy;

    @SerializedName("number")
    private int number;

    @SerializedName("period")
    private int period;

    @SerializedName("group")
    private int group;

    @SerializedName("phase")
    private String phase;

    @SerializedName("source")
    private String source;

    @SerializedName("bohr_model_image")
    private String bohrModelImage;

    @SerializedName("bohr_model_3d")
    private String bohrModel3D;

    @SerializedName("spectral_img")
    private String spectralImg;

    @SerializedName("summary")
    private String summary;

    @SerializedName("symbol")
    private String symbol;

    @SerializedName("xpos")
    private int xpos;

    @SerializedName("ypos")
    private int ypos;

    @SerializedName("wxpos")
    private int wxpos;

    @SerializedName("wypos")
    private int wypos;

    @SerializedName("shells")
    private List<Integer> shells;

    @SerializedName("electron_configuration")
    private String electronConfiguration;

    @SerializedName("electron_configuration_semantic")
    private String electronConfigurationSemantic;

    @SerializedName("electron_affinity")
    private double electronAffinity;

    @SerializedName("electronegativity_pauling")
    private double electronegativityPauling;

    @SerializedName("ionization_energies")
    private List<Double> ionizationEnergies;

    @SerializedName("cpk-hex")
    private String cpkHex;

    // Add getters for all fields


    public String getName() {
        return name;
    }

    public String getAppearance() {
        return appearance;
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

    public double getMelt() {
        return melt;
    }

    public Double getMolarHeat() {
        return molarHeat;
    }

    public String getNamedBy() {
        return namedBy;
    }

    public int getNumber() {
        return number;
    }

    public int getPeriod() {
        return period;
    }

    public int getGroup() {
        return group;
    }

    public String getPhase() {
        return phase;
    }

    public String getSource() {
        return source;
    }

    public String getBohrModelImage() {
        return bohrModelImage;
    }

    public String getBohrModel3D() {
        return bohrModel3D;
    }

    public String getSpectralImg() {
        return spectralImg;
    }

    public String getSummary() {
        return summary;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public int getWxpos() {
        return wxpos;
    }

    public int getWypos() {
        return wypos;
    }

    public List<Integer> getShells() {
        return shells;
    }

    public String getElectronConfiguration() {
        return electronConfiguration;
    }

    public String getElectronConfigurationSemantic() {
        return electronConfigurationSemantic;
    }

    public double getElectronAffinity() {
        return electronAffinity;
    }

    public double getElectronegativityPauling() {
        return electronegativityPauling;
    }

    public List<Double> getIonizationEnergies() {
        return ionizationEnergies;
    }

    public String getCpkHex() {
        return cpkHex;
    }
}
