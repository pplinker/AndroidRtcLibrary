package cceh.androidrtclibrary;

import org.webrtc.MediaConstraints;

/**
 * Factory for {@link MediaConstraints}.
 *
 * Created by Charlie Chen (ccehshmily@gmail.com) on 4/7/17.
 */
public class MediaParams {
  private static MediaConstraints defaultVideoConstraints() {
    MediaConstraints videoConstraints = new MediaConstraints();
    videoConstraints.mandatory.add(new MediaConstraints.KeyValuePair("maxWidth","1280"));
    videoConstraints.mandatory.add(new MediaConstraints.KeyValuePair("maxHeight","720"));
    videoConstraints.mandatory.add(new MediaConstraints.KeyValuePair("minWidth", "640"));
    videoConstraints.mandatory.add(new MediaConstraints.KeyValuePair("minHeight","480"));
    return videoConstraints;
  }

  private static MediaConstraints defaultAudioConstraints() {
    MediaConstraints audioConstraints = new MediaConstraints();
    return audioConstraints;
  }
}
