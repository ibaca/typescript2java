package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RegExpExecArray
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 34697
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RegExpExecArray")
public class RegExpExecArray extends Array<String> 
{

    /*
        Constructors
    */
    public RegExpExecArray (String...  items) {
        super((T) null); 
    } 
    public RegExpExecArray () {
        super((T) null); 
    } 

    /** skipped index of type {@link String} because already in type hierarchy */

    /*
        Properties
    */

    public Number index;

    public String input;

    /*
        Methods
    */
    @JsProperty(name = "index")
    public native Number getIndex();
    @JsProperty(name = "input")
    public native String getInput();
    @JsProperty(name = "index")
    public native void setIndex(@DoNotAutobox Number value);
    @JsProperty(name = "input")
    public native void setInput(String value);
}
