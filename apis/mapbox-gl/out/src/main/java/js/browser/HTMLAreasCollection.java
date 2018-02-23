package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLAreasCollection
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 384752
  * declared in: tsd/browser/lib.es6.d.ts at pos 384827
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLAreasCollection")
public class HTMLAreasCollection implements HTMLCollectionBase 
{

    /*
        Constructors
    */
    public HTMLAreasCollection () {
    } 

    /** skipped index of type {@link Element} because already in type hierarchy */

    /*
        Properties
    */

    /** 
      * Sets or retrieves the number of objects in a collection.
     */
    public int length;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.HTMLCollectionBase)
      * inherited from (js.browser.HTMLCollectionBase)
      * inherited from (js.browser.HTMLCollectionBase)
     */
    @JsProperty(name = "length")
    public native Number getLength();
    /** 
      * tsd/browser/lib.es6.d.ts@395009
      * Retrieves an object from various collections.
      * inherited from (js.browser.HTMLCollectionBase)
      * inherited from (js.browser.HTMLCollectionBase)
      * inherited from (js.browser.HTMLCollectionBase)
     */
    public native Element item(@DoNotAutobox Number index);
    /** 
      * inherited from (js.browser.HTMLCollectionBase)
      * inherited from (js.browser.HTMLCollectionBase)
      * inherited from (js.browser.HTMLCollectionBase)
     */
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
