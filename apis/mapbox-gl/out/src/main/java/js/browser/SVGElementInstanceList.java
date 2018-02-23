package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGElementInstanceList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 578076
  * declared in: tsd/browser/lib.es6.d.ts at pos 578201
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGElementInstanceList")
public class SVGElementInstanceList
{

    /*
        Constructors
    */
    public SVGElementInstanceList () {
    } 

    /*
        Properties
    */

    public int length;

    /*
        Methods
    */
    @JsProperty(name = "length")
    public native Number getLength();
    /** 
      * tsd/browser/lib.es6.d.ts@578146
     */
    public native SVGElementInstance item(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
