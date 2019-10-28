package mum.edu.altmetric.gui.model;
import lombok.*;

@Data
@NoArgsConstructor
@ToString
public class TrackWithDescription {
    private String TrackId;
    private String TrackName;
    private String TrackLyrics;
    private String ArtistName;
      private String ArtistPictureLink;
    private Double ArtistRating;

    public TrackWithDescription(String trackId, String trackName, String trackLyrics, String artistName, String artistPictureLink, Double ArtistRating) {
        TrackId = trackId;
        TrackName = trackName;
        ArtistName = artistName;
        TrackLyrics = trackLyrics;
        ArtistPictureLink = artistPictureLink;
        this.ArtistRating = ArtistRating;
    }

}
