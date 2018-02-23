package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: ClientRectList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 315384
  * declared in: tsd/browser/lib.es6.d.ts at pos 315526
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ClientRectList")
public class ClientRectList
{

    /*
        Constructors
    */
    public ClientRectList () {
    } 

    @JsOverlay
    public final void setByIndex(int index, ClientRect value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final ClientRect getByIndex(int index) {
        return (ClientRect) Js.asArrayLike(this).getAt(index);
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
    /** 
      * tsd/browser/lib.es6.d.ts@315446
     */
    public native ClientRect item(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
