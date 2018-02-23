package js.browser;

import fr.lteconsulting.prebuilt.Function2;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Int8ArrayConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 82484
  * declared in: tsd/browser/lib.es6.d.ts at pos 221831

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class Int8ArrayConstructor
{

    /*
        Properties
    */

    /** 
      * The size in bytes of each element in the array.
     */
    public Number BYTES_PER_ELEMENT;

    public Int8Array prototype;

    /*
        Methods
    */
    public native Int8Array from(ArrayLike<Number> arrayLike);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@83327
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
     */
    public native Int8Array from(ArrayLike<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);
    public native Int8Array from(Iterable<Number> arrayLike);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@222227
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
      * VERSION 1
     */
    public native Int8Array from(Iterable<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);
    @JsProperty(name = "BYTES_PER_ELEMENT")
    public native Number getBYTES_PER_ELEMENT();
    @JsProperty(name = "prototype")
    public native Int8Array getPrototype();
    public native Int8Array of();
    /** 
      * tsd/browser/lib.es6.d.ts@82980
      * Returns a new array from a set of elements.
     */
    public native Int8Array of(@DoNotAutobox Number...  items);
    @JsProperty(name = "BYTES_PER_ELEMENT")
    public native void setBYTES_PER_ELEMENT(@DoNotAutobox Number value);
    @JsProperty(name = "prototype")
    public native void setPrototype(Int8Array value);
}
