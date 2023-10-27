package Chapter6;

public class Weather {
    public static String sportsRecommendation(int celsius){
        String output = "";
        if (celsius >= 20 && celsius <= 30) output = "It’s lovely weather for sports today!";
        else if (celsius >= 10 && celsius <= 40) output = "It’s reasonable weather for sports today.";
        else {output = "Please exercise with care today, watch out for the weather!";}
            
       return output;
    }
}
