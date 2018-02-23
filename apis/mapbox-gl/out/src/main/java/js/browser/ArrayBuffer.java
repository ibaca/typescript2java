package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ArrayBuffer
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 63046
  * declared in: tsd/browser/lib.es6.d.ts at pos 63751
  * declared in: tsd/browser/lib.es6.d.ts at pos 252651
  * 1 constructors
  * Represents a raw buffer of binary data, which is used to store data for the
  * different typed arrays. ArrayBuffers cannot be read from or written to directly,
  * but can be passed to a typed array or DataView Object to interpret the raw
  * buffer as needed.
  * Represents a raw buffer of binary data, which is used to store data for the 
  * different typed arrays. ArrayBuffers cannot be read from or written to directly, 
  * but can be passed to a typed array or DataView Object to interpret the raw 
  * buffer as needed. 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ArrayBuffer")
public class ArrayBuffer
{

    /*
        Constructors
    */
    public ArrayBuffer (@DoNotAutobox Number byteLength) {
    } 

    /*
        Static methods
    */

    /** 
      * source : tsd/browser/lib.es6.d.ts:63694
     */
    @JsMethod(namespace="ArrayBuffer", name = "isView")
    public static native Boolean isView(Object arg);

    /*
        Properties
    */

    // skipped property __@toStringTag
    /** 
      * Read-only. The length of the ArrayBuffer (in bytes).
     */
    public Number byteLength;

    /*
        Methods
    */
    @JsProperty(name = "byteLength")
    public native Number getByteLength();
    // skipped method get___at_toStringTag
    @JsProperty(name = "byteLength")
    public native void setByteLength(@DoNotAutobox Number value);
    // skipped method set___at_toStringTag
    public native ArrayBuffer slice(@DoNotAutobox Number begin);
    /** 
      * tsd/browser/lib.es6.d.ts@63525
      * Returns a section of an ArrayBuffer.
     */
    public native ArrayBuffer slice(@DoNotAutobox Number begin, @DoNotAutobox Number end /* optional */);
}
