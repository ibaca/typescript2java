package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: FileList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 374658
  * declared in: tsd/browser/lib.es6.d.ts at pos 374782
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="FileList")
public class FileList
{

    /*
        Constructors
    */
    public FileList () {
    } 

    @JsOverlay
    public final void setByIndex(int index, File value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final File getByIndex(int index) {
        return (File) Js.asArrayLike(this).getAt(index);
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
      * tsd/browser/lib.es6.d.ts@374714
     */
    public native File item(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
