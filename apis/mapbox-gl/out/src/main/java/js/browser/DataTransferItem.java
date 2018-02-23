package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DataTransferItem
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 324114
  * declared in: tsd/browser/lib.es6.d.ts at pos 324337
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DataTransferItem")
public class DataTransferItem
{

    /*
        Constructors
    */
    public DataTransferItem () {
    } 

    /*
        Properties
    */

    public String kind;

    public String type;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@324203
     */
    public native File getAsFile();
    /** 
      * tsd/browser/lib.es6.d.ts@324233
     */
    public native void getAsString(FunctionStringCallback _callback);
    @JsProperty(name = "kind")
    public native String getKind();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "kind")
    public native void setKind(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@324298
     */
    public native Object webkitGetAsEntry();
}
