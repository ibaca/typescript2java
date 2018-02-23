package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCPeerConnection
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 559466
  * declared in: tsd/browser/lib.es6.d.ts at pos 561876
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCPeerConnection")
public class RTCPeerConnection extends EventTarget 
{

    /*
        Constructors
    */
    public RTCPeerConnection (RTCConfiguration configuration) {
    } 

    /*
        Properties
    */

    public Boolean canTrickleIceCandidates;

    public String iceConnectionState;

    public String iceGatheringState;

    public RTCSessionDescription localDescription;

    public Function1<MediaStreamEvent, Object> onaddstream;

    public Function1<RTCPeerConnectionIceEvent, Object> onicecandidate;

    public Function1<Event, Object> oniceconnectionstatechange;

    public Function1<Event, Object> onicegatheringstatechange;

    public Function1<Event, Object> onnegotiationneeded;

    public Function1<MediaStreamEvent, Object> onremovestream;

    public Function1<Event, Object> onsignalingstatechange;

    public RTCSessionDescription remoteDescription;

    public String signalingState;

    /*
        Methods
    */
    public native Promise<Void> addIceCandidate(RTCIceCandidate candidate);
    public native Promise<Void> addIceCandidate(RTCIceCandidate candidate, VoidFunction successCallback /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@560347
     */
    public native Promise<Void> addIceCandidate(RTCIceCandidate candidate, VoidFunction successCallback /* optional */, RTCPeerConnectionErrorCallback failureCallback /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@560493
     */
    public native void addStream(MediaStream stream);
    /** 
      * tsd/browser/lib.es6.d.ts@560535
     */
    public native void close();
    public native Promise<RTCSessionDescription> createAnswer();
    public native Promise<RTCSessionDescription> createAnswer(RTCSessionDescriptionCallback successCallback /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@560554
     */
    public native Promise<RTCSessionDescription> createAnswer(RTCSessionDescriptionCallback successCallback /* optional */, RTCPeerConnectionErrorCallback failureCallback /* optional */);
    public native Promise<RTCSessionDescription> createOffer();
    public native Promise<RTCSessionDescription> createOffer(RTCSessionDescriptionCallback successCallback /* optional */);
    public native Promise<RTCSessionDescription> createOffer(RTCSessionDescriptionCallback successCallback /* optional */, RTCPeerConnectionErrorCallback failureCallback /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@560703
     */
    public native Promise<RTCSessionDescription> createOffer(RTCSessionDescriptionCallback successCallback /* optional */, RTCPeerConnectionErrorCallback failureCallback /* optional */, RTCOfferOptions options /* optional */);
    @JsProperty(name = "canTrickleIceCandidates")
    public native Boolean getCanTrickleIceCandidates();
    /** 
      * tsd/browser/lib.es6.d.ts@560878
     */
    public native RTCConfiguration getConfiguration();
    @JsProperty(name = "iceConnectionState")
    public native String getIceConnectionState();
    @JsProperty(name = "iceGatheringState")
    public native String getIceGatheringState();
    @JsProperty(name = "localDescription")
    public native RTCSessionDescription getLocalDescription();
    /** 
      * tsd/browser/lib.es6.d.ts@560920
     */
    public native Array<MediaStream> getLocalStreams();
    @JsProperty(name = "onaddstream")
    public native Function1<MediaStreamEvent, Object> getOnaddstream();
    @JsProperty(name = "onicecandidate")
    public native Function1<RTCPeerConnectionIceEvent, Object> getOnicecandidate();
    @JsProperty(name = "oniceconnectionstatechange")
    public native Function1<Event, Object> getOniceconnectionstatechange();
    @JsProperty(name = "onicegatheringstatechange")
    public native Function1<Event, Object> getOnicegatheringstatechange();
    @JsProperty(name = "onnegotiationneeded")
    public native Function1<Event, Object> getOnnegotiationneeded();
    @JsProperty(name = "onremovestream")
    public native Function1<MediaStreamEvent, Object> getOnremovestream();
    @JsProperty(name = "onsignalingstatechange")
    public native Function1<Event, Object> getOnsignalingstatechange();
    @JsProperty(name = "remoteDescription")
    public native RTCSessionDescription getRemoteDescription();
    /** 
      * tsd/browser/lib.es6.d.ts@560958
     */
    public native Array<MediaStream> getRemoteStreams();
    @JsProperty(name = "signalingState")
    public native String getSignalingState();
    public native Promise<RTCStatsReport> getStats(MediaStreamTrack selector);
    public native Promise<RTCStatsReport> getStats(MediaStreamTrack selector, RTCStatsCallback successCallback /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@560997
     */
    public native Promise<RTCStatsReport> getStats(MediaStreamTrack selector, RTCStatsCallback successCallback /* optional */, RTCPeerConnectionErrorCallback failureCallback /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@561157
     */
    public native MediaStream getStreamById(String streamId);
    /** 
      * tsd/browser/lib.es6.d.ts@561214
     */
    public native void removeStream(MediaStream stream);
    @JsProperty(name = "canTrickleIceCandidates")
    public native void setCanTrickleIceCandidates(Boolean value);
    @JsProperty(name = "iceConnectionState")
    public native void setIceConnectionState(String value);
    @JsProperty(name = "iceGatheringState")
    public native void setIceGatheringState(String value);
    @JsProperty(name = "localDescription")
    public native void setLocalDescription(RTCSessionDescription value);
    public native Promise<Void> setLocalDescription(RTCSessionDescription description, VoidFunction successCallback /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@561259
     */
    public native Promise<Void> setLocalDescription(RTCSessionDescription description, VoidFunction successCallback /* optional */, RTCPeerConnectionErrorCallback failureCallback /* optional */);
    @JsProperty(name = "onaddstream")
    public native void setOnaddstream(Function1<MediaStreamEvent, Object> value);
    @JsProperty(name = "onicecandidate")
    public native void setOnicecandidate(Function1<RTCPeerConnectionIceEvent, Object> value);
    @JsProperty(name = "oniceconnectionstatechange")
    public native void setOniceconnectionstatechange(Function1<Event, Object> value);
    @JsProperty(name = "onicegatheringstatechange")
    public native void setOnicegatheringstatechange(Function1<Event, Object> value);
    @JsProperty(name = "onnegotiationneeded")
    public native void setOnnegotiationneeded(Function1<Event, Object> value);
    @JsProperty(name = "onremovestream")
    public native void setOnremovestream(Function1<MediaStreamEvent, Object> value);
    @JsProperty(name = "onsignalingstatechange")
    public native void setOnsignalingstatechange(Function1<Event, Object> value);
    @JsProperty(name = "remoteDescription")
    public native void setRemoteDescription(RTCSessionDescription value);
    public native Promise<Void> setRemoteDescription(RTCSessionDescription description, VoidFunction successCallback /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@561417
     */
    public native Promise<Void> setRemoteDescription(RTCSessionDescription description, VoidFunction successCallback /* optional */, RTCPeerConnectionErrorCallback failureCallback /* optional */);
    @JsProperty(name = "signalingState")
    public native void setSignalingState(String value);
}
