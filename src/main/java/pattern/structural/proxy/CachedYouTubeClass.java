package pattern.structural.proxy;

public class CachedYouTubeClass implements ThirdPartyYouTubeLib {

    private final ThirdPartyYouTubeLib thirdPartyYouTubeLib;
    private String lastVideo = "";
    private int cachedVideoId;

    public CachedYouTubeClass(ThirdPartyYouTubeLib thirdPartyYouTubeLib) {
        this.thirdPartyYouTubeLib = thirdPartyYouTubeLib;
    }

    @Override
    public String getVideoInfo(int id) {
        System.out.println("Получить видео с id: " + id);
        if (!lastVideo.isEmpty() && cachedVideoId == id) {
            System.out.println("Получить видео из кэша");
            return "кэш " + lastVideo;
        }
        cachedVideoId = id;
        lastVideo = thirdPartyYouTubeLib.getVideoInfo(id);
        return lastVideo;
    }

}
