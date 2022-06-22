package pattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    private final List<String> videos = new ArrayList<>();

    public ThirdPartyYouTubeClass() {
        videos.add("котики");
        videos.add("собачки");
        videos.add("дудь");
    }

    @Override
    public String getVideoInfo(int id) {
        return videos.get(id);
    }

}
