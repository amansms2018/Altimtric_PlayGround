package alti.com.toptrack.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Track {
    private String name;
    private String listeners;
    private Artist artist;
    private String lyrics;
    List<SimilarTracks> similarTracks;

}
