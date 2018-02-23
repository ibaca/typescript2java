package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: HTMLCollectionBase
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 394790
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface HTMLCollectionBase
{

    @JsOverlay
    default void setByIndex(int index, Element value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    default Element getByIndex(int index) {
        return (Element) Js.asArrayLike(this).getAt(index);
    }

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.HTMLCollectionBase)
      * inherited from (js.browser.HTMLCollectionBase)
      * inherited from (js.browser.HTMLCollectionBase)
     */
    @JsProperty(name = "length")
    Number getLength();
    /** 
      * tsd/browser/lib.es6.d.ts@395009
      * Retrieves an object from various collections.
      * inherited from (js.browser.HTMLCollectionBase)
      * inherited from (js.browser.HTMLCollectionBase)
      * inherited from (js.browser.HTMLCollectionBase)
     */
    Element item(@DoNotAutobox Number index);
    /** 
      * inherited from (js.browser.HTMLCollectionBase)
      * inherited from (js.browser.HTMLCollectionBase)
      * inherited from (js.browser.HTMLCollectionBase)
     */
    @JsProperty(name = "length")
    void setLength(@DoNotAutobox Number value);
}
