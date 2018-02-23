package js.browser;

import fr.lteconsulting.prebuilt.Function2;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ArrayConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 60235
  * declared in: tsd/browser/lib.es6.d.ts at pos 197672
  * declared in: tsd/browser/lib.es6.d.ts at pos 218480

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ArrayConstructor
{
    /** SKIPPED CALL SIGNATURE ! */
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public Array<Object> prototype;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@198228
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
      * VERSION 1
     */
    public native <T> Array<T> from(ArrayLike<T> arrayLike);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@197990
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
     */
    public native <T, U> Array<U> from(ArrayLike<T> arrayLike, Function2<T, Number, U> mapfn);
    /** 
      * tsd/browser/lib.es6.d.ts@219027
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
      * VERSION 3
     */
    public native <T> Array<T> from(Iterable<T> iterable);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@218793
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
      * VERSION 2
     */
    public native <T, U> Array<U> from(Iterable<T> iterable, Function2<T, Number, U> mapfn);
    @JsProperty(name = "prototype")
    public native Array<Object> getPrototype();
    /** 
      * tsd/browser/lib.es6.d.ts@60484
     */
    public native Boolean isArray(Object arg);
    public native <T> Array<T> of();
    /** 
      * tsd/browser/lib.es6.d.ts@198421
      * Returns a new array from a set of elements.
     */
    public native <T> Array<T> of(@DoNotAutobox T...  items);
    @JsProperty(name = "prototype")
    public native void setPrototype(Array<Object> value);
}
