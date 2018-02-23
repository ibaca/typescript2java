package js.browser;

import fr.lteconsulting.prebuilt.Function2;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Uint8ClampedArrayConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 108714
  * declared in: tsd/browser/lib.es6.d.ts at pos 224067

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class Uint8ClampedArrayConstructor
{

    /*
        Properties
    */

    /** 
      * The size in bytes of each element in the array.
     */
    public Number BYTES_PER_ELEMENT;

    public Uint8ClampedArray prototype;

    /*
        Methods
    */
    public native Uint8ClampedArray from(ArrayLike<Number> arrayLike);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@109606
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
     */
    public native Uint8ClampedArray from(ArrayLike<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);
    public native Uint8ClampedArray from(Iterable<Number> arrayLike);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@224480
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
      * VERSION 1
     */
    public native Uint8ClampedArray from(Iterable<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);
    @JsProperty(name = "BYTES_PER_ELEMENT")
    public native Number getBYTES_PER_ELEMENT();
    @JsProperty(name = "prototype")
    public native Uint8ClampedArray getPrototype();
    public native Uint8ClampedArray of();
    /** 
      * tsd/browser/lib.es6.d.ts@109251
      * Returns a new array from a set of elements.
     */
    public native Uint8ClampedArray of(@DoNotAutobox Number...  items);
    @JsProperty(name = "BYTES_PER_ELEMENT")
    public native void setBYTES_PER_ELEMENT(@DoNotAutobox Number value);
    @JsProperty(name = "prototype")
    public native void setPrototype(Uint8ClampedArray value);
}
