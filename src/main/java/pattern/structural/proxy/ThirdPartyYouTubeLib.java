package pattern.structural.proxy;

/*
Заместитель(Proxy)

Позволяет подставлять вместо реальных объектов специаль-
ные объекты-заменители. Эти объекты перехватывают вызовы
к оригинальному объекту, позволяя сделать что-то до или после
передачи вызова оригиналу.
*/
public interface ThirdPartyYouTubeLib {

    String getVideoInfo(int id);

}
