package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PerformanceEntry
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 545035
  * declared in: tsd/browser/lib.es6.d.ts at pos 545202
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PerformanceEntry")
public class PerformanceEntry
{

    /*
        Constructors
    */
    public PerformanceEntry () {
    } 

    /*
        Properties
    */

    public Number duration;

    public String entryType;

    public String name;

    public Number startTime;

    /*
        Methods
    */
    @JsProperty(name = "duration")
    public native Number getDuration();
    @JsProperty(name = "entryType")
    public native String getEntryType();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "startTime")
    public native Number getStartTime();
    @JsProperty(name = "duration")
    public native void setDuration(@DoNotAutobox Number value);
    @JsProperty(name = "entryType")
    public native void setEntryType(String value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "startTime")
    public native void setStartTime(@DoNotAutobox Number value);
}
