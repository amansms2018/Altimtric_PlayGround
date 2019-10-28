package alti.com.toptrack.controller;

import alti.com.toptrack.model.Track;
import alti.com.toptrack.service.TrackService;
//import io.swagger.annotations.Api;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/track")   //@GetMapping("top/{country}")
@Api(value="TrackController", description = "Top Track per Country REST API",tags = "Track Controller")
public class TrackController {

    @Autowired
    TrackService trackService;

    @GetMapping("top/{country}")
    @ApiOperation(value="get top track", notes = "${TrackController.topTrack.notes}")
    public Track getTopTrack(@ApiParam(value = "Country Name", required = true) @PathVariable String country) {
        try{
            return trackService.getTopTrack(country);
        }
        catch (JSONException e) {
            return null;
        }

    }

}
