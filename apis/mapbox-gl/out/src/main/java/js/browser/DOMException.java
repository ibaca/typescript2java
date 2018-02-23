package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DOMException
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 319415
  * declared in: tsd/browser/lib.es6.d.ts at pos 320619
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMException")
public class DOMException
{

    /*
        Constructors
    */
    public DOMException () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="DOMException", name="ABORT_ERR")
    public static Number ABORT_ERR;

    @JsProperty(namespace="DOMException", name="DATA_CLONE_ERR")
    public static Number DATA_CLONE_ERR;

    @JsProperty(namespace="DOMException", name="DOMSTRING_SIZE_ERR")
    public static Number DOMSTRING_SIZE_ERR;

    @JsProperty(namespace="DOMException", name="HIERARCHY_REQUEST_ERR")
    public static Number HIERARCHY_REQUEST_ERR;

    @JsProperty(namespace="DOMException", name="INDEX_SIZE_ERR")
    public static Number INDEX_SIZE_ERR;

    @JsProperty(namespace="DOMException", name="INUSE_ATTRIBUTE_ERR")
    public static Number INUSE_ATTRIBUTE_ERR;

    @JsProperty(namespace="DOMException", name="INVALID_ACCESS_ERR")
    public static Number INVALID_ACCESS_ERR;

    @JsProperty(namespace="DOMException", name="INVALID_CHARACTER_ERR")
    public static Number INVALID_CHARACTER_ERR;

    @JsProperty(namespace="DOMException", name="INVALID_MODIFICATION_ERR")
    public static Number INVALID_MODIFICATION_ERR;

    @JsProperty(namespace="DOMException", name="INVALID_NODE_TYPE_ERR")
    public static Number INVALID_NODE_TYPE_ERR;

    @JsProperty(namespace="DOMException", name="INVALID_STATE_ERR")
    public static Number INVALID_STATE_ERR;

    @JsProperty(namespace="DOMException", name="NAMESPACE_ERR")
    public static Number NAMESPACE_ERR;

    @JsProperty(namespace="DOMException", name="NETWORK_ERR")
    public static Number NETWORK_ERR;

    @JsProperty(namespace="DOMException", name="NOT_FOUND_ERR")
    public static Number NOT_FOUND_ERR;

    @JsProperty(namespace="DOMException", name="NOT_SUPPORTED_ERR")
    public static Number NOT_SUPPORTED_ERR;

    @JsProperty(namespace="DOMException", name="NO_DATA_ALLOWED_ERR")
    public static Number NO_DATA_ALLOWED_ERR;

    @JsProperty(namespace="DOMException", name="NO_MODIFICATION_ALLOWED_ERR")
    public static Number NO_MODIFICATION_ALLOWED_ERR;

    @JsProperty(namespace="DOMException", name="PARSE_ERR")
    public static Number PARSE_ERR;

    @JsProperty(namespace="DOMException", name="QUOTA_EXCEEDED_ERR")
    public static Number QUOTA_EXCEEDED_ERR;

    @JsProperty(namespace="DOMException", name="SECURITY_ERR")
    public static Number SECURITY_ERR;

    @JsProperty(namespace="DOMException", name="SERIALIZE_ERR")
    public static Number SERIALIZE_ERR;

    @JsProperty(namespace="DOMException", name="SYNTAX_ERR")
    public static Number SYNTAX_ERR;

    @JsProperty(namespace="DOMException", name="TIMEOUT_ERR")
    public static Number TIMEOUT_ERR;

    @JsProperty(namespace="DOMException", name="TYPE_MISMATCH_ERR")
    public static Number TYPE_MISMATCH_ERR;

    @JsProperty(namespace="DOMException", name="URL_MISMATCH_ERR")
    public static Number URL_MISMATCH_ERR;

    @JsProperty(namespace="DOMException", name="VALIDATION_ERR")
    public static Number VALIDATION_ERR;

    @JsProperty(namespace="DOMException", name="WRONG_DOCUMENT_ERR")
    public static Number WRONG_DOCUMENT_ERR;

    /*
        Properties
    */

    public Number code;

    public String message;

    public String name;

    /*
        Methods
    */
    @JsProperty(name = "ABORT_ERR")
    public native Number getABORT_ERR();
    @JsProperty(name = "code")
    public native Number getCode();
    @JsProperty(name = "DATA_CLONE_ERR")
    public native Number getDATA_CLONE_ERR();
    @JsProperty(name = "DOMSTRING_SIZE_ERR")
    public native Number getDOMSTRING_SIZE_ERR();
    @JsProperty(name = "HIERARCHY_REQUEST_ERR")
    public native Number getHIERARCHY_REQUEST_ERR();
    @JsProperty(name = "INDEX_SIZE_ERR")
    public native Number getINDEX_SIZE_ERR();
    @JsProperty(name = "INUSE_ATTRIBUTE_ERR")
    public native Number getINUSE_ATTRIBUTE_ERR();
    @JsProperty(name = "INVALID_ACCESS_ERR")
    public native Number getINVALID_ACCESS_ERR();
    @JsProperty(name = "INVALID_CHARACTER_ERR")
    public native Number getINVALID_CHARACTER_ERR();
    @JsProperty(name = "INVALID_MODIFICATION_ERR")
    public native Number getINVALID_MODIFICATION_ERR();
    @JsProperty(name = "INVALID_NODE_TYPE_ERR")
    public native Number getINVALID_NODE_TYPE_ERR();
    @JsProperty(name = "INVALID_STATE_ERR")
    public native Number getINVALID_STATE_ERR();
    @JsProperty(name = "message")
    public native String getMessage();
    @JsProperty(name = "NAMESPACE_ERR")
    public native Number getNAMESPACE_ERR();
    @JsProperty(name = "NETWORK_ERR")
    public native Number getNETWORK_ERR();
    @JsProperty(name = "NOT_FOUND_ERR")
    public native Number getNOT_FOUND_ERR();
    @JsProperty(name = "NOT_SUPPORTED_ERR")
    public native Number getNOT_SUPPORTED_ERR();
    @JsProperty(name = "NO_DATA_ALLOWED_ERR")
    public native Number getNO_DATA_ALLOWED_ERR();
    @JsProperty(name = "NO_MODIFICATION_ALLOWED_ERR")
    public native Number getNO_MODIFICATION_ALLOWED_ERR();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "PARSE_ERR")
    public native Number getPARSE_ERR();
    @JsProperty(name = "QUOTA_EXCEEDED_ERR")
    public native Number getQUOTA_EXCEEDED_ERR();
    @JsProperty(name = "SECURITY_ERR")
    public native Number getSECURITY_ERR();
    @JsProperty(name = "SERIALIZE_ERR")
    public native Number getSERIALIZE_ERR();
    @JsProperty(name = "SYNTAX_ERR")
    public native Number getSYNTAX_ERR();
    @JsProperty(name = "TIMEOUT_ERR")
    public native Number getTIMEOUT_ERR();
    @JsProperty(name = "TYPE_MISMATCH_ERR")
    public native Number getTYPE_MISMATCH_ERR();
    @JsProperty(name = "URL_MISMATCH_ERR")
    public native Number getURL_MISMATCH_ERR();
    @JsProperty(name = "VALIDATION_ERR")
    public native Number getVALIDATION_ERR();
    @JsProperty(name = "WRONG_DOCUMENT_ERR")
    public native Number getWRONG_DOCUMENT_ERR();
    @JsProperty(name = "ABORT_ERR")
    public native void setABORT_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "code")
    public native void setCode(@DoNotAutobox Number value);
    @JsProperty(name = "DATA_CLONE_ERR")
    public native void setDATA_CLONE_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "DOMSTRING_SIZE_ERR")
    public native void setDOMSTRING_SIZE_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "HIERARCHY_REQUEST_ERR")
    public native void setHIERARCHY_REQUEST_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "INDEX_SIZE_ERR")
    public native void setINDEX_SIZE_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "INUSE_ATTRIBUTE_ERR")
    public native void setINUSE_ATTRIBUTE_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "INVALID_ACCESS_ERR")
    public native void setINVALID_ACCESS_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "INVALID_CHARACTER_ERR")
    public native void setINVALID_CHARACTER_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "INVALID_MODIFICATION_ERR")
    public native void setINVALID_MODIFICATION_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "INVALID_NODE_TYPE_ERR")
    public native void setINVALID_NODE_TYPE_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "INVALID_STATE_ERR")
    public native void setINVALID_STATE_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "message")
    public native void setMessage(String value);
    @JsProperty(name = "NAMESPACE_ERR")
    public native void setNAMESPACE_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "NETWORK_ERR")
    public native void setNETWORK_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "NOT_FOUND_ERR")
    public native void setNOT_FOUND_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "NOT_SUPPORTED_ERR")
    public native void setNOT_SUPPORTED_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "NO_DATA_ALLOWED_ERR")
    public native void setNO_DATA_ALLOWED_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "NO_MODIFICATION_ALLOWED_ERR")
    public native void setNO_MODIFICATION_ALLOWED_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "PARSE_ERR")
    public native void setPARSE_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "QUOTA_EXCEEDED_ERR")
    public native void setQUOTA_EXCEEDED_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "SECURITY_ERR")
    public native void setSECURITY_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "SERIALIZE_ERR")
    public native void setSERIALIZE_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "SYNTAX_ERR")
    public native void setSYNTAX_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "TIMEOUT_ERR")
    public native void setTIMEOUT_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "TYPE_MISMATCH_ERR")
    public native void setTYPE_MISMATCH_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "URL_MISMATCH_ERR")
    public native void setURL_MISMATCH_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "VALIDATION_ERR")
    public native void setVALIDATION_ERR(@DoNotAutobox Number value);
    @JsProperty(name = "WRONG_DOCUMENT_ERR")
    public native void setWRONG_DOCUMENT_ERR(@DoNotAutobox Number value);
}
