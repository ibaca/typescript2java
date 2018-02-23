package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RsaOtherPrimesInfo
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 742790

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RsaOtherPrimesInfo
{

    /*
        Properties
    */

    public String d;

    public String r;

    public String t;

    /*
        Methods
    */
    @JsProperty(name = "d")
    public native String getD();
    @JsProperty(name = "r")
    public native String getR();
    @JsProperty(name = "t")
    public native String getT();
    @JsProperty(name = "d")
    public native void setD(String value);
    @JsProperty(name = "r")
    public native void setR(String value);
    @JsProperty(name = "t")
    public native void setT(String value);
}
