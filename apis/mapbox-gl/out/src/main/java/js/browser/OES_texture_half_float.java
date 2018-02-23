package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: OES_texture_half_float
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 537441
  * declared in: tsd/browser/lib.es6.d.ts at pos 537529
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="OES_texture_half_float")
public class OES_texture_half_float
{

    /*
        Constructors
    */
    public OES_texture_half_float () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="OES_texture_half_float", name="HALF_FLOAT_OES")
    public static Number HALF_FLOAT_OES;

    /*
        Properties
    */

    /*
        Methods
    */
    @JsProperty(name = "HALF_FLOAT_OES")
    public native Number getHALF_FLOAT_OES();
    @JsProperty(name = "HALF_FLOAT_OES")
    public native void setHALF_FLOAT_OES(@DoNotAutobox Number value);
}
