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
  * source type: Array
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 48601
  * declared in: tsd/browser/lib.es6.d.ts at pos 60574
  * declared in: tsd/browser/lib.es6.d.ts at pos 195218
  * declared in: tsd/browser/lib.es6.d.ts at pos 218048
  * declared in: tsd/browser/lib.es6.d.ts at pos 246448
  * source type: Array
  * flags: TypeParameter (16384)
  * declared in: tsd/browser/lib.es6.d.ts at pos 48601
  * declared in: tsd/browser/lib.es6.d.ts at pos 60574
  * declared in: tsd/browser/lib.es6.d.ts at pos 195218
  * declared in: tsd/browser/lib.es6.d.ts at pos 218048
  * declared in: tsd/browser/lib.es6.d.ts at pos 246448
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Array")
public class Array<T>
{

    /*
        Constructors
    */
    public Array (@DoNotAutobox T...  items) {
    } 
    public Array () {
    } 

    @JsOverlay
    public final void setByIndex(int index, @DoNotAutobox T value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final T getByIndex(int index) {
        return (T) Js.asArrayLike(this).getAt(index);
    }

    /*
        Static methods
    */

    /** 
      * source : tsd/browser/lib.es6.d.ts:60484
     */
    @JsMethod(namespace="Array", name = "isArray")
    public static native <T> Boolean isArray(Object arg);

    /** 
      * thisArg is java.lang.Object
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
      * source : tsd/browser/lib.es6.d.ts:197990
     */
    @JsMethod(namespace="Array", name = "from")
    public static native <T, U> Array<U> from(ArrayLike<T> arrayLike, Function2<T, Number, U> mapfn);

    /** 
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
      * source : tsd/browser/lib.es6.d.ts:197990
      * source : tsd/browser/lib.es6.d.ts:198228
     */
    @JsMethod(namespace="Array", name = "from")
    public static native <T> Array<T> from(ArrayLike<T> arrayLike);

    /** 
      * thisArg is java.lang.Object
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
      * source : tsd/browser/lib.es6.d.ts:197990
      * source : tsd/browser/lib.es6.d.ts:198228
      * source : tsd/browser/lib.es6.d.ts:218793
     */
    @JsMethod(namespace="Array", name = "from")
    public static native <T, U> Array<U> from(Iterable<T> iterable, Function2<T, Number, U> mapfn);

    /** 
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
      * source : tsd/browser/lib.es6.d.ts:197990
      * source : tsd/browser/lib.es6.d.ts:198228
      * source : tsd/browser/lib.es6.d.ts:218793
      * source : tsd/browser/lib.es6.d.ts:219027
     */
    @JsMethod(namespace="Array", name = "from")
    public static native <T> Array<T> from(Iterable<T> iterable);

    /** 
      * Returns a new array from a set of elements.
      * source : tsd/browser/lib.es6.d.ts:198421
     */
    @JsMethod(namespace="Array", name = "of")
    public static native <T> Array<T> of(@DoNotAutobox T...  items);

    @JsMethod(namespace="Array", name = "of")
    public static native <T> Array<T> of();

    /*
        Properties
    */

    /** 
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
     */
    public int length;

    /*
        Methods
    */
    // skipped method ___at_iterator
    // skipped method ___at_unscopables
    public native Array<T> concat();
    public native Array<T> concat(@DoNotAutobox T...  items);
    /** 
      * tsd/browser/lib.es6.d.ts@49317
      * Combines two or more arrays.
      * Combines two or more arrays.
     */
    public native Array<T> concat(Array<T>...  items);
    /** 
      * tsd/browser/lib.es6.d.ts@49472
      * Combines two or more arrays.
      * Combines two or more arrays.
      * VERSION 1
     */
    public native Array<T> concat(UnionOfArrayOfTAndT<T>...  items);
    public native Array<T> copyWithin(@DoNotAutobox Number target, @DoNotAutobox Number start);
    /** 
      * tsd/browser/lib.es6.d.ts@197608
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
     */
    public native Array<T> copyWithin(@DoNotAutobox Number target, @DoNotAutobox Number start, @DoNotAutobox Number end /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@218234
      * Returns an array of key, value pairs for every entry in the array
     */
    public native IterableIterator<Tuple<Number, T>> entries();
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@52692
      * Determines whether all the members of an array satisfy the specified test.
     */
    public native Boolean every(Function3<T, Number, Array<T>, Boolean> callbackfn);
    public native Array<T> fill(@DoNotAutobox T value);
    public native Array<T> fill(@DoNotAutobox T value, @DoNotAutobox Number start /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@197034
      * Returns the this object after filling the section identified by start and end with value
     */
    public native Array<T> fill(@DoNotAutobox T value, @DoNotAutobox Number start /* optional */, @DoNotAutobox Number end /* optional */);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@57093
      * Returns the elements of an array that meet the condition specified in a callback function.
     */
    public native Array<T> filter(Function3<T, Number, Array<T>, Object> callbackfn);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@195818
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
     */
    public native T find(Function3<T, Number, Array<T>, Boolean> predicate);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@196492
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
     */
    public native Number findIndex(Function3<T, Number, Array<T>, Boolean> predicate);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@53767
      * Performs the specified action for each element in an array.
     */
    public native void forEach(Action3<T, Number, Array<T>> callbackfn);
    @JsProperty(name = "length")
    public native Number getLength();
    public native Number indexOf(@DoNotAutobox T searchElement);
    /** 
      * tsd/browser/lib.es6.d.ts@51790
      * Returns the index of the first occurrence of a value in an array.
     */
    public native Number indexOf(@DoNotAutobox T searchElement, @DoNotAutobox Number fromIndex /* optional */);
    public native String join();
    /** 
      * tsd/browser/lib.es6.d.ts@49789
      * Adds all the elements of an array separated by the specified separator string.
     */
    public native String join(String separator /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@218344
      * Returns an list of keys in the array
     */
    public native IterableIterator<Number> keys();
    public native Number lastIndexOf(@DoNotAutobox T searchElement);
    /** 
      * tsd/browser/lib.es6.d.ts@52158
      * Returns the index of the last occurrence of a specified value in an array.
     */
    public native Number lastIndexOf(@DoNotAutobox T searchElement, @DoNotAutobox Number fromIndex /* optional */);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@54311
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
     */
    public native <U> TupleOf5<U, U, U, U, U> map(Function3<T, Number, Array<T>, U> callbackfn);
    /** 
      * tsd/browser/lib.es6.d.ts@49170
      * Removes the last element from an array and returns it.
     */
    public native T pop();
    public native Number push();
    /** 
      * tsd/browser/lib.es6.d.ts@49057
      * Appends new elements to an array, and returns the new length of the array.
     */
    public native Number push(@DoNotAutobox T...  items);
    public native T reduce(Function4<T, T, Number, Array<T>, T> callbackfn);
    /** 
      * tsd/browser/lib.es6.d.ts@57804
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
     */
    public native T reduce(Function4<T, T, Number, Array<T>, T> callbackfn, @DoNotAutobox T initialValue /* optional */);
    public native T reduceRight(Function4<T, T, Number, Array<T>, T> callbackfn);
    /** 
      * tsd/browser/lib.es6.d.ts@59316
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
     */
    public native T reduceRight(Function4<T, T, Number, Array<T>, T> callbackfn, @DoNotAutobox T initialValue /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@49887
      * Reverses the elements in an Array.
     */
    public native Array<T> reverse();
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@49988
      * Removes the first element from an array and returns it.
     */
    public native T shift();
    public native Array<T> slice();
    public native Array<T> slice(@DoNotAutobox Number start /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@50212
      * Returns a section of an array.
     */
    public native Array<T> slice(@DoNotAutobox Number start /* optional */, @DoNotAutobox Number end /* optional */);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@53276
      * Determines whether the specified callback function returns true for any element of an array.
     */
    public native Boolean some(Function3<T, Number, Array<T>, Boolean> callbackfn);
    public native Array<T> sort();
    /** 
      * tsd/browser/lib.es6.d.ts@50467
      * Sorts an array.
     */
    public native Array<T> sort(Function2<T, T, Number> compareFn /* optional */);
    public native Array<T> splice(@DoNotAutobox Number start);
    /** 
      * tsd/browser/lib.es6.d.ts@50821
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
     */
    public native Array<T> splice(@DoNotAutobox Number start, @DoNotAutobox Number deleteCount /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@51266
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * VERSION 1
     */
    public native Array<T> splice(@DoNotAutobox Number start, @DoNotAutobox Number deleteCount, @DoNotAutobox T...  items);
    /** 
      * tsd/browser/lib.es6.d.ts@48879
     */
    public native String toLocaleString();
    public native Number unshift();
    /** 
      * tsd/browser/lib.es6.d.ts@51474
      * Inserts new elements at the start of an array.
     */
    public native Number unshift(@DoNotAutobox T...  items);
    /** 
      * tsd/browser/lib.es6.d.ts@218448
      * Returns an list of values in the array
     */
    public native IterableIterator<T> values();
}
