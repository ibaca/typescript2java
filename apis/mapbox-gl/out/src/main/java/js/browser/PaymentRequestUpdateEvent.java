package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: PaymentRequestUpdateEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 542409
  * declared in: tsd/browser/lib.es6.d.ts at pos 542527
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PaymentRequestUpdateEvent")
public class PaymentRequestUpdateEvent extends Event 
{

    /*
        Constructors
    */
    public PaymentRequestUpdateEvent (String type, PaymentRequestUpdateEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public PaymentRequestUpdateEvent (String type) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@542467
     */
    public native void updateWith(Promise<PaymentDetails> d);
}
