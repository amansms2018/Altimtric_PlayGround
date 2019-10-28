package alti.com.toptrack.service;

import alti.com.toptrack.model.Track;
import org.json.JSONException;

public interface TrackService {
    Track getTopTrack(String country) throws JSONException;
    String getArtistName(String country);

}
