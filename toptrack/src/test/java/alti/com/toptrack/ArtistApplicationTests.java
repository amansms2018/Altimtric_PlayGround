//package alti.com.toptrack;
//
//import alti.com.toptrack.controller.TrackController;
//import alti.com.toptrack.model.Artist;
//import alti.com.toptrack.model.Image;
//import alti.com.toptrack.model.SimilarTracks;
//import alti.com.toptrack.model.Track;
//import alti.com.toptrack.service.TrackService;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ArtistApplicationTests {
//
//    private MockMvc mockMvc;
//
//    @Autowired
//    private TrackService trackService;
//    @Test
//    public void getTopTrackTest() {
//
//        String artistName = "Adele";
//        String countryName = "Uganda";
//        assertThat(artistName.equals(trackService.getArtistName(countryName)));
//
//    }
//}
