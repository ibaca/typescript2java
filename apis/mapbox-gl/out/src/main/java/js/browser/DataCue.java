package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DataCue
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 323311
  * declared in: tsd/browser/lib.es6.d.ts at pos 323661
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DataCue")
public class DataCue extends TextTrackCue 
{

    /*
        Constructors
    */
    public DataCue () {
        super((Number) null, (Number) null, (String) null); 
    } 

    /*
        Properties
    */

    public ArrayBuffer data;

    /*
        Methods
    */
    @JsProperty(name = "data")
    public native ArrayBuffer getData();
    @JsProperty(name = "data")
    public native void setData(ArrayBuffer value);
}
