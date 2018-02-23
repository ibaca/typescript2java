package js.browser;

import fr.lteconsulting.prebuilt.Function2;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Uint8ArrayConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 95533
  * declared in: tsd/browser/lib.es6.d.ts at pos 222938

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class Uint8ArrayConstructor
{

    /*
        Properties
    */

    /** 
      * The size in bytes of each element in the array.
     */
    public Number BYTES_PER_ELEMENT;

    public Uint8Array prototype;

    /*
        Methods
    */
    public native Uint8Array from(ArrayLike<Number> arrayLike);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@96383
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
     */
    public native Uint8Array from(ArrayLike<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);
    public native Uint8Array from(Iterable<Number> arrayLike);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@223336
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
      * VERSION 1
     */
    public native Uint8Array from(Iterable<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);
    @JsProperty(name = "BYTES_PER_ELEMENT")
    public native Number getBYTES_PER_ELEMENT();
    @JsProperty(name = "prototype")
    public native Uint8Array getPrototype();
    public native Uint8Array of();
    /** 
      * tsd/browser/lib.es6.d.ts@96035
      * Returns a new array from a set of elements.
     */
    public native Uint8Array of(@DoNotAutobox Number...  items);
    @JsProperty(name = "BYTES_PER_ELEMENT")
    public native void setBYTES_PER_ELEMENT(@DoNotAutobox Number value);
    @JsProperty(name = "prototype")
    public native void setPrototype(Uint8Array value);
}
