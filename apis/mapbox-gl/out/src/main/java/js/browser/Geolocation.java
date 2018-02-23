package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: Geolocation
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 377253
  * declared in: tsd/browser/lib.es6.d.ts at pos 377591
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Geolocation")
public class Geolocation
{

    /*
        Constructors
    */
    public Geolocation () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@377283
     */
    public native void clearWatch(@DoNotAutobox Number watchId);
    public native void getCurrentPosition(PositionCallback successCallback);
    public native void getCurrentPosition(PositionCallback successCallback, PositionErrorCallback errorCallback /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@377322
     */
    public native void getCurrentPosition(PositionCallback successCallback, PositionErrorCallback errorCallback /* optional */, PositionOptions options /* optional */);
    public native Number watchPosition(PositionCallback successCallback);
    public native Number watchPosition(PositionCallback successCallback, PositionErrorCallback errorCallback /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@377453
     */
    public native Number watchPosition(PositionCallback successCallback, PositionErrorCallback errorCallback /* optional */, PositionOptions options /* optional */);
}
