package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: MediaList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 519816
  * declared in: tsd/browser/lib.es6.d.ts at pos 520078
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaList")
public class MediaList
{

    /*
        Constructors
    */
    public MediaList () {
    } 

    @JsOverlay
    public final void setByIndex(int index, String value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final String getByIndex(int index) {
        return (String) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public int length;

    public String mediaText;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@519896
     */
    public native void appendMedium(String newMedium);
    /** 
      * tsd/browser/lib.es6.d.ts@519939
     */
    public native void deleteMedium(String oldMedium);
    @JsProperty(name = "length")
    public native Number getLength();
    @JsProperty(name = "mediaText")
    public native String getMediaText();
    /** 
      * tsd/browser/lib.es6.d.ts@519982
     */
    public native String item(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    @JsProperty(name = "mediaText")
    public native void setMediaText(String value);
}
