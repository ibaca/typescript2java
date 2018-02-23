package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Blob
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 293012
  * declared in: tsd/browser/lib.es6.d.ts at pos 293216
  * 3 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Blob")
public class Blob
{

    /*
        Constructors
    */
    public Blob (Array<Object> blobParts /* optional */, BlobPropertyBag options /* optional */) {
    } 
    public Blob (Array<Object> blobParts /* optional */) {
    } 
    public Blob () {
    } 

    /*
        Properties
    */

    public int size;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "size")
    public native Number getSize();
    @JsProperty(name = "type")
    public native String getType();
    /** 
      * tsd/browser/lib.es6.d.ts@293089
     */
    public native void msClose();
    /** 
      * tsd/browser/lib.es6.d.ts@293110
     */
    public native Object msDetachStream();
    @JsProperty(name = "size")
    public native void setSize(@DoNotAutobox Number value);
    @JsProperty(name = "type")
    public native void setType(String value);
    public native Blob slice();
    public native Blob slice(@DoNotAutobox Number start /* optional */);
    public native Blob slice(@DoNotAutobox Number start /* optional */, @DoNotAutobox Number end /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@293137
     */
    public native Blob slice(@DoNotAutobox Number start /* optional */, @DoNotAutobox Number end /* optional */, String contentType /* optional */);
}
