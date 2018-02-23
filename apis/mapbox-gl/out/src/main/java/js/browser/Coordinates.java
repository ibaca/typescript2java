package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Coordinates
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 318049
  * declared in: tsd/browser/lib.es6.d.ts at pos 318339
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Coordinates")
public class Coordinates
{

    /*
        Constructors
    */
    public Coordinates () {
    } 

    /*
        Properties
    */

    public Number accuracy;

    public Number altitude;

    public Number altitudeAccuracy;

    public Number heading;

    public Number latitude;

    public Number longitude;

    public Number speed;

    /*
        Methods
    */
    @JsProperty(name = "accuracy")
    public native Number getAccuracy();
    @JsProperty(name = "altitude")
    public native Number getAltitude();
    @JsProperty(name = "altitudeAccuracy")
    public native Number getAltitudeAccuracy();
    @JsProperty(name = "heading")
    public native Number getHeading();
    @JsProperty(name = "latitude")
    public native Number getLatitude();
    @JsProperty(name = "longitude")
    public native Number getLongitude();
    @JsProperty(name = "speed")
    public native Number getSpeed();
    @JsProperty(name = "accuracy")
    public native void setAccuracy(@DoNotAutobox Number value);
    @JsProperty(name = "altitude")
    public native void setAltitude(@DoNotAutobox Number value);
    @JsProperty(name = "altitudeAccuracy")
    public native void setAltitudeAccuracy(@DoNotAutobox Number value);
    @JsProperty(name = "heading")
    public native void setHeading(@DoNotAutobox Number value);
    @JsProperty(name = "latitude")
    public native void setLatitude(@DoNotAutobox Number value);
    @JsProperty(name = "longitude")
    public native void setLongitude(@DoNotAutobox Number value);
    @JsProperty(name = "speed")
    public native void setSpeed(@DoNotAutobox Number value);
}
