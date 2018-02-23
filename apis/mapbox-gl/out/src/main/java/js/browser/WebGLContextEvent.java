package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WebGLContextEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 665658
  * declared in: tsd/browser/lib.es6.d.ts at pos 665754
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebGLContextEvent")
public class WebGLContextEvent extends Event 
{

    /*
        Constructors
    */
    public WebGLContextEvent (String typeArg, WebGLContextEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public WebGLContextEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public String statusMessage;

    /*
        Methods
    */
    @JsProperty(name = "statusMessage")
    public native String getStatusMessage();
    @JsProperty(name = "statusMessage")
    public native void setStatusMessage(String value);
}
