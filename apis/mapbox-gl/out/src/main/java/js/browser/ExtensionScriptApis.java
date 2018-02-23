package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: ExtensionScriptApis
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 373613
  * declared in: tsd/browser/lib.es6.d.ts at pos 374165
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ExtensionScriptApis")
public class ExtensionScriptApis
{

    /*
        Constructors
    */
    public ExtensionScriptApis () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@373651
     */
    public native Number extensionIdToShortId(String extensionId);
    /** 
      * tsd/browser/lib.es6.d.ts@373706
     */
    public native void fireExtensionApiTelemetry(String functionName, Boolean isSucceeded, Boolean isSupported);
    public native void genericFunction(Object routerAddress);
    public native void genericFunction(Object routerAddress, String parameters /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@373809
     */
    public native void genericFunction(Object routerAddress, String parameters /* optional */, @DoNotAutobox Number callbackId /* optional */);
    public native String genericSynchronousFunction(@DoNotAutobox Number functionId);
    /** 
      * tsd/browser/lib.es6.d.ts@373898
     */
    public native String genericSynchronousFunction(@DoNotAutobox Number functionId, String parameters /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@373979
     */
    public native String getExtensionId();
    /** 
      * tsd/browser/lib.es6.d.ts@374009
     */
    public native void registerGenericFunctionCallbackHandler(Object callbackHandler);
    /** 
      * tsd/browser/lib.es6.d.ts@374081
     */
    public native void registerGenericPersistentCallbackHandler(Object callbackHandler);
}
