package mum.edu.altmetric.gui.controller;

import io.swagger.annotations.ApiParam;
import mum.edu.altmetric.gui.model.Track;
import mum.edu.altmetric.gui.service.MusicMatchServiceClient;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MusicController {

    @Autowired
    MusicMatchServiceClient trackService;

       @GetMapping("/api/track/top/searchForm")
       public String  newRegionForm() {

        return "searchRegion";
    }

    @GetMapping("/api/track/top")
    public ModelAndView getTopTrack(@ RequestParam String country) {
        try{
            System.out.println("mukera 1 " + country);

            Track topTrack= trackService.findTopMusicInARegion(country);
//            System.out.println("mukera  one" + topTrack);

        return new ModelAndView("trackList", "topTrack", topTrack);

        }
        catch (JSONException e) {
            return null;
        }

    }


//    @Autowired
//    MusicMatchServiceClient musicMatchServiceClient;
//
//    @GetMapping("musicMatch/new")
//    public String  newRegionForm() {
////        TrackWithDescription transaction = new TrackWithDescription();
////        model.addAttribute("transaction",transaction);
//        return "searchRegion";
//    }
//
////    @GetMapping("/getstats")
////    public String recordAirport(Model model) {
////        Statistics statistics = new Statistics();
////        model.addAttribute("statistics",statistics);
////        return "addairport";
////    }
//
//    @GetMapping ("/musicMatch/searchRegion/{regionCode}")
//      public String getTopMusicByRegion( @PathVariable("regionCode") String regionCode) {
//        System.out.println(" \n\n\nTest case one is done Before"  + regionCode);
//        TrackWithDescription trackWithDescription = musicMatchServiceClient.findTopMusicInARegion(regionCode);
////        System.out.println(" \n\n\nTest case one is done after ");
////        model.addAttribute("trackWithDescription", trackWithDescription);
//        return "redirect:/musicMatch/displayMusicInfo";
//
//    }
//
//    @GetMapping("/musicMatch/displayMusicInfo")
//    public ModelAndView findTopMusic(Model model , RedirectAttributes redirectAttributes) {
//        TrackWithDescription transactions_list = musicMatchServiceClient.findTopMusicInARegion();
//
//        return new ModelAndView("transactionsList", "transactions_list", transactions_list);
//    }

}