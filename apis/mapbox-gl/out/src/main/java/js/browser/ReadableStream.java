package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ReadableStream
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 567541
  * declared in: tsd/browser/lib.es6.d.ts at pos 567682
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ReadableStream")
public class ReadableStream
{

    /*
        Constructors
    */
    public ReadableStream () {
    } 

    /*
        Properties
    */

    public Boolean locked;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@567604
     */
    public native Promise<Void> cancel();
    @JsProperty(name = "locked")
    public native Boolean getLocked();
    /** 
      * tsd/browser/lib.es6.d.ts@567633
     */
    public native ReadableStreamReader getReader();
    @JsProperty(name = "locked")
    public native void setLocked(Boolean value);
}
