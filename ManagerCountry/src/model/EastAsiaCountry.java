package model;

public class EastAsiaCountry extends Country {
    private String countryTerrain;
   
    public EastAsiaCountry(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public String toString() {
        return "EastAsiaCountry [countryCode = " + countryCode + ", countryName = " + countryName + " , totalArea = " + totalArea
                + " , countryTerrain = " + countryTerrain + "]";
    }
}
