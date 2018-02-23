package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ProcessingInstruction
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 551967
  * declared in: tsd/browser/lib.es6.d.ts at pos 552068
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ProcessingInstruction")
public class ProcessingInstruction extends CharacterData 
{

    /*
        Constructors
    */
    public ProcessingInstruction () {
    } 

    /*
        Properties
    */

    public String target;

    /*
        Methods
    */
    @JsProperty(name = "target")
    public native String getTarget();
    @JsProperty(name = "target")
    public native void setTarget(String value);
}
