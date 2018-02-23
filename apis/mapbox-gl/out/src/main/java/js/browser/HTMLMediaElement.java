package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLMediaElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 438227
  * declared in: tsd/browser/lib.es6.d.ts at pos 444825
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLMediaElement")
public class HTMLMediaElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLMediaElement () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="HTMLMediaElement", name="HAVE_CURRENT_DATA")
    public static Number HAVE_CURRENT_DATA;

    @JsProperty(namespace="HTMLMediaElement", name="HAVE_ENOUGH_DATA")
    public static Number HAVE_ENOUGH_DATA;

    @JsProperty(namespace="HTMLMediaElement", name="HAVE_FUTURE_DATA")
    public static Number HAVE_FUTURE_DATA;

    @JsProperty(namespace="HTMLMediaElement", name="HAVE_METADATA")
    public static Number HAVE_METADATA;

    @JsProperty(namespace="HTMLMediaElement", name="HAVE_NOTHING")
    public static Number HAVE_NOTHING;

    @JsProperty(namespace="HTMLMediaElement", name="NETWORK_EMPTY")
    public static Number NETWORK_EMPTY;

    @JsProperty(namespace="HTMLMediaElement", name="NETWORK_IDLE")
    public static Number NETWORK_IDLE;

    @JsProperty(namespace="HTMLMediaElement", name="NETWORK_LOADING")
    public static Number NETWORK_LOADING;

    @JsProperty(namespace="HTMLMediaElement", name="NETWORK_NO_SOURCE")
    public static Number NETWORK_NO_SOURCE;

    /*
        Properties
    */

    /** 
      * Returns an AudioTrackList object with the audio tracks for a given video element.
     */
    public AudioTrackList audioTracks;

    /** 
      * Gets or sets a value that indicates whether to start playing the media automatically.
     */
    public Boolean autoplay;

    /** 
      * Gets a collection of buffered time ranges.
     */
    public TimeRanges buffered;

    public Number childElementCount;

    public HTMLCollection children;

    /** 
      * Gets or sets a flag that indicates whether the client provides a set of controls for the media (in case the developer does not include controls for the player).
     */
    public Boolean controls;

    public String crossOrigin;

    /** 
      * Gets the address or URL of the current media resource that is selected by IHTMLMediaElement.
     */
    public String currentSrc;

    /** 
      * Gets or sets the current playback position, in seconds.
     */
    public Number currentTime;

    public Boolean defaultMuted;

    /** 
      * Gets or sets the default playback rate when the user is not using fast forward or reverse for a video or audio resource.
     */
    public Number defaultPlaybackRate;

    /** 
      * Returns the duration in seconds of the current media resource. A NaN value is returned if duration is not available, or Infinity if the media resource is streaming.
     */
    public Number duration;

    /** 
      * Gets information about whether the playback has ended or not.
     */
    public Boolean ended;

    /** 
      * Returns an object representing the current error state of the audio or video element.
     */
    public MediaError error;

    public Element firstElementChild;

    public Element lastElementChild;

    /** 
      * Gets or sets a flag to specify whether playback should restart after it completes.
     */
    public Boolean loop;

    public MediaKeys mediaKeys;

    /** 
      * Specifies the purpose of the audio or video media, such as background audio or alerts.
     */
    public String msAudioCategory;

    /** 
      * Specifies the output device id that the audio will be sent to.
     */
    public String msAudioDeviceType;

    public MSGraphicsTrust msGraphicsTrustStatus;

    /** 
      * Gets the MSMediaKeys object, which is used for decrypting media data, that is associated with this media element.
     */
    public MSMediaKeys msKeys;

    /** 
      * Gets or sets whether the DLNA PlayTo device is available.
     */
    public Boolean msPlayToDisabled;

    /** 
      * Gets or sets the path to the preferred media source. This enables the Play To target device to stream the media content, which can be DRM protected, from a different location, such as a cloud media server.
     */
    public String msPlayToPreferredSourceUri;

    /** 
      * Gets or sets the primary DLNA PlayTo device.
     */
    public Boolean msPlayToPrimary;

    /** 
      * Gets the source associated with the media element for use by the PlayToManager.
     */
    public Object msPlayToSource;

    /** 
      * Specifies whether or not to enable low-latency playback on the media element.
     */
    public Boolean msRealTime;

    /** 
      * Gets or sets a flag that indicates whether the audio (either audio or the audio track on video media) is muted.
     */
    public Boolean muted;

    /** 
      * Gets the current network activity for the element.
     */
    public Number networkState;

    public Element nextElementSibling;

    public Function1<MediaEncryptedEvent, Object> onencrypted;

    public Function1<MSMediaKeyNeededEvent, Object> onmsneedkey;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<WheelEvent, Object> onwheel;

    /** 
      * Gets a flag that specifies whether playback is paused.
     */
    public Boolean paused;

    /** 
      * Gets or sets the current rate of speed for the media resource to play. This speed is expressed as a multiple of the normal speed of the media resource.
     */
    public Number playbackRate;

    /** 
      * Gets TimeRanges for the current media resource that has been played.
     */
    public TimeRanges played;

    /** 
      * Gets or sets the current playback position, in seconds.
     */
    public String preload;

    public Element previousElementSibling;

    public Number readyState;

    /** 
      * Returns a TimeRanges object that represents the ranges of the current media resource that can be seeked.
     */
    public TimeRanges seekable;

    /** 
      * Gets a flag that indicates whether the the client is currently moving to a new playback position in the media resource.
     */
    public Boolean seeking;

    /** 
      * The address or URL of the a media resource that is to be considered.
     */
    public String src;

    public MediaStream srcObject;

    public TextTrackList textTracks;

    public VideoTrackList videoTracks;

    /** 
      * Gets or sets the volume level for audio portions of the media element.
     */
    public Number volume;

    /*
        Methods
    */
    public native TextTrack addTextTrack(String kind);
    public native TextTrack addTextTrack(String kind, String label /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@442930
     */
    public native TextTrack addTextTrack(String kind, String label /* optional */, String language /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@443122
      * Returns a string that specifies whether the client can play a given media resource type.
     */
    public native String canPlayType(String type);
    @JsProperty(name = "audioTracks")
    public native AudioTrackList getAudioTracks();
    @JsProperty(name = "autoplay")
    public native Boolean getAutoplay();
    @JsProperty(name = "buffered")
    public native TimeRanges getBuffered();
    @JsProperty(name = "controls")
    public native Boolean getControls();
    @JsProperty(name = "crossOrigin")
    public native String getCrossOrigin();
    @JsProperty(name = "currentSrc")
    public native String getCurrentSrc();
    @JsProperty(name = "currentTime")
    public native Number getCurrentTime();
    @JsProperty(name = "defaultMuted")
    public native Boolean getDefaultMuted();
    @JsProperty(name = "defaultPlaybackRate")
    public native Number getDefaultPlaybackRate();
    @JsProperty(name = "duration")
    public native Number getDuration();
    @JsProperty(name = "ended")
    public native Boolean getEnded();
    @JsProperty(name = "error")
    public native MediaError getError();
    @JsProperty(name = "HAVE_CURRENT_DATA")
    public native Number getHAVE_CURRENT_DATA();
    @JsProperty(name = "HAVE_ENOUGH_DATA")
    public native Number getHAVE_ENOUGH_DATA();
    @JsProperty(name = "HAVE_FUTURE_DATA")
    public native Number getHAVE_FUTURE_DATA();
    @JsProperty(name = "HAVE_METADATA")
    public native Number getHAVE_METADATA();
    @JsProperty(name = "HAVE_NOTHING")
    public native Number getHAVE_NOTHING();
    @JsProperty(name = "loop")
    public native Boolean getLoop();
    @JsProperty(name = "mediaKeys")
    public native MediaKeys getMediaKeys();
    @JsProperty(name = "msAudioCategory")
    public native String getMsAudioCategory();
    @JsProperty(name = "msAudioDeviceType")
    public native String getMsAudioDeviceType();
    @JsProperty(name = "msGraphicsTrustStatus")
    public native MSGraphicsTrust getMsGraphicsTrustStatus();
    @JsProperty(name = "msKeys")
    public native MSMediaKeys getMsKeys();
    @JsProperty(name = "msPlayToDisabled")
    public native Boolean getMsPlayToDisabled();
    @JsProperty(name = "msPlayToPreferredSourceUri")
    public native String getMsPlayToPreferredSourceUri();
    @JsProperty(name = "msPlayToPrimary")
    public native Boolean getMsPlayToPrimary();
    @JsProperty(name = "msPlayToSource")
    public native Object getMsPlayToSource();
    @JsProperty(name = "msRealTime")
    public native Boolean getMsRealTime();
    @JsProperty(name = "muted")
    public native Boolean getMuted();
    @JsProperty(name = "NETWORK_EMPTY")
    public native Number getNETWORK_EMPTY();
    @JsProperty(name = "NETWORK_IDLE")
    public native Number getNETWORK_IDLE();
    @JsProperty(name = "NETWORK_LOADING")
    public native Number getNETWORK_LOADING();
    @JsProperty(name = "NETWORK_NO_SOURCE")
    public native Number getNETWORK_NO_SOURCE();
    @JsProperty(name = "networkState")
    public native Number getNetworkState();
    @JsProperty(name = "onencrypted")
    public native Function1<MediaEncryptedEvent, Object> getOnencrypted();
    @JsProperty(name = "onmsneedkey")
    public native Function1<MSMediaKeyNeededEvent, Object> getOnmsneedkey();
    @JsProperty(name = "paused")
    public native Boolean getPaused();
    @JsProperty(name = "playbackRate")
    public native Number getPlaybackRate();
    @JsProperty(name = "played")
    public native TimeRanges getPlayed();
    @JsProperty(name = "preload")
    public native String getPreload();
    @JsProperty(name = "readyState")
    public native Number getReadyState();
    @JsProperty(name = "seekable")
    public native TimeRanges getSeekable();
    @JsProperty(name = "seeking")
    public native Boolean getSeeking();
    @JsProperty(name = "src")
    public native String getSrc();
    @JsProperty(name = "srcObject")
    public native MediaStream getSrcObject();
    @JsProperty(name = "textTracks")
    public native TextTrackList getTextTracks();
    @JsProperty(name = "videoTracks")
    public native VideoTrackList getVideoTracks();
    @JsProperty(name = "volume")
    public native Number getVolume();
    /** 
      * tsd/browser/lib.es6.d.ts@443251
      * Resets the audio or video object and loads a new media resource.
     */
    public native void load();
    /** 
      * tsd/browser/lib.es6.d.ts@443338
      * Clears all effects from the media pipeline.
     */
    public native void msClearEffects();
    /** 
      * tsd/browser/lib.es6.d.ts@443366
     */
    public native Object msGetAsCastingSource();
    public native void msInsertAudioEffect(String activatableClassId, Boolean effectRequired);
    /** 
      * tsd/browser/lib.es6.d.ts@443480
      * Inserts the specified audio effect into media pipeline.
     */
    public native void msInsertAudioEffect(String activatableClassId, Boolean effectRequired, Object config /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@443578
     */
    public native void msSetMediaKeys(MSMediaKeys mediaKeys);
    public native void msSetMediaProtectionManager();
    /** 
      * tsd/browser/lib.es6.d.ts@443720
      * Specifies the media protection manager for a given media pipeline.
     */
    public native void msSetMediaProtectionManager(Object mediaProtectionManager /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@444019
      * Pauses the current playback and sets paused to TRUE. This can be used to test whether the media is playing or paused. You can also use the pause or play events to tell whether the media is playing or not.
     */
    public native void pause();
    /** 
      * tsd/browser/lib.es6.d.ts@444110
      * Loads and starts playback of a media resource.
     */
    public native void play();
    @JsProperty(name = "audioTracks")
    public native void setAudioTracks(AudioTrackList value);
    @JsProperty(name = "autoplay")
    public native void setAutoplay(Boolean value);
    @JsProperty(name = "buffered")
    public native void setBuffered(TimeRanges value);
    @JsProperty(name = "controls")
    public native void setControls(Boolean value);
    @JsProperty(name = "crossOrigin")
    public native void setCrossOrigin(String value);
    @JsProperty(name = "currentSrc")
    public native void setCurrentSrc(String value);
    @JsProperty(name = "currentTime")
    public native void setCurrentTime(@DoNotAutobox Number value);
    @JsProperty(name = "defaultMuted")
    public native void setDefaultMuted(Boolean value);
    @JsProperty(name = "defaultPlaybackRate")
    public native void setDefaultPlaybackRate(@DoNotAutobox Number value);
    @JsProperty(name = "duration")
    public native void setDuration(@DoNotAutobox Number value);
    @JsProperty(name = "ended")
    public native void setEnded(Boolean value);
    @JsProperty(name = "error")
    public native void setError(MediaError value);
    @JsProperty(name = "HAVE_CURRENT_DATA")
    public native void setHAVE_CURRENT_DATA(@DoNotAutobox Number value);
    @JsProperty(name = "HAVE_ENOUGH_DATA")
    public native void setHAVE_ENOUGH_DATA(@DoNotAutobox Number value);
    @JsProperty(name = "HAVE_FUTURE_DATA")
    public native void setHAVE_FUTURE_DATA(@DoNotAutobox Number value);
    @JsProperty(name = "HAVE_METADATA")
    public native void setHAVE_METADATA(@DoNotAutobox Number value);
    @JsProperty(name = "HAVE_NOTHING")
    public native void setHAVE_NOTHING(@DoNotAutobox Number value);
    @JsProperty(name = "loop")
    public native void setLoop(Boolean value);
    @JsProperty(name = "mediaKeys")
    public native void setMediaKeys(MediaKeys value);
    @JsProperty(name = "msAudioCategory")
    public native void setMsAudioCategory(String value);
    @JsProperty(name = "msAudioDeviceType")
    public native void setMsAudioDeviceType(String value);
    @JsProperty(name = "msGraphicsTrustStatus")
    public native void setMsGraphicsTrustStatus(MSGraphicsTrust value);
    @JsProperty(name = "msKeys")
    public native void setMsKeys(MSMediaKeys value);
    @JsProperty(name = "msPlayToDisabled")
    public native void setMsPlayToDisabled(Boolean value);
    @JsProperty(name = "msPlayToPreferredSourceUri")
    public native void setMsPlayToPreferredSourceUri(String value);
    @JsProperty(name = "msPlayToPrimary")
    public native void setMsPlayToPrimary(Boolean value);
    @JsProperty(name = "msPlayToSource")
    public native void setMsPlayToSource(Object value);
    @JsProperty(name = "msRealTime")
    public native void setMsRealTime(Boolean value);
    @JsProperty(name = "muted")
    public native void setMuted(Boolean value);
    @JsProperty(name = "NETWORK_EMPTY")
    public native void setNETWORK_EMPTY(@DoNotAutobox Number value);
    @JsProperty(name = "NETWORK_IDLE")
    public native void setNETWORK_IDLE(@DoNotAutobox Number value);
    @JsProperty(name = "NETWORK_LOADING")
    public native void setNETWORK_LOADING(@DoNotAutobox Number value);
    @JsProperty(name = "NETWORK_NO_SOURCE")
    public native void setNETWORK_NO_SOURCE(@DoNotAutobox Number value);
    @JsProperty(name = "networkState")
    public native void setNetworkState(@DoNotAutobox Number value);
    @JsProperty(name = "onencrypted")
    public native void setOnencrypted(Function1<MediaEncryptedEvent, Object> value);
    @JsProperty(name = "onmsneedkey")
    public native void setOnmsneedkey(Function1<MSMediaKeyNeededEvent, Object> value);
    @JsProperty(name = "paused")
    public native void setPaused(Boolean value);
    @JsProperty(name = "playbackRate")
    public native void setPlaybackRate(@DoNotAutobox Number value);
    @JsProperty(name = "played")
    public native void setPlayed(TimeRanges value);
    @JsProperty(name = "preload")
    public native void setPreload(String value);
    @JsProperty(name = "readyState")
    public native void setReadyState(@DoNotAutobox Number value);
    @JsProperty(name = "seekable")
    public native void setSeekable(TimeRanges value);
    @JsProperty(name = "seeking")
    public native void setSeeking(Boolean value);
    @JsProperty(name = "src")
    public native void setSrc(String value);
    @JsProperty(name = "srcObject")
    public native void setSrcObject(MediaStream value);
    @JsProperty(name = "textTracks")
    public native void setTextTracks(TextTrackList value);
    @JsProperty(name = "videoTracks")
    public native void setVideoTracks(VideoTrackList value);
    @JsProperty(name = "volume")
    public native void setVolume(@DoNotAutobox Number value);
}
