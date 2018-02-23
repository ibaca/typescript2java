package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSTransportDiagnosticsStats
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 265197

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSTransportDiagnosticsStats implements RTCStats 
{

    /*
        Properties
    */

    public Number allocationTimeInMs;

    public String baseAddress;

    public MSNetworkInterfaceType baseInterface;

    public String iceRole;

    public MSIceWarningFlags iceWarningFlags;

    public String id;

    public MSNetworkInterfaceType interfaces;

    public String localAddrType;

    public String localAddress;

    public MSNetworkInterfaceType localInterface;

    public String localMR;

    public Number localMRTCPPort;

    public String localSite;

    public String msRtcEngineVersion;

    public String msType;

    public String networkName;

    public Number numConsentReqReceived;

    public Number numConsentReqSent;

    public Number numConsentRespReceived;

    public Number numConsentRespSent;

    public Number portRangeMax;

    public Number portRangeMin;

    public String protocol;

    public String remoteAddrType;

    public String remoteAddress;

    public String remoteMR;

    public Number remoteMRTCPPort;

    public String remoteSite;

    public Boolean rtpRtcpMux;

    public Number stunVer;

    public Number timestamp;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "allocationTimeInMs")
    public native Number getAllocationTimeInMs();
    @JsProperty(name = "baseAddress")
    public native String getBaseAddress();
    @JsProperty(name = "baseInterface")
    public native MSNetworkInterfaceType getBaseInterface();
    @JsProperty(name = "iceRole")
    public native String getIceRole();
    @JsProperty(name = "iceWarningFlags")
    public native MSIceWarningFlags getIceWarningFlags();
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "id")
    public native String getId();
    @JsProperty(name = "interfaces")
    public native MSNetworkInterfaceType getInterfaces();
    @JsProperty(name = "localAddrType")
    public native String getLocalAddrType();
    @JsProperty(name = "localAddress")
    public native String getLocalAddress();
    @JsProperty(name = "localInterface")
    public native MSNetworkInterfaceType getLocalInterface();
    @JsProperty(name = "localMR")
    public native String getLocalMR();
    @JsProperty(name = "localMRTCPPort")
    public native Number getLocalMRTCPPort();
    @JsProperty(name = "localSite")
    public native String getLocalSite();
    @JsProperty(name = "msRtcEngineVersion")
    public native String getMsRtcEngineVersion();
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "msType")
    public native String getMsType();
    @JsProperty(name = "networkName")
    public native String getNetworkName();
    @JsProperty(name = "numConsentReqReceived")
    public native Number getNumConsentReqReceived();
    @JsProperty(name = "numConsentReqSent")
    public native Number getNumConsentReqSent();
    @JsProperty(name = "numConsentRespReceived")
    public native Number getNumConsentRespReceived();
    @JsProperty(name = "numConsentRespSent")
    public native Number getNumConsentRespSent();
    @JsProperty(name = "portRangeMax")
    public native Number getPortRangeMax();
    @JsProperty(name = "portRangeMin")
    public native Number getPortRangeMin();
    @JsProperty(name = "protocol")
    public native String getProtocol();
    @JsProperty(name = "remoteAddrType")
    public native String getRemoteAddrType();
    @JsProperty(name = "remoteAddress")
    public native String getRemoteAddress();
    @JsProperty(name = "remoteMR")
    public native String getRemoteMR();
    @JsProperty(name = "remoteMRTCPPort")
    public native Number getRemoteMRTCPPort();
    @JsProperty(name = "remoteSite")
    public native String getRemoteSite();
    @JsProperty(name = "rtpRtcpMux")
    public native Boolean getRtpRtcpMux();
    @JsProperty(name = "stunVer")
    public native Number getStunVer();
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "timestamp")
    public native Number getTimestamp();
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "allocationTimeInMs")
    public native void setAllocationTimeInMs(@DoNotAutobox Number value);
    @JsProperty(name = "baseAddress")
    public native void setBaseAddress(String value);
    @JsProperty(name = "baseInterface")
    public native void setBaseInterface(MSNetworkInterfaceType value);
    @JsProperty(name = "iceRole")
    public native void setIceRole(String value);
    @JsProperty(name = "iceWarningFlags")
    public native void setIceWarningFlags(MSIceWarningFlags value);
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "interfaces")
    public native void setInterfaces(MSNetworkInterfaceType value);
    @JsProperty(name = "localAddrType")
    public native void setLocalAddrType(String value);
    @JsProperty(name = "localAddress")
    public native void setLocalAddress(String value);
    @JsProperty(name = "localInterface")
    public native void setLocalInterface(MSNetworkInterfaceType value);
    @JsProperty(name = "localMR")
    public native void setLocalMR(String value);
    @JsProperty(name = "localMRTCPPort")
    public native void setLocalMRTCPPort(@DoNotAutobox Number value);
    @JsProperty(name = "localSite")
    public native void setLocalSite(String value);
    @JsProperty(name = "msRtcEngineVersion")
    public native void setMsRtcEngineVersion(String value);
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "msType")
    public native void setMsType(String value);
    @JsProperty(name = "networkName")
    public native void setNetworkName(String value);
    @JsProperty(name = "numConsentReqReceived")
    public native void setNumConsentReqReceived(@DoNotAutobox Number value);
    @JsProperty(name = "numConsentReqSent")
    public native void setNumConsentReqSent(@DoNotAutobox Number value);
    @JsProperty(name = "numConsentRespReceived")
    public native void setNumConsentRespReceived(@DoNotAutobox Number value);
    @JsProperty(name = "numConsentRespSent")
    public native void setNumConsentRespSent(@DoNotAutobox Number value);
    @JsProperty(name = "portRangeMax")
    public native void setPortRangeMax(@DoNotAutobox Number value);
    @JsProperty(name = "portRangeMin")
    public native void setPortRangeMin(@DoNotAutobox Number value);
    @JsProperty(name = "protocol")
    public native void setProtocol(String value);
    @JsProperty(name = "remoteAddrType")
    public native void setRemoteAddrType(String value);
    @JsProperty(name = "remoteAddress")
    public native void setRemoteAddress(String value);
    @JsProperty(name = "remoteMR")
    public native void setRemoteMR(String value);
    @JsProperty(name = "remoteMRTCPPort")
    public native void setRemoteMRTCPPort(@DoNotAutobox Number value);
    @JsProperty(name = "remoteSite")
    public native void setRemoteSite(String value);
    @JsProperty(name = "rtpRtcpMux")
    public native void setRtpRtcpMux(Boolean value);
    @JsProperty(name = "stunVer")
    public native void setStunVer(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "timestamp")
    public native void setTimestamp(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "type")
    public native void setType(String value);
}
