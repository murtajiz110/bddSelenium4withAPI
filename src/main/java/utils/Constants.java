package utils;

import org.apache.log4j.Logger;


public class Constants {
    public static final String userDirPath = System.getProperty("user.dir");
    public static final Logger myLogger = Logger.getLogger(Constants.class);
    public static final String startPage = "http://newtours.demoaut.com/mercurysignon.php";
    public static String landingPage = "http://newtours.demoaut.com/mercuryreservation.php";

    public static String apiUrlGetAllLeagues = "https://thesportsdb.p.rapidapi.com/1/all_leagues.php";
    public static final String apiKey = "369336c2e9msh3d53861af64474dp1a54eejsnafaa208fe62c";

}
