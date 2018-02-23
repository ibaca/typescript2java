package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DataTransfer
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 323718
  * declared in: tsd/browser/lib.es6.d.ts at pos 324042
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DataTransfer")
public class DataTransfer
{

    /*
        Constructors
    */
    public DataTransfer () {
    } 

    /*
        Properties
    */

    public String dropEffect;

    public String effectAllowed;

    public FileList files;

    public DataTransferItemList items;

    public Array<String> types;

    /*
        Methods
    */
    public native Boolean clearData();
    /** 
      * tsd/browser/lib.es6.d.ts@323902
     */
    public native Boolean clearData(String format /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@323943
     */
    public native String getData(String format);
    @JsProperty(name = "dropEffect")
    public native String getDropEffect();
    @JsProperty(name = "effectAllowed")
    public native String getEffectAllowed();
    @JsProperty(name = "files")
    public native FileList getFiles();
    @JsProperty(name = "items")
    public native DataTransferItemList getItems();
    @JsProperty(name = "types")
    public native Array<String> getTypes();
    /** 
      * tsd/browser/lib.es6.d.ts@323980
     */
    public native Boolean setData(String format, String data);
    @JsProperty(name = "dropEffect")
    public native void setDropEffect(String value);
    @JsProperty(name = "effectAllowed")
    public native void setEffectAllowed(String value);
    @JsProperty(name = "files")
    public native void setFiles(FileList value);
    @JsProperty(name = "items")
    public native void setItems(DataTransferItemList value);
    @JsProperty(name = "types")
    public native void setTypes(Array<String> value);
}
