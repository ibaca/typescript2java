package js.browser;

import fr.lteconsulting.prebuilt.Action3;
import fr.lteconsulting.prebuilt.Function3;
import fr.lteconsulting.prebuilt.Function4;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: ReadonlyArray
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 39966
  * declared in: tsd/browser/lib.es6.d.ts at pos 208215
  * declared in: tsd/browser/lib.es6.d.ts at pos 219070
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface ReadonlyArray<T>
{

    @JsOverlay
    default void setByIndex(int index, @DoNotAutobox T value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    default T getByIndex(int index) {
        return (T) Js.asArrayLike(this).getAt(index);
    }

    /*
        Methods
    */
    // skipped method ___at_iterator
    <U> Array<T> concat();
    /** 
      * tsd/browser/lib.es6.d.ts@40523
      * Combines two or more arrays.
      * Combines two or more arrays.
      * Combines two or more arrays.
     */
    <U> Array<T> concat(@DoNotAutobox U...  items);
    /** 
      * tsd/browser/lib.es6.d.ts@40704
      * Combines two or more arrays.
      * Combines two or more arrays.
      * Combines two or more arrays.
      * VERSION 1
     */
    Array<T> concat(Array<T>...  items);
    /** 
      * tsd/browser/lib.es6.d.ts@40859
      * Combines two or more arrays.
      * Combines two or more arrays.
      * Combines two or more arrays.
      * VERSION 2
     */
    Array<T> concat(UnionOfArrayOfTAndT<T>...  items);
    /** 
      * tsd/browser/lib.es6.d.ts@219264
      * Returns an array of key, value pairs for every entry in the array
     */
    IterableIterator<Tuple<Number, T>> entries();
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@42639
      * Determines whether all the members of an array satisfy the specified test.
     */
    Boolean every(Function3<T, Number, ReadonlyArray<T>, Boolean> callbackfn);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@44828
      * Returns the elements of an array that meet the condition specified in a callback function.
      * Returns the elements of an array that meet the condition specified in a callback function.
     */
    <S> Array<S> filter(Function3<T, Number, ReadonlyArray<T>, Boolean> callbackfn);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@208803
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
     */
    T find(Function3<T, Number, ReadonlyArray<T>, Boolean> predicate);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@209465
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
     */
    Number findIndex(Function3<T, Number, Array<T>, Boolean> predicate);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@43740
      * Performs the specified action for each element in an array.
     */
    void forEach(Action3<T, Number, ReadonlyArray<T>> callbackfn);
    @JsProperty(name = "length")
    Number getLength();
    Number indexOf(@DoNotAutobox T searchElement);
    /** 
      * tsd/browser/lib.es6.d.ts@41736
      * Returns the index of the first occurrence of a value in an array.
     */
    Number indexOf(@DoNotAutobox T searchElement, @DoNotAutobox Number fromIndex /* optional */);
    String join();
    /** 
      * tsd/browser/lib.es6.d.ts@41176
      * Adds all the elements of an array separated by the specified separator string.
     */
    String join(String separator /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@219374
      * Returns an list of keys in the array
     */
    IterableIterator<Number> keys();
    Number lastIndexOf(@DoNotAutobox T searchElement);
    /** 
      * tsd/browser/lib.es6.d.ts@42105
      * Returns the index of the last occurrence of a specified value in an array.
     */
    Number lastIndexOf(@DoNotAutobox T searchElement, @DoNotAutobox Number fromIndex /* optional */);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@44297
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
     */
    <U> Array<U> map(Function3<T, Number, ReadonlyArray<T>, U> callbackfn);
    T reduce(Function4<T, T, Number, ReadonlyArray<T>, T> callbackfn);
    /** 
      * tsd/browser/lib.es6.d.ts@46109
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
     */
    T reduce(Function4<T, T, Number, ReadonlyArray<T>, T> callbackfn, @DoNotAutobox T initialValue /* optional */);
    T reduceRight(Function4<T, T, Number, ReadonlyArray<T>, T> callbackfn);
    /** 
      * tsd/browser/lib.es6.d.ts@47647
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
     */
    T reduceRight(Function4<T, T, Number, ReadonlyArray<T>, T> callbackfn, @DoNotAutobox T initialValue /* optional */);
    @JsProperty(name = "length")
    void setLength(@DoNotAutobox Number value);
    Array<T> slice();
    Array<T> slice(@DoNotAutobox Number start /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@41410
      * Returns a section of an array.
     */
    Array<T> slice(@DoNotAutobox Number start /* optional */, @DoNotAutobox Number end /* optional */);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@43236
      * Determines whether the specified callback function returns true for any element of an array.
     */
    Boolean some(Function3<T, Number, ReadonlyArray<T>, Boolean> callbackfn);
    /** 
      * tsd/browser/lib.es6.d.ts@40372
     */
    String toLocaleString();
    /** 
      * tsd/browser/lib.es6.d.ts@219478
      * Returns an list of values in the array
     */
    IterableIterator<T> values();
}
