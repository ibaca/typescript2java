package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WEBGL_debug_renderer_info
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 663832
  * declared in: tsd/browser/lib.es6.d.ts at pos 663976
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WEBGL_debug_renderer_info")
public class WEBGL_debug_renderer_info
{

    /*
        Constructors
    */
    public WEBGL_debug_renderer_info () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="WEBGL_debug_renderer_info", name="UNMASKED_RENDERER_WEBGL")
    public static Number UNMASKED_RENDERER_WEBGL;

    @JsProperty(namespace="WEBGL_debug_renderer_info", name="UNMASKED_VENDOR_WEBGL")
    public static Number UNMASKED_VENDOR_WEBGL;

    /*
        Properties
    */

    /*
        Methods
    */
    @JsProperty(name = "UNMASKED_RENDERER_WEBGL")
    public native Number getUNMASKED_RENDERER_WEBGL();
    @JsProperty(name = "UNMASKED_VENDOR_WEBGL")
    public native Number getUNMASKED_VENDOR_WEBGL();
    @JsProperty(name = "UNMASKED_RENDERER_WEBGL")
    public native void setUNMASKED_RENDERER_WEBGL(@DoNotAutobox Number value);
    @JsProperty(name = "UNMASKED_VENDOR_WEBGL")
    public native void setUNMASKED_VENDOR_WEBGL(@DoNotAutobox Number value);
}
