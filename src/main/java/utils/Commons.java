package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Commons {

    private static String dateTimeStamp = getDate()+ "_" + getTime();

    public   static String getDate(  )   {
        DateFormat df = new SimpleDateFormat( "yyyy-MM-dd" ) ;
        df.setTimeZone( TimeZone.getTimeZone( "PKT" )  ) ;
        return ( df.format( new Date(  )  )  ) ;
    }

    public    static String getTime(  )   {
        DateFormat df = new SimpleDateFormat( "hh-mm-ss" ) ;
        df.setTimeZone ( TimeZone.getTimeZone ( "PKT" )  ) ;
        return ( df.format( new Date(  )  )  ) ;
    }

    public static String getDateTimeStamp() {
        return dateTimeStamp;
    }

}
