package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSApp
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 500546
  * declared in: tsd/browser/lib.es6.d.ts at pos 501642
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface MSApp
{

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@500570
     */
    MSAppAsyncOperation clearTemporaryWebDataAsync();
    /** 
      * tsd/browser/lib.es6.d.ts@500625
     */
    Blob createBlobFromRandomAccessStream(String type, Object seeker);
    /** 
      * tsd/browser/lib.es6.d.ts@500696
     */
    Object createDataPackage(Object object);
    /** 
      * tsd/browser/lib.es6.d.ts@500737
     */
    Object createDataPackageFromSelection();
    /** 
      * tsd/browser/lib.es6.d.ts@500780
     */
    File createFileFromStorageFile(Object storageFile);
    /** 
      * tsd/browser/lib.es6.d.ts@500835
     */
    MSStream createStreamFromInputStream(String type, Object inputStream);
    void execAsyncAtPriority(MSExecAtPriorityFunctionCallback asynchronousCallback, String priority);
    /** 
      * tsd/browser/lib.es6.d.ts@500910
     */
    void execAsyncAtPriority(MSExecAtPriorityFunctionCallback asynchronousCallback, String priority, Object...  args);
    Object execAtPriority(MSExecAtPriorityFunctionCallback synchronousCallback, String priority);
    /** 
      * tsd/browser/lib.es6.d.ts@501031
     */
    Object execAtPriority(MSExecAtPriorityFunctionCallback synchronousCallback, String priority, Object...  args);
    @JsProperty(name = "CURRENT")
    String getCURRENT();
    /** 
      * tsd/browser/lib.es6.d.ts@501145
     */
    String getCurrentPriority();
    @JsProperty(name = "HIGH")
    String getHIGH();
    /** 
      * tsd/browser/lib.es6.d.ts@501179
     */
    Promise<Object> getHtmlPrintDocumentSourceAsync(Object htmlDoc);
    @JsProperty(name = "IDLE")
    String getIDLE();
    @JsProperty(name = "NORMAL")
    String getNORMAL();
    /** 
      * tsd/browser/lib.es6.d.ts@501244
     */
    Object getViewId(Object view);
    /** 
      * tsd/browser/lib.es6.d.ts@501275
     */
    Boolean isTaskScheduledAtPriorityOrHigher(String priority);
    /** 
      * tsd/browser/lib.es6.d.ts@501341
     */
    void pageHandlesAllApplicationActivations(Boolean enabled);
    @JsProperty(name = "CURRENT")
    void setCURRENT(String value);
    @JsProperty(name = "HIGH")
    void setHIGH(String value);
    @JsProperty(name = "IDLE")
    void setIDLE(String value);
    @JsProperty(name = "NORMAL")
    void setNORMAL(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@501407
     */
    void suppressSubdownloadCredentialPrompts(Boolean suppress);
    /** 
      * tsd/browser/lib.es6.d.ts@501474
     */
    void terminateApp(Object exceptionObject);
}
