package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSStream
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 513697
  * declared in: tsd/browser/lib.es6.d.ts at pos 513809
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSStream")
public class MSStream
{

    /*
        Constructors
    */
    public MSStream () {
    } 

    /*
        Properties
    */

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "type")
    public native String getType();
    /** 
      * tsd/browser/lib.es6.d.ts@513751
     */
    public native void msClose();
    /** 
      * tsd/browser/lib.es6.d.ts@513772
     */
    public native Object msDetachStream();
    @JsProperty(name = "type")
    public native void setType(String value);
}
