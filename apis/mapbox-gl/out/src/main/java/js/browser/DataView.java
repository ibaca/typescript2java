package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DataView
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 64087
  * declared in: tsd/browser/lib.es6.d.ts at pos 70425
  * declared in: tsd/browser/lib.es6.d.ts at pos 253007
  * 3 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DataView")
public class DataView
{

    /*
        Constructors
    */
    public DataView (ArrayBuffer buffer, @DoNotAutobox Number byteOffset /* optional */, @DoNotAutobox Number byteLength /* optional */) {
    } 
    public DataView (ArrayBuffer buffer, @DoNotAutobox Number byteOffset /* optional */) {
    } 
    public DataView (ArrayBuffer buffer) {
    } 

    /*
        Properties
    */

    // skipped property __@toStringTag
    public ArrayBuffer buffer;

    public Number byteLength;

    public Number byteOffset;

    /*
        Methods
    */
    @JsProperty(name = "buffer")
    public native ArrayBuffer getBuffer();
    @JsProperty(name = "byteLength")
    public native Number getByteLength();
    @JsProperty(name = "byteOffset")
    public native Number getByteOffset();
    public native Number getFloat32(@DoNotAutobox Number byteOffset);
    /** 
      * tsd/browser/lib.es6.d.ts@64501
      * Gets the Float32 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getFloat32(@DoNotAutobox Number byteOffset, Boolean littleEndian /* optional */);
    public native Number getFloat64(@DoNotAutobox Number byteOffset);
    /** 
      * tsd/browser/lib.es6.d.ts@64857
      * Gets the Float64 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getFloat64(@DoNotAutobox Number byteOffset, Boolean littleEndian /* optional */);
    public native Number getInt16(@DoNotAutobox Number byteOffset);
    /** 
      * tsd/browser/lib.es6.d.ts@65537
      * Gets the Int16 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getInt16(@DoNotAutobox Number byteOffset, Boolean littleEndian /* optional */);
    public native Number getInt32(@DoNotAutobox Number byteOffset);
    /** 
      * tsd/browser/lib.es6.d.ts@65888
      * Gets the Int32 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getInt32(@DoNotAutobox Number byteOffset, Boolean littleEndian /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@65210
      * Gets the Int8 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getInt8(@DoNotAutobox Number byteOffset);
    public native Number getUint16(@DoNotAutobox Number byteOffset);
    /** 
      * tsd/browser/lib.es6.d.ts@66569
      * Gets the Uint16 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getUint16(@DoNotAutobox Number byteOffset, Boolean littleEndian /* optional */);
    public native Number getUint32(@DoNotAutobox Number byteOffset);
    /** 
      * tsd/browser/lib.es6.d.ts@66923
      * Gets the Uint32 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getUint32(@DoNotAutobox Number byteOffset, Boolean littleEndian /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@66240
      * Gets the Uint8 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getUint8(@DoNotAutobox Number byteOffset);
    // skipped method get___at_toStringTag
    @JsProperty(name = "buffer")
    public native void setBuffer(ArrayBuffer value);
    @JsProperty(name = "byteLength")
    public native void setByteLength(@DoNotAutobox Number value);
    @JsProperty(name = "byteOffset")
    public native void setByteOffset(@DoNotAutobox Number value);
    public native void setFloat32(@DoNotAutobox Number byteOffset, @DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@67368
      * Stores an Float32 value at the specified byte offset from the start of the view.
     */
    public native void setFloat32(@DoNotAutobox Number byteOffset, @DoNotAutobox Number value, Boolean littleEndian /* optional */);
    public native void setFloat64(@DoNotAutobox Number byteOffset, @DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@67827
      * Stores an Float64 value at the specified byte offset from the start of the view.
     */
    public native void setFloat64(@DoNotAutobox Number byteOffset, @DoNotAutobox Number value, Boolean littleEndian /* optional */);
    public native void setInt16(@DoNotAutobox Number byteOffset, @DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@68565
      * Stores an Int16 value at the specified byte offset from the start of the view.
     */
    public native void setInt16(@DoNotAutobox Number byteOffset, @DoNotAutobox Number value, Boolean littleEndian /* optional */);
    public native void setInt32(@DoNotAutobox Number byteOffset, @DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@69020
      * Stores an Int32 value at the specified byte offset from the start of the view.
     */
    public native void setInt32(@DoNotAutobox Number byteOffset, @DoNotAutobox Number value, Boolean littleEndian /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@68135
      * Stores an Int8 value at the specified byte offset from the start of the view.
     */
    public native void setInt8(@DoNotAutobox Number byteOffset, @DoNotAutobox Number value);
    public native void setUint16(@DoNotAutobox Number byteOffset, @DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@69759
      * Stores an Uint16 value at the specified byte offset from the start of the view.
     */
    public native void setUint16(@DoNotAutobox Number byteOffset, @DoNotAutobox Number value, Boolean littleEndian /* optional */);
    public native void setUint32(@DoNotAutobox Number byteOffset, @DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@70216
      * Stores an Uint32 value at the specified byte offset from the start of the view.
     */
    public native void setUint32(@DoNotAutobox Number byteOffset, @DoNotAutobox Number value, Boolean littleEndian /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@69327
      * Stores an Uint8 value at the specified byte offset from the start of the view.
     */
    public native void setUint8(@DoNotAutobox Number byteOffset, @DoNotAutobox Number value);
    // skipped method set___at_toStringTag
}
