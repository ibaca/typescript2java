package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: DataTransferItemList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 324421
  * declared in: tsd/browser/lib.es6.d.ts at pos 324679
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DataTransferItemList")
public class DataTransferItemList
{

    /*
        Constructors
    */
    public DataTransferItemList () {
    } 

    @JsOverlay
    public final void setByIndex(int index, DataTransferItem value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final DataTransferItem getByIndex(int index) {
        return (DataTransferItem) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public int length;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@324489
     */
    public native DataTransferItem add(File data);
    /** 
      * tsd/browser/lib.es6.d.ts@324535
     */
    public native void clear();
    @JsProperty(name = "length")
    public native Number getLength();
    /** 
      * tsd/browser/lib.es6.d.ts@324554
     */
    public native DataTransferItem item(@DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@324597
     */
    public native void remove(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
