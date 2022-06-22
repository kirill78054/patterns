package pattern.structural.proxy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CachedYouTubeClassTest {

    @Test
    public void getVideoInfoTest() {
        ThirdPartyYouTubeLib youTubeLib = new CachedYouTubeClass(new ThirdPartyYouTubeClass());
        assertEquals("котики", youTubeLib.getVideoInfo(0));
        assertEquals("кэш котики", youTubeLib.getVideoInfo(0));
    }

}
