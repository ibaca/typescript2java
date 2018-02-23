package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: LongRunningScriptDetectedEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 500273
  * declared in: tsd/browser/lib.es6.d.ts at pos 500420
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="LongRunningScriptDetectedEvent")
public class LongRunningScriptDetectedEvent extends Event 
{

    /*
        Constructors
    */
    public LongRunningScriptDetectedEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Number executionTime;

    public Boolean stopPageScriptExecution;

    /*
        Methods
    */
    @JsProperty(name = "executionTime")
    public native Number getExecutionTime();
    @JsProperty(name = "stopPageScriptExecution")
    public native Boolean getStopPageScriptExecution();
    @JsProperty(name = "executionTime")
    public native void setExecutionTime(@DoNotAutobox Number value);
    @JsProperty(name = "stopPageScriptExecution")
    public native void setStopPageScriptExecution(Boolean value);
}
