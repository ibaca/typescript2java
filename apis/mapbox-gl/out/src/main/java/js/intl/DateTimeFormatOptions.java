package js.intl;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Intl.DateTimeFormatOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 190497

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class DateTimeFormatOptions
{

    /*
        Properties
    */

    public String day;

    public String era;

    public String formatMatcher;

    public String hour;

    public Boolean hour12;

    public String localeMatcher;

    public String minute;

    public String month;

    public String second;

    public String timeZone;

    public String timeZoneName;

    public String weekday;

    public String year;

    /*
        Methods
    */
    @JsProperty(name = "day")
    public native String getDay();
    @JsProperty(name = "era")
    public native String getEra();
    @JsProperty(name = "formatMatcher")
    public native String getFormatMatcher();
    @JsProperty(name = "hour")
    public native String getHour();
    @JsProperty(name = "hour12")
    public native Boolean getHour12();
    @JsProperty(name = "localeMatcher")
    public native String getLocaleMatcher();
    @JsProperty(name = "minute")
    public native String getMinute();
    @JsProperty(name = "month")
    public native String getMonth();
    @JsProperty(name = "second")
    public native String getSecond();
    @JsProperty(name = "timeZone")
    public native String getTimeZone();
    @JsProperty(name = "timeZoneName")
    public native String getTimeZoneName();
    @JsProperty(name = "weekday")
    public native String getWeekday();
    @JsProperty(name = "year")
    public native String getYear();
    @JsProperty(name = "day")
    public native void setDay(String value);
    @JsProperty(name = "era")
    public native void setEra(String value);
    @JsProperty(name = "formatMatcher")
    public native void setFormatMatcher(String value);
    @JsProperty(name = "hour")
    public native void setHour(String value);
    @JsProperty(name = "hour12")
    public native void setHour12(Boolean value);
    @JsProperty(name = "localeMatcher")
    public native void setLocaleMatcher(String value);
    @JsProperty(name = "minute")
    public native void setMinute(String value);
    @JsProperty(name = "month")
    public native void setMonth(String value);
    @JsProperty(name = "second")
    public native void setSecond(String value);
    @JsProperty(name = "timeZone")
    public native void setTimeZone(String value);
    @JsProperty(name = "timeZoneName")
    public native void setTimeZoneName(String value);
    @JsProperty(name = "weekday")
    public native void setWeekday(String value);
    @JsProperty(name = "year")
    public native void setYear(String value);
}
