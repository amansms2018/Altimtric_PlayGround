package mum.edu.altmetric.gui.service;

import mum.edu.altmetric.gui.model.Track;
import mum.edu.altmetric.gui.model.TrackWithDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class MusicMatchServiceClient {
	@Autowired
	private RestTemplate restTemplate;

	private final String searchTopMusicbyRegionUrl = "http://localhost:8091/api/track/top/";

	public Track findTopMusicInARegion(String country) {
		ResponseEntity<Track> response = restTemplate.exchange(searchTopMusicbyRegionUrl + country , HttpMethod.GET, null,
						new ParameterizedTypeReference<Track>() {});
		return response.getBody();
	}
//	public void update(Transactions p) {
//		restTemplate.put(searchTopMusicbyRegionUrl, p, p.getTime());
//	}

//	public void deleteAllTrnsaction() {
//		System.out.print(" ID at  service class before  Delete");
//		restTemplate.delete(deleteTRansactionUrl);
//		System.out.print(" ID at  Service class After  Delete" );
//	}

//	public void save(Transactions p) {
//
//		System.out.println(" update at Service section before calling Rest  " + p.toString());
//
//		restTemplate.postForLocation(saveTransactionsUrl, p);
//		System.out.println(p.getTime());
//		System.out.println(" update at Service section after calling Rest  " + p.toString());
////		return p.getId();
//
//	}

}
