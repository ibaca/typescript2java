package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: MSRangeCollection
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 513273
  * declared in: tsd/browser/lib.es6.d.ts at pos 513408
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSRangeCollection")
public class MSRangeCollection
{

    /*
        Constructors
    */
    public MSRangeCollection () {
    } 

    @JsOverlay
    public final void setByIndex(int index, Range value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Range getByIndex(int index) {
        return (Range) Js.asArrayLike(this).getAt(index);
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
      * tsd/browser/lib.es6.d.ts@513338
     */
    public native Range item(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
