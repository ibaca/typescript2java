package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: VBArray
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 783093
  * declared in: tsd/browser/lib.es6.d.ts at pos 784286
  * 1 constructors
  * Enables reading from a COM safe array, which might have an alternate lower bound, or multiple dimensions.
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="VBArray")
public class VBArray<T>
{

    /*
        Constructors
    */
    public VBArray (Object safeArray) {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@783306
      * Returns the number of dimensions (1-based).
     */
    public native Number dimensions();
    public native T getItem(@DoNotAutobox Number dimension1Index);
    /** 
      * tsd/browser/lib.es6.d.ts@783456
      * Takes an index for each dimension in the array, and returns the item at the corresponding location.
     */
    public native T getItem(@DoNotAutobox Number dimension1Index, @DoNotAutobox Number...  dimensionNIndexes);
    public native Number lbound();
    /** 
      * tsd/browser/lib.es6.d.ts@783671
      * Returns the smallest available index for a given dimension.
     */
    public native Number lbound(@DoNotAutobox Number dimension /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@784141
      * Returns a Javascript array with all the elements in the VBArray. If there are multiple dimensions,
      * each successive dimension is appended to the end of the array.
      * Example: [[1,2,3],[4,5,6]] becomes [1,2,3,4,5,6]
     */
    public native Array<T> toArray();
    public native Number ubound();
    /** 
      * tsd/browser/lib.es6.d.ts@783852
      * Returns the largest available index for a given dimension.
     */
    public native Number ubound(@DoNotAutobox Number dimension /* optional */);
}
