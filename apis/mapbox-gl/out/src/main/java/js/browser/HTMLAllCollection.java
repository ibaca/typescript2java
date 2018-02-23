package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: HTMLAllCollection
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 377660
  * declared in: tsd/browser/lib.es6.d.ts at pos 377892
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLAllCollection")
public class HTMLAllCollection
{

    /*
        Constructors
    */
    public HTMLAllCollection () {
    } 

    @JsOverlay
    public final void setByIndex(int index, Element value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Element getByIndex(int index) {
        return (Element) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public int length;

    /*
        Methods
    */
    @JsProperty(name = "length")
    public native Number getLength();
    public native UnionOfElementAndHTMLCollection item();
    /** 
      * tsd/browser/lib.es6.d.ts@377725
     */
    public native UnionOfElementAndHTMLCollection item(String nameOrIndex /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@377790
     */
    public native UnionOfElementAndHTMLCollection namedItem(String name);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
