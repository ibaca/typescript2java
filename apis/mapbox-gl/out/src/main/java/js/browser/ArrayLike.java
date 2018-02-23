package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: ArrayLike
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 62533

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ArrayLike<T>
{

    @JsOverlay
    public final void setByIndex(int index, @DoNotAutobox T value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final T getByIndex(int index) {
        return (T) Js.asArrayLike(this).getAt(index);
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
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
