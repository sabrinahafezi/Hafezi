
package com.sabrina.module2.one;


public class Planet {

    private String designation;

    private double massKg;

    private double orbitEarthYears;

    private PlanetType type;

    public Planet(String designation, PlanetType type) {
        this.designation = designation;
        this.type = type;
    }


    public Planet(String designation, double massKg, double orbitEarthYears, PlanetType type) {
        this.designation = designation;
        this.massKg = massKg;
        this.orbitEarthYears = orbitEarthYears;
        this.type = type;
    }


    public String toString() {
        return ("Planet: " + designation + "/" + type.getType() + "/" + massKg);
    }


    /**
     * If o1.equals(o2), then o1.hashCode() == o2.hashCode() should always be true.
     * If o1.hashCode() == o2.hashCode is true, it doesn't mean that o1.equals(o2) will be true.
     *
     *
     * @param obj The object to compare to this planet.
     * @return true if the two objects have the same designation.
     */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Planet) {
            return (
              this.designation.equals(((Planet) obj).designation) &&
              this.type.getType().equals(((Planet) obj).type.getType()) &&
              this.massKg == (((Planet) obj).massKg)
            );
        } else {
            return (false);
        }
    }


    /**
     * If o1.equals(o2), then o1.hashCode() == o2.hashCode() should always be true.
     * If o1.hashCode() == o2.hashCode is true, it doesn’t mean that o1.equals(o2) will be true.
     *
     *
     * @return
     */
    @Override
    public int hashCode() {
        return (designation.hashCode());
    }

}

