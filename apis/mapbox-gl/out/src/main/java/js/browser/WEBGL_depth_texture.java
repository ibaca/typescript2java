package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WEBGL_depth_texture
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 664177
  * declared in: tsd/browser/lib.es6.d.ts at pos 664271
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WEBGL_depth_texture")
public class WEBGL_depth_texture
{

    /*
        Constructors
    */
    public WEBGL_depth_texture () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="WEBGL_depth_texture", name="UNSIGNED_INT_24_8_WEBGL")
    public static Number UNSIGNED_INT_24_8_WEBGL;

    /*
        Properties
    */

    /*
        Methods
    */
    @JsProperty(name = "UNSIGNED_INT_24_8_WEBGL")
    public native Number getUNSIGNED_INT_24_8_WEBGL();
    @JsProperty(name = "UNSIGNED_INT_24_8_WEBGL")
    public native void setUNSIGNED_INT_24_8_WEBGL(@DoNotAutobox Number value);
}
