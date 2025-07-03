package PoliticalZone;

public enum PoliticalZone {
    NORTHCENTRAL("benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTHEAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTHWEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTHEAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTHWEST("Ekiti", "Lagos","Osun", "Ondo", "Ogun", "Oyo"),
    SOUTHSOUTH("Akwa-Ibon", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers");

    private String[] politicalZone;
    PoliticalZone(String... politicalZone){
        this.politicalZone = politicalZone;
    }
    public void setPoliticalZone(String[] politicalZone) {
        this.politicalZone = politicalZone;
    }
    public String[] getPoliticalZone(){
        return politicalZone;
    }
}
