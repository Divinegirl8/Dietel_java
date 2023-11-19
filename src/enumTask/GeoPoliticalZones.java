package enumTask;

public enum GeoPoliticalZones {
    NORTHCENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTHEAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTHWEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTHEAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTHSOUTH("Akwa Ibom", "Bayelsa", "Cross River", "Delta", "Edo", "Rivers"),
    SOUTHWEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");

   private final String[] states;

   GeoPoliticalZones(String... states){
       this.states = states;
   }

   public String[] getStates(){
       return states;
   }

    public static GeoPoliticalZones displayZone(String value) {
       GeoPoliticalZones result = null;

        for (GeoPoliticalZones zone : values()) {
            for (String state : zone.getStates()) {
                if (state.equalsIgnoreCase(value)) {
                    result = zone;
                    break;
                }
            }
        }

        return result;
    }



}
