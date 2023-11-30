package com.example.advjavaassignment2;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ElementDetails {

    private String name;
    private String appearance;
    private double atomic_mass;
    private double boil;
    private String category;
    private String color;
    private double density;
    private String discovered_by;
    private double melt;
    private String molar_heat;
    private String named_by;
    private int number;
    private int period;
    private String phase;
    private String source;
    private String spectral_img;
    private String summary;
    private String symbol;
    private int xpos;
    private int ypos;
    private List<Integer> shells;
    private String electron_configuration;
    private String electron_configuration_semantic;
    private double electron_affinity;
    private double electronegativity_pauling;
    private List<Double> ionization_energies;
    private String cpk_hex;

    @SerializedName("name")
    public String getName() {
        return name;
    }

    @SerializedName("appearance")
    public String getAppearance() {
        return appearance;
    }

    @SerializedName("atomic_mass")
    public double getAtomicMass() {
        return atomic_mass;
    }

    @SerializedName("boil")
    public double getBoil() {
        return boil;
    }

    @SerializedName("category")
    public String getCategory() {
        return category;
    }

    @SerializedName("color")
    public String getColor() {
        return color;
    }

    @SerializedName("density")
    public double getDensity() {
        return density;
    }

    @SerializedName("discovered_by")
    public String getDiscoveredBy() {
        return discovered_by;
    }

    @SerializedName("melt")
    public double getMelt() {
        return melt;
    }

    @SerializedName("molar_heat")
    public String getMolarHeat() {
        return molar_heat;
    }

    @SerializedName("named_by")
    public String getNamedBy() {
        return named_by;
    }

    @SerializedName("number")
    public int getNumber() {
        return number;
    }

    @SerializedName("period")
    public int getPeriod() {
        return period;
    }

    @SerializedName("phase")
    public String getPhase() {
        return phase;
    }

    @SerializedName("source")
    public String getSource() {
        return source;
    }

    @SerializedName("spectral_img")
    public String getSpectralImg() {
        return spectral_img;
    }

    @SerializedName("summary")
    public String getSummary() {
        return summary;
    }

    @SerializedName("symbol")
    public String getSymbol() {
        return symbol;
    }

    @SerializedName("xpos")
    public int getXpos() {
        return xpos;
    }

    @SerializedName("ypos")
    public int getYpos() {
        return ypos;
    }

    @SerializedName("shells")
    public List<Integer> getShells() {
        return shells;
    }

    @SerializedName("electron_configuration")
    public String getElectronConfiguration() {
        return electron_configuration;
    }

    @SerializedName("electron_configuration_semantic")
    public String getElectronConfigurationSemantic() {
        return electron_configuration_semantic;
    }

    @SerializedName("electron_affinity")
    public double getElectronAffinity() {
        return electron_affinity;
    }

    @SerializedName("electronegativity_pauling")
    public double getElectronegativityPauling() {
        return electronegativity_pauling;
    }

    @SerializedName("ionization_energies")
    public List<Double> getIonizationEnergies() {
        return ionization_energies;
    }

    @SerializedName("cpk-hex")
    public String getCpkHex() {
        return cpk_hex;
    }
}

