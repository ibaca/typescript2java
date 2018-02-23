package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PerformanceNavigation
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 545598
  * declared in: tsd/browser/lib.es6.d.ts at pos 545876
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PerformanceNavigation")
public class PerformanceNavigation
{

    /*
        Constructors
    */
    public PerformanceNavigation () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="PerformanceNavigation", name="TYPE_BACK_FORWARD")
    public static Number TYPE_BACK_FORWARD;

    @JsProperty(namespace="PerformanceNavigation", name="TYPE_NAVIGATE")
    public static Number TYPE_NAVIGATE;

    @JsProperty(namespace="PerformanceNavigation", name="TYPE_RELOAD")
    public static Number TYPE_RELOAD;

    @JsProperty(namespace="PerformanceNavigation", name="TYPE_RESERVED")
    public static Number TYPE_RESERVED;

    /*
        Properties
    */

    public Number redirectCount;

    public Number type;

    /*
        Methods
    */
    @JsProperty(name = "redirectCount")
    public native Number getRedirectCount();
    @JsProperty(name = "TYPE_BACK_FORWARD")
    public native Number getTYPE_BACK_FORWARD();
    @JsProperty(name = "TYPE_NAVIGATE")
    public native Number getTYPE_NAVIGATE();
    @JsProperty(name = "TYPE_RELOAD")
    public native Number getTYPE_RELOAD();
    @JsProperty(name = "TYPE_RESERVED")
    public native Number getTYPE_RESERVED();
    @JsProperty(name = "type")
    public native Number getType();
    @JsProperty(name = "redirectCount")
    public native void setRedirectCount(@DoNotAutobox Number value);
    @JsProperty(name = "TYPE_BACK_FORWARD")
    public native void setTYPE_BACK_FORWARD(@DoNotAutobox Number value);
    @JsProperty(name = "TYPE_NAVIGATE")
    public native void setTYPE_NAVIGATE(@DoNotAutobox Number value);
    @JsProperty(name = "TYPE_RELOAD")
    public native void setTYPE_RELOAD(@DoNotAutobox Number value);
    @JsProperty(name = "TYPE_RESERVED")
    public native void setTYPE_RESERVED(@DoNotAutobox Number value);
    @JsProperty(name = "type")
    public native void setType(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@545701
     */
    public native Object toJSON();
}
