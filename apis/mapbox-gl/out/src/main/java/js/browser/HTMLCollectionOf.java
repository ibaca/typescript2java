package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLCollectionOf
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 739136
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLCollectionOf")
public class HTMLCollectionOf<T extends Element> extends HTMLCollection 
{

    /*
        Constructors
    */
    public HTMLCollectionOf () {
    } 

    /** skipped index of type {@link Element} because already in type hierarchy */

    /*
        Properties
    */

    /** 
      * Sets or retrieves the number of objects in a collection.
     */
    public int length;

}
