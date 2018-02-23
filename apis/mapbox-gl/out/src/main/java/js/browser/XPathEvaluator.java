package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: XPathEvaluator
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 719460
  * declared in: tsd/browser/lib.es6.d.ts at pos 719791
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XPathEvaluator")
public class XPathEvaluator
{

    /*
        Constructors
    */
    public XPathEvaluator () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@719493
     */
    public native XPathExpression createExpression(String expression, XPathNSResolver resolver);
    public native XPathNSResolver createNSResolver();
    /** 
      * tsd/browser/lib.es6.d.ts@719579
     */
    public native XPathNSResolver createNSResolver(Node nodeResolver /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@719639
     */
    public native XPathResult evaluate(String expression, Node contextNode, XPathNSResolver resolver, @DoNotAutobox Number type, XPathResult result);
}
