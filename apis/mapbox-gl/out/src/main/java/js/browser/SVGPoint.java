package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGPoint
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 619444
  * declared in: tsd/browser/lib.es6.d.ts at pos 619561
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPoint")
public class SVGPoint
{

    /*
        Constructors
    */
    public SVGPoint () {
    } 

    /*
        Properties
    */

    public Number x;

    public Number y;

    /*
        Methods
    */
    @JsProperty(name = "x")
    public native Number getX();
    @JsProperty(name = "y")
    public native Number getY();
    /** 
      * tsd/browser/lib.es6.d.ts@619501
     */
    public native SVGPoint matrixTransform(SVGMatrix matrix);
    @JsProperty(name = "x")
    public native void setX(@DoNotAutobox Number value);
    @JsProperty(name = "y")
    public native void setY(@DoNotAutobox Number value);
}
