package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: TouchList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 658887
  * declared in: tsd/browser/lib.es6.d.ts at pos 659021
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TouchList")
public class TouchList
{

    /*
        Constructors
    */
    public TouchList () {
    } 

    @JsOverlay
    public final void setByIndex(int index, Touch value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Touch getByIndex(int index) {
        return (Touch) Js.asArrayLike(this).getAt(index);
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
      * tsd/browser/lib.es6.d.ts@658944
     */
    public native Touch item(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
