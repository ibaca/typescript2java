package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: Enumerator
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 782111
  * declared in: tsd/browser/lib.es6.d.ts at pos 783058
  * 1 constructors
  * Allows enumerating over a COM collection, which may not have indexed item access.
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Enumerator")
public class Enumerator<T>
{

    /*
        Constructors
    */
    public Enumerator (Object collection) {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@782396
      * Returns true if the current item is the last one in the collection, or the collection is empty,
      * or the current item is undefined.
     */
    public native Boolean atEnd();
    /** 
      * tsd/browser/lib.es6.d.ts@782485
      * Returns the current item in the collection
     */
    public native T item();
    /** 
      * tsd/browser/lib.es6.d.ts@782671
      * Resets the current item in the collection to the first item. If there are no items in the collection,
      * the current item is set to undefined.
     */
    public native void moveFirst();
    /** 
      * tsd/browser/lib.es6.d.ts@782900
      * Moves the current item to the next item in the collection. If the enumerator is at the end of
      * the collection or the collection is empty, the current item is set to undefined.
     */
    public native void moveNext();
}
