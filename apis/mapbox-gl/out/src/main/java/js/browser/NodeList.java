package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: NodeList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 535459
  * declared in: tsd/browser/lib.es6.d.ts at pos 535583
  * declared in: tsd/browser/lib.es6.d.ts at pos 784605
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NodeList")
public class NodeList
{

    /*
        Constructors
    */
    public NodeList () {
    } 

    @JsOverlay
    public final void setByIndex(int index, Node value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Node getByIndex(int index) {
        return (Node) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public int length;

    /*
        Methods
    */
    // skipped method ___at_iterator
    @JsProperty(name = "length")
    public native Number getLength();
    /** 
      * tsd/browser/lib.es6.d.ts@535515
     */
    public native Node item(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
