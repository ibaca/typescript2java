package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: Headers
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 489200
  * declared in: tsd/browser/lib.es6.d.ts at pos 489475
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Headers")
public class Headers
{

    /*
        Constructors
    */
    public Headers (Object init /* optional */) {
    } 
    public Headers () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@489226
     */
    public native void append(String name, String value);
    /** 
      * tsd/browser/lib.es6.d.ts@489273
     */
    public native void delete(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@489305
     */
    public native void forEach(ForEachCallback callback);
    /** 
      * tsd/browser/lib.es6.d.ts@489351
     */
    public native String get(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@489389
     */
    public native Boolean has(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@489421
     */
    public native void set(String name, String value);
}
