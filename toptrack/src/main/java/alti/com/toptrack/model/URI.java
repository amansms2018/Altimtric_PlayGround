package alti.com.toptrack.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode
public class URI {
    final private String lastFmHost = "http://ws.audioscrobbler.com";
    final private String musixMatchHost = "http://api.musixmatch.com/ws/1.1";
    final private String goole = "https://www.googleapis.com/customsearch/v1?num=10&searchType=image&imgSize=medium&imgType=face&alt=json";
    final private String topTrack = lastFmHost + "/2.0/?method=geo.gettoptracks&format=json";
    final private String artist = lastFmHost + "/2.0/?method=artist.getinfo&format=json";
    final private String lyrics = musixMatchHost + "/matcher.lyrics.get?";
    final private String similarTrack = lastFmHost +"/2.0/?method=track.getsimilar&format=json";
}
