package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: PluginArray
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 549571
  * declared in: tsd/browser/lib.es6.d.ts at pos 549776
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PluginArray")
public class PluginArray
{

    /*
        Constructors
    */
    public PluginArray () {
    } 

    @JsOverlay
    public final void setByIndex(int index, Plugin value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Plugin getByIndex(int index) {
        return (Plugin) Js.asArrayLike(this).getAt(index);
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
      * tsd/browser/lib.es6.d.ts@549630
     */
    public native Plugin item(@DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@549663
     */
    public native Plugin namedItem(String name);
    public native void refresh();
    /** 
      * tsd/browser/lib.es6.d.ts@549700
     */
    public native void refresh(Boolean reload /* optional */);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
