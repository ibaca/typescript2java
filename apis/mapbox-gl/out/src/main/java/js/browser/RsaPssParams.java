package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RsaPssParams
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 740512

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RsaPssParams
{

    /*
        Properties
    */

    public Number saltLength;

    /*
        Methods
    */
    @JsProperty(name = "saltLength")
    public native Number getSaltLength();
    @JsProperty(name = "saltLength")
    public native void setSaltLength(@DoNotAutobox Number value);
}
