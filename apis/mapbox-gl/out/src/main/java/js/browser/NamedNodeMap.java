package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: NamedNodeMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 529110
  * declared in: tsd/browser/lib.es6.d.ts at pos 529554
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NamedNodeMap")
public class NamedNodeMap
{

    /*
        Constructors
    */
    public NamedNodeMap () {
    } 

    @JsOverlay
    public final void setByIndex(int index, Attr value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Attr getByIndex(int index) {
        return (Attr) Js.asArrayLike(this).getAt(index);
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
      * tsd/browser/lib.es6.d.ts@529170
     */
    public native Attr getNamedItem(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@529208
     */
    public native Attr getNamedItemNS(String namespaceURI, String localName);
    /** 
      * tsd/browser/lib.es6.d.ts@529289
     */
    public native Attr item(@DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@529320
     */
    public native Attr removeNamedItem(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@529361
     */
    public native Attr removeNamedItemNS(String namespaceURI, String localName);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@529445
     */
    public native Attr setNamedItem(Attr arg);
    /** 
      * tsd/browser/lib.es6.d.ts@529480
     */
    public native Attr setNamedItemNS(Attr arg);
}
