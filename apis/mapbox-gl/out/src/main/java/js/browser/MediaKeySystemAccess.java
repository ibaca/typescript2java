package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaKeySystemAccess
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 519319
  * declared in: tsd/browser/lib.es6.d.ts at pos 519496
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaKeySystemAccess")
public class MediaKeySystemAccess
{

    /*
        Constructors
    */
    public MediaKeySystemAccess () {
    } 

    /*
        Properties
    */

    public String keySystem;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@519390
     */
    public native Promise<MediaKeys> createMediaKeys();
    /** 
      * tsd/browser/lib.es6.d.ts@519433
     */
    public native MediaKeySystemConfiguration getConfiguration();
    @JsProperty(name = "keySystem")
    public native String getKeySystem();
    @JsProperty(name = "keySystem")
    public native void setKeySystem(String value);
}
