package js.browser;

import fr.lteconsulting.prebuilt.Action3;
import fr.lteconsulting.prebuilt.Function2;
import fr.lteconsulting.prebuilt.Function3;
import fr.lteconsulting.prebuilt.Function4;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: Float32Array
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 162065
  * declared in: tsd/browser/lib.es6.d.ts at pos 175125
  * declared in: tsd/browser/lib.es6.d.ts at pos 229042
  * declared in: tsd/browser/lib.es6.d.ts at pos 254887
  * source type: Float32Array
  * flags: TypeParameter (16384)
  * declared in: tsd/browser/lib.es6.d.ts at pos 162065
  * declared in: tsd/browser/lib.es6.d.ts at pos 175125
  * declared in: tsd/browser/lib.es6.d.ts at pos 229042
  * declared in: tsd/browser/lib.es6.d.ts at pos 254887
  * 6 constructors
  * A typed array of 32-bit float values. The contents are initialized to 0. If the requested number
  * of bytes could not be allocated an exception is raised.
  * A typed array of 32-bit float values. The contents are initialized to 0. If the requested number
  * of bytes could not be allocated an exception is raised.
  * A typed array of 32-bit float values. The contents are initialized to 0. If the requested number
  * of bytes could not be allocated an exception is raised.
  * A typed array of 32-bit float values. The contents are initialized to 0. If the requested number
  * of bytes could not be allocated an exception is raised.
  * A typed array of 32-bit float values. The contents are initialized to 0. If the requested number
  * of bytes could not be allocated an exception is raised.
  * A typed array of 32-bit float values. The contents are initialized to 0. If the requested number
  * of bytes could not be allocated an exception is raised.
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Float32Array")
public class Float32Array
{

    /*
        Constructors
    */
    public Float32Array (@DoNotAutobox Number length) {
    } 
    public Float32Array (ArrayLike<Number> array) {
    } 
    public Float32Array (ArrayBuffer buffer, @DoNotAutobox Number byteOffset /* optional */, @DoNotAutobox Number length /* optional */) {
    } 
    public Float32Array (Iterable<Number> elements) {
    } 
    public Float32Array (ArrayBuffer buffer, @DoNotAutobox Number byteOffset /* optional */) {
    } 
    public Float32Array (ArrayBuffer buffer) {
    } 

    @JsOverlay
    public final void setByIndex(int index, @DoNotAutobox Number value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Number getByIndex(int index) {
        return (Number) Js.asArrayLike(this).getAt(index);
    }

    /*
        Static properties
    */

    /** 
      * The size in bytes of each element in the array.
     */
    @JsProperty(namespace="Float32Array", name="BYTES_PER_ELEMENT")
    public static Number BYTES_PER_ELEMENT;

    /*
        Static methods
    */

    /** 
      * Returns a new array from a set of elements.
      * source : tsd/browser/lib.es6.d.ts:174652
     */
    @JsMethod(namespace="Float32Array", name = "of")
    public static native Float32Array of(@DoNotAutobox Number...  items);

    /** 
      * thisArg is java.lang.Object
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
      * source : tsd/browser/lib.es6.d.ts:175002
     */
    @JsMethod(namespace="Float32Array", name = "from")
    public static native Float32Array from(ArrayLike<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);

    /** 
      * thisArg is java.lang.Object
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
      * source : tsd/browser/lib.es6.d.ts:175002
      * source : tsd/browser/lib.es6.d.ts:230042
     */
    @JsMethod(namespace="Float32Array", name = "from")
    public static native Float32Array from(Iterable<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);

    @JsMethod(namespace="Float32Array", name = "of")
    public static native Float32Array of();

    @JsMethod(namespace="Float32Array", name = "from")
    public static native Float32Array from(ArrayLike<Number> arrayLike);

    @JsMethod(namespace="Float32Array", name = "from")
    public static native Float32Array from(Iterable<Number> arrayLike);

    /*
        Properties
    */

    // skipped property __@toStringTag
    /** 
      * The ArrayBuffer instance referenced by the array.
     */
    public ArrayBuffer buffer;

    /** 
      * The length in bytes of the array.
     */
    public Number byteLength;

    /** 
      * The offset in bytes of the array.
     */
    public Number byteOffset;

    /** 
      * The length of the array.
     */
    public int length;

    /*
        Methods
    */
    // skipped method ___at_iterator
    public native Float32Array copyWithin(@DoNotAutobox Number target, @DoNotAutobox Number start);
    /** 
      * tsd/browser/lib.es6.d.ts@163193
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
     */
    public native Float32Array copyWithin(@DoNotAutobox Number target, @DoNotAutobox Number start, @DoNotAutobox Number end /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@229386
      * Returns an array of key, value pairs for every entry in the array
     */
    public native IterableIterator<Tuple<Number, Number>> entries();
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@163756
      * Determines whether all the members of an array satisfy the specified test.
     */
    public native Boolean every(Function3<Number, Number, Float32Array, Boolean> callbackfn);
    public native Float32Array fill(@DoNotAutobox Number value);
    public native Float32Array fill(@DoNotAutobox Number value, @DoNotAutobox Number start /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@164321
      * Returns the this object after filling the section identified by start and end with value
     */
    public native Float32Array fill(@DoNotAutobox Number value, @DoNotAutobox Number start /* optional */, @DoNotAutobox Number end /* optional */);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@164833
      * Returns the elements of an array that meet the condition specified in a callback function.
     */
    public native Float32Array filter(Function3<Number, Number, Float32Array, Object> callbackfn);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@165520
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
     */
    public native Number find(Function3<Number, Number, Array<Number>, Boolean> predicate);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@166209
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
     */
    public native Number findIndex(Function3<Number, Number, Array<Number>, Boolean> predicate);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@166733
      * Performs the specified action for each element in an array.
     */
    public native void forEach(Action3<Number, Number, Float32Array> callbackfn);
    @JsProperty(name = "BYTES_PER_ELEMENT")
    public native Number getBYTES_PER_ELEMENT();
    @JsProperty(name = "buffer")
    public native ArrayBuffer getBuffer();
    @JsProperty(name = "byteLength")
    public native Number getByteLength();
    @JsProperty(name = "byteOffset")
    public native Number getByteOffset();
    @JsProperty(name = "length")
    public native Number getLength();
    // skipped method get___at_toStringTag
    public native Number indexOf(@DoNotAutobox Number searchElement);
    /** 
      * tsd/browser/lib.es6.d.ts@167130
      * Returns the index of the first occurrence of a value in an array.
     */
    public native Number indexOf(@DoNotAutobox Number searchElement, @DoNotAutobox Number fromIndex /* optional */);
    public native String join();
    /** 
      * tsd/browser/lib.es6.d.ts@167480
      * Adds all the elements of an array separated by the specified separator string.
     */
    public native String join(String separator /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@229500
      * Returns an list of keys in the array
     */
    public native IterableIterator<Number> keys();
    public native Number lastIndexOf(@DoNotAutobox Number searchElement);
    /** 
      * tsd/browser/lib.es6.d.ts@167806
      * Returns the index of the last occurrence of a value in an array.
     */
    public native Number lastIndexOf(@DoNotAutobox Number searchElement, @DoNotAutobox Number fromIndex /* optional */);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@168430
      * Calls a defined callback function on each element of an array, and returns an array that
      * contains the results.
     */
    public native Float32Array map(Function3<Number, Number, Float32Array, Number> callbackfn);
    public native Number reduce(Function4<Number, Number, Number, Float32Array, Number> callbackfn);
    /** 
      * tsd/browser/lib.es6.d.ts@169205
      * Calls the specified callback function for all the elements in an array. The return value of
      * the callback function is the accumulated result, and is provided as an argument in the next
      * call to the callback function.
      * Calls the specified callback function for all the elements in an array. The return value of
      * the callback function is the accumulated result, and is provided as an argument in the next
      * call to the callback function.
     */
    public native Number reduce(Function4<Number, Number, Number, Float32Array, Number> callbackfn, @DoNotAutobox Number initialValue /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@170022
      * Calls the specified callback function for all the elements in an array. The return value of
      * the callback function is the accumulated result, and is provided as an argument in the next
      * call to the callback function.
      * Calls the specified callback function for all the elements in an array. The return value of
      * the callback function is the accumulated result, and is provided as an argument in the next
      * call to the callback function.
      * VERSION 1
     */
    public native <U> U reduce(Function4<U, Number, Number, Float32Array, U> callbackfn, @DoNotAutobox U initialValue);
    public native Number reduceRight(Function4<Number, Number, Number, Float32Array, Number> callbackfn);
    /** 
      * tsd/browser/lib.es6.d.ts@170847
      * Calls the specified callback function for all the elements in an array, in descending order.
      * The return value of the callback function is the accumulated result, and is provided as an
      * argument in the next call to the callback function.
      * Calls the specified callback function for all the elements in an array, in descending order.
      * The return value of the callback function is the accumulated result, and is provided as an
      * argument in the next call to the callback function.
     */
    public native Number reduceRight(Function4<Number, Number, Number, Float32Array, Number> callbackfn, @DoNotAutobox Number initialValue /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@171695
      * Calls the specified callback function for all the elements in an array, in descending order.
      * The return value of the callback function is the accumulated result, and is provided as an
      * argument in the next call to the callback function.
      * Calls the specified callback function for all the elements in an array, in descending order.
      * The return value of the callback function is the accumulated result, and is provided as an
      * argument in the next call to the callback function.
      * VERSION 1
     */
    public native <U> U reduceRight(Function4<U, Number, Number, Float32Array, U> callbackfn, @DoNotAutobox U initialValue);
    /** 
      * tsd/browser/lib.es6.d.ts@171898
      * Reverses the elements in an Array.
     */
    public native Float32Array reverse();
    /** 
      * tsd/browser/lib.es6.d.ts@172083
      * Sets a value or an array of values.
      * Sets a value or an array of values.
     */
    public native void set(@DoNotAutobox Number index, @DoNotAutobox Number value);
    public native void set(ArrayLike<Number> array);
    /** 
      * tsd/browser/lib.es6.d.ts@172346
      * Sets a value or an array of values.
      * Sets a value or an array of values.
      * VERSION 1
     */
    public native void set(ArrayLike<Number> array, @DoNotAutobox Number offset /* optional */);
    @JsProperty(name = "BYTES_PER_ELEMENT")
    public native void setBYTES_PER_ELEMENT(@DoNotAutobox Number value);
    @JsProperty(name = "buffer")
    public native void setBuffer(ArrayBuffer value);
    @JsProperty(name = "byteLength")
    public native void setByteLength(@DoNotAutobox Number value);
    @JsProperty(name = "byteOffset")
    public native void setByteOffset(@DoNotAutobox Number value);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    // skipped method set___at_toStringTag
    public native Float32Array slice();
    public native Float32Array slice(@DoNotAutobox Number start /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@172601
      * Returns a section of an array.
     */
    public native Float32Array slice(@DoNotAutobox Number start /* optional */, @DoNotAutobox Number end /* optional */);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@173168
      * Determines whether the specified callback function returns true for any element of an array.
     */
    public native Boolean some(Function3<Number, Number, Float32Array, Boolean> callbackfn);
    public native Float32Array sort();
    /** 
      * tsd/browser/lib.es6.d.ts@173496
      * Sorts an array.
     */
    public native Float32Array sort(Function2<Number, Number, Number> compareFn /* optional */);
    public native Float32Array subarray(@DoNotAutobox Number begin);
    /** 
      * tsd/browser/lib.es6.d.ts@173846
      * Gets a new Float32Array view of the ArrayBuffer store for this array, referencing the elements
      * at begin, inclusive, up to end, exclusive.
     */
    public native Float32Array subarray(@DoNotAutobox Number begin, @DoNotAutobox Number end /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@173988
      * Converts a number to a string by using the current locale.
     */
    public native String toLocaleString();
    /** 
      * tsd/browser/lib.es6.d.ts@229603
      * Returns an list of values in the array
     */
    public native IterableIterator<Number> values();
}
