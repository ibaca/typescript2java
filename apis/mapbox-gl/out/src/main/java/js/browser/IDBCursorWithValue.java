package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBCursorWithValue
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 490594
  * declared in: tsd/browser/lib.es6.d.ts at pos 490684
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBCursorWithValue")
public class IDBCursorWithValue extends IDBCursor 
{

    /*
        Constructors
    */
    public IDBCursorWithValue () {
    } 

    /*
        Properties
    */

    public Object value;

    /*
        Methods
    */
    @JsProperty(name = "value")
    public native Object getValue();
    @JsProperty(name = "value")
    public native void setValue(Object value);
}
